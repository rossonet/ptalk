package net.rossonet.ptalk.channel.telegram;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.GetFile;
import org.telegram.telegrambots.meta.api.methods.send.SendAnimation;
import org.telegram.telegrambots.meta.api.methods.send.SendAudio;
import org.telegram.telegrambots.meta.api.methods.send.SendContact;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendSticker;
import org.telegram.telegrambots.meta.api.methods.send.SendVenue;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
import org.telegram.telegrambots.meta.api.methods.send.SendVoice;
import org.telegram.telegrambots.meta.api.objects.Contact;
import org.telegram.telegrambots.meta.api.objects.Document;
import org.telegram.telegrambots.meta.api.objects.File;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.PhotoSize;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.Venue;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import net.rossonet.ptalk.base.grpc.Data;
import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.channel.implementation.PTalkChannelRuntime;

public class TelegramBot extends TelegramLongPollingBot {

	public static final String BOT_USR_ENV = "BOT_USERNAME";
	public static final String BOT_TKN_ENV = "BOT_TOKEN";

	private static final Logger LOGGER = Logger.getLogger(TelegramBot.class.getName());

	private PTalkChannelRuntime pTalkChannelRuntime;

	private TelegramConnector telegramConnector;

	public TelegramBot() {
		super(System.getenv(BOT_TKN_ENV));
	}

	@Override
	public String getBotToken() {
		return System.getenv(BOT_TKN_ENV);
	}

	@Override
	public String getBotUsername() {
		return System.getenv(BOT_USR_ENV);
	}

	public ExecutorService getExecutor() {
		return exe;
	}

	private void getFile(String currentId, String caption, Long chatId) {
		try {
			final File file = execute(new GetFile(currentId));

			final String fileName = file.getFilePath();

			final URL url = new URL("https://api.telegram.org/file/bot" + getBotToken() + "/" + fileName);
			final URLConnection connection = url.openConnection();
			final InputStream inputStream = connection.getInputStream();

			final InputFile importedFile = new InputFile(inputStream, fileName);

			sendFile(chatId, importedFile, caption);

		} catch (final MalformedURLException e) {
			LOGGER.severe(e.getMessage());
		} catch (final IOException e) {
			LOGGER.severe(e.getMessage());
		} catch (final TelegramApiException e) {
			LOGGER.severe(e.getMessage());
		}
	}

	public TelegramConnector getTelegramConnector() {
		return telegramConnector;
	}

	@Override
	public void onClosing() {
		exe.shutdown();
	}

	@Override
	public void onUpdateReceived(Update update) {
		String currentId = "";
		String caption = "";
		final Message message = update.getMessage();
		final Long chatId = message.getChatId();

		if (message.hasAnimation()) {
			caption = (message.getCaption() != null ? message.getCaption() : "");
			currentId = message.getAnimation().getFileId();

			getFile(currentId, caption, chatId);

		} else if (message.hasAudio()) {
			caption = (message.getCaption() != null ? message.getCaption() : "");
			currentId = message.getAudio().getFileId();

			getFile(currentId, caption, chatId);

		} else if (message.hasPhoto()) {
			final List<PhotoSize> photoSizes = message.getPhoto();
			final PhotoSize photoSize = photoSizes.get(photoSizes.size() - 1);
			currentId = photoSize.getFileId();
			caption = (message.getCaption() != null ? message.getCaption() : "");

			getFile(currentId, caption, chatId);

		} else if (message.hasSticker()) {
			currentId = message.getSticker().getFileId();
			caption = (message.getCaption() != null ? message.getCaption() : "");

			getFile(currentId, caption, chatId);

		} else if (message.hasVideo()) {
			currentId = message.getVideo().getFileId();
			caption = (message.getCaption() != null ? message.getCaption() : "");

			getFile(currentId, caption, chatId);

		} else if (message.hasVoice()) {
			currentId = message.getVoice().getFileId();
			caption = (message.getCaption() != null ? message.getCaption() : "");

			getFile(currentId, caption, chatId);

		} else if (message.hasContact()) {
			caption = (message.getCaption() != null ? message.getCaption() : "");
			final Contact contact = message.getContact();
			try {
				final SendContact sendContact = new SendContact();
				sendContact.setChatId(chatId);
				if (contact.getFirstName() != null) {
					sendContact.setFirstName(contact.getFirstName());
				}
				if (contact.getLastName() != null) {
					sendContact.setLastName(contact.getLastName());
				}
				if (contact.getPhoneNumber() != null) {
					sendContact.setPhoneNumber(contact.getPhoneNumber());
				}
				if (contact.getVCard() != null) {
					sendContact.setVCard(contact.getVCard()); // emails
				}

				execute(sendContact);

			} catch (final TelegramApiException e) {
				e.printStackTrace();
			}
		} else if (message.hasLocation()) {
			final Venue location = message.getVenue();
			caption = (message.getCaption() != null ? message.getCaption() : "");
			try {
				final SendVenue sendLocation = new SendVenue();
				sendLocation.setChatId(chatId);
				sendLocation.setLatitude(location.getLocation().getLatitude());
				sendLocation.setLongitude(location.getLocation().getLongitude());
				sendLocation.setAddress(location.getAddress());
				sendLocation.setTitle(location.getTitle());

				execute(sendLocation);

			} catch (final TelegramApiException e) {
				LOGGER.severe(e.getMessage());
			}
		} else if (message.hasDocument()) {
			final Document document = message.getDocument();
			currentId = document.getFileId();
			final String fileName = document.getFileName();

			caption = (message.getCaption() != null ? message.getCaption() : "");

			try {
				final URL url = new URL("https://api.telegram.org/file/bot" + getBotToken() + "/" + fileName);

				final URLConnection connection = url.openConnection();
				final InputStream inputStream = connection.getInputStream();

				final InputFile importedFile = new InputFile(inputStream, fileName);

				final SendDocument sendDocument = new SendDocument();
				sendDocument.setChatId(chatId);
				sendDocument.setDocument(importedFile);
				execute(sendDocument);
			} catch (final MalformedURLException e) {
				LOGGER.severe(e.getMessage());
			} catch (final TelegramApiException e) {
				LOGGER.severe(e.getMessage());
			} catch (final IOException e) {
				LOGGER.severe(e.getMessage());
			}
		}

		if (message.hasText()) {
			sendMessageToPTalk(chatId, message.getText());
		}

	}

	private void sendFile(Long chatId, InputFile fileToSend, String caption) throws TelegramApiException {

		/////////////////////
		final SendAudio sendAudio = new SendAudio();
		sendAudio.setChatId(chatId);
		sendAudio.setAudio(fileToSend);
		sendAudio.setCaption(caption);

		execute(sendAudio);
		/////////////////////
		final SendAnimation sendAnimation = new SendAnimation();
		sendAnimation.setChatId(chatId);
		sendAnimation.setAnimation(fileToSend);
		sendAnimation.setCaption(caption);

		execute(sendAnimation);
		/////////////////////
		final SendDocument sendDocument = new SendDocument();
		sendDocument.setChatId(chatId);
		sendDocument.setDocument(fileToSend);
		sendDocument.setCaption(caption);

		execute(sendDocument);
		/////////////////////
		final SendPhoto sendPhoto = new SendPhoto();
		sendPhoto.setChatId(chatId);
		sendPhoto.setPhoto(fileToSend);
		sendPhoto.setCaption(caption);

		execute(sendPhoto);
		/////////////////////
		final SendSticker sendSticker = new SendSticker();
		sendSticker.setChatId(chatId);
		sendSticker.setSticker(fileToSend);

		execute(sendSticker);
		/////////////////////
		final SendVideo sendVideo = new SendVideo();
		sendVideo.setChatId(chatId);
		sendVideo.setVideo(fileToSend);
		sendVideo.setCaption(caption);

		execute(sendVideo);
		/////////////////////
		final SendVoice sendVoice = new SendVoice();
		sendVoice.setChatId(chatId);
		sendVoice.setVoice(fileToSend);
		sendVoice.setCaption(caption);

		execute(sendVoice);
		/////////////////////

//questa roba va in sendMessageToUser

	}

	private void sendMessageToPTalk(Long chatId, String message) {
		pTalkChannelRuntime.sendMessage(String.valueOf(chatId), message);
	}

	public void sendMessageToUser(ChannelMessageRequest messageRequest) {
		final String chatId = messageRequest.getChannelUniqueName();
		final List<Data> dataList = messageRequest.getAdditionalDatasList();
		String reply = "";
		final String dataType = dataList.stream().filter(e -> e.getKey().equals("typeData")).findFirst().get()
				.getValue();
		final String nomefile = dataList.stream().filter(e -> e.getKey().equals("filename")).findFirst().get()
				.getValue();
		final String fileId = dataList.stream().filter(e -> e.getKey().equals("fileId")).findFirst().get().getValue();

		if (dataType.equals("BASE64DATA")) {
			try {
				final String payload = dataList.get(0).getValue();

				final Decoder decoder = Base64.getMimeDecoder();
				final byte[] decodedFileBytes = decoder.decode(payload);
				final InputFile inputFile = new InputFile(new ByteArrayInputStream(decodedFileBytes), nomefile);

				final SendDocument responseDocument = new SendDocument();
				responseDocument.setChatId(chatId);
				responseDocument.setDocument(inputFile);
				execute(responseDocument);

			} catch (final TelegramApiException e) {
				LOGGER.severe("ERROR WHILE SENDING DOCUMENT: ");
				e.printStackTrace();
			}
		} else {
			reply = messageRequest.getMessage().getValue().replace("ECHO MESSAGE OF:", "You sent: ");
			final SendMessage sendMessage = new SendMessage();
			sendMessage.setChatId(chatId);
			sendMessage.setText(reply);
			try {
				execute(sendMessage);
			} catch (final TelegramApiException e) {
				LOGGER.severe("ERROR WHILE SENDING MESSAGE: " + e.getMessage());
			}
		}
	}

	// https://core.telegram.org/bots/api#sending-files
	// fare untest che manda i documenti al bot oppure due bot che si mandano i mess
	// a vicenda

	public void setPTalkChannelRuntime(PTalkChannelRuntime pTalkChannelRuntime) {
		this.pTalkChannelRuntime = pTalkChannelRuntime;
	}

	public void setTelegramConnector(TelegramConnector telegramConnector) {
		this.telegramConnector = telegramConnector;
	}
}
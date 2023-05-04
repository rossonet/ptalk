package net.rossonet.ptalk.channel.telegram;

import java.util.List;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;

import org.json.JSONObject;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.GetFile;
import org.telegram.telegrambots.meta.api.methods.send.SendAnimation;
import org.telegram.telegrambots.meta.api.methods.send.SendAudio;
import org.telegram.telegrambots.meta.api.methods.send.SendContact;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendLocation;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendSticker;
import org.telegram.telegrambots.meta.api.methods.send.SendVenue;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
import org.telegram.telegrambots.meta.api.methods.send.SendVoice;
import org.telegram.telegrambots.meta.api.objects.Contact;
import org.telegram.telegrambots.meta.api.objects.Document;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.PhotoSize;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.Venue;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Location;

import net.rossonet.ptalk.base.grpc.Data;
import net.rossonet.ptalk.base.grpc.Quality;
import net.rossonet.ptalk.base.grpc.DataType;
import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.channel.implementation.PTalkChannelRuntime;

import java.io.FileOutputStream;
import java.io.FileInputStream;


@SuppressWarnings("deprecation")
public class TelegramBot extends TelegramLongPollingBot{
	public static final String BOT_USR_ENV = "BOT_USERNAME";
	public static final String BOT_TKN_ENV = "BOT_TOKEN";
	private static final Logger logger = Logger.getLogger(TelegramBot.class.getName());
	private PTalkChannelRuntime pTalkChannelRuntime;
	@SuppressWarnings("unused")
	private TelegramConnector telegramConnector; 

	@Override
	public String getBotUsername() {
		return System.getenv(BOT_USR_ENV);
	}

	@Override
	public String getBotToken() {
		return System.getenv(BOT_TKN_ENV);
	}

	public ExecutorService getExecutor() {
		return exe;
	}

	@Override
	public void onClosing() {
		exe.shutdown();
	}

	@Override
	public void onUpdateReceived(Update update) {
		Message message = update.getMessage();
		String caption = (message.getCaption() != null ? message.getCaption() : "");
		Long chatId = message.getChatId();
		String dataType = "Text";
		String currentId = "";
		String fileName =  "";
		JSONObject json = new JSONObject();
		boolean containsFile = false;

		if (message.hasContact()){
			containsFile = false;
			Contact contact = message.getContact();
			dataType = "Contact";

			json.put("contact", contact);

			String reply = dataType + ": " + contact.toString();
			sendMessageToPTalk(chatId, json, reply);

		} else if (message.hasLocation()){
			containsFile = false;
			dataType = "Location";
			Venue venue = message.getVenue();
			Location location = message.getLocation();

			json.put("location", location);
			json.put("venue", venue);

			String reply = dataType + ": " + location.getHeading();
			sendMessageToPTalk(chatId, json, reply);

		} else if (message.hasDocument()){
			containsFile = true;
			dataType = "Document";
			Document document = message.getDocument();
			currentId = document.getFileId();
			fileName = document.getFileName();
			containsFile = true;

		}  else	if (message.hasAnimation()){
			containsFile = true;
			dataType = "Animation";
			currentId = message.getAnimation().getFileId();

		} else if (message.hasAudio()){
			containsFile = true;
			dataType = "Audio";
			currentId = message.getAudio().getFileId();

		}  else if (message.hasPhoto()){
			containsFile = true;
			List<PhotoSize> photoSizes = message.getPhoto();
			dataType = "Photo";
			PhotoSize photoSize = photoSizes.get(photoSizes.size() - 1); 
			currentId = photoSize.getFileId();

		} else if (message.hasSticker()){
			containsFile = true;
			dataType = "Sticker";
			currentId = message.getSticker().getFileId();

		} else if (message.hasVideo()){
			containsFile = true;
			dataType = "Video";
			currentId = message.getVideo().getFileId();

		} else if (message.hasVoice()){
			containsFile = true;
			dataType = "Voice";
			currentId = message.getVoice().getFileId();

		} 

		if (containsFile) {
			try {

				GetFile getFile = new GetFile();
				getFile.setFileId(currentId);
				fileName = execute(getFile).getFilePath();
				java.io.File outputFile = new java.io.File(fileName);
				java.io.File file = downloadFile(fileName, outputFile);


				/***************************** invia copia all'utente come verifica
				InputStream inputStream = new FileInputStream(file);
				InputFile fileToSend = new InputFile(inputStream, fileName);
				sendFile(chatId, fileToSend, caption, dataType);
				inputStream.close();
				 *****************************/

				InputStream inputStream = new FileInputStream(file);
				byte[] targetArray = new byte[inputStream.available()];

				inputStream.read(targetArray);
				inputStream.close();

				Encoder encoder = Base64.getMimeEncoder();
				String payload = encoder.encodeToString(targetArray);

				String reply = dataType + ": " + fileName;

				sendMessageToPTalk(chatId, reply, dataType, payload, fileName, currentId, caption);

			} catch (IOException e) {
				logger.severe("IOException Importing File: " + fileName);
				e.printStackTrace();
			} catch (TelegramApiException e) {
				logger.severe("TelegramApiException Importing File: " + fileName);
				e.printStackTrace();
			}
		}

		if (message.hasText()){
			sendMessageToPTalk(chatId, message.getText());
		}

	}




	private void sendFile(Long chatId, InputFile fileToSend, String caption, String mediaType) 
			throws TelegramApiException {
		logger.info("Sending " + mediaType + ": "+ fileToSend.getMediaName() + "..."); 
		logger.info("fileToSend " + fileToSend.toString());
		switch (mediaType){
		case "Audio": 
			SendAudio sendAudio = new SendAudio();
			sendAudio.setChatId(chatId);
			sendAudio.setAudio(fileToSend);
			sendAudio.setCaption(caption);

			execute(sendAudio);
			break;
		case "Animation":
			SendAnimation sendAnimation = new SendAnimation();
			sendAnimation.setChatId(chatId);
			sendAnimation.setAnimation(fileToSend);
			sendAnimation.setCaption(caption);

			execute(sendAnimation);
			break;
		case "Document":
			SendDocument sendDocument = new SendDocument();
			sendDocument.setChatId(chatId);
			sendDocument.setDocument(fileToSend);
			sendDocument.setCaption(caption);

			execute(sendDocument);
			break;
		case "Photo":
			SendPhoto sendPhoto = new SendPhoto();
			sendPhoto.setChatId(chatId);
			sendPhoto.setPhoto(fileToSend);
			sendPhoto.setCaption(caption);

			execute(sendPhoto);
			break;
		case "Sticker":
			SendSticker sendSticker = new SendSticker();
			sendSticker.setChatId(chatId);
			sendSticker.setSticker(fileToSend);

			execute(sendSticker);
			break;
		case "Video":
			SendVideo sendVideo = new SendVideo();
			sendVideo.setChatId(chatId);
			sendVideo.setVideo(fileToSend);
			sendVideo.setCaption(caption);

			execute(sendVideo);
			break;
		case "Voice":
			SendVoice sendVoice = new SendVoice();
			sendVoice.setChatId(chatId);
			sendVoice.setVoice(fileToSend);
			sendVoice.setCaption(caption);

			execute(sendVoice);
			break;
		default:
			SendMessage sendMessage = new SendMessage();
			sendMessage.setChatId(chatId);
			sendMessage.setText("MEDIATYPE ERROR");
			execute(sendMessage);
		}

	}

	private void sendMessageToPTalk(Long chatId, String reply) {
		logger.info("Sending text to PTalk");
		pTalkChannelRuntime.sendMessage(String.valueOf(chatId), reply);		
	}

	private void sendMessageToPTalk(Long chatId, JSONObject json, String reply) {
		logger.info("Sending json to PTalk");
		pTalkChannelRuntime.sendMessage(String.valueOf(chatId), reply, json);
	}

	private void sendMessageToPTalk(Long chatId, String reply, String dataType, String payload, 
			String filename, String fileId, String caption) {
		logger.info("Sending document to PTalk");
		List<Data> datas = new ArrayList<>();
		Data binaryData = Data.newBuilder()
				.setKey(dataType)
				.setQuality(Quality.GOOD)
				.setTypeData(DataType.BASE64DATA)
				.setValue(payload).build();
		datas.add(binaryData);
		if (filename != "" && filename != null) {
			Data metadata= Data.newBuilder()
					.setKey("filename")
					.setQuality(Quality.GOOD)
					.setTypeData(DataType.STRING)
					.setValue(filename).build();
			datas.add(metadata);
		}
		if (fileId != "" && fileId != null) {
			Data fileData= Data.newBuilder()
					.setKey("fileId")
					.setQuality(Quality.GOOD)
					.setTypeData(DataType.STRING)
					.setValue(fileId).build();
			datas.add(fileData);
		}
		if (caption != "" && caption != null) {
			Data text= Data.newBuilder()
					.setKey("caption")
					.setQuality(Quality.GOOD)
					.setTypeData(DataType.STRING)
					.setValue(caption).build();
			datas.add(text);
		}
		pTalkChannelRuntime.sendMessage(String.valueOf(chatId), reply, new JSONObject(), datas);	
	}

	public void sendMessageToUser(ChannelMessageRequest messageRequest) {
		String chatId = messageRequest.getChannelUniqueName(); 
		List<Data> dataList = messageRequest.getAdditionalDatasList();
		if (!dataList.isEmpty()){
			logger.info("dataList: " + dataList.toString());
			DataType dataType = dataList.get(0).getTypeData();
			logger.info("dataType: " + dataType.toString());
			String mediaType = dataList.get(0).getKey();
			logger.info("mediaType: " + mediaType);
			String payload = dataList.get(0).getValue(); 
			String filePath = dataList.stream().filter(e -> e.getKey().equals("filename")).findFirst().get().getValue();
			logger.info("filePath: " + filePath);
			String fileId = dataList.stream().filter(e -> e.getKey().equals("fileId")).findFirst().get().getValue();
			logger.info("fileId: " + fileId);
			String caption = "";
			if (dataList.stream().filter(e -> e.getKey().equals("caption")).findFirst().isPresent())
				caption = dataList.stream().filter(e -> e.getKey().equals("caption")).findFirst().get().getValue();
			logger.info("caption: " + caption);
			Decoder decoder = Base64.getMimeDecoder();
			byte[] decodedFileBytes = decoder.decode(payload);		

			try {
				int barPosition = 0;
				for(int i = filePath.length() - 1; i >=0; i--) {
					if (filePath.charAt(i) == '/') {
						barPosition = i;
						i = -1;
					}
				}
				String filename = filePath.substring(barPosition + 1, filePath.length());
				java.io.File file = new java.io.File(filename);
				file.setWritable(true);
				file.setReadable(true);
				file.setExecutable(true);
				logger.info("filename: " + filename + ", " + file.getName());
				InputFile inputFile;
				try (FileOutputStream outputStream = new FileOutputStream(file)) {
					outputStream.write(decodedFileBytes);
				} catch (IOException e) {
					logger.severe("ERROR creating outputStream:");
					e.printStackTrace();
				}
				inputFile = new InputFile(file, file.getName());

				logger.info("Sending document to User");

				sendFile(Long.valueOf(chatId), inputFile, caption, mediaType);

			} catch (NumberFormatException | TelegramApiException e1) {
				logger.severe("ERROR WHILE SENDING MESSAGE: ");
				e1.printStackTrace();
			}
		} else if (messageRequest.getContextJson() != null 
				&& messageRequest.getContextJson() != ""){
			String jsonString = messageRequest.getContextJson();
			JSONObject json = new JSONObject(jsonString);
			if (jsonString.contains("contact")) {
				Contact contact = (Contact) json.get("contact");
				SendContact sendContact = new SendContact();
				sendContact.setChatId(chatId);
				sendContact.setFirstName(contact.getFirstName());
				sendContact.setLastName(contact.getLastName());
				sendContact.setPhoneNumber(contact.getPhoneNumber());
				sendContact.setVCard(contact.getVCard());  //emails

				try {
					execute(sendContact);
				} catch (TelegramApiException e) {
					logger.severe("ERROR sending Contact");
					e.printStackTrace();
				}
			}
			if (jsonString.contains("location")) {
				Location location = (Location) json.get("location");
				Venue venue = (Venue) json.get("venue");

				SendLocation sendLocation = new SendLocation();
				sendLocation.setChatId(chatId);
				sendLocation.setLatitude(location.getLatitude());
				sendLocation.setLongitude(location.getLongitude());
				sendLocation.setHeading(location.getHeading());

				SendVenue sendVenue = new SendVenue();
				sendVenue.setAddress(venue.getAddress());
				sendVenue.setChatId(chatId);
				sendVenue.setFoursquareId(venue.getFoursquareId());
				sendVenue.setFoursquareType(venue.getFoursquareType());
				sendVenue.setGooglePlaceId(venue.getGooglePlaceId());
				sendVenue.setGooglePlaceType(venue.getGooglePlaceType());
				sendVenue.setLatitude(venue.getLocation().getLatitude());
				sendVenue.setLongitude(venue.getLocation().getLongitude());
				sendVenue.setTitle(venue.getTitle());

				try {
					execute(sendLocation);
					execute(sendVenue);
				} catch (TelegramApiException e) {
					logger.severe("ERROR sending Location");
					e.printStackTrace();
				}
			}

		} else {			
			logger.info("Sending text to User");
			String reply = messageRequest.getMessage().getValue().replace("ECHO MESSAGE OF:", "You sent: ");
			SendMessage sendMessage = new SendMessage();
			sendMessage.setChatId(chatId);
			sendMessage.setText(reply);		
			try {
				execute(sendMessage);
			} catch (TelegramApiException e) {		
				logger.severe("ERROR WHILE SENDING TEXT MESSAGE: ");
				e.printStackTrace();
			}	
		}
	}

	public void setPTalkChannelRuntime(PTalkChannelRuntime pTalkChannelRuntime) {
		this.pTalkChannelRuntime = pTalkChannelRuntime;
	}

	public void setTelegramConnector(TelegramConnector telegramConnector) {
		this.telegramConnector = telegramConnector;
	}
}
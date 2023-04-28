package net.rossonet.ptalk.channel.telegram;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
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
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendSticker;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
import org.telegram.telegrambots.meta.api.methods.send.SendVoice;
import org.telegram.telegrambots.meta.api.objects.Document;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.PhotoSize;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import org.telegram.telegrambots.meta.api.objects.File;
import org.telegram.telegrambots.meta.api.objects.InputFile;

import net.rossonet.ptalk.base.grpc.Data;
import net.rossonet.ptalk.base.grpc.Quality;
import net.rossonet.ptalk.base.grpc.DataType;
import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.channel.implementation.PTalkChannelRuntime;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ByteArrayOutputStream;

import java.nio.file.Files;
import java.nio.file.Paths;


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

	/*	@Override
	public void onUpdateReceived(Update update) {
		Message message = update.getMessage();
		String reply = "";
		String dataType = "Text";
		String payload = "";
		String filename = "";
		Long chatId = message.getChatId();
		Message currentMessage = update.getMessage();
		try {
			String fileId = "";
			if (currentMessage.hasAnimation()){
				dataType = "Animation";
				Animation animation = currentMessage.getAnimation();
				fileId = animation.getFileId();				
				filename = animation.getFileName();
				reply = "Animation: " + animation.getFileName();
			} else if (currentMessage.hasAudio()){
				dataType = "Audio";
				Audio audio = currentMessage.getAudio();
				fileId = audio.getFileId();
				filename = audio.getFileName();
				reply = "Audio: " + audio.getFileName();
			} else if (currentMessage.hasDocument()) {
				dataType = "Document";
				Document document = currentMessage.getDocument();
				fileId = document.getFileId();
				filename = document.getFileName();
				reply = "Document: " + filename;
			} else if (currentMessage.hasPhoto()){
				dataType = "Photo";
				List<PhotoSize> photo = currentMessage.getPhoto();
				fileId = photo.get(0).getFileId();
				filename = photo.get(0).toString();
				reply = "Photo: " + filename;
			} else if (currentMessage.hasSticker()){
				dataType = "Sticker";
				Sticker sticker = currentMessage.getSticker();
				fileId = sticker.getFileId();
				filename = sticker.getSetName();
				reply = "Sticker: " + sticker.getEmoji();
			}if (currentMessage.hasVideo()){
				dataType = "Video";
				Video video = currentMessage.getVideo();
				fileId = video.getFileId();
				filename = video.getFileName();
				reply = "Video: " + filename;
			} 

			if (currentMessage.hasText()){
				String txt = currentMessage.getText();
				if(reply.equals("")) 
					reply = "Message " + txt;
				else 
					reply += "; Message " + txt;
			}
			if(reply.equals("")) reply = "Invalid Message";
			if (fileId.equals("")) 
				sendMessageToPTalk(chatId, reply);
			else {
				GetFile requestFile = new GetFile();
				requestFile.setFileId(fileId);
				File file = execute(requestFile);
				URL fileURL = new URL(file.getFileUrl(getBotToken()));
				FileInputStream inputStream = new FileInputStream(fileURL);
				StringBuilder resultStringBuilder = new StringBuilder();
				BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
				String line;
				while ((line = br.readLine()) != null) {
					resultStringBuilder.append(line).append("\n");
				}
				br.close();
				byte[] fileBytes  = resultStringBuilder.toString().getBytes();
				//byte[] fileBytes = new URL(file.getFileUrl(getBotToken())).getFile().getBytes();
				Encoder encoder = Base64.getMimeEncoder();
				payload = encoder.encodeToString(fileBytes).replace("\n", "").replace("\r", "");
				sendMessageToPTalk(chatId, reply, dataType, payload, filename, fileId);
			}  
		} catch (TelegramApiException e) {
			logger.severe(e.getMessage());
		} catch (MalformedURLException e1) {
			logger.severe(e1.getMessage());
		} catch (FileNotFoundException e2) {
			logger.severe(e2.getMessage());
		} catch (IOException e3) {
			logger.severe(e3.getMessage());
		}
	}*/


	// onUpdateReceived deve ricevere il file, scaricarlo, codificarlo ed inviarlo a ptalk (sendMessageToPTalk)

	// sendMessageToUser deve ricevere il messaggio con il file codificato, decodificarlo ed inviarlo all'utente


	@Override
	public void onUpdateReceived(Update update) {
		Message message = update.getMessage();
		String caption = (message.getCaption() != null ? message.getCaption() : "");
		Long chatId = message.getChatId();
		String dataType = "Text";
		String currentId = "";
		String fileName =  "";
		//Importa file

		//contact e location sono casi particolari; non esiste file o documento TODO implementarli
		/*	if (message.hasContact()){
			Contact contact = message.getContact();
			dataType = "Contact";
			try {					
				SendContact sendContact = new SendContact();
				sendContact.setChatId(chatId);
				if (contact.getFirstName() != null) sendContact.setFirstName(contact.getFirstName());
				if (contact.getLastName() != null) sendContact.setLastName(contact.getLastName());
				if (contact.getPhoneNumber() != null) sendContact.setPhoneNumber(contact.getPhoneNumber());
				if (contact.getVCard() != null) sendContact.setVCard(contact.getVCard());  //emails

				execute(sendContact);

			} catch (TelegramApiException e) {
				e.printStackTrace();
			} 
		} else if (message.hasLocation()){
			dataType = "Location";
			Venue location = message.getVenue();
			try {					
				SendVenue sendLocation = new SendVenue();
				sendLocation.setChatId(chatId);
				sendLocation.setLatitude(location.getLocation().getLatitude());
				sendLocation.setLongitude(location.getLocation().getLongitude());
				sendLocation.setAddress(location.getAddress());
				sendLocation.setTitle(location.getTitle());

				execute(sendLocation);

			} catch (TelegramApiException e) {
				logger.severe(e.getMessage());
			} 
		} else*/ 
		if (message.hasDocument()){
			dataType = "Document";
			Document document = message.getDocument();
			currentId = document.getFileId();
			fileName = document.getFileName();

		}  else	if (message.hasAnimation()){
			dataType = "Animation";
			currentId = message.getAnimation().getFileId();
			
		} else if (message.hasAudio()){
			dataType = "Audio";
			currentId = message.getAudio().getFileId();

		}  else if (message.hasPhoto()){
			List<PhotoSize> photoSizes = message.getPhoto();
			dataType = "Photo";
			PhotoSize photoSize = photoSizes.get(photoSizes.size() - 1); 
			currentId = photoSize.getFileId();

		} else if (message.hasSticker()){
			dataType = "Sticker";
			currentId = message.getSticker().getFileId();

		} else if (message.hasVideo()){
			dataType = "Video";
			currentId = message.getVideo().getFileId();

		} else if (message.hasVoice()){
			dataType = "Voice";
			currentId = message.getVoice().getFileId();
		} 

		if (!dataType.equals("Text")) {
			try {
				//scarica file
				File  file = execute(new GetFile(currentId));

				if (fileName.equals("")) fileName =  file.getFilePath();
				URL url = new URL("https://api.telegram.org/file/bot" + getBotToken() + "/" + fileName);
				URLConnection connection = url.openConnection();
				InputStream inputStream = connection.getInputStream();
				byte[] targetArray = new byte[inputStream.available()];

				inputStream.read(targetArray);
				
				//codifica file
				Encoder encoder = Base64.getMimeEncoder();
				String payload = encoder.encodeToString(targetArray);

				//invia a PTalk
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

	private void sendMessageToPTalk(Long chatId, String message) {
		logger.info("Sending text to PTalk");
		pTalkChannelRuntime.sendMessage(String.valueOf(chatId), message);		
	}

	private void sendMessageToPTalk(Long chatId, String message, String dataType, String payload, 
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
		pTalkChannelRuntime.sendMessage(String.valueOf(chatId), message, new JSONObject(), datas);	
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


			         
			        
		        
			//InputFile inputFile = new InputFile(new ByteArrayInputStream(decodedFileBytes), filename);
			logger.info("Sending document to User");

				sendFile(Long.valueOf(chatId), inputFile, caption, mediaType);
				
			} catch (NumberFormatException | TelegramApiException e1) {
				logger.severe("ERROR WHILE SENDING MESSAGE: ");
				e1.printStackTrace();
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




	//https://core.telegram.org/bots/api#sending-files
	//fare untest che manda i documenti al bot oppure due bot che si mandano i mess a vicenda




	public void setPTalkChannelRuntime(PTalkChannelRuntime pTalkChannelRuntime) {
		this.pTalkChannelRuntime = pTalkChannelRuntime;
	}

	public void setTelegramConnector(TelegramConnector telegramConnector) {
		this.telegramConnector = telegramConnector;
	}
}
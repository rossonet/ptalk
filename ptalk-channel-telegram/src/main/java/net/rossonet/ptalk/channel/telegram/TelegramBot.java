package net.rossonet.ptalk.channel.telegram;

import java.util.List;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.GetFile;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Audio;
import org.telegram.telegrambots.meta.api.objects.Document;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.PhotoSize;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.Video;
import org.telegram.telegrambots.meta.api.objects.games.Animation;
import org.telegram.telegrambots.meta.api.objects.stickers.Sticker;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import org.telegram.telegrambots.meta.api.objects.File;

import net.rossonet.ptalk.base.grpc.Data;
import net.rossonet.ptalk.base.grpc.Quality;
import net.rossonet.ptalk.base.grpc.DataType;
import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.channel.implementation.PTalkChannelRuntime;

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

	/*@Override
	public void onUpdateReceived(Update update) {
		Message message = update.getMessage();
		String text = message.getText();
		Long chatId = message.getChatId();
		sendMessageToPTalk(chatId, text);
	}*/

	@Override
	public void onUpdateReceived(Update update) {
		Message message = update.getMessage();
		String reply = "";
		String dataType = "Text";
		//https://www.baeldung.com/java-base64-encode-and-decode  
		//in payload mettere la conversione base64 del file inviato dall'utente
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
			} else
			
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
				byte[] fileBytes = new URL(file.getFileUrl(getBotToken())).getFile().getBytes();
				payload = Base64.getMimeEncoder().encodeToString(fileBytes);
				sendMessageToPTalk(chatId, reply, dataType, payload, filename);
			}  


		} catch (TelegramApiException e) {
			logger.severe(e.getMessage());
		} catch (MalformedURLException e1) {
			logger.severe(e1.getMessage());
		} 
	}

	private void sendMessageToPTalk(Long chatId, String message) {
		pTalkChannelRuntime.sendMessage(String.valueOf(chatId), message);		
	}

	private void sendMessageToPTalk(Long chatId, String message, String dataType, String payload, String filename) {
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
		pTalkChannelRuntime.sendMessage(String.valueOf(chatId), message, new JSONObject(), datas);	
	}

	public void sendMessageToUser(ChannelMessageRequest messageRequest) {
		String chatId = messageRequest.getChannelUniqueName(); 
		String reply = messageRequest.getMessage().getValue().replace("ECHO MESSAGE OF:", "You sent ");
		SendMessage sendMessage = new SendMessage();
		sendMessage.setChatId(chatId);
		sendMessage.setText(reply);		
		try {
			execute(sendMessage);
		} catch (TelegramApiException e) {		
			logger.severe("ERROR WHILE SENDING MESSAGE: " + e.getMessage());
		}	
	}

	public void setPTalkChannelRuntime(PTalkChannelRuntime pTalkChannelRuntime) {
		this.pTalkChannelRuntime = pTalkChannelRuntime;
	}

	public void setTelegramConnector(TelegramConnector telegramConnector) {
		this.telegramConnector = telegramConnector;
	}
}
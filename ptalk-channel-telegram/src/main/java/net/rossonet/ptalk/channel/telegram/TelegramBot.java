package net.rossonet.ptalk.channel.telegram;

import java.io.IOException;
import java.util.logging.Logger;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updates.Close;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.channel.implementation.PTalkChannelRuntime;


@SuppressWarnings("deprecation")
public class TelegramBot extends TelegramLongPollingBot{
	public static final String BOT_USR_ENV = "BOT_USERNAME";
	public static final String BOT_TKN_ENV = "BOT_TOKEN";
	private static final Logger logger = Logger.getLogger(TelegramBot.class.getName());
	private PTalkChannelRuntime pTalkChannelRuntime;
	private TelegramConnector telegramConnector; 

	@Override
	public String getBotUsername() {
		return System.getenv(BOT_USR_ENV);
	}

	@Override
	public String getBotToken() {
		return System.getenv(BOT_TKN_ENV);
	}

	@Override
	public void onUpdateReceived(Update update) {
		Message message = update.getMessage();
		String text = message.getText();
		Long chatId = message.getChatId();
		sendMessageToPTalk(chatId, text);
	}

	public void sendMessageToUser(ChannelMessageRequest messageRequest) {
		String chatId = messageRequest.getChannelUniqueName(); 
		String reply = messageRequest.getMessage().getValue();
		SendMessage sendMessage = new SendMessage();
		sendMessage.setChatId(chatId);
		sendMessage.setText(reply);		
		try {
			execute(sendMessage);
		} catch (TelegramApiException e) {		
			logger.severe("ERROR WHILE SENDING MESSAGE: " + e.getMessage());
		}	
	}

	private void sendMessageToPTalk(Long chatId, String message) {
		pTalkChannelRuntime.sendMessage(String.valueOf(chatId), message);	
	}

	public void setPTalkChannelRuntime(PTalkChannelRuntime pTalkChannelRuntime) {
		this.pTalkChannelRuntime = pTalkChannelRuntime;
	}

	public void setTelegramConnector(TelegramConnector telegramConnector) {
		this.telegramConnector = telegramConnector;
	}

}
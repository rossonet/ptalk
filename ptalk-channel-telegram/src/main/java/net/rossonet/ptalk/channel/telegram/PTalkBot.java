package net.rossonet.ptalk.channel.telegram;

import java.util.logging.Logger;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import net.rossonet.ptalk.channel.implementation.PTalkChannelRuntime;


@SuppressWarnings("deprecation")
public class PTalkBot extends TelegramLongPollingBot{
	
	private static final Logger logger = Logger.getLogger(PTalkBot.class.getName());
	private Message message;
	private PTalkChannelRuntime pTalkChannelRuntime;

	@Override
	public String getBotUsername() {
		return System.getenv("botUsername");
	}
	
	@Override
	public String getBotToken() {
		return System.getenv("botToken");
	}
	
	@Override
	public void onUpdateReceived(Update update) {
		message = update.getMessage();
		sendMessageToUser();
		sendMessageToPTalk();	
	}
	
	
	private void sendMessageToUser() {
		String chatId = message.getChatId().toString();
		String userName = message.getFrom().getUserName();
		String reply = userName + " said: \"" + message.getText() + "\"; chatId: " + chatId;
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(reply);		
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {		
           e.printStackTrace();
        }	
	}

	private void sendMessageToPTalk() {
		pTalkChannelRuntime.sendMessage(this.getBotUsername(), message.getText());	
	}

	public Message getMessage() {
		return message;
	}

	public void setPTalkChannelRuntime(PTalkChannelRuntime pTalkChannelRuntime) {
		this.pTalkChannelRuntime = pTalkChannelRuntime;
	}
	
}

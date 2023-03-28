package net.rossonet.ptalk.channel.telegram;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class PTalkBot extends TelegramLongPollingBot{

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
		String msg = update.getMessage().getText();
		String chatId=update.getMessage().getChatId().toString();
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("You said: " + msg);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
           e.printStackTrace();
        }		
	}
}

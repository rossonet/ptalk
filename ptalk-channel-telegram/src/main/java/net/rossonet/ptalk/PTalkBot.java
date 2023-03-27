package net.rossonet.ptalk;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class PTalkBot extends TelegramLongPollingBot{

	@Override
	public String getBotUsername() {
		return "MyPTalkBot";
	}
	
	@Override
	public String getBotToken() {
		return "6220615065:AAGq3kVGGPFJImTiOvK0ib6Xub0rBcKflXQ";
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

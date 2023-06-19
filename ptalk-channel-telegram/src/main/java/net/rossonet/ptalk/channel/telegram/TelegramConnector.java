package net.rossonet.ptalk.channel.telegram;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Logger;

import org.rossonet.utils.LogHelper;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.updates.Close;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.generics.BotSession;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.channel.implementation.CommunicationHandler;
import net.rossonet.ptalk.channel.implementation.UnitChannelConfiguration;

public class TelegramConnector extends CommunicationHandler implements Closeable{

	private static final Logger logger = Logger.getLogger(TelegramConnector.class.getName());
	final UnitChannelConfiguration unitConfiguration = new UnitChannelConfiguration();
	private static final int UNIT_PORT = 11254;
	private Server server = null;
	private TelegramBot telegramBot;
	private BotSession botSession;

	@Override
	public void close() throws IOException {
		logger.info("Stopping Bot, please wait...");
		telegramBot.onClosing();
		if (telegramBot.isTerminated()) logger.info("Bot Stopped.");
		else logger.info("Bot NOT Stopped!");
		logger.info("Stopping Session, please wait...");
		botSession.stop();
		if (!botSession.isRunning()) logger.info("Session Stopped.");
		server = ServerBuilder.forPort(UNIT_PORT).addService(this).build();
		if (server != null) {
			logger.info("Shutting Down Server, please wait...");
			try {
				server.shutdown();
				server.awaitTermination();
				Thread.sleep(1000);
				if (server.isTerminated()) {
					logger.info("Server stopped.");
				} else {
					logger.info("Server NOT stopped!");
				}
			} catch (InterruptedException e) {
				logger.severe("Error waiting for server termination: \n" + LogHelper.stackTraceToString(e));
			}
		} else logger.severe("Server is null!");
	}

	@Override
	protected boolean messageFromPTalkEngine(ChannelMessageRequest message) {
		String name = message.getChannelUniqueName();
		String text = message.getMessage().getValue();
		logger.info("MessageFromPTalkEngine - RECEIVED: " + text + " FROM " + name);
		telegramBot.sendMessageToUser(message);		
		return true;
	}

	@Override
	public void start() {
		logger.info("Starting...");
		try {
			TelegramBotsApi api = new TelegramBotsApi(DefaultBotSession.class);
			telegramBot = new TelegramBot();
			botSession = api.registerBot(telegramBot);
			logger.info("Bot Successfully Connected");
			telegramBot.setPTalkChannelRuntime(pTalkChannelRuntime);
			telegramBot.setTelegramConnector(this);
		} catch (TelegramApiRequestException e1) {
			logger.severe("Error starting the server: \n" + LogHelper.stackTraceToString(e1));
		} catch (Exception e2) {
			logger.severe("Error starting the server:  \n" + LogHelper.stackTraceToString(e2));
		}
	}
}
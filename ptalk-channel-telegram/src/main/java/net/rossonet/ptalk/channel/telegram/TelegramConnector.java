package net.rossonet.ptalk.channel.telegram;

import java.io.Closeable;
import java.io.IOException;
import java.util.UUID;
import java.util.logging.Logger;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import net.rossonet.ptalk.base.grpc.LifecycleStatus;
import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.channel.implementation.CommunicationHandler;
import net.rossonet.ptalk.channel.implementation.UnitChannelConfiguration;

public class TelegramConnector extends CommunicationHandler implements Closeable{

	private final String uniqueName = UUID.randomUUID().toString();
	private LifecycleStatus lifecycleStatus = LifecycleStatus.INIT;
	private static final Logger logger = Logger.getLogger(TelegramConnector.class.getName());
	final UnitChannelConfiguration unitConfiguration = new UnitChannelConfiguration();
	private static final long SLEEP = 5 * 60000; // 5 min.
	private static final int UNIT_PORT = 11254;
	Server server = null;


	@Override
	public void close() throws IOException {
		server = ServerBuilder.forPort(UNIT_PORT).addService(this).build();
		if (server != null) {
			logger.info("Shutting Down Server, please wait...");
			try {
				server.shutdown();
				server.awaitTermination();
				Thread.sleep(1000);
				if (server.isShutdown()) {
					logger.info("Server stopped");
				} else {
					logger.info("Server NOT stopped");
				}
			} catch (InterruptedException e) {
				logger.severe("Error waiting for server termination: " + e.getMessage());
			}
		} else logger.info("Server is null");
	}

	@Override
	protected boolean messageFromPTalkEngine(ChannelMessageRequest message) {
		// TODO inviare il messaggio all'utente Telegram
		//pTalkChannelRuntime.sendMessage(uniqueName, message.toString());
		return false;
	}

	@Override
	public void start() {
		// TODO avviare il connettore
		logger.info("Starting...");
		try {
			
			  ApiContextInitializer.init();
		        TelegramBotsApi api = new TelegramBotsApi();
		        try {
		            api.registerBot(new PTalkBot());
		        } catch (TelegramApiRequestException e) {
		        	e.printStackTrace();        
		        }
			

		} catch (Exception e) {
			logger.severe("Error starting the server: " + e.getMessage());
		}

	}



	// TODO Ricevere messaggi dall'utente telegram
	// esempio ricezione messaggio da Telegram, per inviarlo all'engine
	// pTalkChannelRuntime.sendMessage(name1, message1);
	// pTalkChannelRuntime.sendMessage(...);

}

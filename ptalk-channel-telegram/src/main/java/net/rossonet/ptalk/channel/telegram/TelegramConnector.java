package net.rossonet.ptalk.channel.telegram;

import java.io.Closeable;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import net.rossonet.ptalk.base.grpc.LifecycleStatus;
import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.channel.implementation.CommunicationHandler;
import net.rossonet.ptalk.channel.implementation.PTalkChannelRuntime;
import net.rossonet.ptalk.channel.implementation.UnitChannelConfiguration;
import net.rossonet.ptalk.channel.simulation.FakePTalkEngine;
import net.rossonet.ptalk.engine.GlobalConfiguration;
import net.rossonet.ptalk.engine.PTalkEngineRuntime;

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
		// TODO Auto-generated method stub
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
			pTalkChannelRuntime.sendMessage(uniqueName, "/start");
			
			while (!lifecycleStatus.equals(LifecycleStatus.RUNNING)) {
				logger.info("Waiting for connector to start; Connector status: " + lifecycleStatus.getValueDescriptor());
				Thread.sleep(5000);
			}   
			if (lifecycleStatus.equals(LifecycleStatus.RUNNING)) 
				logger.info("Connector Started!");
			else 
				logger.info("Connector NOT Started!");

		} catch (Exception e) {
			logger.severe("Error starting the server: " + e.getMessage());
		}

	}



	// TODO Ricevere messaggi dall'utente telegram
	// esempio ricezione messaggio da Telegram, per inviarlo all'engine
	// pTalkChannelRuntime.sendMessage(name1, message1);
	// pTalkChannelRuntime.sendMessage(...);

}

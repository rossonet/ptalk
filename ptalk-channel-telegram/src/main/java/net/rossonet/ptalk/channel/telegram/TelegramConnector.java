package net.rossonet.ptalk.channel.telegram;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Logger;

import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.channel.implementation.CommunicationHandler;

public class TelegramConnector extends CommunicationHandler implements Closeable {

	private static final Logger logger = Logger.getLogger(TelegramConnector.class.getName());

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean messageFromPTalkEngine(ChannelMessageRequest message) {
		// TODO inviare il messaggio all'utente Telegram
		return false;
	}

	@Override
	public void start() {
		// TODO avviare il connettore

	}

	// TODO Ricevere messaggi dall'utente telegram
	// esempio ricezione messaggio da Telegram, periviarlo all'engine

	// pTalkChannelRuntime.sendMessage(...);

}

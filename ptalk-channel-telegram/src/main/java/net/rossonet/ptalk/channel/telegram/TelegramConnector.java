package net.rossonet.ptalk.channel.telegram;

import java.util.logging.Logger;

import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.channel.implementation.CommunicationHandler;

public class TelegramConnector extends CommunicationHandler {

	private static final Logger logger = Logger.getLogger(TelegramConnector.class.getName());

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
	// pTalkChannelRuntime.sendMessage(name1, message1);
	// pTalkChannelRuntime.sendMessage(...);

}

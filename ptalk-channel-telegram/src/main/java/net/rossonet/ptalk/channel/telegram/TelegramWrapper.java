package net.rossonet.ptalk.channel.telegram;

import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.channel.grpc.RpcChannelCoreV1Grpc.RpcChannelCoreV1BlockingStub;

public class TelegramWrapper {

	private final PTalkChannelRuntime pTalkChannelRuntime;
	private final RpcChannelCoreV1BlockingStub channelToEngine;

	public TelegramWrapper(PTalkChannelRuntime pTalkChannelRuntime) {
		this.pTalkChannelRuntime = pTalkChannelRuntime;
		channelToEngine = pTalkChannelRuntime.getChannelSyncStub();
		registerTelegramChannel();
	}

	private void registerTelegramChannel() {
		// TODO registrazione canale telegram

	}

	public boolean messageFromPtalkEngine(ChannelMessageRequest request) {
		// TODO messaggio da engine verso utente telegram
		return false;
	}

	private sendToPtalkEngine() {
		
	}

}

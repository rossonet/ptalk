package net.rossonet.ptalk.engine.runtime.fact.channel;

import net.rossonet.ptalk.engine.PTalkEngineRuntime;
import net.rossonet.ptalk.engine.runtime.fact.PTalkFact;

public class ChannelCommunicationFact implements PTalkFact {

	private final String traceId;
	private final PTalkEngineRuntime pTalkEngineRuntime;

	public ChannelCommunicationFact(PTalkEngineRuntime pTalkEngineRuntime, String traceId) {
		this.traceId = traceId;
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	@Override
	public String getTraceId() {
		return traceId;
	}

	public void sendMessage(InputMessageFact inputMessageFact, String message) {
		sendMessage(inputMessageFact.getChannelUniqueName(), message);
	}

	public void sendMessage(OutputMessageFact outputMessageFact) {
		pTalkEngineRuntime.sendMessageToChannel(outputMessageFact);
	}

	public void sendMessage(String channelUniqueName, String message) {
		pTalkEngineRuntime.sendMessageToChannel(new OutputMessageFact(traceId, channelUniqueName, message));
	}
}

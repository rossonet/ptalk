package net.rossonet.ptalk.engine.runtime.fact.channel;

import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;

public class OutputMessageFact {

	private final String traceId;
	private final String channel;
	private final String channelUniqueName;
	private final String message;

	public OutputMessageFact(String traceId, String channel, String channelUniqueName, String message) {
		this.traceId = traceId;
		this.channel = channel;
		this.channelUniqueName = channelUniqueName;
		this.message = message;
	}

	public String getChannel() {
		return channel;
	}

	public ChannelMessageRequest getChannelMessageRequest() {
		// TODO generare il messaggio di risposta
		return null;
	}

	public String getChannelUniqueName() {
		return channelUniqueName;
	}

	public String getMessage() {
		return message;
	}

	public String getTraceId() {
		return traceId;
	}

}

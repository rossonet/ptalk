package net.rossonet.ptalk.engine.runtime.fact.channel;

import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;

public class InputMessageFact {

	private final ChannelMessageRequest request;

	public InputMessageFact(ChannelMessageRequest request) {
		this.request = request;
	}

	public String getChannelUniqueMessageId() {
		return request.getChannelUniqueMessageId();
	}

	public String getChannelUniqueName() {
		return request.getChannelUniqueName();
	}

	public String getMessageValue() {
		return request.getMessage().getValue();
	}

	@Override
	public String toString() {
		return request.toString();
	}

}

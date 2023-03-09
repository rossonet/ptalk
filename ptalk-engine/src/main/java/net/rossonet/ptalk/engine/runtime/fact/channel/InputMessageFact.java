package net.rossonet.ptalk.engine.runtime.fact.channel;

import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.engine.runtime.fact.memory.MemoryData;

public class InputMessageFact extends MemoryData<InputMessageFact> {

	private static final long serialVersionUID = -1027676770315866823L;
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

	public boolean isTraceEnable() {
		return request.getTraceLog();
	}

	@Override
	public String toString() {
		return request.toString();
	}

}

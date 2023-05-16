package net.rossonet.ptalk.engine.runtime.fact.channel;

import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.engine.runtime.fact.PTalkFact;
import net.rossonet.ptalk.engine.runtime.fact.memory.MemoryData;

public class InputMessageFact extends MemoryData<InputMessageFact> implements PTalkFact {

	private static final long serialVersionUID = -1027676770315866823L;
	private final ChannelMessageRequest request;
	private final String traceId;

	public InputMessageFact(String traceId, ChannelMessageRequest request) {
		this.traceId = traceId;
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
	public String getTraceId() {
		return traceId;
	}

	public boolean isTraceEnable() {
		return request.getTraceLog();
	}

	@Override
	public String toString() {
		return request.toString();
	}

}

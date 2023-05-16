package net.rossonet.ptalk.engine.runtime.fact.channel;

import java.util.UUID;

import net.rossonet.ptalk.base.grpc.Data;
import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.engine.runtime.fact.PTalkFact;
import net.rossonet.ptalk.engine.runtime.fact.memory.MemoryData;

public class OutputMessageFact extends MemoryData<OutputMessageFact> implements PTalkFact {

	private static final long serialVersionUID = -4363439337218687662L;
	private final String traceId;
	private final String channelUniqueName;
	private final String message;

	public OutputMessageFact(String traceId, String channelUniqueName, String message) {
		this.traceId = traceId;
		this.channelUniqueName = channelUniqueName;
		this.message = message;
	}

	public ChannelMessageRequest getChannelMessageRequest() {
		return ChannelMessageRequest.newBuilder().setFlowReference(traceId).setChannelUniqueName(channelUniqueName)
				.setChannelUniqueMessageId(UUID.randomUUID().toString())
				.setMessage(Data.newBuilder().setValue(message).build()).build();
	}

	public String getChannelUniqueName() {
		return channelUniqueName;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String getTraceId() {
		return traceId;
	}

}

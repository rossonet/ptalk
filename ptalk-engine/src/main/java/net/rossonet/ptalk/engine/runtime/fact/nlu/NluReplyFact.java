package net.rossonet.ptalk.engine.runtime.fact.nlu;

import net.rossonet.ptalk.engine.runtime.fact.PTalkFact;
import net.rossonet.ptalk.nlu.grpc.NluMessageReply;

public class NluReplyFact implements PTalkFact {

	private final NluMessageReply nluReply;

	private final String traceId;

	public NluReplyFact(String traceId, NluMessageReply nluReply) {
		this.nluReply = nluReply;
		this.traceId = traceId;
	}

	public String getMessageValue() {
		return nluReply.getReply().getValue();

	}

	@Override
	public String getTraceId() {
		return traceId;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("NluReplyFact [nluReply=");
		builder.append(nluReply);
		builder.append("]");
		return builder.toString();
	}
}

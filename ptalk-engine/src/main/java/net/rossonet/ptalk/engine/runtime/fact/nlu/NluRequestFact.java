package net.rossonet.ptalk.engine.runtime.fact.nlu;

import net.rossonet.ptalk.base.grpc.Data;
import net.rossonet.ptalk.engine.runtime.fact.PTalkFact;
import net.rossonet.ptalk.nlu.grpc.NluMessageRequest;

public class NluRequestFact implements PTalkFact {

	private static final String NLU_MESSAGE_KEY = "main-message";

	public static NluRequestFact fromMessage(String traceId, String message) {
		return new NluRequestFact(traceId, message);
	}

	private final String message;

	private final String traceId;

	private NluRequestFact(String traceId, String message) {
		this.message = message;
		this.traceId = traceId;
	}

	public String getMessage() {
		return message;
	}

	public NluMessageRequest getNluMessageRequest(String context) {
		return NluMessageRequest.newBuilder().setMessage(Data.newBuilder().setValue(message).setKey(NLU_MESSAGE_KEY))
				.setContextJson(context).build();
	}

	@Override
	public String getTraceId() {
		return traceId;
	}
}

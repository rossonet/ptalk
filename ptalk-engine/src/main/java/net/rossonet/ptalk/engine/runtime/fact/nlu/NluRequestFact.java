package net.rossonet.ptalk.engine.runtime.fact.nlu;

import net.rossonet.ptalk.base.grpc.Data;
import net.rossonet.ptalk.engine.runtime.fact.PTalkFact;
import net.rossonet.ptalk.engine.runtime.fact.memory.MemoryData;
import net.rossonet.ptalk.nlu.grpc.NluMessageRequest;
import net.rossonet.ptalk.nlu.grpc.NluModel;

public class NluRequestFact extends MemoryData<NluRequestFact> implements PTalkFact {

	private static final long serialVersionUID = 306471530559468603L;

	private static final String NLU_MESSAGE_KEY = "main-message";

	public static NluRequestFact fromMessage(String model, String traceId, String message) {
		return new NluRequestFact(model, traceId, message);
	}

	private final String message;

	private final String traceId;

	private final String model;

	private NluRequestFact(String model, String traceId, String message) {
		this.message = message;
		this.traceId = traceId;
		this.model = model;
	}

	public String getMessage() {
		return message;
	}

	public String getModel() {
		return model;
	}

	public NluMessageRequest getNluMessageRequest() {
		return NluMessageRequest.newBuilder().setModel(NluModel.newBuilder().setModel(getModel()))
				.setMessage(Data.newBuilder().setValue(message).setKey(NLU_MESSAGE_KEY)).build();
	}

	@Override
	public String getTraceId() {
		return traceId;
	}
}

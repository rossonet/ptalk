package net.rossonet.ptalk.engine.runtime.fact.nlu;

public class NluCommunicationFact {

	private final String traceId;

	public NluCommunicationFact(String traceId) {
		this.traceId = traceId;
	}

	public String getTraceId() {
		return traceId;
	}

}

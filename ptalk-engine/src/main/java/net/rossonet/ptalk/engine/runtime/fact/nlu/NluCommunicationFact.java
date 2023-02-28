package net.rossonet.ptalk.engine.runtime.fact.nlu;

import net.rossonet.ptalk.engine.runtime.fact.PTalkFact;

public class NluCommunicationFact implements PTalkFact {

	private final String traceId;

	public NluCommunicationFact(String traceId) {
		this.traceId = traceId;
	}

	@Override
	public String getTraceId() {
		return traceId;
	}

}

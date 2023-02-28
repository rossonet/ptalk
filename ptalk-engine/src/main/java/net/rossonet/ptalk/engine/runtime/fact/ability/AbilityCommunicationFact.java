package net.rossonet.ptalk.engine.runtime.fact.ability;

import net.rossonet.ptalk.engine.runtime.fact.PTalkFact;

public class AbilityCommunicationFact implements PTalkFact {

	private final String traceId;

	public AbilityCommunicationFact(String traceId) {
		this.traceId = traceId;
	}

	@Override
	public String getTraceId() {
		return traceId;
	}
}

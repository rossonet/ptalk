package net.rossonet.ptalk.engine.runtime.fact.superManager;

import net.rossonet.ptalk.engine.runtime.fact.PTalkFact;

public class SuperManagerFact implements PTalkFact {

	private final String traceId;

	public SuperManagerFact(String traceId) {
		this.traceId = traceId;
	}

	@Override
	public String getTraceId() {
		return traceId;
	}
}

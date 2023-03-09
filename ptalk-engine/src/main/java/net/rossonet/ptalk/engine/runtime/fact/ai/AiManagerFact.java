package net.rossonet.ptalk.engine.runtime.fact.ai;

import net.rossonet.ptalk.engine.runtime.fact.PTalkFact;

public class AiManagerFact implements PTalkFact {

	private final String traceId;

	public AiManagerFact(String traceId) {
		this.traceId = traceId;
	}

	@Override
	public String getTraceId() {
		return traceId;
	}
}

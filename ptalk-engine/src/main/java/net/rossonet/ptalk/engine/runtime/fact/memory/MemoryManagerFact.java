package net.rossonet.ptalk.engine.runtime.fact.memory;

import net.rossonet.ptalk.engine.runtime.fact.PTalkFact;

public class MemoryManagerFact implements PTalkFact {

	private final String traceId;

	public MemoryManagerFact(String traceId) {
		this.traceId = traceId;
	}

	@Override
	public String getTraceId() {
		return traceId;
	}
}

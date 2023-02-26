package net.rossonet.ptalk.engine.runtime.fact.memory;

public class MemoryManagerFact {

	private final String traceId;

	public MemoryManagerFact(String traceId) {
		this.traceId = traceId;
	}

	public String getTraceId() {
		return traceId;
	}
}

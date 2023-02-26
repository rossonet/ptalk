package net.rossonet.ptalk.engine.runtime.fact.extensions;

public class ExtensionsManagerFact {

	private final String traceId;

	public ExtensionsManagerFact(String traceId) {
		this.traceId = traceId;
	}

	public String getTraceId() {
		return traceId;
	}
}

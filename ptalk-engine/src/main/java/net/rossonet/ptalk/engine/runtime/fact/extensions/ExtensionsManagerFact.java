package net.rossonet.ptalk.engine.runtime.fact.extensions;

import net.rossonet.ptalk.engine.runtime.fact.PTalkFact;

public class ExtensionsManagerFact implements PTalkFact {

	private final String traceId;

	public ExtensionsManagerFact(String traceId) {
		this.traceId = traceId;
	}

	@Override
	public String getTraceId() {
		return traceId;
	}
}

package net.rossonet.ptalk.engine.runtime.fact.NextHop;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import net.rossonet.ptalk.engine.runtime.ExecutionLogger;

public class NextHopManagerFact {

	private final String traceId;
	private final Set<NextHop> nextHops = new HashSet<>();

	public NextHopManagerFact(String traceId) {
		this.traceId = traceId;
	}

	public void addNextHop(String target) {
		ExecutionLogger.getTraceLoggerFor(traceId).addedNextHop(traceId, target);
		nextHops.add(new NextHop(target, traceId));
	}

	public Collection<NextHop> getNextHops() {
		return nextHops;
	}

}

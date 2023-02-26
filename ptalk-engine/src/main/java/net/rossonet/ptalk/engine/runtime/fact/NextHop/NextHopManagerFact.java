package net.rossonet.ptalk.engine.runtime.fact.NextHop;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import net.rossonet.ptalk.engine.PTalkEngineRuntime;

public class NextHopManagerFact {

	private final String traceId;
	private final Set<NextHop> nextHops = new HashSet<>();
	private final PTalkEngineRuntime pTalkEngineRuntime;

	public NextHopManagerFact(PTalkEngineRuntime pTalkEngineRuntime, String traceId) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
		this.traceId = traceId;
	}

	public void addNextHop(String target, String scheduler) {
		pTalkEngineRuntime.getExecutionLogger().addedNextHop(traceId, target);
		nextHops.add(new NextHop(NextHopSchedulerType.valueOf(scheduler), target, traceId));
	}

	public Collection<NextHop> getNextHops() {
		return nextHops;
	}

}

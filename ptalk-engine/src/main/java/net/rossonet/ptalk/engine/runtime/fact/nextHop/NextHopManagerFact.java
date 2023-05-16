package net.rossonet.ptalk.engine.runtime.fact.nextHop;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import net.rossonet.ptalk.engine.PTalkEngineRuntime;
import net.rossonet.ptalk.engine.runtime.fact.PTalkFact;
import net.rossonet.ptalk.engine.runtime.fact.channel.InputMessageFact;

public class NextHopManagerFact implements PTalkFact {

	private final String traceId;
	private final Set<NextHop> nextHops = new HashSet<>();
	private final PTalkEngineRuntime pTalkEngineRuntime;

	public NextHopManagerFact(PTalkEngineRuntime pTalkEngineRuntime, String traceId) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
		this.traceId = traceId;
	}

	public void addNextHop(String target) {
		addNextHop(target, false);
	}

	public void addNextHop(String target, boolean trace) {
		addNextHop(target, NextHopSchedulerType.LOCAL.name(), trace);
	}

	public void addNextHop(String target, InputMessageFact inputMessageFact) {
		addNextHop(target, inputMessageFact.isTraceEnable());
	}

	public void addNextHop(String target, String scheduler, boolean trace) {
		pTalkEngineRuntime.getExecutionLogger().addedNextHop(traceId, target, scheduler, trace);
		nextHops.add(new NextHop(NextHopSchedulerType.valueOf(scheduler), target, traceId, trace));
	}

	public Collection<NextHop> getNextHops() {
		return nextHops;
	}

	@Override
	public String getTraceId() {
		return traceId;
	}

}

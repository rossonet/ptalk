package net.rossonet.ptalk.engine.runtime.fact.nextHop;

public class NextHop {

	private final String target;
	private final String origin;
	private final NextHopSchedulerType nextHopSchedulerType;
	private final boolean trace;

	public NextHop(NextHopSchedulerType nextHopSchedulerType, String target, String origin, boolean trace) {
		this.target = target;
		this.origin = origin;
		this.trace = trace;
		this.nextHopSchedulerType = nextHopSchedulerType;
	}

	public boolean isTraceOnLog() {
		return trace;
	}

	public NextHopSchedulerType getNextHopSchedulerType() {
		return nextHopSchedulerType;
	}

	public String getOrigin() {
		return origin;
	}

	public String getTarget() {
		return target;
	}

}

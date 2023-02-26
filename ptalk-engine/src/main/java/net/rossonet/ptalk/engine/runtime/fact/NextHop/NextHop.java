package net.rossonet.ptalk.engine.runtime.fact.NextHop;

public class NextHop {

	private final String target;
	private final String origin;
	private final NextHopSchedulerType nextHopSchedulerType;

	public NextHop(NextHopSchedulerType nextHopSchedulerType, String target, String origin) {
		this.target = target;
		this.origin = origin;
		this.nextHopSchedulerType = nextHopSchedulerType;
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

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("NextHop [target=");
		builder.append(target);
		builder.append(", origin=");
		builder.append(origin);
		builder.append(", nextHopSchedulerType=");
		builder.append(nextHopSchedulerType);
		builder.append("]");
		return builder.toString();
	}

}

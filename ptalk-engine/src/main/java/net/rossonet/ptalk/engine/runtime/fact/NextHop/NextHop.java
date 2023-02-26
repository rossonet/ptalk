package net.rossonet.ptalk.engine.runtime.fact.NextHop;

public class NextHop {

	private final String target;
	private final String origin;

	public NextHop(String target, String origin) {
		this.target = target;
		this.origin = origin;
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
		builder.append("]");
		return builder.toString();
	}

}

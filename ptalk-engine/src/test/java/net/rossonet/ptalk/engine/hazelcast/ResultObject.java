package net.rossonet.ptalk.engine.hazelcast;

import java.io.Serializable;

public class ResultObject implements Serializable {

	private long firstParameter = 0;
	private long secondParameter = 0;

	public long getFirstParameter() {
		return firstParameter;
	}

	public long getSecondParameter() {
		return secondParameter;
	}

	public void incrementFirst() {
		firstParameter++;
	}

	public void incrementSecond() {
		secondParameter++;
	}

	public void setFirstParameter(int firstParameter) {
		this.firstParameter = firstParameter;
	}

	public void setSecondParameter(int secondParameter) {
		this.secondParameter = secondParameter;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("ResultObject [firstParameter=");
		builder.append(firstParameter);
		builder.append(", secondParameter=");
		builder.append(secondParameter);
		builder.append("]");
		return builder.toString();
	}

}

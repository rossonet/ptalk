package net.rossonet.ptalk.engine.hazelcast;

import java.io.Serializable;
import java.util.UUID;

public class HazelcastExampleData implements Serializable {
	private static final long serialVersionUID = -1105488524171886859L;
	private String dataText1 = null;
	private String dataText2 = null;
	private Long number = 5L;
	private final Long id = UUID.randomUUID().getLeastSignificantBits();
	private boolean bool = false;

	public String getDataText1() {
		return dataText1;
	}

	public String getDataText2() {
		return dataText2;
	}

	public long getId() {
		return id;
	}

	public long getNumber() {
		return number;
	}

	public boolean isBool() {
		return bool;
	}

	public void setBool(boolean bool) {
		this.bool = bool;
	}

	public void setDataText1(String dataText1) {
		this.dataText1 = dataText1;
	}

	public void setDataText2(String dataText2) {
		this.dataText2 = dataText2;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("HazelcastExampleData [id=");
		builder.append(id);
		builder.append(", dataText1=");
		builder.append(dataText1);
		builder.append(", dataText2=");
		builder.append(dataText2);
		builder.append(", number=");
		builder.append(number);
		builder.append(", bool=");
		builder.append(bool);
		builder.append("]");
		return builder.toString();
	}

}

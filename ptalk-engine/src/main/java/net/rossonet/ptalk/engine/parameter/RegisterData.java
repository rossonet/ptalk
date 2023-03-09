package net.rossonet.ptalk.engine.parameter;

import java.io.Serializable;

import net.rossonet.ptalk.base.grpc.Data;
import net.rossonet.ptalk.base.grpc.Timestamp;

public class RegisterData implements Serializable {

	private static final long serialVersionUID = 6708600499152729283L;
	private final String description;
	private final String displayName;
	private final String key;
	private final int priority;
	private final String quality;
	private final String shortDescription;

	private final Timestamp timestamp;

	private final String typeData;

	private final String value;

	private final long weight;

	public RegisterData(Data data) {
		this.description = data.getDescription();
		this.displayName = data.getDisplayName();
		this.key = data.getKey();
		this.priority = data.getPriority();
		this.quality = data.getQuality().name();
		this.shortDescription = data.getShortDescription();
		this.timestamp = data.getTimestamp();
		this.typeData = data.getTypeData().name();
		this.value = data.getValue();
		this.weight = data.getWeight();
	}

	public String getDescription() {
		return description;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getKey() {
		return key;
	}

	public int getPriority() {
		return priority;
	}

	public String getQuality() {
		return quality;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public String getTypeData() {
		return typeData;
	}

	public String getValue() {
		return value;
	}

	public long getWeight() {
		return weight;
	}

}

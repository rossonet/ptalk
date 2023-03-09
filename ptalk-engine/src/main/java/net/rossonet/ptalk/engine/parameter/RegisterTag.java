package net.rossonet.ptalk.engine.parameter;

import java.io.Serializable;

import net.rossonet.ptalk.base.grpc.Tag;

public class RegisterTag implements Serializable {

	private static final long serialVersionUID = -1727077280241181116L;
	private final String description;
	private final String displayName;
	private final String shortDescription;
	private final String tag;
	private final String tagFather;

	public RegisterTag(Tag tag) {
		this.description = tag.getDescription();
		this.displayName = tag.getDisplayName();
		this.shortDescription = tag.getShortDescription();
		this.tag = tag.getTag();
		this.tagFather = tag.getTagFather();
	}

	public String getDescription() {
		return description;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getTag() {
		return tag;
	}

	public String getTagFather() {
		return tagFather;
	}

}

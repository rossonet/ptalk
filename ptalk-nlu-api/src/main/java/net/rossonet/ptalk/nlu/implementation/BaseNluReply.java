package net.rossonet.ptalk.nlu.implementation;

public class BaseNluReply {

	private String originalContext;
	private final String originalMessage;

	public BaseNluReply(String contextJson, String message) {
		this.originalContext = contextJson;
		this.originalMessage = message;
	}

	public String getOriginalContext() {
		return originalContext;
	}

	public String getTextReply() {
		return "this is nlu reply of a message with " + originalMessage.length() + " characters";
	}

	public boolean isCompleted() {
		return true;
	}

	public void setOriginalContext(String originalContext) {
		this.originalContext = originalContext;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("BaseNluReply [originalContext=");
		builder.append(originalContext);
		builder.append(", originalMessage=");
		builder.append(originalMessage);
		builder.append("]");
		return builder.toString();
	}

}

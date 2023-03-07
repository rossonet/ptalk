package net.rossonet.ptalk.engine.runtime.fact.nlu;

import java.io.Serializable;

import net.rossonet.ptalk.nlu.grpc.TrainingLineLog;

public class LineLog implements Serializable {

	private static final long serialVersionUID = 5821519113442919469L;

	private final String logLevel;

	private final String message;

	private final long timeStamp;

	public LineLog(TrainingLineLog logLine) {
		logLevel = logLine.getLogLevel();
		message = logLine.getMessage();
		timeStamp = logLine.getTimestamp().getMilliSeconds();
	}

	public String getLogLevel() {
		return logLevel;
	}

	public String getMessage() {
		return message;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("LineLog [timeStamp=");
		builder.append(timeStamp);
		builder.append(", logLevel=");
		builder.append(logLevel);
		builder.append(", message=");
		builder.append(message);
		builder.append("]");
		return builder.toString();
	}

}

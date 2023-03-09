package net.rossonet.ptalk.engine.exceptions;

public class TaskManagerException extends Exception {

	private static final long serialVersionUID = -8480084901473199502L;

	public TaskManagerException(Exception cause) {
		super(cause);
	}

	public TaskManagerException(String message) {
		super(message);
	}

	public TaskManagerException(String message, Exception cause) {
		super(message, cause);
	}

}

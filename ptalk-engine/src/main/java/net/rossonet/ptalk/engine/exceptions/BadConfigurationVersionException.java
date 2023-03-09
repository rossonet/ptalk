package net.rossonet.ptalk.engine.exceptions;

public class BadConfigurationVersionException extends TaskManagerException {

	private static final long serialVersionUID = -1895146182747371018L;

	public BadConfigurationVersionException(Exception cause) {
		super(cause);
	}

	public BadConfigurationVersionException(String message) {
		super(message);
	}

	public BadConfigurationVersionException(String message, Exception cause) {
		super(message, cause);
	}

}

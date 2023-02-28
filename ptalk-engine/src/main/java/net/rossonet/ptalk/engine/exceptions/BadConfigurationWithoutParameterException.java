package net.rossonet.ptalk.engine.exceptions;

public class BadConfigurationWithoutParameterException extends TaskManagerException {

	private static final long serialVersionUID = -6661962371893040579L;

	public BadConfigurationWithoutParameterException(Exception cause) {
		super(cause);
	}

	public BadConfigurationWithoutParameterException(String message) {
		super(message);
	}

	public BadConfigurationWithoutParameterException(String message, Exception cause) {
		super(message, cause);
	}

}

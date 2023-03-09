package net.rossonet.ptalk.engine.exceptions;

public class BadConfigurationException extends TaskManagerException {

	private static final long serialVersionUID = -8668541602758960354L;

	public BadConfigurationException(Exception cause) {
		super(cause);
	}

	public BadConfigurationException(String message) {
		super(message);
	}

	public BadConfigurationException(String message, Exception cause) {
		super(message, cause);
	}

}

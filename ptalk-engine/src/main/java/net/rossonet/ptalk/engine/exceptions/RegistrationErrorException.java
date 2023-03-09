package net.rossonet.ptalk.engine.exceptions;

public class RegistrationErrorException extends TaskManagerException {

	private static final long serialVersionUID = -5138327182449759390L;

	public RegistrationErrorException(String message) {
		super(message);
	}

	public RegistrationErrorException(String message, Exception cause) {
		super(message, cause);
	}

}

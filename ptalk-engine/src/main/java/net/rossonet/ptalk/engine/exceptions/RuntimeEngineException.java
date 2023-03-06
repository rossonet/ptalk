package net.rossonet.ptalk.engine.exceptions;

public class RuntimeEngineException extends TaskManagerException {

	private static final long serialVersionUID = -5907000943688200016L;

	public RuntimeEngineException(Exception cause) {
		super(cause);
	}

	public RuntimeEngineException(String message) {
		super(message);
	}

	public RuntimeEngineException(String message, Exception cause) {
		super(message, cause);
	}

}

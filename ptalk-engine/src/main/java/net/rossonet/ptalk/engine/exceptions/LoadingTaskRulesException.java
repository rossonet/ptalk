package net.rossonet.ptalk.engine.exceptions;

public class LoadingTaskRulesException extends TaskManagerException {

	private static final long serialVersionUID = -2471654084779285542L;

	public LoadingTaskRulesException(Exception cause) {
		super(cause);
	}

	public LoadingTaskRulesException(String message) {
		super(message);
	}

	public LoadingTaskRulesException(String message, Exception cause) {
		super(message, cause);
	}

}

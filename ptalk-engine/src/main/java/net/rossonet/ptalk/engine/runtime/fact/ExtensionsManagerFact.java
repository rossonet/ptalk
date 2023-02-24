package net.rossonet.ptalk.engine.runtime.fact;

import net.rossonet.ptalk.engine.runtime.Task;

public class ExtensionsManagerFact {

	private static final ExtensionsManagerFact INSTANCE = new ExtensionsManagerFact();

	public static ExtensionsManagerFact getInstance(Task rulesEngineTask) {
		INSTANCE.register(rulesEngineTask);
		return INSTANCE;
	}

	private void register(Task rulesEngineTask) {
		// TODO Auto-generated method stub

	}

}

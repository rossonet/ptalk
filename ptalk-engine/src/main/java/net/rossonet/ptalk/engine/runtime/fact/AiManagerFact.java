package net.rossonet.ptalk.engine.runtime.fact;

import net.rossonet.ptalk.engine.runtime.Task;

public class AiManagerFact {

	private static final AiManagerFact INSTANCE = new AiManagerFact();

	public static AiManagerFact getInstance(Task rulesEngineTask) {
		INSTANCE.register(rulesEngineTask);
		return INSTANCE;
	}

	private void register(Task rulesEngineTask) {
		// TODO Auto-generated method stub

	}

}

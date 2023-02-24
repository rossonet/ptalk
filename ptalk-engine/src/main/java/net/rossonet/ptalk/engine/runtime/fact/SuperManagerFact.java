package net.rossonet.ptalk.engine.runtime.fact;

import net.rossonet.ptalk.engine.runtime.Task;

public class SuperManagerFact {

	private static final SuperManagerFact INSTANCE = new SuperManagerFact();

	public static SuperManagerFact getInstance(Task rulesEngineTask) {
		INSTANCE.register(rulesEngineTask);
		return INSTANCE;
	}

	private void register(Task rulesEngineTask) {
		// TODO Auto-generated method stub

	}

}

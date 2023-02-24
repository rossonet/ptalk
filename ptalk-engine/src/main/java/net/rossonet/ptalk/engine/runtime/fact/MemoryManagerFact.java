package net.rossonet.ptalk.engine.runtime.fact;

import net.rossonet.ptalk.engine.runtime.Task;

public class MemoryManagerFact {

	private static final MemoryManagerFact INSTANCE = new MemoryManagerFact();

	public static MemoryManagerFact getInstance(Task rulesEngineTask) {
		INSTANCE.register(rulesEngineTask);
		return INSTANCE;
	}

	private void register(Task rulesEngineTask) {
		// TODO Auto-generated method stub

	}

}

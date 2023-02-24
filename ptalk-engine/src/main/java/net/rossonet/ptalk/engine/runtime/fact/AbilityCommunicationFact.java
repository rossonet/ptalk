package net.rossonet.ptalk.engine.runtime.fact;

import net.rossonet.ptalk.engine.runtime.Task;

public class AbilityCommunicationFact {

	private static final AbilityCommunicationFact INSTANCE = new AbilityCommunicationFact();

	public static AbilityCommunicationFact getInstance(Task rulesEngineTask) {
		INSTANCE.register(rulesEngineTask);
		return INSTANCE;
	}

	private void register(Task rulesEngineTask) {
		// TODO Auto-generated method stub

	}

}

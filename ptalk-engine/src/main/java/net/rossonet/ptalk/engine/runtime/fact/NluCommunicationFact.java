package net.rossonet.ptalk.engine.runtime.fact;

import net.rossonet.ptalk.engine.runtime.Task;

public class NluCommunicationFact {

	private static final NluCommunicationFact INSTANCE = new NluCommunicationFact();

	public static NluCommunicationFact getInstance(Task rulesEngineTask) {
		INSTANCE.register(rulesEngineTask);
		return INSTANCE;
	}

	private void register(Task rulesEngineTask) {
		// TODO Auto-generated method stub

	}

}

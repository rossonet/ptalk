package net.rossonet.ptalk.engine.runtime.fact;

import net.rossonet.ptalk.engine.parameter.NextHops;
import net.rossonet.ptalk.engine.runtime.Task;

public class NextHopManagerFact {

	private static final NextHopManagerFact INSTANCE = new NextHopManagerFact();

	public static NextHopManagerFact getInstance(Task rulesEngineTask) {
		INSTANCE.register(rulesEngineTask);
		return INSTANCE;
	}

	public NextHops getNextHops() {
		// TODO Auto-generated method stub
		return null;
	}

	private void register(Task rulesEngineTask) {
		// TODO Auto-generated method stub

	}

}

package net.rossonet.ptalk.engine.runtime.fact.superManager;

import java.util.HashMap;
import java.util.Map;

import net.rossonet.ptalk.engine.runtime.Task;

public class SuperManagerFactFactory {

	private static final SuperManagerFactFactory INSTANCE = new SuperManagerFactFactory();

	public static SuperManagerFact getInstance(Task rulesEngineTask) {
		return INSTANCE.getOrCreate(rulesEngineTask);
	}

	public static void terminate(Task rulesEngineTask) {
		INSTANCE.remove(rulesEngineTask);
	}

	private final Map<String, SuperManagerFact> facts = new HashMap<>();

	private SuperManagerFact getOrCreate(Task rulesEngineTask) {
		if (facts.containsKey(rulesEngineTask.getTraceId())) {
			return facts.get(rulesEngineTask.getTraceId());
		} else {
			final SuperManagerFact f = new SuperManagerFact(rulesEngineTask.getTraceId());
			facts.put(rulesEngineTask.getTraceId(), f);
			return f;
		}
	}

	private void remove(Task rulesEngineTask) {
		if (facts.containsKey(rulesEngineTask.getTraceId())) {
			facts.remove(rulesEngineTask.getTraceId());
		}
	}
}

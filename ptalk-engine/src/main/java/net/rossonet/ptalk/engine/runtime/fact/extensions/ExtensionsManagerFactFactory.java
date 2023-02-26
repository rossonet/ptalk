package net.rossonet.ptalk.engine.runtime.fact.extensions;

import java.util.HashMap;
import java.util.Map;

import net.rossonet.ptalk.engine.runtime.Task;

public class ExtensionsManagerFactFactory {

	private static final ExtensionsManagerFactFactory INSTANCE = new ExtensionsManagerFactFactory();

	public static ExtensionsManagerFact getInstance(Task rulesEngineTask) {
		return INSTANCE.getOrCreate(rulesEngineTask);
	}

	public static void terminate(Task rulesEngineTask) {
		INSTANCE.remove(rulesEngineTask);
	}

	private final Map<String, ExtensionsManagerFact> facts = new HashMap<>();

	private ExtensionsManagerFactFactory() {
	}

	private ExtensionsManagerFact getOrCreate(Task rulesEngineTask) {
		if (facts.containsKey(rulesEngineTask.getTraceId())) {
			return facts.get(rulesEngineTask.getTraceId());
		} else {
			final ExtensionsManagerFact f = new ExtensionsManagerFact(rulesEngineTask.getTraceId());
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

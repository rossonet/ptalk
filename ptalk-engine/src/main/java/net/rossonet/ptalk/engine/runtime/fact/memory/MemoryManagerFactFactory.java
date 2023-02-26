package net.rossonet.ptalk.engine.runtime.fact.memory;

import java.util.HashMap;
import java.util.Map;

import net.rossonet.ptalk.engine.runtime.Task;

public class MemoryManagerFactFactory {

	private static final MemoryManagerFactFactory INSTANCE = new MemoryManagerFactFactory();

	public static MemoryManagerFact getInstance(Task rulesEngineTask) {
		return INSTANCE.getOrCreate(rulesEngineTask);
	}

	public static void terminate(Task rulesEngineTask) {
		INSTANCE.remove(rulesEngineTask);
	}

	private final Map<String, MemoryManagerFact> facts = new HashMap<>();

	private MemoryManagerFactFactory() {
	}

	private MemoryManagerFact getOrCreate(Task rulesEngineTask) {
		if (facts.containsKey(rulesEngineTask.getTraceId())) {
			return facts.get(rulesEngineTask.getTraceId());
		} else {
			final MemoryManagerFact f = new MemoryManagerFact(rulesEngineTask.getTraceId());
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

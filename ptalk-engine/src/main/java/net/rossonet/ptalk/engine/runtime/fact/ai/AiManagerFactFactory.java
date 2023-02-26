package net.rossonet.ptalk.engine.runtime.fact.ai;

import java.util.HashMap;
import java.util.Map;

import net.rossonet.ptalk.engine.runtime.Task;

public class AiManagerFactFactory {

	private static final AiManagerFactFactory INSTANCE = new AiManagerFactFactory();

	public static AiManagerFact getInstance(Task rulesEngineTask) {
		return INSTANCE.getOrCreate(rulesEngineTask);
	}

	public static void terminate(Task rulesEngineTask) {
		INSTANCE.remove(rulesEngineTask);
	}

	private final Map<String, AiManagerFact> facts = new HashMap<>();

	private AiManagerFactFactory() {
	}

	private AiManagerFact getOrCreate(Task rulesEngineTask) {
		if (facts.containsKey(rulesEngineTask.getTraceId())) {
			return facts.get(rulesEngineTask.getTraceId());
		} else {
			final AiManagerFact f = new AiManagerFact(rulesEngineTask.getTraceId());
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

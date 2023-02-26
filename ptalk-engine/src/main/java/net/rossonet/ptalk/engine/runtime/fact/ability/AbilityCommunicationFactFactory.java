package net.rossonet.ptalk.engine.runtime.fact.ability;

import java.util.HashMap;
import java.util.Map;

import net.rossonet.ptalk.engine.runtime.Task;

public class AbilityCommunicationFactFactory {

	private static final AbilityCommunicationFactFactory INSTANCE = new AbilityCommunicationFactFactory();

	public static AbilityCommunicationFact getInstance(Task rulesEngineTask) {
		return INSTANCE.getOrCreate(rulesEngineTask);
	}

	public static void terminate(Task rulesEngineTask) {
		INSTANCE.remove(rulesEngineTask);
	}

	private final Map<String, AbilityCommunicationFact> facts = new HashMap<>();

	private AbilityCommunicationFactFactory() {
	}

	private AbilityCommunicationFact getOrCreate(Task rulesEngineTask) {
		if (facts.containsKey(rulesEngineTask.getTraceId())) {
			return facts.get(rulesEngineTask.getTraceId());
		} else {
			final AbilityCommunicationFact f = new AbilityCommunicationFact(rulesEngineTask.getTraceId());
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

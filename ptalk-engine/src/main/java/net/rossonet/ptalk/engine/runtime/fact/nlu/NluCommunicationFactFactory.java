package net.rossonet.ptalk.engine.runtime.fact.nlu;

import java.util.HashMap;
import java.util.Map;

import net.rossonet.ptalk.engine.runtime.Task;

public class NluCommunicationFactFactory {

	private static final NluCommunicationFactFactory INSTANCE = new NluCommunicationFactFactory();

	public static NluCommunicationFact getInstance(Task rulesEngineTask) {
		return INSTANCE.getOrCreate(rulesEngineTask);
	}

	public static void terminate(Task rulesEngineTask) {
		INSTANCE.remove(rulesEngineTask);
	}

	private final Map<String, NluCommunicationFact> facts = new HashMap<>();

	private NluCommunicationFactFactory() {
	}

	private NluCommunicationFact getOrCreate(Task rulesEngineTask) {
		if (facts.containsKey(rulesEngineTask.getTraceId())) {
			return facts.get(rulesEngineTask.getTraceId());
		} else {
			final NluCommunicationFact f = new NluCommunicationFact(rulesEngineTask.getTraceId());
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

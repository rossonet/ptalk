package net.rossonet.ptalk.engine;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.rossonet.ptalk.engine.runtime.Task;
import net.rossonet.ptalk.engine.runtime.fact.ability.AbilityCommunicationFact;

public class AbilityCommunicationFactFactory implements Closeable {

	private final Map<String, AbilityCommunicationFact> facts = new HashMap<>();

	private final PTalkEngineRuntime pTalkEngineRuntime;

	AbilityCommunicationFactFactory(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	@Override
	public void close() throws IOException {
		// pulizia

	}

	public AbilityCommunicationFact getOrCreate(Task rulesEngineTask) {
		if (facts.containsKey(rulesEngineTask.getTraceId())) {
			return facts.get(rulesEngineTask.getTraceId());
		} else {
			final AbilityCommunicationFact f = new AbilityCommunicationFact(rulesEngineTask.getTraceId());
			facts.put(rulesEngineTask.getTraceId(), f);
			return f;
		}
	}

	public PTalkEngineRuntime getpTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

	public void remove(Task rulesEngineTask) {
		if (facts.containsKey(rulesEngineTask.getTraceId())) {
			facts.remove(rulesEngineTask.getTraceId());
		}
	}

}

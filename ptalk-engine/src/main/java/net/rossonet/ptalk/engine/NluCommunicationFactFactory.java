package net.rossonet.ptalk.engine;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.rossonet.ptalk.engine.runtime.Task;
import net.rossonet.ptalk.engine.runtime.fact.PTalkFactFactory;
import net.rossonet.ptalk.engine.runtime.fact.nlu.NluCommunicationFact;

public class NluCommunicationFactFactory implements PTalkFactFactory {

	private final Map<String, NluCommunicationFact> facts = new HashMap<>();
	private final PTalkEngineRuntime pTalkEngineRuntime;

	NluCommunicationFactFactory(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	@Override
	public void close() throws IOException {
		// pulizia

	}

	@Override
	public NluCommunicationFact getOrCreate(Task rulesEngineTask) {
		if (facts.containsKey(rulesEngineTask.getTraceId())) {
			return facts.get(rulesEngineTask.getTraceId());
		} else {
			final NluCommunicationFact f = new NluCommunicationFact(rulesEngineTask.getTraceId());
			facts.put(rulesEngineTask.getTraceId(), f);
			return f;
		}
	}

	public PTalkEngineRuntime getpTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

	@Override
	public void remove(Task rulesEngineTask) {
		if (facts.containsKey(rulesEngineTask.getTraceId())) {
			facts.remove(rulesEngineTask.getTraceId());
		}
	}

	@Override
	public void updateConfiguration() {
		// forse da migliorare
		facts.clear();

	}
}

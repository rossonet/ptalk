package net.rossonet.ptalk.engine;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.rossonet.ptalk.engine.runtime.Task;
import net.rossonet.ptalk.engine.runtime.fact.PTalkFactFactory;
import net.rossonet.ptalk.engine.runtime.fact.superManager.SuperManagerFact;

public class SuperManagerFactFactory implements PTalkFactFactory {
	private final Map<String, SuperManagerFact> facts = new HashMap<>();
	private final PTalkEngineRuntime pTalkEngineRuntime;

	SuperManagerFactFactory(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	@Override
	public void close() throws IOException {
		// pulizia

	}

	@Override
	public SuperManagerFact getOrCreate(Task rulesEngineTask) {
		if (facts.containsKey(rulesEngineTask.getTraceId())) {
			return facts.get(rulesEngineTask.getTraceId());
		} else {
			final SuperManagerFact f = new SuperManagerFact(rulesEngineTask.getTraceId());
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

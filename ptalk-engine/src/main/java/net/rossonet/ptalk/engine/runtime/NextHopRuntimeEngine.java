package net.rossonet.ptalk.engine.runtime;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import net.rossonet.ptalk.engine.PTalkEngineRuntime;

public class NextHopRuntimeEngine {

	// TODO impostare un TTL su un messaggio e tutto quello che genera

	private final PTalkEngineRuntime pTalkEngineRuntime;
	private final Set<Task> tasks = new HashSet<>();

	public NextHopRuntimeEngine(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	public Collection<Task> getTasksByTraceId(String traceId) {
		final Set<Task> results = new HashSet<>();
		for (final Task t : tasks) {
			if (traceId.equals(t.getTraceId())) {
				results.add(t);
			}
		}
		return results;
	}

	public void registerTask(Task task) {
		tasks.add(task);

	}

	public PTalkEngineRuntime getpTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

}

package net.rossonet.ptalk.engine.runtime;

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

	public Task getTaskByTraceId(String traceId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void manageTasks(Task task) {
		// TODO Auto-generated method stub

	}

}

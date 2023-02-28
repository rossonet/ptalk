package net.rossonet.ptalk.engine;

import net.rossonet.ptalk.ability.grpc.MemoryContextQueryRequest;
import net.rossonet.ptalk.engine.grpc.ReplyMemoryQuery;

public class MemoryManager {

	private final PTalkEngineRuntime pTalkEngineRuntime;

	public MemoryManager(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	public PTalkEngineRuntime getpTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

	public ReplyMemoryQuery query(MemoryContextQueryRequest request) {
		// TODO query
		return null;
	}

}

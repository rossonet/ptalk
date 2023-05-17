package net.rossonet.ptalk.engine.runtime.fact.nlu;

import net.rossonet.ptalk.engine.PTalkEngineRuntime;
import net.rossonet.ptalk.engine.runtime.fact.PTalkFact;

public class NluCommunicationFact implements PTalkFact {

	private final String traceId;
	private final PTalkEngineRuntime pTalkEngineRuntime;

	public NluCommunicationFact(PTalkEngineRuntime pTalkEngineRuntime, String traceId) {
		this.traceId = traceId;
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	@Override
	public String getTraceId() {
		return traceId;
	}

	public NluReplyFact query(NluRequestFact nluQuery) {
		return pTalkEngineRuntime.queryNlu(nluQuery);
	}

	public NluReplyFact query(String model, String traceId, String message) {
		return query(NluRequestFact.fromMessage(model, traceId, message));
	}

}

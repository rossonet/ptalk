package net.rossonet.ptalk.engine;

import org.jeasy.rules.api.Fact;

import net.rossonet.ptalk.ability.grpc.MemoryContextQueryRequest;
import net.rossonet.ptalk.engine.grpc.ReplyMemoryQuery;
import net.rossonet.ptalk.engine.runtime.fact.channel.InputMessageFact;
import net.rossonet.ptalk.engine.runtime.fact.channel.OutputMessageFact;
import net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply;

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

	public void registerInputMessage(Fact<InputMessageFact> inputMessageFact) {
		// TODO Auto-generated method stub

	}

	public void registerOutputMessage(OutputMessageFact outputMessageFact) {
		// TODO register message sent to

	}

	public void registerReplyNluTraining(NluTrainingModelReply request) {
		// TODO register nlu training done

	}

}

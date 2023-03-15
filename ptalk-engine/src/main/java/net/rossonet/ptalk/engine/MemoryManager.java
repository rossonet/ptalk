package net.rossonet.ptalk.engine;

import java.io.Serializable;
import java.time.Instant;

import com.hazelcast.replicatedmap.ReplicatedMap;

import net.rossonet.ptalk.ability.grpc.MemoryContextQueryRequest;
import net.rossonet.ptalk.engine.grpc.ReplyMemoryQuery;
import net.rossonet.ptalk.engine.runtime.fact.channel.InputMessageFact;
import net.rossonet.ptalk.engine.runtime.fact.channel.OutputMessageFact;
import net.rossonet.ptalk.engine.runtime.fact.memory.MemoryData;
import net.rossonet.ptalk.engine.runtime.fact.nlu.NluTrainingModelReplyFact;

public class MemoryManager {

	private final PTalkEngineRuntime pTalkEngineRuntime;

	public MemoryManager(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	private ReplicatedMap<Long, MemoryData<? extends Serializable>> getMemoryMap() {
		return pTalkEngineRuntime.getHazelcastInstanceBuilder().getMemoryMapRepository();
	}

	public PTalkEngineRuntime getpTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

	public ReplyMemoryQuery query(MemoryContextQueryRequest memoryRequest) {
		// TODO query
		return null;
	}

	public void registerInputMessage(InputMessageFact inputMessageFact) {
		getMemoryMap().put(Instant.now().toEpochMilli(), inputMessageFact);

	}

	public void registerOutputMessage(OutputMessageFact outputMessageFact) {
		getMemoryMap().put(Instant.now().toEpochMilli(), outputMessageFact);

	}

	public void registerReplyNluTraining(NluTrainingModelReplyFact nluTrainingModelReplyFact) {
		getMemoryMap().put(Instant.now().toEpochMilli(), nluTrainingModelReplyFact);

	}

}

package net.rossonet.ptalk.engine;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.hazelcast.replicatedmap.ReplicatedMap;

import net.rossonet.ptalk.base.grpc.RegisterRequest;
import net.rossonet.ptalk.engine.grpc.UnitRegistered;
import net.rossonet.ptalk.engine.runtime.Task;
import net.rossonet.ptalk.engine.runtime.fact.PTalkFactFactory;
import net.rossonet.ptalk.engine.runtime.fact.ability.AbilityCommunicationFact;

public class AbilityCommunicationFactFactory implements PTalkFactFactory {

	private final Map<String, AbilityCommunicationFact> facts = new HashMap<>();

	private final PTalkEngineRuntime pTalkEngineRuntime;

	AbilityCommunicationFactFactory(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	@Override
	public void close() throws IOException {
		// pulizia

	}

	@Override
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

	public void registerUnit(RegisterRequest request) {
		getRegisterUnit().put(request.getUnitUniqueName(),
				new UnitRegistered(request));
	}

	private ReplicatedMap<String, UnitRegistered> getRegisterUnit() {
		return pTalkEngineRuntime.getHazelcastInstanceBuilder().getRegisterAbilityRepository();
	}

	@Override
	public void remove(Task rulesEngineTask) {
		if (facts.containsKey(rulesEngineTask.getTraceId())) {
			facts.remove(rulesEngineTask.getTraceId());
		}
	}

	@Override
	public void updateConfiguration() {
		facts.clear();
	}

}

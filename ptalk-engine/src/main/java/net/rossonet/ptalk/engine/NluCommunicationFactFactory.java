package net.rossonet.ptalk.engine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.hazelcast.replicatedmap.ReplicatedMap;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import net.rossonet.ptalk.base.grpc.RegisterRequest;
import net.rossonet.ptalk.engine.parameter.UnitRegistered;
import net.rossonet.ptalk.engine.runtime.Task;
import net.rossonet.ptalk.engine.runtime.fact.PTalkFactFactory;
import net.rossonet.ptalk.engine.runtime.fact.nlu.NluCommunicationFact;
import net.rossonet.ptalk.engine.runtime.fact.nlu.NluReplyFact;
import net.rossonet.ptalk.engine.runtime.fact.nlu.NluRequestFact;
import net.rossonet.ptalk.nlu.grpc.NluListModelsReply;
import net.rossonet.ptalk.nlu.grpc.NluListModelsRequest;
import net.rossonet.ptalk.nlu.grpc.NluMessageReply;
import net.rossonet.ptalk.nlu.grpc.NluModel;
import net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply;
import net.rossonet.ptalk.nlu.grpc.RpcNluUnitV1Grpc;
import net.rossonet.ptalk.nlu.grpc.RpcNluUnitV1Grpc.RpcNluUnitV1BlockingStub;

public class NluCommunicationFactFactory implements PTalkFactFactory {

	private final Map<String, NluCommunicationFact> facts = new HashMap<>();
	private final PTalkEngineRuntime pTalkEngineRuntime;

	private final Map<String, RpcNluUnitV1BlockingStub> cacheBlockingStub = new HashMap<>();

	private Random rand = null;

	NluCommunicationFactFactory(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	private void checkBlockingStubCache(String uniqueName) {
		if (!cacheBlockingStub.containsKey(uniqueName)) {
			final RpcNluUnitV1BlockingStub blockingStub = getBlockingStub(uniqueName);
			cacheBlockingStub.put(uniqueName, blockingStub);
		}
	}

	@Override
	public void close() throws IOException {
		// pulizia

	}

	private void discoveryModels(String uniqueName) {
		checkBlockingStubCache(uniqueName);
		final NluListModelsRequest requestListModels = NluListModelsRequest.newBuilder().build();
		final NluListModelsReply models = cacheBlockingStub.get(uniqueName).listModels(requestListModels);
		for (final NluModel m : models.getModelList()) {
			final String model = m.getModel();
			if (!getModelMap().containsKey(model)) {
				getModelMap().put(model, new ArrayList<String>());
			}
			if (!getModelMap().get(model).contains(uniqueName)) {
				getModelMap().get(model).add(uniqueName);
			}
		}
	}

	private RpcNluUnitV1BlockingStub getBlockingStub(String channelUniqueName) {
		final ManagedChannel mc = ManagedChannelBuilder.forAddress(getRegisterUnit().get(channelUniqueName).getHost(),
				getRegisterUnit().get(channelUniqueName).getPort()).usePlaintext().build();
		return RpcNluUnitV1Grpc.newBlockingStub(mc);

	}

	private ReplicatedMap<String, List<String>> getModelMap() {
		return pTalkEngineRuntime.getHazelcastInstanceBuilder().getNluModels();
	}

	@Override
	public NluCommunicationFact getOrCreate(Task rulesEngineTask) {
		if (facts.containsKey(rulesEngineTask.getTraceId())) {
			return facts.get(rulesEngineTask.getTraceId());
		} else {
			final NluCommunicationFact f = new NluCommunicationFact(pTalkEngineRuntime, rulesEngineTask.getTraceId());
			facts.put(rulesEngineTask.getTraceId(), f);
			return f;
		}
	}

	public PTalkEngineRuntime getpTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

	private ReplicatedMap<String, UnitRegistered> getRegisterUnit() {
		return pTalkEngineRuntime.getHazelcastInstanceBuilder().getRegisterNluRepository();
	}

	public NluReplyFact query(NluRequestFact nluQuery) {
		final String uniqueName = selectOneNluUnit(getModelMap().get(nluQuery.getModel()));
		final NluMessageReply nluReply = cacheBlockingStub.get(uniqueName).callSync(nluQuery.getNluMessageRequest());
		return new NluReplyFact(nluQuery.getTraceId(), nluReply);
	}

	public void registerUnit(RegisterRequest request) {
		getRegisterUnit().put(request.getUnitUniqueName(), new UnitRegistered(request));
		discoveryModels(request.getUnitUniqueName());

	}

	@Override
	public void remove(Task rulesEngineTask) {
		if (facts.containsKey(rulesEngineTask.getTraceId())) {
			facts.remove(rulesEngineTask.getTraceId());
		}
	}

	public void replyFromNluTrainingRequest(NluTrainingModelReply request) {
		// TODO gestione risposta training nlu

	}

	private String selectOneNluUnit(List<String> nluUnitList) {
		switch (pTalkEngineRuntime.getGlobalConfiguration().getNluLoadBalancingPolicy()) {
		case RANDOM:
			if (rand == null) {
				rand = new Random();
			}
			return nluUnitList.get(rand.nextInt(nluUnitList.size()));
		default:
			return nluUnitList.get(0);
		}
	}

	@Override
	public void updateConfiguration() {
		facts.clear();

	}
}

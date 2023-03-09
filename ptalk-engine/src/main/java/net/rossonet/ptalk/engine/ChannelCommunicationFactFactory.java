package net.rossonet.ptalk.engine;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.hazelcast.replicatedmap.ReplicatedMap;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import net.rossonet.ptalk.base.grpc.RegisterRequest;
import net.rossonet.ptalk.channel.grpc.RpcChannelUnitV1Grpc;
import net.rossonet.ptalk.channel.grpc.RpcChannelUnitV1Grpc.RpcChannelUnitV1BlockingStub;
import net.rossonet.ptalk.engine.parameter.UnitRegistered;
import net.rossonet.ptalk.engine.runtime.Task;
import net.rossonet.ptalk.engine.runtime.fact.PTalkFactFactory;
import net.rossonet.ptalk.engine.runtime.fact.channel.ChannelCommunicationFact;
import net.rossonet.ptalk.engine.runtime.fact.channel.OutputMessageFact;

public class ChannelCommunicationFactFactory implements PTalkFactFactory {

	private final Map<String, ChannelCommunicationFact> facts = new HashMap<>();
	private final PTalkEngineRuntime pTalkEngineRuntime;

	private final Map<String, RpcChannelUnitV1BlockingStub> cacheBlockingStub = new HashMap<>();

	ChannelCommunicationFactFactory(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	@Override
	public void close() throws IOException {
		// pulizia

	}

	private RpcChannelUnitV1BlockingStub getBlockingStub(String channelUniqueName) {
		final ManagedChannel mc = ManagedChannelBuilder.forAddress(getRegisterUnit().get(channelUniqueName).getHost(),
				getRegisterUnit().get(channelUniqueName).getPort()).usePlaintext().build();
		return RpcChannelUnitV1Grpc.newBlockingStub(mc);

	}

	@Override
	public ChannelCommunicationFact getOrCreate(Task rulesEngineTask) {
		if (facts.containsKey(rulesEngineTask.getTraceId())) {
			return facts.get(rulesEngineTask.getTraceId());
		} else {
			final ChannelCommunicationFact f = new ChannelCommunicationFact(pTalkEngineRuntime,
					rulesEngineTask.getTraceId());
			facts.put(rulesEngineTask.getTraceId(), f);
			return f;
		}
	}

	public PTalkEngineRuntime getpTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

	private ReplicatedMap<String, UnitRegistered> getRegisterUnit() {
		return pTalkEngineRuntime.getHazelcastInstanceBuilder().getRegisterChannelRepository();
	}

	public void registerUnit(RegisterRequest request) {
		getRegisterUnit().put(request.getUnitUniqueName(), new UnitRegistered(request));

	}

	@Override
	public void remove(Task rulesEngineTask) {
		if (facts.containsKey(rulesEngineTask.getTraceId())) {
			facts.remove(rulesEngineTask.getTraceId());
		}
	}

	public void sendMessage(OutputMessageFact outputMessageFact) {
		if (!cacheBlockingStub.containsKey(outputMessageFact.getChannelUniqueName())) {
			final RpcChannelUnitV1BlockingStub blockingStub = getBlockingStub(outputMessageFact.getChannelUniqueName());
			cacheBlockingStub.put(outputMessageFact.getChannelUniqueName(), blockingStub);
			blockingStub.callSync(outputMessageFact.getChannelMessageRequest());
		} else {
			cacheBlockingStub.get(outputMessageFact.getChannelUniqueName())
					.callSync(outputMessageFact.getChannelMessageRequest());
		}

	}

	@Override
	public void updateConfiguration() {
		facts.clear();

	}
}

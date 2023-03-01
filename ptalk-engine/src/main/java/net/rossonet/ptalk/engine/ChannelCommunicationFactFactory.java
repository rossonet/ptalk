package net.rossonet.ptalk.engine;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import net.rossonet.ptalk.base.grpc.RegisterRequest;
import net.rossonet.ptalk.channel.grpc.RpcChannelUnitV1Grpc;
import net.rossonet.ptalk.channel.grpc.RpcChannelUnitV1Grpc.RpcChannelUnitV1BlockingStub;
import net.rossonet.ptalk.engine.runtime.Task;
import net.rossonet.ptalk.engine.runtime.fact.PTalkFactFactory;
import net.rossonet.ptalk.engine.runtime.fact.channel.ChannelCommunicationFact;
import net.rossonet.ptalk.engine.runtime.fact.channel.OutputMessageFact;
import net.rossonet.ptalk.engine.runtime.fact.channel.ResgisteredChannel;

public class ChannelCommunicationFactFactory implements PTalkFactFactory {

	private final Map<String, ChannelCommunicationFact> facts = new HashMap<>();
	private final PTalkEngineRuntime pTalkEngineRuntime;
	private final Map<String, ResgisteredChannel> registeredChannels = new HashMap<>();

	private final Map<String, RpcChannelUnitV1BlockingStub> cacheBlockingStub = new HashMap<>();

	ChannelCommunicationFactFactory(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	@Override
	public void close() throws IOException {
		// pulizia

	}

	private RpcChannelUnitV1BlockingStub getBlockingStub(String channel) {
		final ManagedChannel mc = ManagedChannelBuilder
				.forAddress(registeredChannels.get(channel).getHost(), registeredChannels.get(channel).getPort())
				.usePlaintext().build();
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

	public void registerUnit(RegisterRequest request) {
		// TODO registrare channel unit

	}

	@Override
	public void remove(Task rulesEngineTask) {
		if (facts.containsKey(rulesEngineTask.getTraceId())) {
			facts.remove(rulesEngineTask.getTraceId());
		}
	}

	public void sendMessage(OutputMessageFact outputMessageFact) {
		if (!cacheBlockingStub.containsKey(outputMessageFact.getChannel())) {
			final RpcChannelUnitV1BlockingStub blockingStub = getBlockingStub(outputMessageFact.getChannel());
			cacheBlockingStub.put(outputMessageFact.getChannel(), blockingStub);
			blockingStub.callSync(outputMessageFact.getChannelMessageRequest());
		} else {
			cacheBlockingStub.get(outputMessageFact.getChannel())
					.callSync(outputMessageFact.getChannelMessageRequest());
		}

	}

	@Override
	public void updateConfiguration() {
		// forse da migliorare
		facts.clear();

	}
}

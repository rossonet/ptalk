package net.rossonet.ptalk.engine.grpc;

import io.grpc.stub.StreamObserver;
import net.rossonet.ptalk.ability.grpc.DumpConfigurationReply;
import net.rossonet.ptalk.ability.grpc.DumpConfigurationRequest;
import net.rossonet.ptalk.ability.grpc.PushConfigurationReply;
import net.rossonet.ptalk.ability.grpc.PushConfigurationRequest;
import net.rossonet.ptalk.ability.grpc.RpcSuperAbilityCoreV1Grpc.RpcSuperAbilityCoreV1ImplBase;
import net.rossonet.ptalk.engine.PTalkEngineRuntime;

public class GrpcSuperAbilityServiceImpl extends RpcSuperAbilityCoreV1ImplBase {

	private final PTalkEngineRuntime pTalkEngineRuntime;

	public GrpcSuperAbilityServiceImpl(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	@Override
	public void dumpConfiguration(DumpConfigurationRequest request,
			StreamObserver<DumpConfigurationReply> responseObserver) {
		// TODO Auto-generated method stub
		super.dumpConfiguration(request, responseObserver);
	}

	public PTalkEngineRuntime getpTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

	@Override
	public void pushConfiguration(PushConfigurationRequest request,
			StreamObserver<PushConfigurationReply> responseObserver) {
		// TODO Auto-generated method stub
		super.pushConfiguration(request, responseObserver);
	}

}

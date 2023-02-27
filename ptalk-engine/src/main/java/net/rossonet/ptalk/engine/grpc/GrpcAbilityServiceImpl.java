package net.rossonet.ptalk.engine.grpc;

import io.grpc.stub.StreamObserver;
import net.rossonet.ptalk.ability.grpc.AbilityMessageReply;
import net.rossonet.ptalk.ability.grpc.CancelRuleReply;
import net.rossonet.ptalk.ability.grpc.CancelRuleRequest;
import net.rossonet.ptalk.ability.grpc.GeneralConfigurationReply;
import net.rossonet.ptalk.ability.grpc.GeneralConfigurationRequest;
import net.rossonet.ptalk.ability.grpc.ListRulesReply;
import net.rossonet.ptalk.ability.grpc.ListRulesRequest;
import net.rossonet.ptalk.ability.grpc.MemoryContextReply;
import net.rossonet.ptalk.ability.grpc.MemoryContextRequest;
import net.rossonet.ptalk.ability.grpc.RegisterRulesReply;
import net.rossonet.ptalk.ability.grpc.RegisterRulesRequest;
import net.rossonet.ptalk.ability.grpc.RpcAbilityCoreV1Grpc.RpcAbilityCoreV1ImplBase;
import net.rossonet.ptalk.base.grpc.Status;
import net.rossonet.ptalk.engine.PTalkEngineRuntime;

public class GrpcAbilityServiceImpl extends RpcAbilityCoreV1ImplBase {

	private final PTalkEngineRuntime pTalkEngineRuntime;

	public GrpcAbilityServiceImpl(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	@Override
	public void cancelRule(CancelRuleRequest request, StreamObserver<CancelRuleReply> responseObserver) {
		// TODO Auto-generated method stub
		super.cancelRule(request, responseObserver);
	}

	@Override
	public void generalConfiguration(GeneralConfigurationRequest request,
			StreamObserver<GeneralConfigurationReply> responseObserver) {
		// TODO Auto-generated method stub
		super.generalConfiguration(request, responseObserver);
	}

	public PTalkEngineRuntime getpTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

	@Override
	public void listRules(ListRulesRequest request, StreamObserver<ListRulesReply> responseObserver) {
		// TODO Auto-generated method stub
		super.listRules(request, responseObserver);
	}

	@Override
	public void memory(MemoryContextRequest request, StreamObserver<MemoryContextReply> responseObserver) {
		// TODO Auto-generated method stub
		super.memory(request, responseObserver);
	}

	@Override
	public void registerRules(RegisterRulesRequest request, StreamObserver<RegisterRulesReply> responseObserver) {
		// TODO Auto-generated method stub
		super.registerRules(request, responseObserver);
	}

	@Override
	public void replyAsync(AbilityMessageReply request, StreamObserver<Status> responseObserver) {
		// TODO Auto-generated method stub
		super.replyAsync(request, responseObserver);
	}

}

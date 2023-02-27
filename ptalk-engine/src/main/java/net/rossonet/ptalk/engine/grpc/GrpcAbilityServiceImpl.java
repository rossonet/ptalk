package net.rossonet.ptalk.engine.grpc;

import io.grpc.stub.StreamObserver;
import net.rossonet.ptalk.ability.grpc.AbilityMessageReply;
import net.rossonet.ptalk.ability.grpc.CancelRuleReply;
import net.rossonet.ptalk.ability.grpc.CancelRuleRequest;
import net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryReply;
import net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryRequest;
import net.rossonet.ptalk.ability.grpc.GetRuleReply;
import net.rossonet.ptalk.ability.grpc.GetRuleRequest;
import net.rossonet.ptalk.ability.grpc.ListRulesReply;
import net.rossonet.ptalk.ability.grpc.ListRulesRequest;
import net.rossonet.ptalk.ability.grpc.MemoryContextQueryReply;
import net.rossonet.ptalk.ability.grpc.MemoryContextQueryRequest;
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
	public void generalConfigurationQuery(GeneralConfigurationQueryRequest request,
			StreamObserver<GeneralConfigurationQueryReply> responseObserver) {
		// TODO Auto-generated method stub
		super.generalConfigurationQuery(request, responseObserver);
	}

	public PTalkEngineRuntime getpTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

	@Override
	public void getRule(GetRuleRequest request, StreamObserver<GetRuleReply> responseObserver) {
		// TODO Auto-generated method stub
		super.getRule(request, responseObserver);
	}

	@Override
	public void listRules(ListRulesRequest request, StreamObserver<ListRulesReply> responseObserver) {
		// TODO Auto-generated method stub
		super.listRules(request, responseObserver);
	}

	@Override
	public void memoryQuery(MemoryContextQueryRequest request,
			StreamObserver<MemoryContextQueryReply> responseObserver) {
		// TODO Auto-generated method stub
		super.memoryQuery(request, responseObserver);
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

package net.rossonet.ptalk.engine.grpc;

import io.grpc.stub.StreamObserver;
import net.rossonet.ptalk.ability.grpc.CancelRuleReply;
import net.rossonet.ptalk.ability.grpc.CancelRuleRequest;
import net.rossonet.ptalk.ability.grpc.DumpConfigurationReply;
import net.rossonet.ptalk.ability.grpc.DumpConfigurationRequest;
import net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementReply;
import net.rossonet.ptalk.ability.grpc.GeneralConfigurationManagementRequest;
import net.rossonet.ptalk.ability.grpc.GetRuleReply;
import net.rossonet.ptalk.ability.grpc.GetRuleRequest;
import net.rossonet.ptalk.ability.grpc.ListRulesReply;
import net.rossonet.ptalk.ability.grpc.ListRulesRequest;
import net.rossonet.ptalk.ability.grpc.MemoryContextManagementReply;
import net.rossonet.ptalk.ability.grpc.MemoryContextManagementRequest;
import net.rossonet.ptalk.ability.grpc.PushConfigurationReply;
import net.rossonet.ptalk.ability.grpc.PushConfigurationRequest;
import net.rossonet.ptalk.ability.grpc.RegisterRulesReply;
import net.rossonet.ptalk.ability.grpc.RegisterRulesRequest;
import net.rossonet.ptalk.ability.grpc.RpcSuperAbilityCoreV1Grpc.RpcSuperAbilityCoreV1ImplBase;
import net.rossonet.ptalk.engine.PTalkEngineRuntime;

public class GrpcSuperAbilityServiceImpl extends RpcSuperAbilityCoreV1ImplBase {

	private final PTalkEngineRuntime pTalkEngineRuntime;

	public GrpcSuperAbilityServiceImpl(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	@Override
	public void cancelPostRule(CancelRuleRequest request, StreamObserver<CancelRuleReply> responseObserver) {
		// TODO Auto-generated method stub
		super.cancelPostRule(request, responseObserver);
	}

	@Override
	public void cancelPreRule(CancelRuleRequest request, StreamObserver<CancelRuleReply> responseObserver) {
		// TODO Auto-generated method stub
		super.cancelPreRule(request, responseObserver);
	}

	@Override
	public void dumpConfiguration(DumpConfigurationRequest request,
			StreamObserver<DumpConfigurationReply> responseObserver) {
		// TODO Auto-generated method stub
		super.dumpConfiguration(request, responseObserver);
	}

	@Override
	public void generalConfigurationManagement(GeneralConfigurationManagementRequest request,
			StreamObserver<GeneralConfigurationManagementReply> responseObserver) {
		// TODO Auto-generated method stub
		super.generalConfigurationManagement(request, responseObserver);
	}

	@Override
	public void getPostRule(GetRuleRequest request, StreamObserver<GetRuleReply> responseObserver) {
		// TODO Auto-generated method stub
		super.getPostRule(request, responseObserver);
	}

	@Override
	public void getPreRule(GetRuleRequest request, StreamObserver<GetRuleReply> responseObserver) {
		// TODO Auto-generated method stub
		super.getPreRule(request, responseObserver);
	}

	public PTalkEngineRuntime getpTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

	@Override
	public void listPostRules(ListRulesRequest request, StreamObserver<ListRulesReply> responseObserver) {
		// TODO Auto-generated method stub
		super.listPostRules(request, responseObserver);
	}

	@Override
	public void listPreRules(ListRulesRequest request, StreamObserver<ListRulesReply> responseObserver) {
		// TODO Auto-generated method stub
		super.listPreRules(request, responseObserver);
	}

	@Override
	public void memoryManagement(MemoryContextManagementRequest request,
			StreamObserver<MemoryContextManagementReply> responseObserver) {
		// TODO Auto-generated method stub
		super.memoryManagement(request, responseObserver);
	}

	@Override
	public void pushConfiguration(PushConfigurationRequest request,
			StreamObserver<PushConfigurationReply> responseObserver) {
		// TODO Auto-generated method stub
		super.pushConfiguration(request, responseObserver);
	}

	@Override
	public void registerPostRules(RegisterRulesRequest request, StreamObserver<RegisterRulesReply> responseObserver) {
		// TODO Auto-generated method stub
		super.registerPostRules(request, responseObserver);
	}

	@Override
	public void registerPreRules(RegisterRulesRequest request, StreamObserver<RegisterRulesReply> responseObserver) {
		// TODO Auto-generated method stub
		super.registerPreRules(request, responseObserver);
	}

}

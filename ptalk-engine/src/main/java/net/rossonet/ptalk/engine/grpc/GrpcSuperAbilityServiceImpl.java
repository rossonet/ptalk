package net.rossonet.ptalk.engine.grpc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;
import org.joda.time.Instant;
import org.json.JSONException;
import org.json.JSONObject;

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
import net.rossonet.ptalk.ability.grpc.RegisterRuleReply;
import net.rossonet.ptalk.ability.grpc.RegisterRuleRequest;
import net.rossonet.ptalk.ability.grpc.RpcSuperAbilityCoreV1Grpc.RpcSuperAbilityCoreV1ImplBase;
import net.rossonet.ptalk.base.grpc.StatusValue;
import net.rossonet.ptalk.base.grpc.Timestamp;
import net.rossonet.ptalk.engine.PTalkEngineRuntime;
import net.rossonet.ptalk.engine.exceptions.TaskManagerException;
import net.rossonet.ptalk.utils.JsonHelper;

public class GrpcSuperAbilityServiceImpl extends RpcSuperAbilityCoreV1ImplBase {

	private final PTalkEngineRuntime pTalkEngineRuntime;

	public GrpcSuperAbilityServiceImpl(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	@Override
	public void cancelPostRule(CancelRuleRequest request, StreamObserver<CancelRuleReply> responseObserver) {
		pTalkEngineRuntime.getConfigurationTasksManager().removePostRule(request.getRule().getTask(),
				request.getRule().getRuleUniqueName());
		final CancelRuleReply reply = CancelRuleReply.newBuilder().setFlowReference(request.getFlowReference())
				.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().getMillis()).build())
				.setStatus(StatusValue.STATUS_GOOD).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

	@Override
	public void cancelPreRule(CancelRuleRequest request, StreamObserver<CancelRuleReply> responseObserver) {
		pTalkEngineRuntime.getConfigurationTasksManager().removePreRule(request.getRule().getTask(),
				request.getRule().getRuleUniqueName());
		final CancelRuleReply reply = CancelRuleReply.newBuilder().setFlowReference(request.getFlowReference())
				.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().getMillis()).build())
				.setStatus(StatusValue.STATUS_GOOD).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

	@Override
	public void dumpConfiguration(DumpConfigurationRequest request,
			StreamObserver<DumpConfigurationReply> responseObserver) {
		final String jsonConfiguration = pTalkEngineRuntime.getJsonConfiguration().toString(0);
		final DumpConfigurationReply reply = DumpConfigurationReply.newBuilder().setConfigurationJson(jsonConfiguration)
				.setFlowReference(request.getFlowReference())
				.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().getMillis()).build())
				.setStatus(StatusValue.STATUS_GOOD).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

	@Override
	public void generalConfigurationManagement(GeneralConfigurationManagementRequest request,
			StreamObserver<GeneralConfigurationManagementReply> responseObserver) {
		// TODO write configuration from self
		super.generalConfigurationManagement(request, responseObserver);
	}

	@Override
	public void getPostRule(GetRuleRequest request, StreamObserver<GetRuleReply> responseObserver) {
		final Set<String> rules = pTalkEngineRuntime.getConfigurationTasksManager()
				.getPostRulesAsString(request.getRule().getTask());
		JSONObject ruleAsJson = new JSONObject();
		for (final String r : rules) {
			final JSONObject jsonR = new JSONObject(r);
			if (jsonR.has(JsonHelper.RULE_NAME_LABEL)
					&& jsonR.getString(JsonHelper.RULE_NAME_LABEL).equals(request.getRule().getRuleUniqueName())) {
				ruleAsJson = jsonR;
				break;
			}
		}
		final GetRuleReply reply = GetRuleReply.newBuilder().setFlowReference(request.getFlowReference())
				.setJsonRule(ruleAsJson.toString(0))
				.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().getMillis()).build())
				.setStatus(StatusValue.STATUS_GOOD).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

	@Override
	public void getPreRule(GetRuleRequest request, StreamObserver<GetRuleReply> responseObserver) {
		final Set<String> rules = pTalkEngineRuntime.getConfigurationTasksManager()
				.getPreRulesAsString(request.getRule().getTask());
		JSONObject ruleAsJson = new JSONObject();
		for (final String r : rules) {
			final JSONObject jsonR = new JSONObject(r);
			if (jsonR.has(JsonHelper.RULE_NAME_LABEL)
					&& jsonR.getString(JsonHelper.RULE_NAME_LABEL).equals(request.getRule().getRuleUniqueName())) {
				ruleAsJson = jsonR;
				break;
			}
		}
		final GetRuleReply reply = GetRuleReply.newBuilder().setFlowReference(request.getFlowReference())
				.setJsonRule(ruleAsJson.toString(0))
				.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().getMillis()).build())
				.setStatus(StatusValue.STATUS_GOOD).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

	public PTalkEngineRuntime getpTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

	@Override
	public void listPostRules(ListRulesRequest request, StreamObserver<ListRulesReply> responseObserver) {
		final Set<net.rossonet.ptalk.ability.grpc.Rule> rulesList = new HashSet<>();
		for (final String t : pTalkEngineRuntime.getConfigurationTasksManager().getTasks()) {
			final Rules rules = pTalkEngineRuntime.getConfigurationTasksManager().getPostRules(t);
			final Iterator<Rule> rulesIterator = rules.iterator();
			while (rulesIterator.hasNext()) {
				final Rule r = rulesIterator.next();
				rulesList.add(net.rossonet.ptalk.ability.grpc.Rule.newBuilder().setRuleUniqueName(r.getName())
						.setTask(t).build());
			}
		}
		final ListRulesReply reply = ListRulesReply.newBuilder().setFlowReference(request.getFlowReference())
				.addAllRule(rulesList)
				.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().getMillis()).build())
				.setStatus(StatusValue.STATUS_GOOD).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

	@Override
	public void listPreRules(ListRulesRequest request, StreamObserver<ListRulesReply> responseObserver) {
		final Set<net.rossonet.ptalk.ability.grpc.Rule> rulesList = new HashSet<>();
		for (final String t : pTalkEngineRuntime.getConfigurationTasksManager().getTasks()) {
			final Rules rules = pTalkEngineRuntime.getConfigurationTasksManager().getPreRules(t);
			final Iterator<Rule> rulesIterator = rules.iterator();
			while (rulesIterator.hasNext()) {
				final Rule r = rulesIterator.next();
				rulesList.add(net.rossonet.ptalk.ability.grpc.Rule.newBuilder().setRuleUniqueName(r.getName())
						.setTask(t).build());
			}
		}
		final ListRulesReply reply = ListRulesReply.newBuilder().setFlowReference(request.getFlowReference())
				.addAllRule(rulesList)
				.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().getMillis()).build())
				.setStatus(StatusValue.STATUS_GOOD).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

	@Override
	public void memoryManagement(MemoryContextManagementRequest request,
			StreamObserver<MemoryContextManagementReply> responseObserver) {
		// TODO write on memory from self
		super.memoryManagement(request, responseObserver);
	}

	@Override
	public void pushConfiguration(PushConfigurationRequest request,
			StreamObserver<PushConfigurationReply> responseObserver) {
		final String jsonConfiguration = request.getConfigurationJson();
		try {
			pTalkEngineRuntime.replaceJsonConfiguration(new JSONObject(jsonConfiguration));
			final PushConfigurationReply reply = PushConfigurationReply.newBuilder()
					.setFlowReference(request.getFlowReference())
					.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().getMillis()).build())
					.setStatus(StatusValue.STATUS_GOOD).build();
			responseObserver.onNext(reply);
			responseObserver.onCompleted();
		} catch (JSONException | TaskManagerException e) {
			responseObserver.onError(e);
		}

	}

	@Override
	public void registerPostRule(RegisterRuleRequest request, StreamObserver<RegisterRuleReply> responseObserver) {
		Rule r;
		try {
			r = pTalkEngineRuntime.getConfigurationTasksManager().addPostRule(request.getRule().getTask(),
					request.getJsonRule());
			final RegisterRuleReply reply = RegisterRuleReply.newBuilder().setFlowReference(request.getFlowReference())
					.setRule(net.rossonet.ptalk.ability.grpc.Rule.newBuilder().setRuleUniqueName(r.getName())
							.setTask(request.getRule().getTask()))
					.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().getMillis()).build())
					.setStatus(StatusValue.STATUS_GOOD).build();
			responseObserver.onNext(reply);
			responseObserver.onCompleted();
		} catch (final Exception e) {
			responseObserver.onError(e);
		}
	}

	@Override
	public void registerPreRule(RegisterRuleRequest request, StreamObserver<RegisterRuleReply> responseObserver) {
		Rule r;
		try {
			r = pTalkEngineRuntime.getConfigurationTasksManager().addPreRule(request.getRule().getTask(),
					request.getJsonRule());
			final RegisterRuleReply reply = RegisterRuleReply.newBuilder().setFlowReference(request.getFlowReference())
					.setRule(net.rossonet.ptalk.ability.grpc.Rule.newBuilder().setRuleUniqueName(r.getName())
							.setTask(request.getRule().getTask()))
					.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().getMillis()).build())
					.setStatus(StatusValue.STATUS_GOOD).build();
			responseObserver.onNext(reply);
			responseObserver.onCompleted();
		} catch (final Exception e) {
			responseObserver.onError(e);
		}
	}

}

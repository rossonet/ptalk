package net.rossonet.ptalk.engine.grpc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;
import org.joda.time.Instant;
import org.json.JSONObject;

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
import net.rossonet.ptalk.ability.grpc.RegisterRuleReply;
import net.rossonet.ptalk.ability.grpc.RegisterRuleRequest;
import net.rossonet.ptalk.ability.grpc.RpcAbilityCoreV1Grpc.RpcAbilityCoreV1ImplBase;
import net.rossonet.ptalk.base.grpc.Status;
import net.rossonet.ptalk.base.grpc.StatusValue;
import net.rossonet.ptalk.base.grpc.Timestamp;
import net.rossonet.ptalk.engine.PTalkEngineRuntime;
import net.rossonet.ptalk.utils.JsonHelper;

public class GrpcAbilityServiceImpl extends RpcAbilityCoreV1ImplBase {

	private final PTalkEngineRuntime pTalkEngineRuntime;

	public GrpcAbilityServiceImpl(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	@Override
	public void cancelRule(CancelRuleRequest request, StreamObserver<CancelRuleReply> responseObserver) {
		pTalkEngineRuntime.getConfigurationTasksManager().removeRule(request.getRule().getTask(),
				request.getRule().getRuleUniqueName());
		final CancelRuleReply reply = CancelRuleReply.newBuilder().setFlowReference(request.getFlowReference())
				.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().getMillis()).build())
				.setStatus(StatusValue.STATUS_GOOD).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

	@Override
	public void generalConfigurationQuery(GeneralConfigurationQueryRequest request,
			StreamObserver<GeneralConfigurationQueryReply> responseObserver) {
		final net.rossonet.ptalk.base.grpc.Data replyData = pTalkEngineRuntime.getGlobalConfiguration().query(request);
		final GeneralConfigurationQueryReply reply = GeneralConfigurationQueryReply.newBuilder()
				.setFlowReference(request.getFlowReference())
				.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().getMillis()).build())
				.setValue(replyData).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

	public PTalkEngineRuntime getpTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

	@Override
	public void getRule(GetRuleRequest request, StreamObserver<GetRuleReply> responseObserver) {
		final Set<String> rules = pTalkEngineRuntime.getConfigurationTasksManager()
				.getMainRulesAsString(request.getRule().getTask());
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
	public void listRules(ListRulesRequest request, StreamObserver<ListRulesReply> responseObserver) {
		final Set<net.rossonet.ptalk.ability.grpc.Rule> rulesList = new HashSet<>();
		for (final String t : pTalkEngineRuntime.getConfigurationTasksManager().getTasks()) {
			final Rules rules = pTalkEngineRuntime.getConfigurationTasksManager().getMainRules(t);
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
	public void memoryQuery(MemoryContextQueryRequest request,
			StreamObserver<MemoryContextQueryReply> responseObserver) {
		final ReplyMemoryQuery replyData = pTalkEngineRuntime.getMemoryManager().query(request);
		final MemoryContextQueryReply reply = MemoryContextQueryReply.newBuilder()
				.setFlowReference(request.getFlowReference())
				.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().getMillis()).build())
				.setContext(replyData.getContext()).addAllDatas(replyData.getDatas()).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

	@Override
	public void registerRule(RegisterRuleRequest request, StreamObserver<RegisterRuleReply> responseObserver) {
		Rule r;
		try {
			r = pTalkEngineRuntime.getConfigurationTasksManager().addMainRule(request.getRule().getTask(),
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
	public void replyAsync(AbilityMessageReply request, StreamObserver<Status> responseObserver) {
		pTalkEngineRuntime.replyFromAbilityMessage(request);
		final Status reply = Status.newBuilder().setStatus(StatusValue.STATUS_GOOD).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

}

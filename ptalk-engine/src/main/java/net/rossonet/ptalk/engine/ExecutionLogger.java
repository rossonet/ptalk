package net.rossonet.ptalk.engine;

import java.io.Closeable;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Logger;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;
import org.rossonet.utils.LogHelper;

import net.rossonet.ptalk.engine.exceptions.TaskManagerException;
import net.rossonet.ptalk.engine.runtime.Task;
import net.rossonet.ptalk.utils.JsonHelper;

public class ExecutionLogger implements Closeable {

	private static final Logger logger = Logger.getLogger(ExecutionLogger.class.getName());
	private final PTalkEngineRuntime pTalkEngineRuntime;

	ExecutionLogger(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	public void addedNextHop(String rulesEngineTask, String target, String scheduler, boolean debug) {
		logger.info("addedNextHop " + rulesEngineTask + "\ntarget" + target + "\nscheduler" + scheduler + "\ndebug"
				+ debug);
	}

	public void afterEvaluate(Task rulesEngineTask, Rule rule, Facts facts, boolean evaluationResult) {
		logger.info("afterEvaluate " + rulesEngineTask.getTraceId() + "\nrule:" + rule + "\nfacts:" + facts
				+ "\nevaluationResult" + evaluationResult);
	}

	public void afterExecute(Task rulesEngineTask, Rules rules, Facts facts) {
		logger.info("afterEvaluate " + rulesEngineTask.getTraceId() + "\nrules:" + rules + "\nfacts:" + facts);
	}

	public void beforeEvaluate(Task rulesEngineTask, Rule rule, Facts facts) {
		logger.info("beforeEvaluate " + rulesEngineTask.getTraceId() + "\nrule:" + rule + "\nfacts:" + facts);
	}

	public void beforeEvaluate(Task rulesEngineTask, Rules rules, Facts facts) {
		logger.info("beforeEvaluate " + rulesEngineTask.getTraceId() + "\nrules:" + rules + "\nfacts:" + facts);
	}

	public void beforeExecute(Task rulesEngineTask, Rule rule, Facts facts) {
		logger.info("beforeExecute " + rulesEngineTask.getTraceId() + "\nrule:" + rule + "\nfacts:" + facts);
	}

	@Override
	public void close() throws IOException {
		// pulizia
	}

	public void completedInstant(Task rulesEngineTask) {
		logger.info("completedInstant " + rulesEngineTask.getTraceId());
	}

	public void exceptionLog(String taskName, TaskManagerException fireException) {
		logger.info("exceptionLog " + taskName + "\nstacktrace" + LogHelper.stackTraceToString(fireException));

	}

	public void exceptionLog(Task rulesEngineTask, Exception fireException) {
		logger.info("exceptionLog " + rulesEngineTask + "\nstacktrace" + LogHelper.stackTraceToString(fireException));

	}

	public void executionParameters(Task rulesEngineTask, String executionParameters) {
		logger.info(
				"executionParameters " + rulesEngineTask.getTraceId() + "\nexecutionParameters" + executionParameters);

	}

	public PTalkEngineRuntime getpTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

	public void logGlobalException(Exception exception) {
		logger.info("logGlobalException\nstacktrace" + LogHelper.stackTraceToString(exception));

	}

	public void mainFireCompletedFacts(Task rulesEngineTask, Facts workingFacts) {
		logger.info("mainFireCompletedFacts " + rulesEngineTask.getTraceId() + "\nworkingFacts:" + workingFacts);

	}

	public void mainFireFacts(Task rulesEngineTask, Facts workingFacts) {
		logger.info("mainFireFacts " + rulesEngineTask.getTraceId() + "\nworkingFacts:" + workingFacts);

	}

	public void mainRules(Task rulesEngineTask, Set<String> set) {
		logger.info("mainRules " + rulesEngineTask.getTraceId() + "\nrulesAsJson"
				+ JsonHelper.getJsonArrayFromStringSet(set));

	}

	public void message(String message) {
		logger.info("message " + message);

	}

	public void onEvaluationError(Task rulesEngineTask, Rule rule, Facts facts, Exception exception) {
		logger.info("onEvaluationError " + rulesEngineTask.getTraceId() + "\nrule:" + rule + "\nfacts:" + facts
				+ "\nstacktrace" + LogHelper.stackTraceToString(exception));

	}

	public void onFailure(Task rulesEngineTask, Rule rule, Facts facts, Exception exception) {
		logger.info("onFailure " + rulesEngineTask.getTraceId() + "\nrule:" + rule + "\nfacts:" + facts + "\nstacktrace"
				+ LogHelper.stackTraceToString(exception));

	}

	public void onSuccess(Task rulesEngineTask, Rule rule, Facts facts) {
		logger.info("onSuccess " + rulesEngineTask.getTraceId() + "\nrule:" + rule + "\nfacts:" + facts);
	}

	public void postFireFacts(Task rulesEngineTask, Facts workingFacts) {
		logger.info("postFireFacts " + rulesEngineTask.getTraceId() + "\nworkingFacts:" + workingFacts);

	}

	public void postRules(Task rulesEngineTask, Set<String> set) {
		logger.info("postRules " + rulesEngineTask.getTraceId() + "\npostRulesAsJson"
				+ JsonHelper.getJsonArrayFromStringSet(set));

	}

	public void preFireFacts(Task rulesEngineTask, Facts preFireFacts) {
		logger.info("preFireFacts " + rulesEngineTask.getTraceId() + "\npreFireFacts:" + preFireFacts);

	}

	public void preRules(Task rulesEngineTask, Set<String> set) {
		logger.info("preRules " + rulesEngineTask.getTraceId() + "\npreRulesAsJson"
				+ JsonHelper.getJsonArrayFromStringSet(set));

	}

	public void startInstant(Task rulesEngineTask) {
		logger.info("startInstant " + rulesEngineTask.getTraceId());

	}

}

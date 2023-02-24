package net.rossonet.ptalk.engine.runtime;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;

import net.rossonet.ptalk.engine.exceptions.TaskManagerException;

public class ExecutionLogger {

	public static ExecutionLogger getTraceLogger(Task rulesEngineTask) {
		// TODO Auto-generated method stub
		return null;
	}

	public void afterEvaluate(Task rulesEngineTask, Rule rule, Facts facts, boolean evaluationResult) {
		// TODO Auto-generated method stub

	}

	public void afterExecute(Task rulesEngineTask, Rules rules, Facts facts) {
		// TODO Auto-generated method stub

	}

	public void beforeEvaluate(Task rulesEngineTask, Rule rule, Facts facts) {
		// TODO Auto-generated method stub

	}

	public void beforeEvaluate(Task rulesEngineTask, Rules rules, Facts facts) {
		// TODO Auto-generated method stub

	}

	public void beforeExecute(Task rulesEngineTask, Rule rule, Facts facts) {
		// TODO Auto-generated method stub

	}

	public void completedInstant(Task rulesEngineTask) {
		// TODO Auto-generated method stub

	}

	public void exceptionLog(Task rulesEngineTask, TaskManagerException fireException) {
		// TODO Auto-generated method stub

	}

	public void executionParameters(Task rulesEngineTask, String executionParametersAsJson) {
		// TODO Auto-generated method stub

	}

	public void mainFireCompletedFacts(Task rulesEngineTask, Facts workingFacts) {
		// TODO Auto-generated method stub

	}

	public void mainFireFacts(Task rulesEngineTask, Facts workingFacts) {
		// TODO Auto-generated method stub

	}

	public void mainRules(Task rulesEngineTask, String rulesAsJson) {
		// TODO Auto-generated method stub

	}

	public void onEvaluationError(Task rulesEngineTask, Rule rule, Facts facts, Exception exception) {
		// TODO Auto-generated method stub

	}

	public void onFailure(Task rulesEngineTask, Rule rule, Facts facts, Exception exception) {
		// TODO Auto-generated method stub

	}

	public void onSuccess(Task rulesEngineTask, Rule rule, Facts facts) {
		// TODO Auto-generated method stub

	}

	public void postFireFacts(Task rulesEngineTask, Facts workingFacts) {
		// TODO Auto-generated method stub

	}

	public void postRules(Task rulesEngineTask, String postRulesAsJson) {
		// TODO Auto-generated method stub

	}

	public void preFireFacts(Task rulesEngineTask, Facts preFireFacts) {
		// TODO Auto-generated method stub

	}

	public void preRules(Task rulesEngineTask, String preRulesAsJson) {
		// TODO Auto-generated method stub

	}

	public void startInstant(Task rulesEngineTask) {
		// TODO Auto-generated method stub

	}

}

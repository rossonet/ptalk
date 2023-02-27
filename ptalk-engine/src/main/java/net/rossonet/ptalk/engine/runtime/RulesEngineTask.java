package net.rossonet.ptalk.engine.runtime;

import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.jeasy.rules.api.Fact;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;

import net.rossonet.ptalk.engine.PTalkEngineRuntime;
import net.rossonet.ptalk.engine.exceptions.BadTaskOrderExecution;
import net.rossonet.ptalk.engine.exceptions.FireException;
import net.rossonet.ptalk.engine.exceptions.LoadingTaskRulesException;
import net.rossonet.ptalk.engine.exceptions.TaskManagerException;
import net.rossonet.ptalk.engine.parameter.ExecutionParameters;
import net.rossonet.ptalk.engine.runtime.callable.RulesEngineRunnerCallable;
import net.rossonet.ptalk.engine.runtime.fact.NextHop.NextHop;
import net.rossonet.ptalk.engine.runtime.fact.NextHop.NextHopManagerFact;
import net.rossonet.ptalk.engine.runtime.fact.ability.AbilityCommunicationFact;
import net.rossonet.ptalk.engine.runtime.fact.ai.AiManagerFact;
import net.rossonet.ptalk.engine.runtime.fact.extensions.ExtensionsManagerFact;
import net.rossonet.ptalk.engine.runtime.fact.memory.MemoryManagerFact;
import net.rossonet.ptalk.engine.runtime.fact.nlu.NluCommunicationFact;
import net.rossonet.ptalk.engine.runtime.fact.superManager.SuperManagerFact;

class RulesEngineTask implements Task {

	private final Rules preExecutionRules = new Rules();

	private final Rules executionRules = new Rules();

	private ExecutionParameters executionParameters = null;

	private final Rules postExecutionRules = new Rules();

	private final Facts workingFacts;

	private final String taskName;

	private ExecutionStatus executionStatus = ExecutionStatus.INIT;

	private boolean traceLog = false;

	private final String traceId;

	private Future<Facts> preRunFuture = null;

	private Future<Facts> mainRunFuture = null;

	private Future<Facts> postRunFuture = null;

	private Collection<NextHop> nextHops = null;

	private final PTalkEngineRuntime pTalkEngineRuntime;

	private final NextHop request;

	RulesEngineTask(PTalkEngineRuntime pTalkEngineRuntime, NextHop request, Facts inputFacts)
			throws TaskManagerException {
		this.traceId = UUID.randomUUID().toString();
		this.request = request;
		this.taskName = request.getTarget();
		if (inputFacts != null) {
			this.workingFacts = inputFacts;
		} else {
			this.workingFacts = new Facts();
		}
		this.pTalkEngineRuntime = pTalkEngineRuntime;
		executionStatus = ExecutionStatus.INIT;
		traceLog = request.isTraceOnLog();
		pTalkEngineRuntime.getExecutionLogger().startInstant(this);
	}

	private void addPostFireFacts() {
		workingFacts.add(new Fact<SuperManagerFact>(executionParameters.getSuperManagerFactLabel(),
				pTalkEngineRuntime.getSuperManagerFactFactory().getOrCreate(this)));
		workingFacts.add(new Fact<NextHopManagerFact>(executionParameters.getNextHopFactLabel(),
				pTalkEngineRuntime.getNextHopManagerFactFactory().getOrCreate(this)));
	}

	private void addPreFireFacts() {
		workingFacts.add(new Fact<SuperManagerFact>(executionParameters.getSuperManagerFactLabel(),
				pTalkEngineRuntime.getSuperManagerFactFactory().getOrCreate(this)));
		workingFacts.add(new Fact<MemoryManagerFact>(executionParameters.getMemoryManagerFactLabel(),
				pTalkEngineRuntime.getMemoryManagerFactFactory().getOrCreate(this)));
		workingFacts.add(new Fact<AiManagerFact>(executionParameters.getAiManagerFactLabel(),
				pTalkEngineRuntime.getAiManagerFactFactory().getOrCreate(this)));
		workingFacts.add(new Fact<ExtensionsManagerFact>(executionParameters.getExtensionsManagerFactLabel(),
				pTalkEngineRuntime.getExtensionsManagerFactFactory().getOrCreate(this)));
		workingFacts.add(new Fact<AbilityCommunicationFact>(executionParameters.getAbilityCommunicationFactLabel(),
				pTalkEngineRuntime.getAbilityCommunicationFactFactory().getOrCreate(this)));
		workingFacts.add(new Fact<NluCommunicationFact>(executionParameters.getNluCommunicationFactLabel(),
				pTalkEngineRuntime.getNluCommunicationFactFactory().getOrCreate(this)));
	}

	@Override
	public void afterEvaluate(Rule rule, Facts facts, boolean evaluationResult) {
		if (traceLog) {
			pTalkEngineRuntime.getExecutionLogger().afterEvaluate(this, rule, facts, evaluationResult);
		}
	}

	@Override
	public void afterExecute(Rules rules, Facts facts) {
		if (traceLog) {
			pTalkEngineRuntime.getExecutionLogger().afterExecute(this, rules, facts);
		}
	}

	@Override
	public boolean beforeEvaluate(Rule rule, Facts facts) {
		if (traceLog) {
			pTalkEngineRuntime.getExecutionLogger().beforeEvaluate(this, rule, facts);
		}
		return true;
	}

	@Override
	public void beforeEvaluate(Rules rules, Facts facts) {
		if (traceLog) {
			pTalkEngineRuntime.getExecutionLogger().beforeEvaluate(this, rules, facts);
		}
	}

	@Override
	public void beforeExecute(Rule rule, Facts facts) {
		if (traceLog) {
			pTalkEngineRuntime.getExecutionLogger().beforeExecute(this, rule, facts);
		}
	}

	@Override
	public void close() throws Exception {
		pTalkEngineRuntime.getExecutionLogger().completedInstant(this);
	}

	void fire() throws TaskManagerException {
		preFire();
		mainFire();
		postFire();
	}

	@Override
	public ExecutionStatus getExecutionStatus() {
		return executionStatus;
	}

	@Override
	public Collection<NextHop> getNextHops() {
		return nextHops;
	}

	public NextHop getRequest() {
		return request;
	}

	@Override
	public String getTaskName() {
		return taskName;
	}

	@Override
	public String getTraceId() {
		return traceId;
	}

	@Override
	public Facts getWorkingFacts() {
		return workingFacts;
	}

	@Override
	public boolean isTraceOnLog() {
		return traceLog;
	}

	void loadRules() throws TaskManagerException {
		if (executionStatus != ExecutionStatus.INIT) {
			throw new BadTaskOrderExecution("try to load rules in a task with status " + executionStatus.name());
		}
		try {
			for (final Rule preRule : pTalkEngineRuntime.getConfigurationTasksManager()
					.getPreRules(getTaskName())) {
				preExecutionRules.register(preRule);
			}
			if (traceLog) {
				pTalkEngineRuntime.getExecutionLogger().preRules(this,
						pTalkEngineRuntime.getConfigurationTasksManager().getPreRulesAsString(getTaskName()));
			}
		} catch (final Exception e) {
			executionStatus = ExecutionStatus.LOAD_FAULT;
			final LoadingTaskRulesException loadingTaskRulesException = new LoadingTaskRulesException(
					"loading pre rules", e);
			if (traceLog) {
				pTalkEngineRuntime.getExecutionLogger().exceptionLog(this, loadingTaskRulesException);
			}
			throw loadingTaskRulesException;
		}
		try {
			for (final Rule preRule : pTalkEngineRuntime.getConfigurationTasksManager()
					.getMainRules(getTaskName())) {
				executionRules.register(preRule);
			}
			executionParameters = pTalkEngineRuntime.getConfigurationTasksManager()
					.getExecutionParameters(getTaskName());
			if (traceLog) {
				pTalkEngineRuntime.getExecutionLogger().mainRules(this,
						pTalkEngineRuntime.getConfigurationTasksManager().getMainRulesAsString(getTaskName()));
				pTalkEngineRuntime.getExecutionLogger().executionParameters(this, executionParameters.toString());
			}
		} catch (final Exception e) {
			executionStatus = ExecutionStatus.LOAD_FAULT;
			final LoadingTaskRulesException loadingTaskRulesException = new LoadingTaskRulesException(
					"loading main rules", e);
			if (traceLog) {
				pTalkEngineRuntime.getExecutionLogger().exceptionLog(this, loadingTaskRulesException);
			}
			throw loadingTaskRulesException;
		}
		try {
			for (final Rule preRule : pTalkEngineRuntime.getConfigurationTasksManager()
					.getPostRules(getTaskName())) {
				postExecutionRules.register(preRule);
			}
			if (traceLog) {
				pTalkEngineRuntime.getExecutionLogger().postRules(this,
						pTalkEngineRuntime.getConfigurationTasksManager().getPostRulesAsString(getTaskName()));
			}
		} catch (final Exception e) {
			executionStatus = ExecutionStatus.LOAD_FAULT;
			final LoadingTaskRulesException loadingTaskRulesException = new LoadingTaskRulesException(
					"loading post rules", e);
			if (traceLog) {
				pTalkEngineRuntime.getExecutionLogger().exceptionLog(this, loadingTaskRulesException);
			}
			throw loadingTaskRulesException;
		}
		executionStatus = ExecutionStatus.LOADED;
	}

	private void mainFire() throws TaskManagerException {
		removePreFireFacts();
		if (executionStatus != ExecutionStatus.PRE_EXECUTION_COMPLETED) {
			throw new BadTaskOrderExecution("try to fire main rules in a task with status " + executionStatus.name());
		}
		executionStatus = ExecutionStatus.MAIN_EXECUTION_RUNNING;
		if (traceLog) {
			pTalkEngineRuntime.getExecutionLogger().mainFireFacts(this, workingFacts);
		}
		final Callable<Facts> mainRunner = new RulesEngineRunnerCallable(this, executionRules, workingFacts);
		try {
			mainRunFuture = pTalkEngineRuntime.submit(request.getNextHopSchedulerType(), mainRunner);
			mainRunFuture.get(Long.valueOf(executionParameters.getTimeoutMainExecution()),
					TimeUnit.valueOf(executionParameters.getTimeoutMainExecutionTimeUnit()));
		} catch (final Exception e) {
			executionStatus = ExecutionStatus.MAIN_EXECUTION_FAULTED;
			final FireException fireException = new FireException("firing main rules", e);
			if (traceLog) {
				pTalkEngineRuntime.getExecutionLogger().exceptionLog(this, fireException);
			}
			throw fireException;
		}
		addPostFireFacts();
		executionStatus = ExecutionStatus.MAIN_EXECUTION_COMPLETED;
		if (traceLog) {
			pTalkEngineRuntime.getExecutionLogger().mainFireCompletedFacts(this, workingFacts);
		}
	}

	@Override
	public void onEvaluationError(Rule rule, Facts facts, Exception exception) {
		if (traceLog) {
			pTalkEngineRuntime.getExecutionLogger().onEvaluationError(this, rule, facts, exception);
		}
	}

	@Override
	public void onFailure(Rule rule, Facts facts, Exception exception) {
		if (traceLog) {
			pTalkEngineRuntime.getExecutionLogger().onFailure(this, rule, facts, exception);
		}
	}

	@Override
	public void onSuccess(Rule rule, Facts facts) {
		if (traceLog) {
			pTalkEngineRuntime.getExecutionLogger().onSuccess(this, rule, facts);
		}
	}

	@SuppressWarnings("unchecked")
	private void postFire() throws TaskManagerException {
		if (executionStatus != ExecutionStatus.MAIN_EXECUTION_COMPLETED) {
			throw new BadTaskOrderExecution("try to fire post rules in a task with status " + executionStatus.name());
		}
		executionStatus = ExecutionStatus.POST_EXECUTION_RUNNING;
		addPostFireFacts();
		if (traceLog) {
			pTalkEngineRuntime.getExecutionLogger().postFireFacts(this, workingFacts);
		}
		final Callable<Facts> postRunner = new RulesEngineRunnerCallable(this, postExecutionRules, workingFacts);
		try {
			postRunFuture = pTalkEngineRuntime.submit(request.getNextHopSchedulerType(), postRunner);
			postRunFuture.get(Long.valueOf(executionParameters.getTimeoutPostExecution()),
					TimeUnit.valueOf(executionParameters.getTimeoutPostExecutionTimeUnit()));
		} catch (final Exception e) {
			executionStatus = ExecutionStatus.POST_EXECUTION_FAULTED;
			final FireException fireException = new FireException("firing post rules", e);
			if (traceLog) {
				pTalkEngineRuntime.getExecutionLogger().exceptionLog(this, fireException);
			}
			throw fireException;
		}
		nextHops = ((Fact<NextHopManagerFact>) workingFacts.getFact(executionParameters.getNextHopFactLabel()))
				.getValue().getNextHops();
		removeAllManagerFactsAfterPostFire();
		executionStatus = ExecutionStatus.POST_EXECUTION_COMPLETED;

	}

	private void preFire() throws TaskManagerException {
		if (executionStatus != ExecutionStatus.LOADED) {
			throw new BadTaskOrderExecution("try to fire pre rules in a task with status " + executionStatus.name());
		}
		executionStatus = ExecutionStatus.PRE_EXECUTION_RUNNING;
		addPreFireFacts();
		if (traceLog) {
			pTalkEngineRuntime.getExecutionLogger().preFireFacts(this, workingFacts);
		}
		final Callable<Facts> preRunner = new RulesEngineRunnerCallable(this, preExecutionRules, workingFacts);
		try {
			preRunFuture = pTalkEngineRuntime.submit(request.getNextHopSchedulerType(), preRunner);
			preRunFuture.get(Long.valueOf(executionParameters.getTimeoutPreExecution()),
					TimeUnit.valueOf(executionParameters.getTimeoutPreExecutionTimeUnit()));
		} catch (final Exception e) {
			executionStatus = ExecutionStatus.PRE_EXECUTION_FAULTED;
			final FireException fireException = new FireException("firing pre rules", e);
			if (traceLog) {
				pTalkEngineRuntime.getExecutionLogger().exceptionLog(this, fireException);
			}
			throw fireException;
		}
		removePreFireFacts();
		executionStatus = ExecutionStatus.PRE_EXECUTION_COMPLETED;
	}

	private void removeAllManagerFactsAfterPostFire() {
		workingFacts.remove(executionParameters.getSuperManagerFactLabel());
		workingFacts.remove(executionParameters.getMemoryManagerFactLabel());
		workingFacts.remove(executionParameters.getAiManagerFactLabel());
		workingFacts.remove(executionParameters.getExtensionsManagerFactLabel());
		workingFacts.remove(executionParameters.getAbilityCommunicationFactLabel());
		workingFacts.remove(executionParameters.getNluCommunicationFactLabel());
		workingFacts.remove(executionParameters.getNextHopFactLabel());
		pTalkEngineRuntime.getSuperManagerFactFactory().remove(this);
		pTalkEngineRuntime.getMemoryManagerFactFactory().remove(this);
		pTalkEngineRuntime.getAiManagerFactFactory().remove(this);
		pTalkEngineRuntime.getExtensionsManagerFactFactory().remove(this);
		pTalkEngineRuntime.getAbilityCommunicationFactFactory().remove(this);
		pTalkEngineRuntime.getNluCommunicationFactFactory().remove(this);
	}

	private void removePreFireFacts() {
		workingFacts.remove(executionParameters.getSuperManagerFactLabel());
	}

}

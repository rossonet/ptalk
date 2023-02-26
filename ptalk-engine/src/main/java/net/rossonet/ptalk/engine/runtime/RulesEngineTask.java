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

import com.hazelcast.spi.impl.executionservice.ExecutionService;

import net.rossonet.ptalk.engine.exceptions.BadTaskOrderExecution;
import net.rossonet.ptalk.engine.exceptions.FireException;
import net.rossonet.ptalk.engine.exceptions.LoadingTaskRulesException;
import net.rossonet.ptalk.engine.exceptions.TaskManagerException;
import net.rossonet.ptalk.engine.parameter.ExecutionParameters;
import net.rossonet.ptalk.engine.parameter.GlobalConfiguration;
import net.rossonet.ptalk.engine.runtime.callable.RulesEngineRunnerCallable;
import net.rossonet.ptalk.engine.runtime.fact.NextHop.NextHop;
import net.rossonet.ptalk.engine.runtime.fact.NextHop.NextHopManagerFact;
import net.rossonet.ptalk.engine.runtime.fact.NextHop.NextHopManagerFactFactory;
import net.rossonet.ptalk.engine.runtime.fact.ability.AbilityCommunicationFact;
import net.rossonet.ptalk.engine.runtime.fact.ability.AbilityCommunicationFactFactory;
import net.rossonet.ptalk.engine.runtime.fact.ai.AiManagerFact;
import net.rossonet.ptalk.engine.runtime.fact.ai.AiManagerFactFactory;
import net.rossonet.ptalk.engine.runtime.fact.extensions.ExtensionsManagerFact;
import net.rossonet.ptalk.engine.runtime.fact.extensions.ExtensionsManagerFactFactory;
import net.rossonet.ptalk.engine.runtime.fact.memory.MemoryManagerFact;
import net.rossonet.ptalk.engine.runtime.fact.memory.MemoryManagerFactFactory;
import net.rossonet.ptalk.engine.runtime.fact.nlu.NluCommunicationFact;
import net.rossonet.ptalk.engine.runtime.fact.nlu.NluCommunicationFactFactory;
import net.rossonet.ptalk.engine.runtime.fact.superManager.SuperManagerFact;
import net.rossonet.ptalk.engine.runtime.fact.superManager.SuperManagerFactFactory;

class RulesEngineTask implements Task {

	private final Rules preExecutionRules = new Rules();

	private final Rules executionRules = new Rules();

	private ExecutionParameters executionParameters = null;

	private final Rules postExecutionRules = new Rules();

	private final Facts workingFacts;

	private final ExecutionLogger traceLogger;

	private final GlobalConfiguration configuration;

	private final String taskName;

	private ExecutionStatus executionStatus = ExecutionStatus.INIT;

	private boolean debug = false;

	private final String traceId = UUID.randomUUID().toString();

	private Future<Facts> preRunFuture = null;

	private Future<Facts> mainRunFuture = null;

	private Future<Facts> postRunFuture = null;
	private Collection<NextHop> nextHops = null;

	RulesEngineTask(NextHop request, String taskName, Facts inputFacts) throws TaskManagerException {
		traceLogger = ExecutionLogger.getTraceLogger(this);
		this.taskName = taskName;
		if (inputFacts != null) {
			this.workingFacts = inputFacts;
		} else {
			this.workingFacts = new Facts();
		}
		this.configuration = GlobalConfiguration.getInstance();
		executionStatus = ExecutionStatus.INIT;
		traceLogger.startInstant(this);
	}

	private void addPostFireFacts() {
		workingFacts.add(new Fact<SuperManagerFact>(executionParameters.getSuperManagerFactLabel(),
				SuperManagerFactFactory.getInstance(this)));
		workingFacts.add(new Fact<NextHopManagerFact>(executionParameters.getNextHopFactLabel(),
				NextHopManagerFactFactory.getInstance(this)));
	}

	private void addPreFireFacts() {
		workingFacts.add(new Fact<SuperManagerFact>(executionParameters.getSuperManagerFactLabel(),
				SuperManagerFactFactory.getInstance(this)));
		workingFacts.add(new Fact<MemoryManagerFact>(executionParameters.getMemoryManagerFactLabel(),
				MemoryManagerFactFactory.getInstance(this)));
		workingFacts.add(new Fact<AiManagerFact>(executionParameters.getAiManagerFactLabel(),
				AiManagerFactFactory.getInstance(this)));
		workingFacts.add(new Fact<ExtensionsManagerFact>(executionParameters.getExtensionsManagerFactLabel(),
				ExtensionsManagerFactFactory.getInstance(this)));
		workingFacts.add(new Fact<AbilityCommunicationFact>(executionParameters.getAbilityCommunicationFactLabel(),
				AbilityCommunicationFactFactory.getInstance(this)));
		workingFacts.add(new Fact<NluCommunicationFact>(executionParameters.getNluCommunicationFactLabel(),
				NluCommunicationFactFactory.getInstance(this)));
	}

	@Override
	public void afterEvaluate(Rule rule, Facts facts, boolean evaluationResult) {
		if (debug) {
			traceLogger.afterEvaluate(this, rule, facts, evaluationResult);
		}
	}

	@Override
	public void afterExecute(Rules rules, Facts facts) {
		if (debug) {
			traceLogger.afterExecute(this, rules, facts);
		}
	}

	@Override
	public boolean beforeEvaluate(Rule rule, Facts facts) {
		if (debug) {
			traceLogger.beforeEvaluate(this, rule, facts);
		}
		return true;
	}

	@Override
	public void beforeEvaluate(Rules rules, Facts facts) {
		if (debug) {
			traceLogger.beforeEvaluate(this, rules, facts);
		}
	}

	@Override
	public void beforeExecute(Rule rule, Facts facts) {
		if (debug) {
			traceLogger.beforeExecute(this, rule, facts);
		}
	}

	@Override
	public void close() throws Exception {
		traceLogger.completedInstant(this);
	}

	void fire(ExecutionService executionService) throws TaskManagerException {
		preFire(executionService);
		mainFire(executionService);
		postFire(executionService);
	}

	@Override
	public ExecutionStatus getExecutionStatus() {
		return executionStatus;
	}

	@Override
	public Collection<NextHop> getNextHops() {
		return nextHops;
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
	public boolean isDebug() {
		return debug;
	}

	void loadRules() throws TaskManagerException {
		if (executionStatus != ExecutionStatus.INIT) {
			throw new BadTaskOrderExecution("try to load rules in a task with status " + executionStatus.name());
		}
		try {
			for (final Rule preRule : configuration.getPreRulesAsJson(this)) {
				preExecutionRules.register(preRule);
			}
			if (debug) {
				traceLogger.preRules(this, configuration.getPreRulesAsString(this));
			}
		} catch (final Exception e) {
			executionStatus = ExecutionStatus.LOAD_FAULT;
			final LoadingTaskRulesException loadingTaskRulesException = new LoadingTaskRulesException(
					"loading pre rules", e);
			if (debug) {
				traceLogger.exceptionLog(this, loadingTaskRulesException);
			}
			throw loadingTaskRulesException;
		}
		try {
			for (final Rule preRule : configuration.getMainRulesAsJson(this)) {
				executionRules.register(preRule);
			}
			executionParameters = configuration.getExecutionParameters(this);
			if (debug) {
				traceLogger.mainRules(this, configuration.getMainRulesAsString(this));
				traceLogger.executionParameters(this, executionParameters.toString());
			}
		} catch (final Exception e) {
			executionStatus = ExecutionStatus.LOAD_FAULT;
			final LoadingTaskRulesException loadingTaskRulesException = new LoadingTaskRulesException(
					"loading main rules", e);
			if (debug) {
				traceLogger.exceptionLog(this, loadingTaskRulesException);
			}
			throw loadingTaskRulesException;
		}
		try {
			for (final Rule preRule : configuration.getPostRulesAsJson(this)) {
				postExecutionRules.register(preRule);
			}
			if (debug) {
				traceLogger.postRules(this, configuration.getPostRulesAsString(this));
			}
		} catch (final Exception e) {
			executionStatus = ExecutionStatus.LOAD_FAULT;
			final LoadingTaskRulesException loadingTaskRulesException = new LoadingTaskRulesException(
					"loading post rules", e);
			if (debug) {
				traceLogger.exceptionLog(this, loadingTaskRulesException);
			}
			throw loadingTaskRulesException;
		}
		executionStatus = ExecutionStatus.LOADED;
	}

	private void mainFire(ExecutionService executionService) throws TaskManagerException {
		removePreFireFacts();
		if (executionStatus != ExecutionStatus.PRE_EXECUTION_COMPLETED) {
			throw new BadTaskOrderExecution("try to fire main rules in a task with status " + executionStatus.name());
		}
		executionStatus = ExecutionStatus.MAIN_EXECUTION_RUNNING;
		if (debug) {
			traceLogger.mainFireFacts(this, workingFacts);
		}
		final Callable<Facts> mainRunner = new RulesEngineRunnerCallable(this, executionRules, workingFacts);
		try {
			mainRunFuture = executionService.submit("main-run", mainRunner);
			mainRunFuture.get(Long.valueOf(executionParameters.getTimeoutMainExecution()),
					TimeUnit.valueOf(executionParameters.getTimeoutMainExecutionTimeUnit()));
		} catch (final Exception e) {
			executionStatus = ExecutionStatus.MAIN_EXECUTION_FAULTED;
			final FireException fireException = new FireException("firing main rules", e);
			if (debug) {
				traceLogger.exceptionLog(this, fireException);
			}
			throw fireException;
		}
		addPostFireFacts();
		executionStatus = ExecutionStatus.MAIN_EXECUTION_COMPLETED;
		if (debug) {
			traceLogger.mainFireCompletedFacts(this, workingFacts);
		}
	}

	@Override
	public void onEvaluationError(Rule rule, Facts facts, Exception exception) {
		if (debug) {
			traceLogger.onEvaluationError(this, rule, facts, exception);
		}
	}

	@Override
	public void onFailure(Rule rule, Facts facts, Exception exception) {
		if (debug) {
			traceLogger.onFailure(this, rule, facts, exception);
		}
	}

	@Override
	public void onSuccess(Rule rule, Facts facts) {
		if (debug) {
			traceLogger.onSuccess(this, rule, facts);
		}
	}

	@SuppressWarnings("unchecked")
	private void postFire(ExecutionService executionService) throws TaskManagerException {
		if (executionStatus != ExecutionStatus.MAIN_EXECUTION_COMPLETED) {
			throw new BadTaskOrderExecution("try to fire post rules in a task with status " + executionStatus.name());
		}
		executionStatus = ExecutionStatus.POST_EXECUTION_RUNNING;
		addPostFireFacts();
		if (debug) {
			traceLogger.postFireFacts(this, workingFacts);
		}
		final Callable<Facts> postRunner = new RulesEngineRunnerCallable(this, postExecutionRules, workingFacts);
		try {
			postRunFuture = executionService.submit("post-run", postRunner);
			postRunFuture.get(Long.valueOf(executionParameters.getTimeoutPostExecution()),
					TimeUnit.valueOf(executionParameters.getTimeoutPostExecutionTimeUnit()));
		} catch (final Exception e) {
			executionStatus = ExecutionStatus.POST_EXECUTION_FAULTED;
			final FireException fireException = new FireException("firing post rules", e);
			if (debug) {
				traceLogger.exceptionLog(this, fireException);
			}
			throw fireException;
		}
		nextHops = ((Fact<NextHopManagerFact>) workingFacts.getFact(executionParameters.getNextHopFactLabel()))
				.getValue().getNextHops();
		removeAllManagerFactsAfterPostFire();
		executionStatus = ExecutionStatus.POST_EXECUTION_COMPLETED;

	}

	private void preFire(ExecutionService executionService) throws TaskManagerException {
		if (executionStatus != ExecutionStatus.LOADED) {
			throw new BadTaskOrderExecution("try to fire pre rules in a task with status " + executionStatus.name());
		}
		executionStatus = ExecutionStatus.PRE_EXECUTION_RUNNING;
		addPreFireFacts();
		if (debug) {
			traceLogger.preFireFacts(this, workingFacts);
		}
		final Callable<Facts> preRunner = new RulesEngineRunnerCallable(this, preExecutionRules, workingFacts);
		try {
			preRunFuture = executionService.submit("pre-run", preRunner);
			preRunFuture.get(Long.valueOf(executionParameters.getTimeoutPreExecution()),
					TimeUnit.valueOf(executionParameters.getTimeoutPreExecutionTimeUnit()));
		} catch (final Exception e) {
			executionStatus = ExecutionStatus.PRE_EXECUTION_FAULTED;
			final FireException fireException = new FireException("firing pre rules", e);
			if (debug) {
				traceLogger.exceptionLog(this, fireException);
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
		SuperManagerFactFactory.terminate(this);
		MemoryManagerFactFactory.terminate(this);
		AiManagerFactFactory.terminate(this);
		ExtensionsManagerFactFactory.terminate(this);
		AbilityCommunicationFactFactory.terminate(this);
		NluCommunicationFactFactory.terminate(this);
	}

	private void removePreFireFacts() {
		workingFacts.remove(executionParameters.getSuperManagerFactLabel());
	}

	@Override
	public void setDebug(boolean debug) {
		this.debug = debug;
	}

}

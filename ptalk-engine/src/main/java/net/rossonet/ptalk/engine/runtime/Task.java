package net.rossonet.ptalk.engine.runtime;

import java.time.Instant;
import java.util.Collection;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.RuleListener;
import org.jeasy.rules.api.RulesEngineListener;

import net.rossonet.ptalk.engine.PTalkEngineRuntime;
import net.rossonet.ptalk.engine.exceptions.TaskManagerException;
import net.rossonet.ptalk.engine.runtime.fact.nextHop.NextHop;

public interface Task extends AutoCloseable, RuleListener, RulesEngineListener {

	public enum ExecutionStatus {
		INIT, LOADED, LOAD_FAULT, POST_EXECUTION_RUNNING, POST_EXECUTION_COMPLETED, POST_EXECUTION_FAULTED,
		PRE_EXECUTION_RUNNING, PRE_EXECUTION_COMPLETED, PRE_EXECUTION_FAULTED, MAIN_EXECUTION_COMPLETED,
		MAIN_EXECUTION_FAULTED, MAIN_EXECUTION_RUNNING
	}

	public static Task fire(PTalkEngineRuntime pTalkEngineRuntime, NextHop request, String taskName, Facts inputFacts)
			throws TaskManagerException {
		final RulesEngineTask rulesEngineTask = new RulesEngineTask(pTalkEngineRuntime, request, inputFacts);
		rulesEngineTask.loadRules();
		rulesEngineTask.fire();
		return rulesEngineTask;
	}

	ExecutionStatus getExecutionStatus();

	Collection<NextHop> getNextHops();

	Instant getStartingInstant();

	String getTaskName();

	String getTraceId();

	Facts getWorkingFacts();

	boolean isTraceOnLog();

}
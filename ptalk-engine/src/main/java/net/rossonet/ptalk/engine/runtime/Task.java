package net.rossonet.ptalk.engine.runtime;

import java.util.Collection;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.RuleListener;
import org.jeasy.rules.api.RulesEngineListener;

import com.hazelcast.spi.impl.executionservice.ExecutionService;

import net.rossonet.ptalk.engine.exceptions.TaskManagerException;
import net.rossonet.ptalk.engine.runtime.fact.NextHop.NextHop;

public interface Task extends AutoCloseable, RuleListener, RulesEngineListener {

	public enum ExecutionStatus {
		INIT, LOADED, LOAD_FAULT, POST_EXECUTION_RUNNING, POST_EXECUTION_COMPLETED, POST_EXECUTION_FAULTED,
		PRE_EXECUTION_RUNNING, PRE_EXECUTION_COMPLETED, PRE_EXECUTION_FAULTED, MAIN_EXECUTION_COMPLETED,
		MAIN_EXECUTION_FAULTED, MAIN_EXECUTION_RUNNING
	}

	public static Task fire(NextHop request, String taskName, Facts inputFacts, ExecutionService executionService)
			throws TaskManagerException {
		final RulesEngineTask rulesEngineTask = new RulesEngineTask(request, taskName, inputFacts);
		rulesEngineTask.loadRules();
		rulesEngineTask.fire(executionService);
		return rulesEngineTask;
	}

	ExecutionStatus getExecutionStatus();

	Collection<NextHop> getNextHops();

	String getTaskName();

	String getTraceId();

	Facts getWorkingFacts();

	boolean isDebug();

	void setDebug(boolean debug);

}
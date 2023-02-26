package net.rossonet.ptalk.engine.parameter;

import java.io.StringReader;
import java.util.Collection;

import org.jeasy.rules.api.Rules;
import org.jeasy.rules.jexl.JexlRuleFactory;
import org.jeasy.rules.support.reader.JsonRuleDefinitionReader;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.replicatedmap.ReplicatedMap;

import net.rossonet.ptalk.engine.HazelcastInstanceBuilder;
import net.rossonet.ptalk.engine.TaskModel;
import net.rossonet.ptalk.engine.exceptions.TaskManagerException;
import net.rossonet.ptalk.engine.runtime.ExecutionLogger;
import net.rossonet.ptalk.engine.runtime.Task;

public class GlobalConfiguration {

	private static final GlobalConfiguration INSTANCE = new GlobalConfiguration();

	private static final JexlRuleFactory RULE_FACTORY = new JexlRuleFactory(new JsonRuleDefinitionReader());

	private static final String TASK_MODEL_MAP_NAME = "task-model";

	public static GlobalConfiguration getInstance() {
		return INSTANCE;
	}

	private final HazelcastInstance hazelcastInstance;

	private final ReplicatedMap<String, TaskModel> taskModelRepository;

	private GlobalConfiguration() {
		hazelcastInstance = HazelcastInstanceBuilder.getHazelcastInstance();
		taskModelRepository = hazelcastInstance.getReplicatedMap(TASK_MODEL_MAP_NAME);
	}

	public void addTaskConfiguration(String jsonConfiguration) {
		// TODO aggiungere un task nella mappa da configurazione json
	}

	public ExecutionParameters getExecutionParameters(Task rulesEngineTask) {
		return ExecutionParameters
				.fromJson(taskModelRepository.get(rulesEngineTask.getTaskName()).getExecutionParameter());
	}

	public Rules getMainRulesAsJson(Task rulesEngineTask) {
		final String rulesAsJson = getMainRulesAsString(rulesEngineTask);
		try {
			return RULE_FACTORY.createRules(new StringReader(rulesAsJson));
		} catch (final Exception e) {
			final TaskManagerException ex = new TaskManagerException("during getMainRules", e);
			ExecutionLogger.getTraceLoggerFor(rulesEngineTask.getTraceId()).exceptionLog(rulesEngineTask, ex);
			return new Rules();
		}
	}

	public String getMainRulesAsString(Task rulesEngineTask) {
		return taskModelRepository.get(rulesEngineTask.getTaskName()).getMainRulesAsString();
	}

	public Rules getPostRulesAsJson(Task rulesEngineTask) {
		final String rulesAsJson = getPostRulesAsString(rulesEngineTask);
		try {
			return RULE_FACTORY.createRules(new StringReader(rulesAsJson));
		} catch (final Exception e) {
			final TaskManagerException ex = new TaskManagerException("during getPostRules", e);
			ExecutionLogger.getTraceLoggerFor(rulesEngineTask.getTraceId()).exceptionLog(rulesEngineTask, ex);
			return new Rules();
		}
	}

	public String getPostRulesAsString(Task rulesEngineTask) {
		return taskModelRepository.get(rulesEngineTask.getTaskName()).getPostRulesAsString();
	}

	public Rules getPreRulesAsJson(Task rulesEngineTask) {
		final String rulesAsJson = getPreRulesAsString(rulesEngineTask);
		try {
			return RULE_FACTORY.createRules(new StringReader(rulesAsJson));
		} catch (final Exception e) {
			final TaskManagerException ex = new TaskManagerException("during getPreRules", e);
			ExecutionLogger.getTraceLoggerFor(rulesEngineTask.getTraceId()).exceptionLog(rulesEngineTask, ex);
			return new Rules();
		}
	}

	public String getPreRulesAsString(Task rulesEngineTask) {
		return taskModelRepository.get(rulesEngineTask.getTaskName()).getPreRulesAsString();
	}

	public String getTaskConfiguration(String taskName) {
		// TODO recuperare la configurazione json di un task
		return null;
	}

	public Collection<String> getTasks() {
		return taskModelRepository.keySet();
	}

}

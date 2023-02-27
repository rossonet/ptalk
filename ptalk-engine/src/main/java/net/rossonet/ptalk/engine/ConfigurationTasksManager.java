package net.rossonet.ptalk.engine;

import java.io.Closeable;
import java.io.IOException;
import java.io.StringReader;
import java.util.Collection;

import org.jeasy.rules.api.Rules;
import org.jeasy.rules.jexl.JexlRuleFactory;
import org.jeasy.rules.support.reader.JsonRuleDefinitionReader;
import org.json.JSONObject;

import net.rossonet.ptalk.engine.exceptions.TaskManagerException;
import net.rossonet.ptalk.engine.parameter.ExecutionParameters;
import net.rossonet.ptalk.engine.parameter.OnlineTaskModel;

public class ConfigurationTasksManager implements Closeable {

	private static final JexlRuleFactory RULE_FACTORY = new JexlRuleFactory(new JsonRuleDefinitionReader());

	private final PTalkEngineRuntime pTalkEngineRuntime;

	ConfigurationTasksManager(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	public void addOrUpdateTaskConfiguration(JSONObject jsonConfiguration) {
		final OnlineTaskModel task = new OnlineTaskModel(jsonConfiguration);
		pTalkEngineRuntime.getHazelcastInstanceBuilder().getTaskModelRepository().put(task.getModelName(), task);
	}

	@Override
	public void close() throws IOException {
		// pulizia
	}

	public void deleteTaskConfiguration(String taskName) {
		pTalkEngineRuntime.getHazelcastInstanceBuilder().getTaskModelRepository().remove(taskName);
	}

	public ExecutionParameters getExecutionParameters(String taskName) {
		return new ExecutionParameters(new JSONObject(getTaskConfiguration(taskName).getExecutionParameter()));
	}

	public Rules getMainRules(String taskName) {
		final String rulesAsJson = getMainRulesAsString(taskName);
		try {
			return RULE_FACTORY.createRules(new StringReader(rulesAsJson));
		} catch (final Exception e) {
			final TaskManagerException ex = new TaskManagerException("during getMainRules", e);
			pTalkEngineRuntime.getExecutionLogger().exceptionLog(taskName, ex);
			return new Rules();
		}
	}

	public String getMainRulesAsString(String taskName) {
		return pTalkEngineRuntime.getHazelcastInstanceBuilder().getTaskModelRepository().get(taskName)
				.getMainRulesAsString();
	}

	public Rules getPostRules(String taskName) {
		final String rulesAsJson = getPostRulesAsString(taskName);
		try {
			return RULE_FACTORY.createRules(new StringReader(rulesAsJson));
		} catch (final Exception e) {
			final TaskManagerException ex = new TaskManagerException("during getPostRules", e);
			pTalkEngineRuntime.getExecutionLogger().exceptionLog(taskName, ex);
			return new Rules();
		}
	}

	public String getPostRulesAsString(String taskName) {
		return getTaskConfiguration(taskName).getPostRulesAsString();
	}

	public Rules getPreRules(String taskName) {
		final String rulesAsJson = getPreRulesAsString(taskName);
		try {
			return RULE_FACTORY.createRules(new StringReader(rulesAsJson));
		} catch (final Exception e) {
			final TaskManagerException ex = new TaskManagerException("during getPreRules", e);
			pTalkEngineRuntime.getExecutionLogger().exceptionLog(taskName, ex);
			return new Rules();
		}
	}

	public String getPreRulesAsString(String taskName) {
		return getTaskConfiguration(taskName).getPreRulesAsString();
	}

	public OnlineTaskModel getTaskConfiguration(String taskName) {
		return pTalkEngineRuntime.getHazelcastInstanceBuilder().getTaskModelRepository().get(taskName);
	}

	public JSONObject getTaskConfigurationAsJson(String taskName) {
		return getTaskConfiguration(taskName).toJson();
	}

	public Collection<String> getTasks() {
		return pTalkEngineRuntime.getHazelcastInstanceBuilder().getTaskModelRepository().keySet();
	}

}

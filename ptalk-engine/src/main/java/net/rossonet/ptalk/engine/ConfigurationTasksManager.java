package net.rossonet.ptalk.engine;

import java.io.Closeable;
import java.io.IOException;
import java.io.StringReader;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.jexl.JexlRuleFactory;
import org.jeasy.rules.support.reader.JsonRuleDefinitionReader;
import org.json.JSONObject;

import com.hazelcast.replicatedmap.ReplicatedMap;

import net.rossonet.ptalk.engine.exceptions.BadConfigurationException;
import net.rossonet.ptalk.engine.exceptions.TaskManagerException;
import net.rossonet.ptalk.engine.parameter.ExecutionParameters;
import net.rossonet.ptalk.engine.parameter.OnlineTaskModel;
import net.rossonet.ptalk.utils.JsonHelper;

public class ConfigurationTasksManager implements Closeable {

	private static final JexlRuleFactory JEXL_RULE_FACTORY = new JexlRuleFactory(new JsonRuleDefinitionReader());

	private final PTalkEngineRuntime pTalkEngineRuntime;

	ConfigurationTasksManager(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	public synchronized Rule addMainRule(String taskName, String jsonRule) throws Exception {
		final Set<String> mainRulesAsString = getMainRulesAsString(taskName);
		mainRulesAsString.add(jsonRule);
		getTaskModels().get(taskName).setMainRules(mainRulesAsString);
		return JEXL_RULE_FACTORY.createRule(new StringReader(jsonRule));
	}

	public synchronized void addOrUpdateTaskConfiguration(JSONObject jsonConfiguration) throws TaskManagerException {
		final OnlineTaskModel task = new OnlineTaskModel(jsonConfiguration);
		getTaskModels().put(task.getModelName(), task);
	}

	public void addOrUpdateTaskConfiguration(String configuration) throws TaskManagerException {
		addOrUpdateTaskConfiguration(new JSONObject(configuration));

	}

	public synchronized Rule addPostRule(String taskName, String jsonRule) throws Exception {
		final Set<String> mainRulesAsString = getPostRulesAsString(taskName);
		mainRulesAsString.add(jsonRule);
		getTaskModels().get(taskName).setPostRules(mainRulesAsString);
		return JEXL_RULE_FACTORY.createRule(new StringReader(jsonRule));
	}

	public synchronized Rule addPreRule(String taskName, String jsonRule) throws Exception {
		final Set<String> mainRulesAsString = getPreRulesAsString(taskName);
		mainRulesAsString.add(jsonRule);
		getTaskModels().get(taskName).setPreRules(mainRulesAsString);
		return JEXL_RULE_FACTORY.createRule(new StringReader(jsonRule));
	}

	@Override
	public void close() throws IOException {
		// pulizia
		try {
			getTaskModels().clear();
		} catch (final Exception a) {
			pTalkEngineRuntime.getExecutionLogger().message(a.getMessage());
		}
	}

	public synchronized void deleteTaskConfiguration(String taskName) {
		getTaskModels().remove(taskName);
	}

	public ExecutionParameters getExecutionParameters(String taskName) {
		return new ExecutionParameters(new JSONObject(getTaskConfiguration(taskName).getExecutionParameter()));
	}

	public Rules getMainRules(String taskName) throws TaskManagerException {
		final Set<String> rulesAsJson = getMainRulesAsString(taskName);
		try {
			return JEXL_RULE_FACTORY
					.createRules(new StringReader(JsonHelper.getJsonArrayFromStringSet(rulesAsJson).toString()));
		} catch (final Exception e) {
			final BadConfigurationException ex = new BadConfigurationException("during getMainRules", e);
			pTalkEngineRuntime.getExecutionLogger().exceptionLog(taskName, ex);
			throw ex;
		}
	}

	public Set<String> getMainRulesAsString(String taskName) {
		return getTaskModels().get(taskName).getMainRulesAsString();
	}

	public Rules getPostRules(String taskName) throws TaskManagerException {
		final Set<String> rulesAsJson = getPostRulesAsString(taskName);
		try {
			return JEXL_RULE_FACTORY
					.createRules(new StringReader(JsonHelper.getJsonArrayFromStringSet(rulesAsJson).toString()));
		} catch (final Exception e) {
			final BadConfigurationException ex = new BadConfigurationException("during getPostRules", e);
			pTalkEngineRuntime.getExecutionLogger().exceptionLog(taskName, ex);
			throw ex;
		}
	}

	public Set<String> getPostRulesAsString(String taskName) {
		return getTaskConfiguration(taskName).getPostRulesAsString();
	}

	public Rules getPreRules(String taskName) throws TaskManagerException {
		final Set<String> rulesAsJson = getPreRulesAsString(taskName);
		try {
			return JEXL_RULE_FACTORY
					.createRules(new StringReader(JsonHelper.getJsonArrayFromStringSet(rulesAsJson).toString()));
		} catch (final Exception e) {
			final BadConfigurationException ex = new BadConfigurationException("during getPreRules", e);
			pTalkEngineRuntime.getExecutionLogger().exceptionLog(taskName, ex);
			throw ex;
		}
	}

	public Set<String> getPreRulesAsString(String taskName) {
		return getTaskConfiguration(taskName).getPreRulesAsString();
	}

	public OnlineTaskModel getTaskConfiguration(String taskName) {
		return getTaskModels().get(taskName);
	}

	public JSONObject getTaskConfigurationAsJson(String taskName) {
		return getTaskConfiguration(taskName).toJson();
	}

	private ReplicatedMap<String, OnlineTaskModel> getTaskModels() {
		return pTalkEngineRuntime.getHazelcastInstanceBuilder().getTaskModelRepository();
	}

	public Collection<String> getTasks() {
		return getTaskModels().keySet();
	}

	public synchronized void removePostRule(String taskName, String ruleUniqueName) {
		final Set<String> rules = getPostRulesAsString(taskName);
		final Set<String> newRules = new HashSet<>();
		for (final String r : rules) {
			final JSONObject json = new JSONObject(r);
			if (json.has(JsonHelper.RULE_NAME_LABEL)
					&& !json.getString(JsonHelper.RULE_NAME_LABEL).equals(ruleUniqueName)) {
				newRules.add(r);
			}
		}
		getTaskModels().get(taskName).setPostRules(newRules);

	}

	public synchronized void removePreRule(String taskName, String ruleUniqueName) {
		final Set<String> rules = getPreRulesAsString(taskName);
		final Set<String> newRules = new HashSet<>();
		for (final String r : rules) {
			final JSONObject json = new JSONObject(r);
			if (json.has(JsonHelper.RULE_NAME_LABEL)
					&& !json.getString(JsonHelper.RULE_NAME_LABEL).equals(ruleUniqueName)) {
				newRules.add(r);
			}
		}
		getTaskModels().get(taskName).setPreRules(newRules);

	}

	public synchronized void removeRule(String taskName, String ruleUniqueName) {
		final Set<String> rules = getMainRulesAsString(taskName);
		final Set<String> newRules = new HashSet<>();
		for (final String r : rules) {
			final JSONObject json = new JSONObject(r);
			if (json.has(JsonHelper.RULE_NAME_LABEL)
					&& !json.getString(JsonHelper.RULE_NAME_LABEL).equals(ruleUniqueName)) {
				newRules.add(r);
			}
		}
		getTaskModels().get(taskName).setMainRules(newRules);

	}

	public JSONObject toJson() {
		final JSONObject result = new JSONObject();
		for (final String taskKey : getTaskModels().keySet()) {
			result.put(taskKey, getTaskModels().get(taskKey).toJson());
		}
		return result;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("ConfigurationTasksManager [getTaskModels()=");
		builder.append(getTasks());
		builder.append("]");
		return builder.toString();
	}

	public void updateFromJson(JSONObject jsonConfiguration) throws TaskManagerException {
		for (final String taskKey : jsonConfiguration.keySet()) {
			getTaskModels().put(taskKey, new OnlineTaskModel(jsonConfiguration.getJSONObject(taskKey)));
		}
	}

	public void validate() throws TaskManagerException {
		for (final String taskName : getTaskModels().keySet()) {
			validate(taskName);
		}
	}

	private void validate(String taskName) throws TaskManagerException {
		getExecutionParameters(taskName);
		getPreRules(taskName);
		getMainRules(taskName);
		getPostRules(taskName);
	}

}

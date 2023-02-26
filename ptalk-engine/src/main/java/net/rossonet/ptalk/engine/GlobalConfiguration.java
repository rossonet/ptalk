package net.rossonet.ptalk.engine;

import java.io.Closeable;
import java.io.IOException;
import java.io.StringReader;
import java.util.Collection;

import org.jeasy.rules.api.Rules;
import org.jeasy.rules.jexl.JexlRuleFactory;
import org.jeasy.rules.support.reader.JsonRuleDefinitionReader;

import net.rossonet.ptalk.engine.exceptions.TaskManagerException;
import net.rossonet.ptalk.engine.parameter.ExecutionParameters;
import net.rossonet.ptalk.engine.runtime.Task;

public class GlobalConfiguration implements Closeable {

	private static final JexlRuleFactory RULE_FACTORY = new JexlRuleFactory(new JsonRuleDefinitionReader());
	private static final int DEFAULT_NORMAL_SCHEDULER_THREAD_SIZE = 4;
	private final PTalkEngineRuntime pTalkEngineRuntime;

	GlobalConfiguration(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	public void addTaskConfiguration(String jsonConfiguration) {
		// TODO aggiungere un task nella mappa da configurazione json
	}

	@Override
	public void close() throws IOException {
		// pulizia

	}

	public ExecutionParameters getExecutionParameters(Task rulesEngineTask) {
		return ExecutionParameters.fromJson(pTalkEngineRuntime.getHazelcastInstanceBuilder().getTaskModelRepository()
				.get(rulesEngineTask.getTaskName()).getExecutionParameter());
	}

	public int getGrpcServerPort() {
		// TODO Auto-generated method stub
		return 8080;
	}

	public Rules getMainRulesAsJson(Task rulesEngineTask) {
		final String rulesAsJson = getMainRulesAsString(rulesEngineTask);
		try {
			return RULE_FACTORY.createRules(new StringReader(rulesAsJson));
		} catch (final Exception e) {
			final TaskManagerException ex = new TaskManagerException("during getMainRules", e);
			pTalkEngineRuntime.getExecutionLogger().exceptionLog(rulesEngineTask, ex);
			return new Rules();
		}
	}

	public String getMainRulesAsString(Task rulesEngineTask) {
		return pTalkEngineRuntime.getHazelcastInstanceBuilder().getTaskModelRepository()
				.get(rulesEngineTask.getTaskName()).getMainRulesAsString();
	}

	public int getNormalSchedulerThreadSize() {
		// TODO Auto-generated method stub
		return DEFAULT_NORMAL_SCHEDULER_THREAD_SIZE;
	}

	public Rules getPostRulesAsJson(Task rulesEngineTask) {
		final String rulesAsJson = getPostRulesAsString(rulesEngineTask);
		try {
			return RULE_FACTORY.createRules(new StringReader(rulesAsJson));
		} catch (final Exception e) {
			final TaskManagerException ex = new TaskManagerException("during getPostRules", e);
			pTalkEngineRuntime.getExecutionLogger().exceptionLog(rulesEngineTask, ex);
			return new Rules();
		}
	}

	public String getPostRulesAsString(Task rulesEngineTask) {
		return pTalkEngineRuntime.getHazelcastInstanceBuilder().getTaskModelRepository()
				.get(rulesEngineTask.getTaskName()).getPostRulesAsString();
	}

	public Rules getPreRulesAsJson(Task rulesEngineTask) {
		final String rulesAsJson = getPreRulesAsString(rulesEngineTask);
		try {
			return RULE_FACTORY.createRules(new StringReader(rulesAsJson));
		} catch (final Exception e) {
			final TaskManagerException ex = new TaskManagerException("during getPreRules", e);
			pTalkEngineRuntime.getExecutionLogger().exceptionLog(rulesEngineTask, ex);
			return new Rules();
		}
	}

	public String getPreRulesAsString(Task rulesEngineTask) {
		return pTalkEngineRuntime.getHazelcastInstanceBuilder().getTaskModelRepository()
				.get(rulesEngineTask.getTaskName()).getPreRulesAsString();
	}

	public String getTaskConfiguration(String taskName) {
		// TODO recuperare la configurazione json di un task
		return null;
	}

	public Collection<String> getTasks() {
		return pTalkEngineRuntime.getHazelcastInstanceBuilder().getTaskModelRepository().keySet();
	}

}

package net.rossonet.ptalk.engine.parameter;

import org.json.JSONObject;

public class ExecutionParameters {

	private static final String AI_MANAGER_FACT_NAME = "ai_manager";

	private static final String ABILITY_COMMUNICATION_FACT_NAME = "ability_communication";

	private static final String EXTENSIONS_MANAGER_FACT_NAME = "extensions_manager";

	private static final String MEMORY_MANAGER_FACT_NAME = "memory_manager";

	private static final String NEXT_HOP_FACT_NAME = "next";

	private static final String NLU_COMMUNICATION_FACT_NAME = "nlu_communication";

	private static final String CHANNEL_COMMUNICATION_FACT_NAME = "channel_communication";

	private static final String SUPER_MANAGER_FACT_NAME = "super_manager";

	private static final String DEFAULT_TIME_UNIT = "MILLISECONDS";

	private static final String DEFAULT_TIMEOUT_PRE_EXECUTION_MS = "60000";

	private static final String DEFAULT_TIMEOUT_POST_EXECUTION_MS = "60000";

	private static final String DEFAULT_TIMEOUT_MAIN_EXECUTION_MS = "60000";

	private static final String AI_MANAGER_FACT_LABEL = "ai_manager_name";

	private static final String ABILITY_COMMUNICATION_FACT_LABEL = "ability_communication_name";

	private static final String EXTENSIONS_MANAGER_FACT_LABEL = "extensions_manager_name";

	private static final String MEMORY_MANAGER_FACT_LABEL = "memory_manager_name";

	private static final String NEXT_HOP_FACT_LABEL = "next_name";

	private static final String NLU_COMMUNICATION_FACT_LABEL = "nlu_communication_name";

	private static final String CHANNEL_COMMUNICATION_FACT_LABEL = "channel_communication_name";

	private static final String SUPER_MANAGER_FACT_LABEL = "super_manager_name";

	private static final String MAIN_TIME_UNIT_LABEL = "main_time_unit";

	private static final String PRE_TIME_UNIT_LABEL = "pre_time_unit";

	private static final String POST_TIME_UNIT_LABEL = "post_time_unit";

	private static final String TIMEOUT_PRE_EXECUTION_MS_LABEL = "timeout_pre_execution";

	private static final String TIMEOUT_POST_EXECUTION_MS_LABEL = "timeout_pre_execution";

	private static final String TIMEOUT_MAIN_EXECUTION_MS_LABEL = "timeout_pre_execution";

	private String abilityCommunicationFactName = null;

	private String timeoutPreExecutionTimeUnit = null;

	private String timeoutPreExecution = null;

	private String timeoutPostExecutionTimeUnit = null;

	private String timeoutPostExecution = null;

	private String timeoutMainExecutionTimeUnit = null;

	private String timeoutMainExecution = null;

	private String superManagerFactName = null;

	private String nluCommunicationFactName = null;

	private String channelCommunicationFactName = null;

	private String nextHopFactName = null;

	private String memoryManagerFactName = null;

	private String extensionsManagerFactName = null;

	private String aiManagerFactName = null;

	public ExecutionParameters(JSONObject executionParameters) {

		if (executionParameters.has(AI_MANAGER_FACT_LABEL)) {
			aiManagerFactName = executionParameters.getString(AI_MANAGER_FACT_LABEL);
		}

		if (executionParameters.has(ABILITY_COMMUNICATION_FACT_LABEL)) {
			abilityCommunicationFactName = executionParameters.getString(ABILITY_COMMUNICATION_FACT_LABEL);
		}

		if (executionParameters.has(EXTENSIONS_MANAGER_FACT_LABEL)) {
			extensionsManagerFactName = executionParameters.getString(EXTENSIONS_MANAGER_FACT_LABEL);
		}

		if (executionParameters.has(MEMORY_MANAGER_FACT_LABEL)) {
			memoryManagerFactName = executionParameters.getString(MEMORY_MANAGER_FACT_LABEL);
		}

		if (executionParameters.has(NEXT_HOP_FACT_LABEL)) {
			nextHopFactName = executionParameters.getString(NEXT_HOP_FACT_LABEL);
		}

		if (executionParameters.has(CHANNEL_COMMUNICATION_FACT_LABEL)) {
			channelCommunicationFactName = executionParameters.getString(CHANNEL_COMMUNICATION_FACT_LABEL);
		}

		if (executionParameters.has(NLU_COMMUNICATION_FACT_LABEL)) {
			nluCommunicationFactName = executionParameters.getString(NLU_COMMUNICATION_FACT_LABEL);
		}

		if (executionParameters.has(SUPER_MANAGER_FACT_LABEL)) {
			superManagerFactName = executionParameters.getString(SUPER_MANAGER_FACT_LABEL);
		}

		if (executionParameters.has(MAIN_TIME_UNIT_LABEL)) {
			timeoutMainExecutionTimeUnit = executionParameters.getString(MAIN_TIME_UNIT_LABEL);
		}

		if (executionParameters.has(PRE_TIME_UNIT_LABEL)) {
			timeoutPreExecutionTimeUnit = executionParameters.getString(PRE_TIME_UNIT_LABEL);
		}

		if (executionParameters.has(POST_TIME_UNIT_LABEL)) {
			timeoutPostExecutionTimeUnit = executionParameters.getString(POST_TIME_UNIT_LABEL);
		}

		if (executionParameters.has(TIMEOUT_PRE_EXECUTION_MS_LABEL)) {
			timeoutPreExecution = executionParameters.getString(TIMEOUT_PRE_EXECUTION_MS_LABEL);
		}

		if (executionParameters.has(TIMEOUT_POST_EXECUTION_MS_LABEL)) {
			timeoutPostExecution = executionParameters.getString(TIMEOUT_POST_EXECUTION_MS_LABEL);
		}

		if (executionParameters.has(TIMEOUT_MAIN_EXECUTION_MS_LABEL)) {
			timeoutMainExecution = executionParameters.getString(TIMEOUT_MAIN_EXECUTION_MS_LABEL);
		}
	}

	public String getAbilityCommunicationFactName() {
		return abilityCommunicationFactName != null ? abilityCommunicationFactName : ABILITY_COMMUNICATION_FACT_NAME;
	}

	public String getAiManagerFactName() {
		return aiManagerFactName != null ? aiManagerFactName : AI_MANAGER_FACT_NAME;
	}

	public String getChannelCommunicationFactName() {
		return channelCommunicationFactName != null ? channelCommunicationFactName : CHANNEL_COMMUNICATION_FACT_NAME;
	}

	public String getExtensionsManagerFactName() {
		return extensionsManagerFactName != null ? extensionsManagerFactName : EXTENSIONS_MANAGER_FACT_NAME;
	}

	public String getMemoryManagerFactName() {
		return memoryManagerFactName != null ? memoryManagerFactName : MEMORY_MANAGER_FACT_NAME;
	}

	public String getNextHopFactName() {
		return nextHopFactName != null ? nextHopFactName : NEXT_HOP_FACT_NAME;
	}

	public String getNluCommunicationFactName() {
		return nluCommunicationFactName != null ? nluCommunicationFactName : NLU_COMMUNICATION_FACT_NAME;
	}

	public String getSuperManagerFactName() {
		return superManagerFactName != null ? superManagerFactName : SUPER_MANAGER_FACT_NAME;
	}

	public String getTimeoutMainExecution() {
		return timeoutMainExecution != null ? timeoutMainExecution : DEFAULT_TIMEOUT_MAIN_EXECUTION_MS;
	}

	public String getTimeoutMainExecutionTimeUnit() {
		return timeoutMainExecutionTimeUnit != null ? timeoutMainExecutionTimeUnit : DEFAULT_TIME_UNIT;
	}

	public String getTimeoutPostExecution() {
		return timeoutPostExecution != null ? timeoutPostExecution : DEFAULT_TIMEOUT_POST_EXECUTION_MS;
	}

	public String getTimeoutPostExecutionTimeUnit() {
		return timeoutPostExecutionTimeUnit != null ? timeoutPostExecutionTimeUnit : DEFAULT_TIME_UNIT;
	}

	public String getTimeoutPreExecution() {
		return timeoutPreExecution != null ? timeoutPreExecution : DEFAULT_TIMEOUT_PRE_EXECUTION_MS;
	}

	public String getTimeoutPreExecutionTimeUnit() {
		return timeoutPreExecutionTimeUnit != null ? timeoutPreExecutionTimeUnit : DEFAULT_TIME_UNIT;
	}

	public JSONObject toJson() {
		final JSONObject json = new JSONObject();
		json.put(AI_MANAGER_FACT_LABEL, getAiManagerFactName());
		json.put(ABILITY_COMMUNICATION_FACT_LABEL, getAbilityCommunicationFactName());
		json.put(EXTENSIONS_MANAGER_FACT_LABEL, getExtensionsManagerFactName());
		json.put(MEMORY_MANAGER_FACT_LABEL, getMemoryManagerFactName());
		json.put(NEXT_HOP_FACT_LABEL, getNextHopFactName());
		json.put(CHANNEL_COMMUNICATION_FACT_LABEL, getChannelCommunicationFactName());
		json.put(NLU_COMMUNICATION_FACT_LABEL, getNluCommunicationFactName());
		json.put(SUPER_MANAGER_FACT_LABEL, getSuperManagerFactName());
		json.put(MAIN_TIME_UNIT_LABEL, getTimeoutMainExecutionTimeUnit());
		json.put(PRE_TIME_UNIT_LABEL, getTimeoutPreExecutionTimeUnit());
		json.put(POST_TIME_UNIT_LABEL, getTimeoutPostExecutionTimeUnit());
		json.put(TIMEOUT_PRE_EXECUTION_MS_LABEL, getTimeoutPreExecution());
		json.put(TIMEOUT_POST_EXECUTION_MS_LABEL, getTimeoutPostExecution());
		json.put(TIMEOUT_MAIN_EXECUTION_MS_LABEL, getTimeoutMainExecution());
		return json;
	}

}

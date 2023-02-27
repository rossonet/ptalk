package net.rossonet.ptalk.engine.parameter;

import org.json.JSONObject;

public class ExecutionParameters {

	private static final String AI_MANAGER_FACT_LABEL = "ai-manager";

	private static final String ABILITY_COMMUNICATION_FACT_LABEL = "ability-communication";

	private static final String EXTENSIONS_MANAGER_FACT_LABEL = "extensions-manager";

	private static final String MEMORY_MANAGER_FACT_LABEL = "memory-manager";

	private static final String NEXT_HOP_FACT_LABEL = "next";

	private static final String NLU_COMMUNICATION_FACT_LABEL = "nlu-communication";

	private static final String SUPER_MANAGER_FACT_LABEL = "super-manager";

	private static final String DEFAULT_TIME_UNIT = "milliseconds";

	private static final String DEFAULT_TIMEOUT_PRE_EXECUTION_MS = "60000";

	private static final String DEFAULT_TIMEOUT_POST_EXECUTION_MS = "60000";

	private static final String DEFAULT_TIMEOUT_MAIN_EXECUTION_MS = "60000";

	public static JSONObject toJson() {
		// TODO toJson
		return null;
	}

	public ExecutionParameters(JSONObject executionParameters) {
		// TODO import da json
	}

	public String getAbilityCommunicationFactLabel() {
		return ABILITY_COMMUNICATION_FACT_LABEL;
	}

	public String getAiManagerFactLabel() {
		return AI_MANAGER_FACT_LABEL;
	}

	public String getExtensionsManagerFactLabel() {
		return EXTENSIONS_MANAGER_FACT_LABEL;
	}

	public String getMemoryManagerFactLabel() {
		return MEMORY_MANAGER_FACT_LABEL;
	}

	public String getNextHopFactLabel() {
		return NEXT_HOP_FACT_LABEL;
	}

	public String getNluCommunicationFactLabel() {
		return NLU_COMMUNICATION_FACT_LABEL;
	}

	public String getSuperManagerFactLabel() {
		return SUPER_MANAGER_FACT_LABEL;
	}

	public String getTimeoutMainExecution() {
		return DEFAULT_TIMEOUT_MAIN_EXECUTION_MS;
	}

	public String getTimeoutMainExecutionTimeUnit() {
		return DEFAULT_TIME_UNIT;
	}

	public String getTimeoutPostExecution() {
		return DEFAULT_TIMEOUT_POST_EXECUTION_MS;
	}

	public String getTimeoutPostExecutionTimeUnit() {
		return DEFAULT_TIME_UNIT;
	}

	public String getTimeoutPreExecution() {
		return DEFAULT_TIMEOUT_PRE_EXECUTION_MS;
	}

	public String getTimeoutPreExecutionTimeUnit() {
		return DEFAULT_TIME_UNIT;
	}

}

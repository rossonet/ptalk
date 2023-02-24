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

	public void fromJson(JSONObject jsonObject) {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub
		return null;
	}

	public String getTimeoutMainExecutionTimeUnit() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTimeoutPostExecution() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTimeoutPostExecutionTimeUnit() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTimeoutPreExecution() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTimeoutPreExecutionTimeUnit() {
		// TODO Auto-generated method stub
		return null;
	}

	public JSONObject toJson() {
		// TODO Auto-generated method stub
		return null;
	}

}

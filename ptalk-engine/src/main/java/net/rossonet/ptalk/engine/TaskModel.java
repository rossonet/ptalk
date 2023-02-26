package net.rossonet.ptalk.engine;

import java.io.Serializable;

public class TaskModel implements Serializable {

	private static final long serialVersionUID = -9139834337155333462L;
	private String executionParameter;
	private String mainRules;
	private String postRules;
	private String preRules;

	private String modelName;

	public String getExecutionParameter() {
		return executionParameter;
	}

	public String getMainRulesAsString() {
		return mainRules;
	}

	public String getModelName() {
		return modelName;
	}

	public String getPostRulesAsString() {
		return postRules;
	}

	public String getPreRulesAsString() {
		return preRules;
	}

	public void setExecutionParameter(String executionParameter) {
		this.executionParameter = executionParameter;
	}

	public void setMainRules(String mainRules) {
		this.mainRules = mainRules;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void setPostRules(String postRules) {
		this.postRules = postRules;
	}

	public void setPreRules(String preRules) {
		this.preRules = preRules;
	}

}

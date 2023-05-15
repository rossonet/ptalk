package net.rossonet.ptalk.nlu.implementation;

import java.util.HashMap;
import java.util.Map;

public class UnitNluConfiguration {

	private final Map<String, String> parameters = new HashMap<>();

	public String getParameter(String label) {
		return parameters.get(label);
	}

	public void setParameter(String label, String value) {
		parameters.put(label, value);
	}

}

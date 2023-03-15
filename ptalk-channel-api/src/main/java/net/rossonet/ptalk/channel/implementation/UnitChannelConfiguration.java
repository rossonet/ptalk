package net.rossonet.ptalk.channel.implementation;

import java.util.HashMap;
import java.util.Map;

public class UnitChannelConfiguration {

	private final Map<String, String> parameters = new HashMap<>();

	public String getParameter(String label) {
		return parameters.get(label);
	}

	public void setParameter(String label, String value) {
		parameters.put(label, value);
	}

}

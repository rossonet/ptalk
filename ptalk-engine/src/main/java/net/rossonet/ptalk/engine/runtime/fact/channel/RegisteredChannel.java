package net.rossonet.ptalk.engine.runtime.fact.channel;

public class RegisteredChannel {

	private final String uniqueName;
	private final String host;
	private final int port;

	public RegisteredChannel(String uniqueName, String host, int port) {
		this.uniqueName = uniqueName;
		this.host = host;
		this.port = port;

	}

	public String getHost() {
		return host;
	}

	public int getPort() {
		return port;
	}

	public String getUniqueName() {
		return uniqueName;
	}

}

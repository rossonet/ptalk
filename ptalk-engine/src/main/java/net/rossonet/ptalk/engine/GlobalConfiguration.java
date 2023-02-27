package net.rossonet.ptalk.engine;

import java.io.Serializable;

public class GlobalConfiguration implements Serializable {

	private static final int DEFAULT_GRPC_SERVER_PORT = 8080;
	private static final long serialVersionUID = -615842239868641069L;
	private static final int DEFAULT_NORMAL_SCHEDULER_THREAD_SIZE = 4;
	private static final boolean DEFAULT_IS_HAZELCAST_EMBEDDED = false;

	public int getGrpcServerPort() {
		return DEFAULT_GRPC_SERVER_PORT;
	}

	public int getNormalSchedulerThreadSize() {
		return DEFAULT_NORMAL_SCHEDULER_THREAD_SIZE;
	}

	public boolean isHazelcastEmbedded() {
		return DEFAULT_IS_HAZELCAST_EMBEDDED;
	}

}

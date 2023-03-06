package net.rossonet.ptalk.engine;

import java.io.Closeable;
import java.io.IOException;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.durableexecutor.DurableExecutorService;
import com.hazelcast.replicatedmap.ReplicatedMap;

import net.rossonet.ptalk.engine.parameter.OnlineTaskModel;

public class HazelcastInstanceBuilder implements Closeable {

	private static final String TASK_MODEL_MAP_NAME = "task_model";

	private static final String SCHEDULER_MAP_NAME = "task_scheduler";
	private static HazelcastInstance hazelcastServer = null;
	private HazelcastInstance hazelcastClient = null;

	private final PTalkEngineRuntime pTalkEngineRuntime;

	private ReplicatedMap<String, OnlineTaskModel> taskModelRepository;

	private DurableExecutorService scheduler;

	HazelcastInstanceBuilder(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
		if (pTalkEngineRuntime.getGlobalConfiguration().isHazelcastEmbedded()
				&& HazelcastInstanceBuilder.hazelcastServer == null) {
			runServer();
		}
	}

	private void checkCreated() {
		if (hazelcastClient == null) {
			createInstance();
		}
	}

	@Override
	public void close() throws IOException {
		// pulizia
		if (hazelcastClient != null) {
			hazelcastClient.shutdown();
		}
		if (hazelcastServer != null) {
			hazelcastServer.shutdown();
		}

	}

	private void createInstance() {
		final Config clusterConfig = getConfig();
		hazelcastClient = Hazelcast.newHazelcastInstance(clusterConfig);
		createMapsAndScheduler();
	}

	private void createMapsAndScheduler() {
		taskModelRepository = hazelcastClient.getReplicatedMap(TASK_MODEL_MAP_NAME);
		scheduler = hazelcastClient.getDurableExecutorService(SCHEDULER_MAP_NAME);
	}

	private Config getConfig() {
		final Config clusterConfig = new Config();
		clusterConfig.setClusterName("dev");
		clusterConfig.getNetworkConfig().setPort(5777);
		clusterConfig.getJetConfig().setEnabled(true);
		clusterConfig.getUserCodeDeploymentConfig().setEnabled(true);
		return clusterConfig;
	}

	public HazelcastInstance getHazelcastInstance() {
		checkCreated();
		return hazelcastClient;
	}

	public PTalkEngineRuntime getPTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

	public DurableExecutorService getScheduler() {
		checkCreated();
		return scheduler;
	}

	public ReplicatedMap<String, OnlineTaskModel> getTaskModelRepository() {
		checkCreated();
		return taskModelRepository;
	}

	void resetInstance() {
		hazelcastClient = null;
	}

	private void runServer() {
		final Config clusterConfig = getConfig();
		hazelcastServer = Hazelcast.newHazelcastInstance(clusterConfig);
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("HazelcastInstanceBuilder [hazelcastClient=");
		builder.append(hazelcastClient);
		builder.append("]");
		return builder.toString();
	}

}

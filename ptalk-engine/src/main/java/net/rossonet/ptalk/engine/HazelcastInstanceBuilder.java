package net.rossonet.ptalk.engine;

import java.io.Closeable;
import java.io.IOException;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.replicatedmap.ReplicatedMap;

import net.rossonet.ptalk.engine.parameter.TaskModel;

public class HazelcastInstanceBuilder implements Closeable {

	private static final String TASK_MODEL_MAP_NAME = "task-model";
	private HazelcastInstance hzServer = null;
	private final PTalkEngineRuntime pTalkEngineRuntime;

	private ReplicatedMap<String, TaskModel> taskModelRepository;

	HazelcastInstanceBuilder(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	private void checkCreated() {
		if (hzServer == null) {
			createInstance();
		}
	}

	@Override
	public void close() throws IOException {
		// pulizia

	}

	private void createInstance() {
		final Config clusterConfig = new Config();
		clusterConfig.setClusterName("dev");
		clusterConfig.getNetworkConfig().setPort(5777);
		clusterConfig.getJetConfig().setEnabled(true);
		clusterConfig.getUserCodeDeploymentConfig().setEnabled(true);
		hzServer = Hazelcast.newHazelcastInstance(clusterConfig);
		createMaps();
	}

	private void createMaps() {
		taskModelRepository = hzServer.getReplicatedMap(TASK_MODEL_MAP_NAME);

	}

	public HazelcastInstance getHazelcastInstance() {
		checkCreated();
		return hzServer;
	}

	public PTalkEngineRuntime getpTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

	public ReplicatedMap<String, TaskModel> getTaskModelRepository() {
		checkCreated();
		return taskModelRepository;
	}

	void resetInstance() {
		hzServer = null;
	}

}

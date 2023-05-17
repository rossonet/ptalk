package net.rossonet.ptalk.engine;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.durableexecutor.DurableExecutorService;
import com.hazelcast.replicatedmap.ReplicatedMap;

import net.rossonet.ptalk.engine.parameter.OnlineTaskModel;
import net.rossonet.ptalk.engine.parameter.UnitRegistered;
import net.rossonet.ptalk.engine.parameter.UnitRegisteredSerializer;
import net.rossonet.ptalk.engine.runtime.fact.memory.MemoryData;

public class HazelcastInstanceBuilder implements Closeable {

	private static final Logger logger = Logger.getLogger(HazelcastInstanceBuilder.class.getName());

	private static final int HAZELCAST_CLUSTER_PORT = 5777;

	private static final String HAZELCAST_CLUSTER_NAME = "dev";

	private static final String TASK_MODEL_MAP_NAME = "task_model";

	private static final String SCHEDULER_MAP_NAME = "task_scheduler";

	private static final String MEMORY_MAP_NAME = "memory_map";
	private static final String REGISTER_ABILITY_NAME = "register_ability_map";
	private static final String REGISTER_NLU_NAME = "register_nlu_map";
	private static final String REGISTER_CHANNEL_NAME = "register_channel_map";

	private static final String MODELS_NLU_NAME = "nlu_models";

	private static HazelcastInstance hazelcastServer = null;
	private HazelcastInstance hazelcastClient = null;

	private final PTalkEngineRuntime pTalkEngineRuntime;

	private ReplicatedMap<String, OnlineTaskModel> taskModelRepository;

	private DurableExecutorService scheduler;

	private ReplicatedMap<Long, MemoryData<? extends Serializable>> memoryMapRepository;

	private ReplicatedMap<String, UnitRegistered> registerAbilityRepository;
	private ReplicatedMap<String, UnitRegistered> registerNluRepository;
	private ReplicatedMap<String, List<String>> nluModels;
	private ReplicatedMap<String, UnitRegistered> registerChannelRepository;

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
		if (hazelcastClient != null) {
			hazelcastClient.shutdown();
		}
		if (hazelcastServer != null) {
			hazelcastServer.shutdown();
		}

	}

	private void createInstance() {
		final Config clusterConfig = getConfig();
		clusterConfig.getSerializationConfig().getCompactSerializationConfig()
				.addSerializer(new UnitRegisteredSerializer());
		hazelcastClient = Hazelcast.newHazelcastInstance(clusterConfig);
		createMapsAndScheduler();
	}

	private void createMapsAndScheduler() {
		taskModelRepository = hazelcastClient.getReplicatedMap(TASK_MODEL_MAP_NAME);
		memoryMapRepository = hazelcastClient.getReplicatedMap(MEMORY_MAP_NAME);
		scheduler = hazelcastClient.getDurableExecutorService(SCHEDULER_MAP_NAME);
		registerAbilityRepository = hazelcastClient.getReplicatedMap(REGISTER_ABILITY_NAME);
		registerNluRepository = hazelcastClient.getReplicatedMap(REGISTER_NLU_NAME);
		nluModels = hazelcastClient.getReplicatedMap(MODELS_NLU_NAME);
		registerChannelRepository = hazelcastClient.getReplicatedMap(REGISTER_CHANNEL_NAME);
	}

	private Config getConfig() {
		final Config clusterConfig = new Config();
		clusterConfig.setClusterName(HAZELCAST_CLUSTER_NAME);
		clusterConfig.getNetworkConfig().setPort(HAZELCAST_CLUSTER_PORT);
		clusterConfig.getJetConfig().setEnabled(true);
		clusterConfig.getUserCodeDeploymentConfig().setEnabled(true);
		return clusterConfig;
	}

	public HazelcastInstance getHazelcastInstance() {
		checkCreated();
		return hazelcastClient;
	}

	public ReplicatedMap<Long, MemoryData<? extends Serializable>> getMemoryMapRepository() {
		checkCreated();
		return memoryMapRepository;
	}

	public ReplicatedMap<String, List<String>> getNluModels() {
		return nluModels;
	}

	public PTalkEngineRuntime getPTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

	public ReplicatedMap<String, UnitRegistered> getRegisterAbilityRepository() {
		return registerAbilityRepository;
	}

	public ReplicatedMap<String, UnitRegistered> getRegisterChannelRepository() {
		return registerChannelRepository;
	}

	public ReplicatedMap<String, UnitRegistered> getRegisterNluRepository() {
		return registerNluRepository;
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
		logger.info("run Hazelcast server with config " + clusterConfig);
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

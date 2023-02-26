package net.rossonet.ptalk.engine;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class HazelcastInstanceBuilder {

	private static HazelcastInstance hzServer = null;

	public static void createInstance() {
		final Config clusterConfig = new Config();
		clusterConfig.setClusterName("dev");
		clusterConfig.getNetworkConfig().setPort(5777);
		clusterConfig.getJetConfig().setEnabled(true);
		clusterConfig.getUserCodeDeploymentConfig().setEnabled(true);
		hzServer = Hazelcast.newHazelcastInstance(clusterConfig);
	}

	public static HazelcastInstance getHazelcastInstance() {
		if (hzServer == null) {
			createInstance();
		}
		return hzServer;
	}

	private HazelcastInstanceBuilder() {
	}

}

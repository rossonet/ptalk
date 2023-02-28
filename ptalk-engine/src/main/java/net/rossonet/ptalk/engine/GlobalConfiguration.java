package net.rossonet.ptalk.engine;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.json.JSONObject;

import net.rossonet.ptalk.ability.grpc.GeneralConfigurationQueryRequest;
import net.rossonet.ptalk.base.grpc.Data;
import net.rossonet.ptalk.utils.JsonHelper;

public class GlobalConfiguration implements Serializable {

	public static class GlobalConfigurationBuilder {
		private Integer grpcServerPort = null;
		private Integer normalSchedulerThreadSize = null;
		private Boolean hazelcastEmbedded = null;
		private String inputChannel = null;
		private final Map<String, Data> globalDatas = new HashMap<>();

		public GlobalConfigurationBuilder addData(String key, Data value) {
			globalDatas.put(key, value);
			return this;
		}

		public GlobalConfigurationBuilder addData(String key, JSONObject value) {
			addData(key, JsonHelper.dataFromJson(value));
			return this;
		}

		public GlobalConfiguration build() {
			final GlobalConfiguration globalConfiguration = new GlobalConfiguration();
			globalConfiguration.setGrpcServerPort(grpcServerPort);
			globalConfiguration.setNormalSchedulerThreadSize(normalSchedulerThreadSize);
			globalConfiguration.setHazelcastEmbedded(hazelcastEmbedded);
			globalConfiguration.setInputChannel(inputChannel);
			for (final Entry<String, Data> d : globalDatas.entrySet()) {
				globalConfiguration.getGlobalDatas().put(d.getKey(), d.getValue());
			}
			return globalConfiguration;
		}

		public GlobalConfigurationBuilder setGrpcServerPort(Integer grpcServerPort) {
			this.grpcServerPort = grpcServerPort;
			return this;
		}

		public GlobalConfigurationBuilder setHazelcastEmbedded(Boolean hazelcastEmbedded) {
			this.hazelcastEmbedded = hazelcastEmbedded;
			return this;
		}

		public GlobalConfigurationBuilder setInputChannel(String inputChannel) {
			this.inputChannel = inputChannel;
			return this;
		}

		public GlobalConfigurationBuilder setNormalSchedulerThreadSize(Integer normalSchedulerThreadSize) {
			this.normalSchedulerThreadSize = normalSchedulerThreadSize;
			return this;
		}

	}

	private static final int DEFAULT_GRPC_SERVER_PORT = 8080;
	private static final String GRPC_SERVER_PORT_LABEL = "grpc-server-port";
	private static final long serialVersionUID = -615842239868641069L;
	private static final int DEFAULT_NORMAL_SCHEDULER_THREAD_SIZE = 4;
	private static final String NORMAL_SCHEDULER_THREAD_SIZE_LABEL = "scheduler-thread-size";
	private static final boolean DEFAULT_IS_HAZELCAST_EMBEDDED = false;
	private static final String IS_HAZELCAST_EMBEDDED_LABEL = "hazelcast-embedded";
	private static final String DEFAULT_INPUT_CHANNEL_TASK = "input-channel";
	private static final String INPUT_CHANNEL_TASK_LABEL = "input-channel";

	public static GlobalConfigurationBuilder getNewBuilder() {
		return new GlobalConfigurationBuilder();
	}

	private Integer grpcServerPort = null;

	private Integer normalSchedulerThreadSize = null;
	private Boolean hazelcastEmbedded = null;

	private String inputChannel = null;

	private final Map<String, Data> globalDatas = new HashMap<>();

	private GlobalConfiguration() {

	}

	public Map<String, Data> getGlobalDatas() {
		return globalDatas;
	}

	public int getGrpcServerPort() {
		return grpcServerPort != null ? grpcServerPort : DEFAULT_GRPC_SERVER_PORT;
	}

	public String getInputChannel() {
		return inputChannel != null ? inputChannel : DEFAULT_INPUT_CHANNEL_TASK;
	}

	public int getNormalSchedulerThreadSize() {
		return normalSchedulerThreadSize != null ? normalSchedulerThreadSize : DEFAULT_NORMAL_SCHEDULER_THREAD_SIZE;
	}

	public boolean isHazelcastEmbedded() {
		return hazelcastEmbedded != null ? hazelcastEmbedded : DEFAULT_IS_HAZELCAST_EMBEDDED;
	}

	public Data query(GeneralConfigurationQueryRequest request) {
		return globalDatas.get(request.getKey());
	}

	public void setGrpcServerPort(Integer grpcServerPort) {
		this.grpcServerPort = grpcServerPort;
	}

	public void setHazelcastEmbedded(Boolean hazelcastEmbedded) {
		this.hazelcastEmbedded = hazelcastEmbedded;
	}

	public void setInputChannel(String inputChannel) {
		this.inputChannel = inputChannel;
	}

	public void setNormalSchedulerThreadSize(Integer normalSchedulerThreadSize) {
		this.normalSchedulerThreadSize = normalSchedulerThreadSize;
	}

	public JSONObject toJson() {
		final JSONObject reply = new JSONObject();
		reply.put(GRPC_SERVER_PORT_LABEL, getGrpcServerPort());
		reply.put(NORMAL_SCHEDULER_THREAD_SIZE_LABEL, getNormalSchedulerThreadSize());
		reply.put(IS_HAZELCAST_EMBEDDED_LABEL, isHazelcastEmbedded());
		reply.put(INPUT_CHANNEL_TASK_LABEL, getInputChannel());
		for (final Entry<String, Data> data : globalDatas.entrySet()) {
			reply.put(data.getKey(), JsonHelper.jsonFromData(data.getValue()));
		}
		return reply;
	}

	public void updateFromJson(JSONObject configuration) {
		if (configuration.has(GRPC_SERVER_PORT_LABEL)) {
			grpcServerPort = configuration.getInt(GRPC_SERVER_PORT_LABEL);
		}
		if (configuration.has(NORMAL_SCHEDULER_THREAD_SIZE_LABEL)) {
			normalSchedulerThreadSize = configuration.getInt(NORMAL_SCHEDULER_THREAD_SIZE_LABEL);
		}
		if (configuration.has(IS_HAZELCAST_EMBEDDED_LABEL)) {
			hazelcastEmbedded = configuration.getBoolean(IS_HAZELCAST_EMBEDDED_LABEL);
		}
		if (configuration.has(INPUT_CHANNEL_TASK_LABEL)) {
			inputChannel = configuration.getString(INPUT_CHANNEL_TASK_LABEL);
		}
		for (final String jsonKey : configuration.keySet()) {
			if (!jsonKey.equals(GRPC_SERVER_PORT_LABEL) && !jsonKey.equals(NORMAL_SCHEDULER_THREAD_SIZE_LABEL)
					&& !jsonKey.equals(IS_HAZELCAST_EMBEDDED_LABEL) && !jsonKey.equals(INPUT_CHANNEL_TASK_LABEL)) {
				globalDatas.put(jsonKey, JsonHelper.dataFromJson(configuration.getJSONObject(jsonKey)));
			}
		}
	}

}

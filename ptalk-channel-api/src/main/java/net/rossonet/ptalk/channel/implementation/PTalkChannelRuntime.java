package net.rossonet.ptalk.channel.implementation;

import java.util.Collection;
import java.util.UUID;
import java.util.logging.Logger;

import org.json.JSONObject;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import net.rossonet.ptalk.base.grpc.Data;
import net.rossonet.ptalk.base.grpc.LifecycleStatus;
import net.rossonet.ptalk.base.grpc.Quality;
import net.rossonet.ptalk.base.grpc.RegisterReply;
import net.rossonet.ptalk.base.grpc.RegisterRequest;
import net.rossonet.ptalk.base.grpc.RpcCoreV1Grpc;
import net.rossonet.ptalk.base.grpc.Tag;
import net.rossonet.ptalk.base.grpc.UnitType;
import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.channel.grpc.RpcChannelCoreV1Grpc;
import net.rossonet.ptalk.channel.grpc.RpcChannelCoreV1Grpc.RpcChannelCoreV1BlockingStub;

public class PTalkChannelRuntime {

	private static final String TEXT_MESSAGE_DATA_KEY = "TEXT_MESSAGE";

	public static final String LOCAL_GRPC_PORT_ENV = "PTALK_CHANNEL_MY_PORT";

	public static final String ENGINE_GRPC_PORT_ENV = "PTALK_CHANNEL_ENGINE_PORT";

	public static final String ENGINE_GRPC_HOST_ENV = "PTALK_CHANNEL_ENGINE_HOST";

	public static final String UNIQUENAME_ENV = "PTALK_CHANNEL_UNIQUENAME";

	public static final String MY_HOST_ENV = "PTALK_CHANNEL_MY_HOST";

	public static final String IS_REGISTER_UNIT_ENV = "IS_REGISTER_UNIT";

	private static final Logger logger = Logger.getLogger(PTalkChannelRuntime.class.getName());

	private LifecycleStatus lifecycleStatus = LifecycleStatus.INIT;

	private final Server server;

	private int grpcUnitPort = 6745;

	private String ptalkEngineHost = "127.0.0.1";

	private int ptalkEnginePort = 8191;
	private String uniqueName = UUID.randomUUID().toString();
	private String myHost = "127.0.0.1";
	private RegisterReply replyRegistration;
	private final CommunicationHandler communicationHandler;

	private RpcChannelCoreV1BlockingStub channelSyncStub;

	private boolean registerUnit = true;

	public PTalkChannelRuntime(UnitChannelConfiguration unitConfiguration, CommunicationHandler handler)
			throws Exception {
		configureEnviroment(unitConfiguration);
		createChannelSyncStub();
		lifecycleStatus = LifecycleStatus.CONFIGURED;
		this.communicationHandler = handler;
		this.communicationHandler.setChannelRuntime(this);
		this.communicationHandler.start();
		server = ServerBuilder.forPort(grpcUnitPort).addService(this.communicationHandler).build();
		server.start();
		if (registerUnit) {
			registerChannelUnit();
		} else {
			logger.info("registration not executed beacause registerUnit flag is false");
		}
		lifecycleStatus = LifecycleStatus.RUNNING;
	}

	private void configureEnviroment(UnitChannelConfiguration unitConfiguration) {
		if (System.getenv(LOCAL_GRPC_PORT_ENV) != null) {
			grpcUnitPort = Integer.valueOf(System.getenv(LOCAL_GRPC_PORT_ENV));
		}
		if (System.getenv(ENGINE_GRPC_PORT_ENV) != null) {
			ptalkEnginePort = Integer.valueOf(System.getenv(ENGINE_GRPC_PORT_ENV));
		}
		if (System.getenv(IS_REGISTER_UNIT_ENV) != null) {
			registerUnit = Boolean.valueOf(System.getenv(IS_REGISTER_UNIT_ENV));
		}
		if (System.getenv(ENGINE_GRPC_HOST_ENV) != null) {
			ptalkEngineHost = System.getenv(ENGINE_GRPC_HOST_ENV);
		}
		if (System.getenv(UNIQUENAME_ENV) != null) {
			uniqueName = System.getenv(UNIQUENAME_ENV);
		}
		if (System.getenv(MY_HOST_ENV) != null) {
			myHost = System.getenv(MY_HOST_ENV);
		}
		if (unitConfiguration != null) {
			if (unitConfiguration.getParameter(LOCAL_GRPC_PORT_ENV) != null) {
				grpcUnitPort = Integer.valueOf(unitConfiguration.getParameter(LOCAL_GRPC_PORT_ENV));
			}
			if (unitConfiguration.getParameter(ENGINE_GRPC_PORT_ENV) != null) {
				ptalkEnginePort = Integer.valueOf(unitConfiguration.getParameter(ENGINE_GRPC_PORT_ENV));
			}
			if (unitConfiguration.getParameter(IS_REGISTER_UNIT_ENV) != null) {
				registerUnit = Boolean.valueOf(unitConfiguration.getParameter(IS_REGISTER_UNIT_ENV));
			}
			if (unitConfiguration.getParameter(ENGINE_GRPC_HOST_ENV) != null) {
				ptalkEngineHost = unitConfiguration.getParameter(ENGINE_GRPC_HOST_ENV);
			}
			if (unitConfiguration.getParameter(UNIQUENAME_ENV) != null) {
				uniqueName = unitConfiguration.getParameter(UNIQUENAME_ENV);
			}
			if (unitConfiguration.getParameter(MY_HOST_ENV) != null) {
				myHost = unitConfiguration.getParameter(MY_HOST_ENV);
			}
		}
	}

	private void createChannelSyncStub() {
		final ManagedChannel mc = ManagedChannelBuilder.forAddress(ptalkEngineHost, ptalkEnginePort).usePlaintext()
				.build();
		channelSyncStub = RpcChannelCoreV1Grpc.newBlockingStub(mc);

	}

	public RpcChannelCoreV1BlockingStub getChannelSyncStub() {
		return channelSyncStub;
	}

	public CommunicationHandler getCommunicationHandler() {
		return communicationHandler;
	}

	public int getGrpcUnitPort() {
		return grpcUnitPort;
	}

	public LifecycleStatus getLifecycleStatus() {
		return lifecycleStatus;
	}

	public String getMyHost() {
		return myHost;
	}

	public String getPtalkEngineHost() {
		return ptalkEngineHost;
	}

	public int getPtalkEnginePort() {
		return ptalkEnginePort;
	}

	public RegisterReply getReplyRegistration() {
		return replyRegistration;
	}

	public Server getServer() {
		return server;
	}

	public String getUniqueName() {
		return uniqueName;
	}

	public boolean isRunning() {
		return lifecycleStatus.equals(LifecycleStatus.RUNNING);
	}

	private void registerChannelUnit() {
		final ManagedChannel mc = ManagedChannelBuilder.forAddress(ptalkEngineHost, ptalkEnginePort).usePlaintext()
				.build();
		final RegisterRequest registerRequest = RegisterRequest.newBuilder().setUnitType(UnitType.CHANNEL)
				.setUnitUniqueName(uniqueName).setHost(myHost).setPort(grpcUnitPort).build();
		replyRegistration = RpcCoreV1Grpc.newBlockingStub(mc).register(registerRequest);
	}

	public void sendMessage(final ChannelMessageRequest request) {
		getChannelSyncStub().callSync(request);
	}

	public void sendMessage(String uniqueUsername, String message) {
		final ChannelMessageRequest request = ChannelMessageRequest.newBuilder()
				.setChannelUniqueMessageId(UUID.randomUUID().toString()).setChannelUniqueName(uniqueUsername)
				.setMessage(Data.newBuilder().setQuality(Quality.GOOD).setKey(TEXT_MESSAGE_DATA_KEY).setValue(message)
						.build())
				.build();
		sendMessage(request);
	}

	public void sendMessage(String uniqueUsername, String message, JSONObject context) {
		final ChannelMessageRequest request = ChannelMessageRequest.newBuilder().setContextJson(context.toString())
				.setChannelUniqueMessageId(UUID.randomUUID().toString()).setChannelUniqueName(uniqueUsername)
				.setMessage(Data.newBuilder().setQuality(Quality.GOOD).setKey(TEXT_MESSAGE_DATA_KEY).setValue(message)
						.build())
				.build();
		sendMessage(request);
	}

	public void sendMessage(String uniqueUsername, String message, JSONObject context, Collection<Data> datas) {
		final ChannelMessageRequest request = ChannelMessageRequest.newBuilder().setContextJson(context.toString())
				.setChannelUniqueMessageId(UUID.randomUUID().toString()).setChannelUniqueName(uniqueUsername)
				.setMessage(Data.newBuilder().setQuality(Quality.GOOD).setKey(TEXT_MESSAGE_DATA_KEY).setValue(message)
						.build())
				.addAllAdditionalDatas(datas).build();
		sendMessage(request);
	}

	public void sendMessage(String uniqueUsername, String message, JSONObject context, Collection<Data> datas,
			Collection<Tag> tags) {
		final ChannelMessageRequest request = ChannelMessageRequest
				.newBuilder().setContextJson(context.toString()).setChannelUniqueMessageId(UUID.randomUUID().toString())
				.setChannelUniqueName(uniqueUsername).setMessage(Data.newBuilder().setQuality(Quality.GOOD)
						.setKey(TEXT_MESSAGE_DATA_KEY).setValue(message).build())
				.addAllTags(tags).addAllAdditionalDatas(datas).build();
		sendMessage(request);
	}

	public void stop() {
		lifecycleStatus = LifecycleStatus.STOPPED;
		synchronized (this) {
			notifyAll();
		}
	}

}

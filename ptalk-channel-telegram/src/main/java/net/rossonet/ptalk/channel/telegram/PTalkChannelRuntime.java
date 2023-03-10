package net.rossonet.ptalk.channel.telegram;

import java.util.UUID;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import net.rossonet.ptalk.base.grpc.LifecycleStatus;
import net.rossonet.ptalk.base.grpc.RegisterReply;
import net.rossonet.ptalk.base.grpc.RegisterRequest;
import net.rossonet.ptalk.base.grpc.RpcCoreV1Grpc;
import net.rossonet.ptalk.base.grpc.UnitType;
import net.rossonet.ptalk.channel.grpc.RpcChannelCoreV1Grpc;
import net.rossonet.ptalk.channel.grpc.RpcChannelCoreV1Grpc.RpcChannelCoreV1BlockingStub;

public class PTalkChannelRuntime {

	public static final String LOCAL_GRPC_PORT_ENV = "PTALK_CHANNEL_MY_PORT";

	public static final String ENGINE_GRPC_PORT_ENV = "PTALK_CHANNEL_ENGINE_PORT";

	public static final String ENGINE_GRPC_HOST_ENV = "PTALK_CHANNEL_ENGINE_HOST";

	public static final String UNIQUENAME_ENV = "PTALK_CHANNEL_UNIQUENAME";

	public static final String MY_HOST_ENV = "PTALK_CHANNEL_MY_HOST";

	private LifecycleStatus lifecycleStatus = LifecycleStatus.INIT;

	private final Server server;

	private int grpcUnitPort = 6745;

	private String ptalkEngineHost = "127.0.0.1";

	private int ptalkEnginePort = 8191;

	private String uniqueName = UUID.randomUUID().toString();
	private String myHost = "127.0.0.1";
	private RegisterReply replyRegistration;
	private final TelegramWrapper telegram;
	private RpcChannelCoreV1BlockingStub channelSyncStub;

	public PTalkChannelRuntime() throws Exception {
		configureEnviroment();
		lifecycleStatus = LifecycleStatus.CONFIGURED;
		server = ServerBuilder.forPort(grpcUnitPort).addService(new GrpcChannelTelegramServiceImpl(this)).build();
		server.start();
		registerChannelUnit();
		createChannelSyncStub();
		telegram = new TelegramWrapper(this);
		lifecycleStatus = LifecycleStatus.RUNNING;
	}

	private void configureEnviroment() {
		if (System.getenv(LOCAL_GRPC_PORT_ENV) != null) {
			grpcUnitPort = Integer.valueOf(System.getenv(LOCAL_GRPC_PORT_ENV));
		}
		if (System.getenv(ENGINE_GRPC_PORT_ENV) != null) {
			ptalkEnginePort = Integer.valueOf(System.getenv(ENGINE_GRPC_PORT_ENV));
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
	}

	private void createChannelSyncStub() {
		final ManagedChannel mc = ManagedChannelBuilder.forAddress(ptalkEngineHost, ptalkEnginePort).usePlaintext()
				.build();
		channelSyncStub = RpcChannelCoreV1Grpc.newBlockingStub(mc);

	}

	public RpcChannelCoreV1BlockingStub getChannelSyncStub() {
		return channelSyncStub;
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

	public TelegramWrapper getTelegram() {
		return telegram;
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

	public void stop() {
		lifecycleStatus = LifecycleStatus.STOPPED;
		synchronized (this) {
			notifyAll();
		}
	}

}

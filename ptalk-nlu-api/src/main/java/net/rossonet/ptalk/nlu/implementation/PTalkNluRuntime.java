package net.rossonet.ptalk.nlu.implementation;

import java.util.UUID;
import java.util.logging.Logger;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import net.rossonet.ptalk.base.grpc.LifecycleStatus;
import net.rossonet.ptalk.base.grpc.RegisterReply;
import net.rossonet.ptalk.base.grpc.RegisterRequest;
import net.rossonet.ptalk.base.grpc.RpcCoreV1Grpc;
import net.rossonet.ptalk.base.grpc.UnitType;
import net.rossonet.ptalk.nlu.grpc.RpcNluCoreV1Grpc;
import net.rossonet.ptalk.nlu.grpc.RpcNluCoreV1Grpc.RpcNluCoreV1BlockingStub;

public class PTalkNluRuntime {

	public static final String LOCAL_GRPC_PORT_ENV = "PTALK_NLU_MY_PORT";

	public static final String ENGINE_GRPC_PORT_ENV = "PTALK_NLU_ENGINE_PORT";

	public static final String ENGINE_GRPC_HOST_ENV = "PTALK_NLU_ENGINE_HOST";

	public static final String UNIQUENAME_ENV = "PTALK_NLU_UNIQUENAME";

	public static final String MY_HOST_ENV = "PTALK_NLU_MY_HOST";

	public static final String IS_REGISTER_UNIT_ENV = "IS_REGISTER_UNIT";

	private static final Logger logger = Logger.getLogger(PTalkNluRuntime.class.getName());

	private LifecycleStatus lifecycleStatus = LifecycleStatus.INIT;

	private final Server server;

	private int grpcUnitPort = 6745;

	private String ptalkEngineHost = "127.0.0.1";

	private int ptalkEnginePort = 8191;
	private String uniqueName = UUID.randomUUID().toString();
	private String myHost = "127.0.0.1";
	private RegisterReply replyRegistration;
	private final CommunicationHandler communicationHandler;

	private RpcNluCoreV1BlockingStub nluSyncStub;

	private boolean registerUnit = true;

	public PTalkNluRuntime(UnitNluConfiguration unitConfiguration, CommunicationHandler handler) throws Exception {
		configureEnviroment(unitConfiguration);
		createNluSyncStub();
		lifecycleStatus = LifecycleStatus.CONFIGURED;
		this.communicationHandler = handler;
		this.communicationHandler.setNluRuntime(this);
		server = ServerBuilder.forPort(grpcUnitPort).addService(this.communicationHandler).build();
		server.start();
		if (registerUnit) {
			registerNluUnit();
		} else {
			logger.info("registration not executed beacause registerUnit flag is false");
		}
		lifecycleStatus = LifecycleStatus.RUNNING;
	}

	private void configureEnviroment(UnitNluConfiguration unitConfiguration) {
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

	private void createNluSyncStub() {
		final ManagedChannel mc = ManagedChannelBuilder.forAddress(ptalkEngineHost, ptalkEnginePort).usePlaintext()
				.build();
		nluSyncStub = RpcNluCoreV1Grpc.newBlockingStub(mc);

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

	public RpcNluCoreV1BlockingStub getNluSyncStub() {
		return nluSyncStub;
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

	private void registerNluUnit() {
		final ManagedChannel mc = ManagedChannelBuilder.forAddress(ptalkEngineHost, ptalkEnginePort).usePlaintext()
				.build();
		final RegisterRequest registerRequest = RegisterRequest.newBuilder().setUnitType(UnitType.NLU)
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

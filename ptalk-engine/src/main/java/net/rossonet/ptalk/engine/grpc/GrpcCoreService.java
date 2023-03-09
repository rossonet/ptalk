package net.rossonet.ptalk.engine.grpc;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import net.rossonet.ptalk.engine.PTalkEngineRuntime;

public class GrpcCoreService {

	private static final int SHUTDOWN_AWAIT_SECONDS = 30;

	private final PTalkEngineRuntime pTalkEngineRuntime;

	private final Server server;

	public GrpcCoreService(PTalkEngineRuntime pTalkEngineRuntime, int grpcServerPort) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
		server = ServerBuilder.forPort(grpcServerPort).addService(new GrpcEngineCoreServiceImpl(pTalkEngineRuntime))
				.addService(new GrpcNluServiceImpl(pTalkEngineRuntime))
				.addService(new GrpcChannelServiceImpl(pTalkEngineRuntime))
				.addService(new GrpcAbilityServiceImpl(pTalkEngineRuntime))
				.addService(new GrpcSuperAbilityServiceImpl(pTalkEngineRuntime)).build();
	}

	public PTalkEngineRuntime getpTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

	public void shutdown() throws InterruptedException {
		server.shutdown();
		server.awaitTermination(SHUTDOWN_AWAIT_SECONDS, TimeUnit.SECONDS);
		if (!server.isTerminated()) {
			server.shutdownNow();
		}
	}

	public void start() throws IOException {
		server.start();
	}

}

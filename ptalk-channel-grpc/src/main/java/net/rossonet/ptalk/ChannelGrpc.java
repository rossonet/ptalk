package net.rossonet.ptalk;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class ChannelGrpc {

	private static final int SHUTDOWN_AWAIT_SECONDS = 30;

	private final Server serverInternal;
	private final Server serverExternal;

	public ChannelGrpc(int internalPort, int externalPort, String coreHost, int corePort) {
		serverInternal = ServerBuilder.forPort(internalPort).build();
		serverExternal = ServerBuilder.forPort(externalPort).addService(new RpcServerGrpc(this)).build();
	}

	public void shutdown() throws InterruptedException {
		serverInternal.shutdown();
		serverInternal.awaitTermination(SHUTDOWN_AWAIT_SECONDS, TimeUnit.SECONDS);
		if (!serverInternal.isTerminated()) {
			serverInternal.shutdownNow();
		}
		serverExternal.shutdown();
		serverExternal.awaitTermination(SHUTDOWN_AWAIT_SECONDS, TimeUnit.SECONDS);
		if (!serverExternal.isTerminated()) {
			serverExternal.shutdownNow();
		}
	}

	public void start() throws IOException {
		serverInternal.start();
		serverExternal.start();
	}

}

package net.rossonet.ptalk.channel.simulation;

import java.io.Closeable;
import java.io.IOException;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import net.rossonet.ptalk.base.grpc.Data;
import net.rossonet.ptalk.base.grpc.StatusValue;
import net.rossonet.ptalk.base.grpc.Timestamp;
import net.rossonet.ptalk.channel.grpc.ChannelMessageReply;
import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.channel.grpc.RpcChannelCoreV1Grpc.RpcChannelCoreV1ImplBase;
import net.rossonet.ptalk.channel.grpc.RpcChannelUnitV1Grpc;
import net.rossonet.ptalk.channel.grpc.RpcChannelUnitV1Grpc.RpcChannelUnitV1BlockingStub;

public class FakePTalkEngine extends RpcChannelCoreV1ImplBase implements Closeable {

	public static final String ECHO_MESSAGE_PREFIX = "ECHO MESSAGE OF: ";

	private static final Logger logger = Logger.getLogger(FakePTalkEngine.class.getName());

	private final Queue<ChannelMessageRequest> requestQueue = new ArrayBlockingQueue<>(50);

	private final ExecutorService executorService;

	private boolean running = true;

	private String unitAddress;

	private int unitPort;

	private final Map<String, RpcChannelUnitV1BlockingStub> cacheBlockingStub = new HashMap<>();

	private Server server;

	public FakePTalkEngine(ExecutorService executorService, String unitAddress, int unitPort, int corePort)
			throws IOException {
		this.executorService = executorService;
		this.unitAddress = unitAddress;
		this.unitPort = unitPort;

		executorService.submit(new Callable<Void>() {

			@Override
			public Void call() throws Exception {
				while (running) {
					try {
						elaborateMessage();
						Thread.sleep(1000L);
					} catch (final Exception ee) {
						logger.severe(ee.getMessage());
						ee.printStackTrace();
					}
				}
				return null;
			}

		});
		runService(corePort);
	}

	@Override
	public void callSync(ChannelMessageRequest request, StreamObserver<ChannelMessageReply> responseObserver) {
		logger.info("receive request " + request);
		requestQueue.add(request);
		responseObserver.onNext(ChannelMessageReply.newBuilder().setFlowReference(request.getFlowReference())
				.setStatus(StatusValue.STATUS_GOOD)
				.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().toEpochMilli()).build()).build());
		responseObserver.onCompleted();

	}

	@Override
	public void close() throws IOException {
		server.shutdown();
		running = false;
		executorService.shutdown();
	}

	private synchronized void elaborateMessage() {
		if (!requestQueue.isEmpty()) {
			replyToMessage(requestQueue.poll());
		}

	}

	private RpcChannelUnitV1BlockingStub getBlockingStub(String targetIp) {
		final ManagedChannel mc = ManagedChannelBuilder.forAddress(targetIp, unitPort).usePlaintext().build();
		return RpcChannelUnitV1Grpc.newBlockingStub(mc);

	}

	private void replyToMessage(ChannelMessageRequest inputMessage) {
		final String targetIp = unitAddress;
		if (targetIp == null) {
			// se implementata la registrazione
		}
		if (!cacheBlockingStub.containsKey(targetIp)) {
			cacheBlockingStub.put(targetIp, getBlockingStub(targetIp));
		}
		final Data message = Data.newBuilder(inputMessage.getMessage())
				.setValue(ECHO_MESSAGE_PREFIX + inputMessage.getMessage().getValue()).build();
		final ChannelMessageRequest outputMessage = ChannelMessageRequest.newBuilder(inputMessage).setMessage(message)
				.build();
		cacheBlockingStub.get(targetIp).callSync(outputMessage);
	}

	private void runService(int grpcServerPort) throws IOException {
		server = ServerBuilder.forPort(grpcServerPort).addService(this).build();
		server.start();
	}

}

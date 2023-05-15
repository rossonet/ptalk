package net.rossonet.ptalk.nlu.simulation;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;

import org.rossonet.utils.LogHelper;

import com.opencsv.CSVReader;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import net.rossonet.ptalk.base.grpc.Data;
import net.rossonet.ptalk.base.grpc.Status;
import net.rossonet.ptalk.base.grpc.StatusValue;
import net.rossonet.ptalk.nlu.grpc.NluDeleteModelReply;
import net.rossonet.ptalk.nlu.grpc.NluDeleteModelRequest;
import net.rossonet.ptalk.nlu.grpc.NluListModelsReply;
import net.rossonet.ptalk.nlu.grpc.NluListModelsRequest;
import net.rossonet.ptalk.nlu.grpc.NluMessageReply;
import net.rossonet.ptalk.nlu.grpc.NluMessageRequest;
import net.rossonet.ptalk.nlu.grpc.NluModel;
import net.rossonet.ptalk.nlu.grpc.NluRestoreModelReply;
import net.rossonet.ptalk.nlu.grpc.NluRestoreModelRequest;
import net.rossonet.ptalk.nlu.grpc.NluSnapshotModelReply;
import net.rossonet.ptalk.nlu.grpc.NluSnapshotModelRequest;
import net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply;
import net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest;
import net.rossonet.ptalk.nlu.grpc.RpcNluCoreV1Grpc.RpcNluCoreV1ImplBase;
import net.rossonet.ptalk.nlu.grpc.RpcNluUnitV1Grpc;
import net.rossonet.ptalk.nlu.grpc.RpcNluUnitV1Grpc.RpcNluUnitV1BlockingStub;

public class FakePTalkEngine extends RpcNluCoreV1ImplBase implements Closeable {

	private static final String NULL_CAPABILITY = "null_capability";

	private static final Logger logger = Logger.getLogger(FakePTalkEngine.class.getName());

	private static final String MODEL_NAME = "testModel";

	private static final String MODEL_VERSION = "0.0.1-debug";

	private static final String TRAINING_JOB = "echo ok";

	private final ExecutorService executorService;

	private boolean running = true;

	private String unitAddress;

	private int unitPort;

	private Server server;

	private RpcNluUnitV1BlockingStub cacheBlockingStub;

	private boolean trainingDone = false;

	private boolean fault = false;

	private final NluModel model = NluModel.newBuilder().setModel(MODEL_NAME).setModelVersion(MODEL_VERSION)
			.setRequiredCapability(NULL_CAPABILITY).build();

	private List<Data> snapshotData = null;

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
						if (cacheBlockingStub == null) {
							cacheBlockingStub = getBlockingStub();
						}
						System.out.println("*** [CHECK] trainingModel");
						trainingModel();
						System.out.println("*** [OK] trainingModel");
						System.out.println("*** [CHECK] waitTrainingReply");
						waitTrainingReply();
						trainingDone = false;
						System.out.println("*** [OK] waitTrainingReply");
						System.out.println("*** [CHECK] listModels");
						listModels(true);
						System.out.println("*** [OK] listModels");
						System.out.println("*** [CHECK] sendNluQuery");
						sendNluQuery();
						System.out.println("*** [OK] sendNluQuery");
						System.out.println("*** [CHECK] snapshotModel");
						snapshotModel();
						System.out.println("*** [OK] snapshotModel");
						System.out.println("*** [CHECK] deleteModel");
						deleteModel();
						System.out.println("*** [OK] deleteModel");
						System.out.println("*** [CHECK] listModels");
						listModels(false);
						System.out.println("*** [OK] listModels");
						System.out.println("*** [RESTORE] restoreModel");
						restoreModel();
						System.out.println("*** [OK] restoreModel");
						System.out.println("*** [CHECK] listModels");
						listModels(true);
						System.out.println("*** [OK] listModels");
						System.out.println("*** [CHECK] sendNluQuery");
						sendNluQuery();
						System.out.println("*** [OK] sendNluQuery");
						System.out.println("*** [CHECK] deleteModel");
						deleteModel();
						System.out.println("*** [OK] deleteModel");
						System.out.println("*** [CHECK] listModels");
						listModels(false);
						System.out.println("*** [OK] listModels");
						Thread.sleep(6000L);
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
	public void close() throws IOException {
		server.shutdown();
		running = false;
		executorService.shutdown();
	}

	private void deleteModel() {
		final NluDeleteModelRequest nluDeleteModelMessage = NluDeleteModelRequest.newBuilder().setModel(model).build();
		final NluDeleteModelReply callReply = cacheBlockingStub.deleteModel(nluDeleteModelMessage);
		manageReply(callReply);

	}

	private RpcNluUnitV1BlockingStub getBlockingStub() {
		final ManagedChannel mc = ManagedChannelBuilder.forAddress(unitAddress, unitPort).usePlaintext().build();
		return RpcNluUnitV1Grpc.newBlockingStub(mc);

	}

	public boolean isSimulationCompletedSuccessful() {
		return !fault;
	}

	private void listModels(boolean wantExists) {
		final NluListModelsRequest nluListModelsMessage = NluListModelsRequest.newBuilder().build();
		final NluListModelsReply callReply = cacheBlockingStub.listModels(nluListModelsMessage);
		manageReply(callReply);
		boolean found = false;
		for (final NluModel m : callReply.getModelList()) {
			if (m.getModel().equals(MODEL_NAME) && m.getModelVersion().equals(MODEL_VERSION)) {
				found = true;
				break;
			}
		}
		if ((wantExists && !found) || (!wantExists && found)) {
			System.out.println("model not found!");
			fault = true;
		}
	}

	private void manageReply(NluDeleteModelReply callReply) {
		final StatusValue status = callReply.getStatus();
		final String replyString = callReply.toString();
		statusManager(status, replyString);

	}

	private void manageReply(NluListModelsReply callReply) {
		final StatusValue status = callReply.getStatus();
		final String replyString = callReply.toString();
		statusManager(status, replyString);
	}

	private void manageReply(final NluMessageReply callReply) {
		final StatusValue status = callReply.getStatus();
		final String replyString = callReply.toString();
		statusManager(status, replyString);
	}

	private void manageReply(NluRestoreModelReply callReply) {
		final StatusValue status = callReply.getStatus();
		final String replyString = callReply.toString();
		statusManager(status, replyString);

	}

	private void manageReply(NluSnapshotModelReply callReply) {
		final StatusValue status = callReply.getStatus();
		final String replyString = callReply.toString();
		statusManager(status, replyString);
	}

	private void manageReply(NluTrainingModelReply callReply) {
		final StatusValue status = callReply.getStatus();
		final String replyString = callReply.toString();
		statusManager(status, replyString);
	}

	private void manageReply(Status callReply) {
		final StatusValue status = callReply.getStatus();
		final String replyString = callReply.toString();
		statusManager(status, replyString);
	}

	@Override
	public void replyTrainingModelAsync(NluTrainingModelReply request, StreamObserver<Status> responseObserver) {
		logger.info("receive training reply " + request);
		manageReply(request);
		final Status status = Status.newBuilder().setStatus(StatusValue.STATUS_GOOD).build();
		responseObserver.onNext(status);
		responseObserver.onCompleted();
		trainingDone = true;
	}

	private void restoreModel() {
		final NluRestoreModelRequest nluLoadModelMessage = NluRestoreModelRequest.newBuilder().setModel(model)
				.addAllModelSnapshotData(snapshotData).build();
		final NluRestoreModelReply callReply = cacheBlockingStub.restoreModel(nluLoadModelMessage);
		manageReply(callReply);

	}

	private void runService(int grpcServerPort) throws IOException {
		server = ServerBuilder.forPort(grpcServerPort).addService(this).build();
		server.start();
	}

	private synchronized void sendNluQuery() {
		final ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		final InputStream is = classloader.getResourceAsStream("nlu_example_input.csv");
		try (CSVReader csvReader = new CSVReader(new InputStreamReader(is))) {
			String[] values = null;
			while ((values = csvReader.readNext()) != null) {
				final String context = values[0];
				final String text = values[1];
				final Data message = Data.newBuilder().setValue(text).build();
				final NluMessageRequest nluQueryMessage = NluMessageRequest.newBuilder().setContextJson(context)
						.setMessage(message).setModel(model).build();
				final NluMessageReply callReply = cacheBlockingStub.callSync(nluQueryMessage);
				manageReply(callReply);
				Thread.sleep(1500L);
			}
		} catch (final Exception e) {
			fault = true;
			logger.severe(LogHelper.stackTraceToString(e));
		}
	}

	private void snapshotModel() {
		final NluSnapshotModelRequest nluSaveModelMessage = NluSnapshotModelRequest.newBuilder().setModel(model)
				.build();
		final NluSnapshotModelReply callReply = cacheBlockingStub.snapshotModel(nluSaveModelMessage);
		manageReply(callReply);
		snapshotData = callReply.getModelSnapshotDataList();
	}

	private void statusManager(StatusValue status, String replyString) {
		if (status.equals(StatusValue.STATUS_GOOD)) {
			System.out.println(replyString);
		} else {
			System.out.println("status different from GOOD ");
			System.out.println(replyString);
			fault = true;
		}
	}

	private void trainingModel() {
		final NluTrainingModelRequest nluTrainingMessage = NluTrainingModelRequest.newBuilder().setModel(model)
				.setTrainingJob(TRAINING_JOB).setTrainingEngine("bash").build();
		final Status callReply = cacheBlockingStub.trainModelAsync(nluTrainingMessage);
		manageReply(callReply);
	}

	private void waitTrainingReply() {
		while (!trainingDone) {
			try {
				Thread.sleep(1000L);
			} catch (final InterruptedException e) {
				logger.severe(LogHelper.stackTraceToString(e));
			}
		}

	}

}

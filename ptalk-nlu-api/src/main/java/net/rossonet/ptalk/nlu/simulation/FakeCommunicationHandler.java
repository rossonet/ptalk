package net.rossonet.ptalk.nlu.simulation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Logger;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import net.rossonet.ptalk.base.grpc.Data;
import net.rossonet.ptalk.base.grpc.DataType;
import net.rossonet.ptalk.nlu.grpc.NluMessageRequest;
import net.rossonet.ptalk.nlu.grpc.NluModel;
import net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply;
import net.rossonet.ptalk.nlu.grpc.RpcNluCoreV1Grpc;
import net.rossonet.ptalk.nlu.implementation.BaseNluReply;
import net.rossonet.ptalk.nlu.implementation.CommunicationHandler;

public class FakeCommunicationHandler extends CommunicationHandler {

	private static final String EXAMPLE_DUMP_MODEL_KEY = "dump-nlu-model-1";

	private static final Logger logger = Logger.getLogger(FakeCommunicationHandler.class.getName());

	private static final String EXAMPLE_DUMP_MODEL_DATA = UUID.randomUUID().toString();

	Set<String> implementedModels = new HashSet<>();

	private final List<NluModel> models = new ArrayList<>();

	private int nluCalls = 0;

	private int deleteCalls = 0;

	private int listCalls = 0;

	private int restoreCalls = 0;

	private int trainingCalls = 0;

	private int snapshotCalls = 0;

	@Override
	protected BaseNluReply callSync(NluMessageRequest message) {
		nluCalls++;
		return new BaseNluReply(message.getContextJson(), message.getMessage().getValue());
	}

	private boolean checkAllCompleted() {
		return (nluCalls > 0 && deleteCalls > 0 && listCalls > 0 && restoreCalls > 0 && trainingCalls > 0
				&& snapshotCalls > 0);
	}

	@Override
	protected boolean deleteModel(NluModel model) {
		deleteCalls++;
		NluModel found = null;
		for (final NluModel m : listModels()) {
			if (m.getModel().equals(model.getModel())) {
				found = m;
				break;
			}
		}
		if (found != null) {
			System.out.println("REMOVE " + found.toString());
			models.remove(found);
			return true;
		} else {
			return false;
		}
	}

	@Override
	protected List<NluModel> listModels() {
		listCalls++;
		return models;
	}

	@Override
	protected boolean restoreModel(NluModel model, List<Data> modelSnapshotDataList) {
		restoreCalls++;
		boolean found = false;
		boolean correctData = false;
		for (final Data d : modelSnapshotDataList) {
			logger.info("looking data for snapshot " + d.toString() + " original data are " + EXAMPLE_DUMP_MODEL_KEY
					+ " -> " + EXAMPLE_DUMP_MODEL_DATA);
			if (d.getKey().equals(EXAMPLE_DUMP_MODEL_KEY) && d.getValue().equals(EXAMPLE_DUMP_MODEL_DATA)) {
				correctData = true;
				break;
			}
		}
		for (final NluModel m : listModels()) {
			if (m.getModel().equals(model.getModel())) {
				found = true;
				break;
			}
		}
		if (!found && correctData) {
			models.add(model);
			logger.info("*********** model added " + model);
		} else {
			logger.severe("ERROR RESTORE: model already exists");
		}
		return correctData;
	}

	@Override
	protected void sendTrainingModelReplyMessage(NluModel model) {
		final ManagedChannel mc = ManagedChannelBuilder.forAddress(getpTalkChannelRuntime().getPtalkEngineHost(),
				getpTalkChannelRuntime().getPtalkEnginePort()).usePlaintext().build();
		final NluTrainingModelReply reply = NluTrainingModelReply.newBuilder().setModel(model).build();
		RpcNluCoreV1Grpc.newBlockingStub(mc).replyTrainingModelAsync(reply);
	}

	@Override
	protected List<Data> snapshotModel(NluModel model) {
		System.out.println("SNAPSHOT OF MODEL: " + model);
		snapshotCalls++;
		final List<Data> result = new ArrayList<>();
		result.add(Data.newBuilder().setKey(EXAMPLE_DUMP_MODEL_KEY).setValue(EXAMPLE_DUMP_MODEL_DATA)
				.setTypeData(DataType.STRING).build());
		return result;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("FakeCommunicationHandler [nluCalls=");
		builder.append(nluCalls);
		builder.append(", deleteCalls=");
		builder.append(deleteCalls);
		builder.append(", listCalls=");
		builder.append(listCalls);
		builder.append(", restoreCalls=");
		builder.append(restoreCalls);
		builder.append(", trainingCalls=");
		builder.append(trainingCalls);
		builder.append(", snapshotCalls=");
		builder.append(snapshotCalls);
		builder.append("]");
		return builder.toString();
	}

	@Override
	protected boolean trainModelAsync(NluModel model) {
		trainingCalls++;
		boolean found = false;
		for (final NluModel m : listModels()) {
			if (m.getModel().equals(model.getModel())) {
				found = true;
				break;
			}
		}
		if (found) {
			Thread.dumpStack();
			logger.severe("ERROR TRAIN: model already exists");
			return false;
		} else {
			models.add(model);
			return true;
		}
	}

	public void waitFirstLoopSimulation() {
		while (!checkAllCompleted()) {
			System.out.println(toString());
			try {
				Thread.sleep(2500L);
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

package net.rossonet.ptalk.nlu.implementation;

import java.time.Instant;
import java.util.List;

import io.grpc.stub.StreamObserver;
import net.rossonet.ptalk.base.grpc.Data;
import net.rossonet.ptalk.base.grpc.DataType;
import net.rossonet.ptalk.base.grpc.Quality;
import net.rossonet.ptalk.base.grpc.Status;
import net.rossonet.ptalk.base.grpc.StatusValue;
import net.rossonet.ptalk.base.grpc.Timestamp;
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
import net.rossonet.ptalk.nlu.grpc.NluTrainingModelRequest;
import net.rossonet.ptalk.nlu.grpc.RpcNluUnitV1Grpc.RpcNluUnitV1ImplBase;

public abstract class CommunicationHandler extends RpcNluUnitV1ImplBase {

	protected PTalkNluRuntime pTalkChannelRuntime;

	protected abstract BaseNluReply callSync(NluMessageRequest message);

	@Override
	public void callSync(NluMessageRequest request, StreamObserver<NluMessageReply> responseObserver) {
		System.out.println("--- NLU QUERY ---\n" + request.toString());
		try {
			final BaseNluReply reply = callSync(request);
			if (reply.isCompleted()) {
				final Data contentReply = Data.newBuilder().setKey("nlu_reply").setQuality(Quality.GOOD)
						.setTypeData(DataType.STRING).setValue(reply.getTextReply()).build();
				responseObserver.onNext(NluMessageReply.newBuilder().setFlowReference(request.getFlowReference())
						.setStatus(StatusValue.STATUS_GOOD).setReply(contentReply)
						.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().toEpochMilli()).build())
						.build());
				responseObserver.onCompleted();
			} else {
				responseObserver.onError(new RuntimeException("error working nlu query"));
			}
		} catch (final Exception a) {
			responseObserver.onError(a);
		}
	}

	@Override
	public void deleteModel(NluDeleteModelRequest request, StreamObserver<NluDeleteModelReply> responseObserver) {
		try {
			final boolean reply = deleteModel(request.getModel());
			if (reply) {
				responseObserver.onNext(NluDeleteModelReply.newBuilder().setFlowReference(request.getFlowReference())
						.setStatus(StatusValue.STATUS_GOOD)
						.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().toEpochMilli()).build())
						.build());
				responseObserver.onCompleted();
			} else {
				responseObserver.onError(new RuntimeException("error working delete model query"));
			}
		} catch (final Exception a) {
			responseObserver.onError(a);
		}
	}

	protected abstract boolean deleteModel(NluModel model);

	public PTalkNluRuntime getpTalkChannelRuntime() {
		return pTalkChannelRuntime;
	}

	protected abstract List<NluModel> listModels();

	@Override
	public void listModels(NluListModelsRequest request, StreamObserver<NluListModelsReply> responseObserver) {
		try {
			final List<NluModel> models = listModels();
			if (models != null) {
				responseObserver.onNext(NluListModelsReply.newBuilder().setFlowReference(request.getFlowReference())
						.setStatus(StatusValue.STATUS_GOOD).addAllModel(models)
						.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().toEpochMilli()).build())
						.build());
				responseObserver.onCompleted();
			} else {
				responseObserver.onError(new RuntimeException("error working list models query"));
			}
		} catch (final Exception a) {
			responseObserver.onError(a);
		}
	}

	protected abstract boolean restoreModel(NluModel model, List<Data> modelSnapshotDataList);

	@Override
	public void restoreModel(NluRestoreModelRequest request, StreamObserver<NluRestoreModelReply> responseObserver) {
		try {
			final boolean reply = restoreModel(request.getModel(), request.getModelSnapshotDataList());
			if (reply) {
				responseObserver.onNext(NluRestoreModelReply.newBuilder().setFlowReference(request.getFlowReference())
						.setStatus(StatusValue.STATUS_GOOD)
						.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().toEpochMilli()).build())
						.build());
				responseObserver.onCompleted();
			} else {
				responseObserver.onError(new RuntimeException("error working restore model query"));
			}
		} catch (final Exception a) {
			responseObserver.onError(a);
		}
	}

	protected abstract void sendTrainingModelReplyMessage(NluModel model);

	public void setNluRuntime(PTalkNluRuntime pTalkChannelRuntime) {
		this.pTalkChannelRuntime = pTalkChannelRuntime;

	}

	protected abstract List<Data> snapshotModel(NluModel model);

	@Override
	public void snapshotModel(NluSnapshotModelRequest request, StreamObserver<NluSnapshotModelReply> responseObserver) {
		try {
			final List<Data> snapshot = snapshotModel(request.getModel());
			if (!snapshot.isEmpty()) {
				responseObserver.onNext(NluSnapshotModelReply.newBuilder().setFlowReference(request.getFlowReference())
						.setStatus(StatusValue.STATUS_GOOD).addAllModelSnapshotData(snapshot)
						.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().toEpochMilli()).build())
						.build());
				responseObserver.onCompleted();
			} else {
				responseObserver.onError(new RuntimeException("error working snapshot model query"));
			}
		} catch (final Exception a) {
			responseObserver.onError(a);
		}
	}

	protected abstract boolean trainModelAsync(NluModel model);

	@Override
	public void trainModelAsync(NluTrainingModelRequest request, StreamObserver<Status> responseObserver) {
		try {
			final boolean reply = trainModelAsync(request.getModel());
			if (reply) {
				responseObserver.onNext(Status.newBuilder().setStatus(StatusValue.STATUS_GOOD).build());
				responseObserver.onCompleted();
			} else {
				responseObserver.onError(new RuntimeException("error training model query"));
			}
			Thread.sleep(5000L);
			sendTrainingModelReplyMessage(request.getModel());
		} catch (final Exception a) {
			responseObserver.onError(a);
		}
	}

}

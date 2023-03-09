package net.rossonet.ptalk.engine.runtime.fact.nlu;

import java.util.ArrayList;
import java.util.List;

import net.rossonet.ptalk.base.grpc.Timestamp;
import net.rossonet.ptalk.engine.runtime.fact.memory.MemoryData;
import net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply;
import net.rossonet.ptalk.nlu.grpc.TrainingLineLog;

public class NluTrainingModelReplyFact extends MemoryData<NluTrainingModelReply> {

	private static final long serialVersionUID = -431676829283917362L;
	private final String flowReference;
	private final String model;
	private final String capability;

	private final String modelVersion;

	private final String status;

	private final Timestamp timestamp;

	private final List<LineLog> trainingLogs = new ArrayList<>();

	private final List<LineLog> testLogs = new ArrayList<>();

	public NluTrainingModelReplyFact(NluTrainingModelReply request) {
		this.flowReference = request.getFlowReference();
		this.model = request.getModel().getModel();
		this.capability = request.getModel().getCapability();
		this.modelVersion = request.getModel().getModelVersion();
		this.status = request.getStatus().name();
		this.timestamp = request.getTimestamp();
		for (final TrainingLineLog l : request.getTestLogList()) {
			trainingLogs.add(new LineLog(l));
		}
		for (final TrainingLineLog l : request.getTrainingLogList()) {
			testLogs.add(new LineLog(l));
		}
	}

	public String getCapability() {
		return capability;
	}

	public String getFlowReference() {
		return flowReference;
	}

	public String getModel() {
		return model;
	}

	public String getModelVersion() {
		return modelVersion;
	}

	public String getStatus() {
		return status;
	}

	public List<LineLog> getTestLogs() {
		return testLogs;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public List<LineLog> getTrainingLogs() {
		return trainingLogs;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("NluTrainingModelReplyFact [flowReference=");
		builder.append(flowReference);
		builder.append(", model=");
		builder.append(model);
		builder.append(", modelVersion=");
		builder.append(modelVersion);
		builder.append(", capability=");
		builder.append(capability);
		builder.append(", status=");
		builder.append(status);
		builder.append(", timestamp=");
		builder.append(timestamp);
		builder.append("]");
		return builder.toString();
	}

}

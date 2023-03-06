package net.rossonet.ptalk.engine.grpc;

import java.time.Instant;
import java.util.logging.Logger;

import org.rossonet.utils.LogHelper;

import io.grpc.stub.StreamObserver;
import net.rossonet.ptalk.base.grpc.StatusValue;
import net.rossonet.ptalk.base.grpc.Timestamp;
import net.rossonet.ptalk.channel.grpc.ChannelMessageReply;
import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.channel.grpc.RpcChannelCoreV1Grpc.RpcChannelCoreV1ImplBase;
import net.rossonet.ptalk.engine.PTalkEngineRuntime;
import net.rossonet.ptalk.engine.exceptions.TaskManagerException;

public class GrpcChannelServiceImpl extends RpcChannelCoreV1ImplBase {

	private static final Logger logger = Logger.getLogger(GrpcChannelServiceImpl.class.getName());

	private final PTalkEngineRuntime pTalkEngineRuntime;

	public GrpcChannelServiceImpl(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	@Override
	public void callSync(ChannelMessageRequest request, StreamObserver<ChannelMessageReply> responseObserver) {
		try {
			pTalkEngineRuntime.channelMessage(request);
			responseObserver.onNext(ChannelMessageReply.newBuilder().setFlowReference(request.getFlowReference())
					.setStatus(StatusValue.STATUS_GOOD)
					.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().toEpochMilli()).build())
					.build());
			responseObserver.onCompleted();
		} catch (final TaskManagerException e) {
			logger.severe(LogHelper.stackTraceToString(e));
			responseObserver.onError(e);
		}

	}

	public PTalkEngineRuntime getpTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

}

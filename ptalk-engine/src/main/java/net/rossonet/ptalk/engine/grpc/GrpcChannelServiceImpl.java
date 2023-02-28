package net.rossonet.ptalk.engine.grpc;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import io.grpc.stub.StreamObserver;
import net.rossonet.ptalk.base.grpc.Status;
import net.rossonet.ptalk.base.grpc.StatusValue;
import net.rossonet.ptalk.channel.grpc.ChannelMessageReply;
import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.channel.grpc.RpcChannelCoreV1Grpc.RpcChannelCoreV1ImplBase;
import net.rossonet.ptalk.engine.PTalkEngineRuntime;

public class GrpcChannelServiceImpl extends RpcChannelCoreV1ImplBase {

	private final PTalkEngineRuntime pTalkEngineRuntime;

	public GrpcChannelServiceImpl(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	@Override
	public void callAsync(ChannelMessageRequest request, StreamObserver<Status> responseObserver) {
		pTalkEngineRuntime.channelMessage(request, true);
		final Status reply = Status.newBuilder().setStatus(StatusValue.STATUS_GOOD).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

	@Override
	public void callSync(ChannelMessageRequest request, StreamObserver<ChannelMessageReply> responseObserver) {
		final Future<ChannelMessageReply> replyMessage = pTalkEngineRuntime.channelMessage(request, false);
		try {
			responseObserver.onNext(replyMessage.get());
		} catch (InterruptedException | ExecutionException e) {
			responseObserver.onError(e);
		}
		responseObserver.onCompleted();
	}

	public PTalkEngineRuntime getpTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

	@Override
	public void replyCallAsync(ChannelMessageReply request, StreamObserver<Status> responseObserver) {
		pTalkEngineRuntime.replyFromChannelMessage(request);
		final Status reply = Status.newBuilder().setStatus(StatusValue.STATUS_GOOD).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

}

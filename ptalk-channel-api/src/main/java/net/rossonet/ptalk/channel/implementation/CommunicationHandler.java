package net.rossonet.ptalk.channel.implementation;

import java.time.Instant;

import io.grpc.stub.StreamObserver;
import net.rossonet.ptalk.base.grpc.StatusValue;
import net.rossonet.ptalk.base.grpc.Timestamp;
import net.rossonet.ptalk.channel.grpc.ChannelMessageReply;
import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.channel.grpc.RpcChannelUnitV1Grpc.RpcChannelUnitV1ImplBase;

public abstract class CommunicationHandler extends RpcChannelUnitV1ImplBase {

	protected PTalkChannelRuntime pTalkChannelRuntime;

	@Override
	public void callSync(ChannelMessageRequest request, StreamObserver<ChannelMessageReply> responseObserver) {
		try {
			final boolean status = messageFromPTalkEngine(request);
			if (status) {
				responseObserver.onNext(ChannelMessageReply.newBuilder().setFlowReference(request.getFlowReference())
						.setStatus(StatusValue.STATUS_GOOD)
						.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().toEpochMilli()).build())
						.build());
				responseObserver.onCompleted();
			} else {
				responseObserver.onError(new RuntimeException("error sending message to telegram"));
			}
		} catch (final Exception a) {
			responseObserver.onError(a);
		}
	}

	protected abstract boolean messageFromPTalkEngine(ChannelMessageRequest message);

	public void setChannelRuntime(PTalkChannelRuntime pTalkChannelRuntime) {
		this.pTalkChannelRuntime = pTalkChannelRuntime;

	}

	public abstract void start();
}

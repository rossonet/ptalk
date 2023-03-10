package net.rossonet.ptalk.channel.telegram;

import java.time.Instant;

import io.grpc.stub.StreamObserver;
import net.rossonet.ptalk.base.grpc.StatusValue;
import net.rossonet.ptalk.base.grpc.Timestamp;
import net.rossonet.ptalk.channel.grpc.ChannelMessageReply;
import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.channel.grpc.RpcChannelCoreV1Grpc.RpcChannelCoreV1ImplBase;

public class GrpcChannelTelegramServiceImpl extends RpcChannelCoreV1ImplBase {

	private final PTalkChannelRuntime pTalkChannelRuntime;

	public GrpcChannelTelegramServiceImpl(PTalkChannelRuntime pTalkChannelRuntime) {
		this.pTalkChannelRuntime = pTalkChannelRuntime;
	}

	@Override
	public void callSync(ChannelMessageRequest request, StreamObserver<ChannelMessageReply> responseObserver) {
		try {
			final boolean status = pTalkChannelRuntime.getTelegram().messageFromPtalkEngine(request);
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

}

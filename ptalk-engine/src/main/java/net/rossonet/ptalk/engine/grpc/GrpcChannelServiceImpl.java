package net.rossonet.ptalk.engine.grpc;

import io.grpc.stub.StreamObserver;
import net.rossonet.ptalk.base.grpc.Status;
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
		// TODO Auto-generated method stub
		super.callAsync(request, responseObserver);
	}

	@Override
	public void callSync(ChannelMessageRequest request, StreamObserver<ChannelMessageReply> responseObserver) {
		// TODO Auto-generated method stub
		super.callSync(request, responseObserver);
	}

	public PTalkEngineRuntime getpTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

	@Override
	public void replyCallAsync(ChannelMessageReply request, StreamObserver<Status> responseObserver) {
		// TODO Auto-generated method stub
		super.replyCallAsync(request, responseObserver);
	}

}

package net.rossonet.ptalk.engine.grpc;

import io.grpc.stub.StreamObserver;
import net.rossonet.ptalk.base.grpc.Status;
import net.rossonet.ptalk.engine.PTalkEngineRuntime;
import net.rossonet.ptalk.nlu.grpc.NluMessageReply;
import net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply;
import net.rossonet.ptalk.nlu.grpc.RpcNluCoreV1Grpc.RpcNluCoreV1ImplBase;

public class GrpcNluServiceImpl extends RpcNluCoreV1ImplBase {

	private final PTalkEngineRuntime pTalkEngineRuntime;

	public GrpcNluServiceImpl(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	public PTalkEngineRuntime getpTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

	@Override
	public void replyCallAsync(NluMessageReply request, StreamObserver<Status> responseObserver) {
		// TODO Auto-generated method stub
		super.replyCallAsync(request, responseObserver);
	}

	@Override
	public void replyTrainingModelAsync(NluTrainingModelReply request, StreamObserver<Status> responseObserver) {
		// TODO Auto-generated method stub
		super.replyTrainingModelAsync(request, responseObserver);
	}

}

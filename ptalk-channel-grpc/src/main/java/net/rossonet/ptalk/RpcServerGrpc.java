package net.rossonet.ptalk;

import net.rossonet.ptalk.channel.protobuf.server.grpc.RpcChannelGrpcServerV1Grpc.RpcChannelGrpcServerV1ImplBase;

public class RpcServerGrpc extends RpcChannelGrpcServerV1ImplBase {

	private final ChannelGrpc channelGrpc;

	public RpcServerGrpc(ChannelGrpc channelGrpc) {
		this.channelGrpc = channelGrpc;
		// TODO Auto-generated constructor stub
	}

}

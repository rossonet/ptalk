package net.rossonet.ptalk;

import net.rossonet.ptalk.channel.grpc.RpcChannelUnitV1Grpc.RpcChannelUnitV1ImplBase;

public class RpcChannelUnit extends RpcChannelUnitV1ImplBase {

	private final ChannelGrpc channelGrpc;

	public RpcChannelUnit(ChannelGrpc channelGrpc) {
		this.channelGrpc = channelGrpc;
		// TODO implementare metodi ricezione messagi da core
	}

	public ChannelGrpc getChannelGrpc() {
		return channelGrpc;
	}

}

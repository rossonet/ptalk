package net.rossonet.ptalk.engine.grpc;

import java.util.List;

import net.rossonet.ptalk.base.grpc.Data;

public class ReplyMemoryQuery {

	private final String context;
	private final List<Data> datas;

	public ReplyMemoryQuery(String context, List<Data> datas) {
		this.context = context;
		this.datas = datas;
	}

	public String getContext() {
		return context;
	}

	public List<Data> getDatas() {
		return datas;
	}

}

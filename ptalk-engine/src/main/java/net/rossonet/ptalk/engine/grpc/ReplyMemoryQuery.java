package net.rossonet.ptalk.engine.grpc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import net.rossonet.ptalk.base.grpc.Data;
import net.rossonet.ptalk.engine.runtime.fact.memory.MemoryData;

public class ReplyMemoryQuery {

	private final String context;
	private final List<MemoryData<? extends Serializable>> datas;

	public ReplyMemoryQuery(String context, List<MemoryData<? extends Serializable>> datas) {
		this.context = context;
		this.datas = datas;
	}

	public String getContext() {
		return context;
	}

	public List<Data> getDatas() {
		final List<Data> reply = new ArrayList<>();
		for (final MemoryData<? extends Serializable> data : datas) {
			reply.add(getMemoryData(data));
		}
		return reply;
	}

	private Data getMemoryData(MemoryData<? extends Serializable> data) {
		// TODO convert data to memory data
		return null;
	}

}

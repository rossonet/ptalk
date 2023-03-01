package net.rossonet.ptalk.engine.runtime;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import net.rossonet.ptalk.channel.grpc.ChannelMessageReply;
import net.rossonet.ptalk.engine.PTalkEngineRuntime;

public class NextHopRuntimeEngine {

	// TODO impostare un TTL su un messaggio e tutto quello che genera

	private final PTalkEngineRuntime pTalkEngineRuntime;
	private final Set<Task> tasks = new HashSet<>();

	public NextHopRuntimeEngine(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	public Future<ChannelMessageReply> getMessageReplyFuture(Task task) {
		tasks.add(task);
		return new Future<ChannelMessageReply>() {

			@Override
			public boolean cancel(boolean mayInterruptIfRunning) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public ChannelMessageReply get() throws InterruptedException, ExecutionException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ChannelMessageReply get(long timeout, TimeUnit unit)
					throws InterruptedException, ExecutionException, TimeoutException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean isCancelled() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isDone() {
				// TODO Auto-generated method stub
				return false;
			}

		};
	}

	public Task getTaskByTraceId(String traceId) {
		// TODO Auto-generated method stub
		return null;
	}

}

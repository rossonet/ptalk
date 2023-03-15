package net.rossonet.ptalk.channel.simulation;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Logger;

import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.channel.implementation.CommunicationHandler;

public class FakeCommunicationHandler extends CommunicationHandler {

	private static final Logger logger = Logger.getLogger(FakeCommunicationHandler.class.getName());

	private final ExecutorService executor = Executors.newSingleThreadExecutor();
	private Future<Boolean> future;
	private String reply1 = null;
	private String reply2 = null;
	private final String name1 = "c1s2";
	private final String name2 = "f45g_1";
	private final String message1 = "Hello I'm c1s2!";
	private final String message2 = "Hi";

	private Boolean executeTest() {
		pTalkChannelRuntime.sendMessage(name1, message1);
		logger.info("SENT: " + message1 + " TO " + name1);
		pTalkChannelRuntime.sendMessage(name2, message2);
		logger.info("SENT: " + message2 + " TO " + name2);
		int counter = 0;
		while (reply1 == null || reply2 == null) {
			counter++;
			if (counter > 30) {
				return false;
			}
			try {
				Thread.sleep(1000L);
			} catch (final InterruptedException e) {
				e.printStackTrace();
				return false;
			}
		}
		return (reply1.equals(FakePTalkEngine.ECHO_MESSAGE_PREFIX + message1)
				&& reply2.equals(FakePTalkEngine.ECHO_MESSAGE_PREFIX + message2));
	}

	public boolean isSimulationCompletedSuccessful() throws InterruptedException, ExecutionException {
		return future.get();
	}

	@Override
	protected boolean messageFromPTalkEngine(ChannelMessageRequest message) {
		if (message.getChannelUniqueName().equals(name1)) {
			reply1 = message.getMessage().getValue();
		}
		if (message.getChannelUniqueName().equals(name2)) {
			reply2 = message.getMessage().getValue();
		}
		logger.info("RECEIVED: " + message);
		return true;
	}

	public void start() {
		future = executor.submit(new Callable<Boolean>() {

			@Override
			public Boolean call() throws Exception {
				Thread.sleep(5000L);
				return executeTest();
			}
		});
	}

	public void waitSimulation() throws InterruptedException, ExecutionException {
		future.get();
	}

}

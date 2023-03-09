package net.rossonet.ptalk;

import java.util.logging.Logger;

import net.rossonet.ptalk.engine.GlobalConfiguration;
import net.rossonet.ptalk.engine.PTalkEngineRuntime;
import net.rossonet.ptalk.engine.exceptions.TaskManagerException;

public class MainApp {

	private static final Logger logger = Logger.getLogger(MainApp.class.getName());

	private static PTalkEngineRuntime pTalkEngineRuntime = null;

	public static boolean isRunning() {
		return pTalkEngineRuntime != null ? pTalkEngineRuntime.isRunning() : false;
	}

	public static void main(final String[] args) {
		final GlobalConfiguration configuration = GlobalConfiguration.getNewBuilder().build();
		try {
			pTalkEngineRuntime = new PTalkEngineRuntime(configuration);
		} catch (final TaskManagerException e) {
			e.printStackTrace();
		}
		runAppUntilStop();
	}

	public static void runAppUntilStop() {
		logger.info("system started");
		Thread.currentThread().setName("main");
		while (pTalkEngineRuntime.isRunning()) {
			try {
				logger.info("running");
				synchronized (pTalkEngineRuntime) {
					pTalkEngineRuntime.wait();
				}
			} catch (final Exception e) {
				e.printStackTrace();
			}
		}
		logger.info("system shutdown completed");
	}

}

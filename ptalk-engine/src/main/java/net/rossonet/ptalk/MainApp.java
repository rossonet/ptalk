package net.rossonet.ptalk;

import java.util.logging.Logger;

import net.rossonet.ptalk.engine.PTalkEngineRuntime;

public class MainApp {

	private static final Logger logger = Logger.getLogger(MainApp.class.getName());

	private static PTalkEngineRuntime pTalkEngineRuntime = null;

	public static boolean isRunning() {
		return pTalkEngineRuntime != null ? pTalkEngineRuntime.isRunning() : false;
	}

	public static void main(final String[] args) {
		pTalkEngineRuntime = new PTalkEngineRuntime(false, args);
		runAppUntilStop(pTalkEngineRuntime);
	}

	public static void runAppUntilStop(PTalkEngineRuntime pTalk) {
		logger.info("system started");
		Thread.currentThread().setName("main");
		while (pTalkEngineRuntime.isRunning()) {
			try {
				logger.info("running");
				pTalk.wait();
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}
		}
		logger.info("system shutdown completed");
	}

}

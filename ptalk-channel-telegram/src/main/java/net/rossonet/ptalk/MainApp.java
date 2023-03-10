package net.rossonet.ptalk;

import java.util.logging.Logger;

import net.rossonet.ptalk.channel.telegram.PTalkChannelRuntime;

public class MainApp {

	private static final Logger logger = Logger.getLogger(MainApp.class.getName());

	private static PTalkChannelRuntime pTalkChannelRuntime = null;

	public static boolean isRunning() {
		return pTalkChannelRuntime != null ? pTalkChannelRuntime.isRunning() : false;
	}

	public static void main(final String[] args) {
		try {
			pTalkChannelRuntime = new PTalkChannelRuntime();
		} catch (final Exception e) {
			e.printStackTrace();
		}
		runAppUntilStop();
	}

	public static void runAppUntilStop() {
		logger.info("system started");
		Thread.currentThread().setName("main");
		while (pTalkChannelRuntime.isRunning()) {
			try {
				logger.info("running");
				synchronized (pTalkChannelRuntime) {
					pTalkChannelRuntime.wait();
				}
			} catch (final Exception e) {
				e.printStackTrace();
			}
		}
		logger.info("system shutdown completed");
	}

}

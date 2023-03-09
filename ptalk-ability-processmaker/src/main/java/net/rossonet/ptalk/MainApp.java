package net.rossonet.ptalk;

import java.util.logging.Logger;

public class MainApp {

	private static final Logger logger = Logger.getLogger(MainApp.class.getName());

	private static final long WHILE_DELAY = 60000L;
	private static boolean running = true;

	public static boolean isRunning() {
		return running;
	}

	public static void main(final String[] args) {
		runApp();
	}

	public static void runApp() {
		logger.info("system started");
		Thread.currentThread().setName("main");
		while (running) {
			try {
				Thread.sleep(WHILE_DELAY);
				logger.info("running");
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void setRunning(boolean running) {
		MainApp.running = running;
	}

}

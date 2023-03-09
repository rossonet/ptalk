package net.rossonet.ptalk;

import java.util.logging.Logger;

import org.rossonet.utils.LogHelper;

public class MainApp {

	private static final Logger logger = Logger.getLogger(MainApp.class.getName());

	private static final long WHILE_DELAY = 60000L;

	private static int portInternalService = 4356;

	private static int portExternalService = 8726;

	private static String coreHost = null;

	private static int corePort = 0;

	private static boolean running = true;

	private static ChannelGrpc service;

	public static String getCoreHost() {
		return coreHost;
	}

	public static int getCorePort() {
		return corePort;
	}

	public static int getPortExternalService() {
		return portExternalService;
	}

	public static int getPortInternalService() {
		return portInternalService;
	}

	public static boolean isRunning() {
		return running;
	}

	public static void main(final String[] args) {
		runApp();
	}

	public static void runApp() {
		logger.info("system started");
		Thread.currentThread().setName("main");
		service = new ChannelGrpc(portInternalService, portExternalService, coreHost, corePort);
		while (running) {
			try {
				Thread.sleep(WHILE_DELAY);
				logger.info("running");
			} catch (final InterruptedException e) {
				logger.severe(LogHelper.stackTraceToString(e));
			}
		}
		try {
			service.shutdown();
		} catch (final InterruptedException e) {
			logger.severe(LogHelper.stackTraceToString(e));
		}
	}

	public static void setCoreHost(String coreHost) {
		MainApp.coreHost = coreHost;
	}

	public static void setCorePort(int corePort) {
		MainApp.corePort = corePort;
	}

	public static void setPortExternalService(int portExternalService) {
		MainApp.portExternalService = portExternalService;
	}

	public static void setPortInternalService(int portInternalService) {
		MainApp.portInternalService = portInternalService;
	}

	public static void setRunning(boolean running) {
		MainApp.running = running;
	}

}

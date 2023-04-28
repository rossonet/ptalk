package net.rossonet.ptalk.channel.telegram;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import net.rossonet.ptalk.base.grpc.LifecycleStatus;
import net.rossonet.ptalk.channel.implementation.PTalkChannelRuntime;
import net.rossonet.ptalk.channel.implementation.UnitChannelConfiguration;
import net.rossonet.ptalk.channel.simulation.FakePTalkEngine;

public class TelegramInteractionTests {

	private static final ExecutorService EXECUTOR_SERVICE = Executors.newCachedThreadPool();

	private static final String ADDRESS = "127.0.0.1";

	private static final int UNIT_PORT = 11254;

	private static final int CORE_PORT = 11256;

	private static final long SLEEP = 20 * 60000; // n minuti

	private FakePTalkEngine ptalkEngine = null;

	private final String uniqueName = UUID.randomUUID().toString();
	private LifecycleStatus lifecycleStatus = LifecycleStatus.INIT;
	private static final Logger logger = Logger.getLogger(TelegramConnector.class.getName());
	private TelegramConnector telegramConnector;
	private PTalkChannelRuntime pTalkChannelRuntime;

	@Test
	public void tryDialog() {
		try {
			ptalkEngine = new FakePTalkEngine(EXECUTOR_SERVICE, ADDRESS, UNIT_PORT, CORE_PORT);
			final UnitChannelConfiguration unitConfiguration = new UnitChannelConfiguration();
			unitConfiguration.setParameter(PTalkChannelRuntime.LOCAL_GRPC_PORT_ENV, String.valueOf(UNIT_PORT));
			unitConfiguration.setParameter(PTalkChannelRuntime.ENGINE_GRPC_PORT_ENV, String.valueOf(CORE_PORT));
			unitConfiguration.setParameter(PTalkChannelRuntime.ENGINE_GRPC_HOST_ENV, ADDRESS);
			unitConfiguration.setParameter(PTalkChannelRuntime.MY_HOST_ENV, ADDRESS);
			unitConfiguration.setParameter(PTalkChannelRuntime.UNIQUENAME_ENV, uniqueName);
			unitConfiguration.setParameter(PTalkChannelRuntime.IS_REGISTER_UNIT_ENV, "false");
			telegramConnector = new TelegramConnector();
			pTalkChannelRuntime = new PTalkChannelRuntime(unitConfiguration, telegramConnector);
			telegramConnector.setChannelRuntime(pTalkChannelRuntime);
			Thread.sleep(SLEEP);
			telegramConnector.close();			
			ptalkEngine.close(); 
		} catch (final Exception a) {
			logger.severe("Error: " + a.getMessage());
			if (ptalkEngine != null) {
				try {
					ptalkEngine.close();
				} catch (final IOException e) {
					logger.severe("Error: " + e.getMessage());
				}
			}
		}
	}

	@Test
	public void tryClose() {
		try {
			ptalkEngine = new FakePTalkEngine(EXECUTOR_SERVICE, ADDRESS, UNIT_PORT, CORE_PORT);
			final UnitChannelConfiguration unitConfiguration = new UnitChannelConfiguration();
			unitConfiguration.setParameter(PTalkChannelRuntime.LOCAL_GRPC_PORT_ENV, String.valueOf(UNIT_PORT));
			unitConfiguration.setParameter(PTalkChannelRuntime.ENGINE_GRPC_PORT_ENV, String.valueOf(CORE_PORT));
			unitConfiguration.setParameter(PTalkChannelRuntime.ENGINE_GRPC_HOST_ENV, ADDRESS);
			unitConfiguration.setParameter(PTalkChannelRuntime.MY_HOST_ENV, ADDRESS);
			unitConfiguration.setParameter(PTalkChannelRuntime.UNIQUENAME_ENV, uniqueName);
			unitConfiguration.setParameter(PTalkChannelRuntime.IS_REGISTER_UNIT_ENV, "false");
			telegramConnector = new TelegramConnector();
			telegramConnector.setChannelRuntime(pTalkChannelRuntime);
			pTalkChannelRuntime = new PTalkChannelRuntime(unitConfiguration, telegramConnector);
			telegramConnector.close();
			ptalkEngine.close(); 
		}catch (IOException e1) {
			logger.severe("Error: " + e1.getMessage());
		} catch (Exception e) {
			logger.severe("Error: " + e.getMessage());
		}
	}	
}

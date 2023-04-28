package net.rossonet.ptalk.channel.simulation;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.jupiter.api.Test;

import net.rossonet.ptalk.channel.implementation.PTalkChannelRuntime;
import net.rossonet.ptalk.channel.implementation.UnitChannelConfiguration;

public class ChannelInteractionTests {

	private static final ExecutorService EXECUTOR_SERVICE = Executors.newCachedThreadPool();

	private static final String ADDRESS = "127.0.0.1";

	private static final int UNIT_PORT = 11214;

	private static final int CORE_PORT = 11216;

	private static void closeEngine(FakePTalkEngine engine) {
		try {
			engine.close();
		} catch (final IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void main(final String[] args) {
		FakePTalkEngine engine = null;
		try {
			engine = new FakePTalkEngine(EXECUTOR_SERVICE, ADDRESS, UNIT_PORT, CORE_PORT);
			System.out.println("Fake engine started, press CTRL + C to exit");
			while (true) {
				Thread.sleep(Long.MAX_VALUE);
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
		if (engine != null) {
			closeEngine(engine);
		}
		System.out.println("Fake engine closed");
	}

	private FakePTalkEngine ptalkEngine = null;

	private final String uniqueName = UUID.randomUUID().toString();

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
			final PTalkChannelRuntime pTalkChannelRuntime = new PTalkChannelRuntime(unitConfiguration,
					new FakeCommunicationHandler());
			final FakeCommunicationHandler fakeCommunicationHandler = (FakeCommunicationHandler) pTalkChannelRuntime
					.getCommunicationHandler();
			fakeCommunicationHandler.waitSimulation();
			assertTrue(fakeCommunicationHandler.isSimulationCompletedSuccessful());
			ptalkEngine.close();
		} catch (final Exception a) {
			a.printStackTrace();
			if (ptalkEngine != null) {
				try {
					ptalkEngine.close();
				} catch (final IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

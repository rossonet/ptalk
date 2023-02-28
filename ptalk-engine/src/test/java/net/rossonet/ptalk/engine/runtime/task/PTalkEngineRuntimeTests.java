package net.rossonet.ptalk.engine.runtime.task;

import org.json.JSONObject;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import net.rossonet.ptalk.engine.GlobalConfiguration;
import net.rossonet.ptalk.engine.PTalkEngineRuntime;

public class PTalkEngineRuntimeTests {

	private static PTalkEngineRuntime pTalkEngineRuntime = null;

	@BeforeAll
	public static void createRuntime() {
		final GlobalConfiguration configuration = GlobalConfiguration.getNewBuilder().build();
		pTalkEngineRuntime = new PTalkEngineRuntime(configuration);

	}

	@AfterAll
	public static void terminateRuntime() {
		pTalkEngineRuntime.stop();
	}

	@Test
	public void createRuntimeAndPushConfiguration() {
		System.out.println(pTalkEngineRuntime.toString());
	}

	@Test
	public void importExportBaseConfiguration() {
		final JSONObject configuration = pTalkEngineRuntime.getJsonConfiguration();
		System.out.println(configuration.toString(2));
		// TODO completare con import
	}

}

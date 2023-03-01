package net.rossonet.ptalk.engine.runtime.task;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import net.rossonet.ptalk.engine.GlobalConfiguration;
import net.rossonet.ptalk.engine.PTalkEngineRuntime;
import net.rossonet.ptalk.engine.exceptions.TaskManagerException;

public class PTalkEngineRuntimeTests {

	private static PTalkEngineRuntime pTalkEngineRuntime = null;

	@BeforeAll
	public static void createRuntime() {
		final GlobalConfiguration configuration = GlobalConfiguration.getNewBuilder().setHazelcastEmbedded(true)
				.build();
		pTalkEngineRuntime = new PTalkEngineRuntime(configuration);

	}

	@AfterAll
	public static void terminateRuntime() {
		pTalkEngineRuntime.stop();
	}

	@Test
	public void createPTalkEngineRuntime() {
		System.out.println(pTalkEngineRuntime.toString());
	}

	@Test
	public void importExportBaseConfiguration() throws TaskManagerException {
		final JSONObject jsonTaskConfiguration = new JSONObject();
		jsonTaskConfiguration.put("name", "test task1");
		final JSONArray pre = new JSONArray("[\n" + "  {\n" + "    \"name\": \"adult rule\",\n"
				+ "    \"description\": \"when age is greater than 18, then mark as adult\",\n"
				+ "    \"priority\": 1,\n" + "    \"condition\": \"person.age > 18\",\n" + "    \"actions\": [\n"
				+ "      \"person.setAdult(true);\"\n" + "    ]\n" + "  },\n" + "  {\n"
				+ "    \"name\": \"weather rule\",\n"
				+ "    \"description\": \"when it rains, then take an umbrella\",\n" + "    \"priority\": 2,\n"
				+ "    \"condition\": \"rain == true\",\n" + "    \"actions\": [\n"
				+ "      \"sout:println(\\\"It rains, take an umbrella!\\\");\"\n" + "    ]\n" + "  }\n" + "]");
		final JSONArray post = new JSONArray("[\n" + "  {\n" + "    \"name\": \"Movie id rule\",\n"
				+ "    \"compositeRuleType\": \"UnitRuleGroup\",\n" + "    \"priority\": 1,\n"
				+ "    \"composingRules\": [\n" + "      {\n" + "        \"name\": \"Time is evening\",\n"
				+ "        \"description\": \"If it's later than 7pm\",\n" + "        \"priority\": 1,\n"
				+ "        \"condition\": \"day.hour > 19\",\n" + "        \"actions\": [\n"
				+ "          \"person.shouldProvideId(true);\"\n" + "        ]\n" + "      },\n" + "      {\n"
				+ "        \"name\": \"Movie is rated R\",\n"
				+ "        \"description\": \"If the movie is rated R\",\n" + "        \"priority\": 1,\n"
				+ "        \"condition\": \"movie.rating == R\",\n" + "        \"actions\": [\n"
				+ "          \"person.shouldProvideId(true);\"\n" + "        ]\n" + "      }\n" + "    ]\n" + "  },\n"
				+ "  {\n" + "    \"name\": \"weather rule\",\n"
				+ "    \"description\": \"when it rains, then take an umbrella\",\n" + "    \"priority\": 1,\n"
				+ "    \"condition\": \"rain == True\",\n" + "    \"actions\": [\n"
				+ "      \"sout:println(\\\"It rains, take an umbrella!\\\");\"\n" + "    ]\n" + "  }\n" + "]");
		final JSONArray main = new JSONArray("[\n" + "  {\n" + "    \"name\": \"Movie id rule\",\n"
				+ "    \"compositeRuleType\": \"UnitRuleGroup\",\n" + "    \"priority\": 1,\n"
				+ "    \"condition\": \"true\",\n" + "    \"actions\": [\n" + "      \"sout:println();\"\n" + "    ],\n"
				+ "    \"composingRules\": [\n" + "      {\n" + "        \"name\": \"Time is evening\",\n"
				+ "        \"description\": \"If it's later than 7pm\",\n" + "        \"priority\": 1,\n"
				+ "        \"condition\": \"day.hour > 19\",\n" + "        \"actions\": [\n"
				+ "          \"person.shouldProvideId(true);\"\n" + "        ]\n" + "      },\n" + "      {\n"
				+ "        \"name\": \"Movie is rated R\",\n"
				+ "        \"description\": \"If the movie is rated R\",\n" + "        \"priority\": 1,\n"
				+ "        \"condition\": \"movie.rating == R\",\n" + "        \"actions\": [\n"
				+ "          \"person.shouldProvideId(true);\"\n" + "        ]\n" + "      }\n" + "    ]\n" + "  }\n"
				+ "]");
		jsonTaskConfiguration.put("pre-rules", pre);
		jsonTaskConfiguration.put("post-rules", post);
		jsonTaskConfiguration.put("main-rules", main);
		pTalkEngineRuntime.getConfigurationTasksManager().addOrUpdateTaskConfiguration(jsonTaskConfiguration);
		final JSONObject configuration = pTalkEngineRuntime.getJsonConfiguration();
		System.out.println(configuration.toString(2));
		pTalkEngineRuntime.replaceJsonConfiguration(configuration);
	}

	@Test
	public void importFromString() throws TaskManagerException {
		final String configuration = "{\n" + "  \"global-configuration\": {\n" + "    \"scheduler-thread-size\": 4,\n"
				+ "    \"hazelcast-embedded\": true,\n" + "    \"input-channel\": \"input-channel\",\n"
				+ "    \"grpc-server-port\": 8080\n" + "  },\n" + "  \"configuration-type\": \"ptalk_conf_v.1.0\",\n"
				+ "  \"task-configuration\": {\"test task1\": {\n" + "    \"main-rules\": [{\n"
				+ "      \"condition\": \"true\",\n" + "      \"name\": \"Movie id rule\",\n"
				+ "      \"composingRules\": [\n" + "        {\n" + "          \"condition\": \"day.hour > 19\",\n"
				+ "          \"name\": \"Time is evening\",\n"
				+ "          \"description\": \"If it's later than 7pm\",\n" + "          \"priority\": 1,\n"
				+ "          \"actions\": [\"person.shouldProvideId(true);\"]\n" + "        },\n" + "        {\n"
				+ "          \"condition\": \"movie.rating == R\",\n" + "          \"name\": \"Movie is rated R\",\n"
				+ "          \"description\": \"If the movie is rated R\",\n" + "          \"priority\": 1,\n"
				+ "          \"actions\": [\"person.shouldProvideId(true);\"]\n" + "        }\n" + "      ],\n"
				+ "      \"priority\": 1,\n" + "      \"actions\": [\"sout:println();\"],\n"
				+ "      \"compositeRuleType\": \"UnitRuleGroup\"\n" + "    }],\n" + "    \"post-rules\": [\n"
				+ "      {\n" + "        \"name\": \"Movie id rule\",\n" + "        \"composingRules\": [\n"
				+ "          {\n" + "            \"condition\": \"day.hour > 19\",\n"
				+ "            \"name\": \"Time is evening\",\n"
				+ "            \"description\": \"If it's later than 7pm\",\n" + "            \"priority\": 1,\n"
				+ "            \"actions\": [\"person.shouldProvideId(true);\"]\n" + "          },\n" + "          {\n"
				+ "            \"condition\": \"movie.rating == R\",\n"
				+ "            \"name\": \"Movie is rated R\",\n"
				+ "            \"description\": \"If the movie is rated R\",\n" + "            \"priority\": 1,\n"
				+ "            \"actions\": [\"person.shouldProvideId(true);\"]\n" + "          }\n" + "        ],\n"
				+ "        \"priority\": 1,\n" + "        \"compositeRuleType\": \"UnitRuleGroup\"\n" + "      },\n"
				+ "      {\n" + "        \"condition\": \"rain == True\",\n" + "        \"name\": \"weather rule\",\n"
				+ "        \"description\": \"when it rains, then take an umbrella\",\n" + "        \"priority\": 1,\n"
				+ "        \"actions\": [\"sout:println(\\\"It rains, take an umbrella!\\\");\"]\n" + "      }\n"
				+ "    ],\n" + "    \"name\": \"test task1\",\n" + "    \"execution-parameters\": {\n"
				+ "      \"extensions-manager-name\": \"extensions-manager\",\n"
				+ "      \"super-manager-name\": \"super-manager\",\n"
				+ "      \"nlu-communication-name\": \"nlu-communication\",\n"
				+ "      \"post-time-unit\": \"milliseconds\",\n" + "      \"pre-time-unit\": \"milliseconds\",\n"
				+ "      \"ability-communication-name\": \"ability-communication\",\n"
				+ "      \"next-name\": \"next\",\n" + "      \"memory-manager-name\": \"memory-manager\",\n"
				+ "      \"timeout-pre-execution\": \"60000\",\n" + "      \"main-time-unit\": \"milliseconds\",\n"
				+ "      \"ai-manager-name\": \"ai-manager\"\n" + "    },\n" + "    \"pre-rules\": [\n" + "      {\n"
				+ "        \"condition\": \"rain == true\",\n" + "        \"name\": \"weather rule\",\n"
				+ "        \"description\": \"when it rains, then take an umbrella\",\n" + "        \"priority\": 2,\n"
				+ "        \"actions\": [\"sout:println(\\\"It rains, take an umbrella!\\\");\"]\n" + "      },\n"
				+ "      {\n" + "        \"condition\": \"person.age > 18\",\n" + "        \"name\": \"adult rule\",\n"
				+ "        \"description\": \"when age is greater than 18, then mark as adult\",\n"
				+ "        \"priority\": 1,\n" + "        \"actions\": [\"person.setAdult(true);\"]\n" + "      }\n"
				+ "    ]\n" + "  }}\n" + "}";
		System.out.println("\n\n" + configuration + "\n\n");
		pTalkEngineRuntime.replaceJsonConfiguration(configuration);
		final JSONObject json = pTalkEngineRuntime.getJsonConfiguration();
		System.out.println(json.toString(2));
	}

}

package net.rossonet.ptalk.engine.runtime.task;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.google.common.io.Resources;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import net.rossonet.ptalk.base.grpc.Data;
import net.rossonet.ptalk.channel.grpc.ChannelMessageReply;
import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.channel.grpc.RpcChannelCoreV1Grpc;
import net.rossonet.ptalk.channel.grpc.RpcChannelCoreV1Grpc.RpcChannelCoreV1BlockingStub;
import net.rossonet.ptalk.engine.GlobalConfiguration;
import net.rossonet.ptalk.engine.PTalkEngineRuntime;
import net.rossonet.ptalk.engine.exceptions.TaskManagerException;

public class SimpleRuleTests {

	private static PTalkEngineRuntime pTalkEngineRuntime = null;

	@BeforeAll
	public static void createRuntime() throws TaskManagerException {
		final GlobalConfiguration configuration = GlobalConfiguration.getNewBuilder().setHazelcastEmbedded(true)
				.build();
		pTalkEngineRuntime = new PTalkEngineRuntime(configuration);
	}

	@AfterAll
	public static void terminateRuntime() {
		pTalkEngineRuntime.stop();
	}

	private RpcChannelCoreV1BlockingStub getInputChannel() {
		final ManagedChannel mc = ManagedChannelBuilder
				.forAddress("127.0.0.1", GlobalConfiguration.DEFAULT_GRPC_SERVER_PORT).usePlaintext().build();
		return RpcChannelCoreV1Grpc.newBlockingStub(mc);
	}

	private void loadSingleRule() throws IOException, TaskManagerException, JSONException {
		System.out.println(pTalkEngineRuntime.toString());
		final URL url = Resources.getResource("one-rule/echo-channel.json");
		final String configuration = Resources.toString(url, StandardCharsets.UTF_8);
		System.out.println("\n\n" + configuration + "\n\n");
		pTalkEngineRuntime.replaceJsonConfiguration(configuration);
		final JSONObject json = pTalkEngineRuntime.getJsonConfiguration();
		System.out.println(json.toString(2));
	}

	@Test
	public void loadSingleRuleConfiguration() throws TaskManagerException, IOException {
		loadSingleRule();
		final RpcChannelCoreV1BlockingStub inputChannel = getInputChannel();
		final String checkValue = UUID.randomUUID().toString();
		final ChannelMessageRequest request = ChannelMessageRequest.newBuilder()
				.setChannelUniqueMessageId(UUID.randomUUID().toString())
				.setMessage(Data.newBuilder().setValue(checkValue).build()).build();
		final ChannelMessageReply reply = inputChannel.callSync(request);
		System.out.println(reply.toString());
	}

	@Test
	public void sendOneMessageToChannel() throws TaskManagerException, IOException {
		loadSingleRule();

	}

}

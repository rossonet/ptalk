package net.rossonet.ptalk.engine.hazelcast;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.client.config.ClientUserCodeDeploymentConfig;
import com.hazelcast.config.Config;
import com.hazelcast.core.EntryEvent;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.durableexecutor.DurableExecutorService;
import com.hazelcast.map.IMap;
import com.hazelcast.map.listener.EntryAddedListener;
import com.hazelcast.map.listener.MapListener;
import com.hazelcast.query.Predicate;
import com.hazelcast.query.Predicates;
import com.hazelcast.replicatedmap.ReplicatedMap;

public class HazelcastStudy {

	private static HazelcastInstance hzServer = null;

	@AfterAll
	private static void closeServer() {
		hzServer.shutdown();
	}

	@BeforeAll
	private static void runServer() {
		final Config clusterConfig = new Config();
		clusterConfig.setClusterName("dev");
		clusterConfig.getNetworkConfig().setPort(5777);
		clusterConfig.getJetConfig().setEnabled(true);
		clusterConfig.getUserCodeDeploymentConfig().setEnabled(true);
		hzServer = Hazelcast.newHazelcastInstance(clusterConfig);
	}

	private HazelcastInstance hz = null;

	// private final String hazelcastEndpoint = "127.0.0.1:5701";
	private final String hazelcastEndpoint = "127.0.0.1:5777";

	@AfterEach
	private void closeConnection() {
		hz.shutdown();
	}

	@BeforeEach
	private void connectToHazelcast() {
		final ClientConfig clientConfig = new ClientConfig();
		clientConfig.setClusterName("dev");
		clientConfig.getNetworkConfig().addAddress(hazelcastEndpoint);
		deployClasses(clientConfig);
		hz = HazelcastClient.newHazelcastClient(clientConfig);

	}

	private void deployClasses(ClientConfig clientConfig) {
		final ClientUserCodeDeploymentConfig clientUserCodeDeploymentConfig = new ClientUserCodeDeploymentConfig();
		clientUserCodeDeploymentConfig.addClass(HazelcastExampleData.class.getCanonicalName());
		clientUserCodeDeploymentConfig.addClass(ExampleJobCallable.class.getCanonicalName());
		clientUserCodeDeploymentConfig.addClass(ResultObject.class.getCanonicalName());
		clientUserCodeDeploymentConfig.setEnabled(true);
		clientConfig.setUserCodeDeploymentConfig(clientUserCodeDeploymentConfig);

	}

	@Test
	@Order(1)
	public void firstTest() {
		final ReplicatedMap<String, String> map = hz.getReplicatedMap("my-replicated-map");
		map.clear();
		map.put("first", "value");
		assertEquals("value", map.get("first"));
		map.putIfAbsent("somekey", "somevalue");
		map.replace("first", "value", "newvalue");
		assertEquals("newvalue", map.get("first"));
	}

	@Test
	@Order(3)
	public void remoteServiceTest() throws InterruptedException, ExecutionException, TimeoutException {
		final AtomicLong firstCounter = new AtomicLong(0);
		final AtomicLong secondCounter = new AtomicLong(0);
		final IMap<Long, HazelcastExampleData> map = hz.getMap("my-replicated-objects-map");
		map.clear();
		final Predicate<Long, HazelcastExampleData> predicateFirst = Predicates
				.not(Predicates.equal("dataText1", null));
		final Predicate<Long, HazelcastExampleData> predicateSecond = Predicates
				.not(Predicates.equal("dataText2", null));
		final MapListener listenerFirst = new EntryAddedListener<Long, HazelcastExampleData>() {
			@Override
			public void entryAdded(EntryEvent<Long, HazelcastExampleData> event) {
				System.out.println("FIRST: " + event);
				firstCounter.getAndAdd(1);
			}
		};
		final MapListener listenerSecond = new EntryAddedListener<Long, HazelcastExampleData>() {
			@Override
			public void entryAdded(EntryEvent<Long, HazelcastExampleData> event) {
				System.out.println("SECOND: " + event);
				secondCounter.getAndAdd(1);
			}
		};
		map.addEntryListener(listenerFirst, predicateFirst, true);
		map.addEntryListener(listenerSecond, predicateSecond, true);
		final DurableExecutorService executorService = hz.getDurableExecutorService("executorService");
		final Future<ResultObject> future = executorService.submit(new ExampleJobCallable(100000));
		final ResultObject result = future.get(60, TimeUnit.SECONDS);
		Thread.sleep(10000);
		assertEquals(firstCounter.get(), result.getFirstParameter());
		assertEquals(secondCounter.get(), result.getSecondParameter());
	}

	@Test
	@Order(2)
	public void sqlTest() {
		final HazelcastExampleData firstObject = new HazelcastExampleData();
		firstObject.setDataText1("ciao");
		firstObject.setDataText2("accessorio");
		firstObject.setBool(true);
		firstObject.setNumber(19);
		final HazelcastExampleData secondObject = new HazelcastExampleData();
		secondObject.setDataText1("welcome");
		secondObject.setDataText2("data base");
		secondObject.setBool(true);
		secondObject.setNumber(13);
		final HazelcastExampleData thirdObject = new HazelcastExampleData();
		thirdObject.setDataText1("bonjour");
		thirdObject.setDataText2("baguette");
		final IMap<Long, HazelcastExampleData> map = hz.getMap("my-replicated-objects-map");
		map.clear();
		map.put(firstObject.getId(), firstObject);
		map.put(secondObject.getId(), secondObject);
		map.put(thirdObject.getId(), thirdObject);
		final Predicate<Long, HazelcastExampleData> sqlQuery = Predicates.sql("bool AND number BETWEEN 13 AND 18)");
		final Predicate<Long, HazelcastExampleData> criteriaQuery = Predicates.and(Predicates.equal("bool", false),
				Predicates.ilike("DataText2", "Baguette"));
		final Collection<HazelcastExampleData> result1 = map.values(sqlQuery);
		final Collection<HazelcastExampleData> result2 = map.values(criteriaQuery);
		// Print out the results
		System.out.println(result1);
		assertEquals(1, result1.size());
		assertEquals(secondObject.getId(), result1.toArray(new HazelcastExampleData[0])[0].getId());
		System.out.println(result2);
		assertEquals(1, result2.size());
		assertEquals(thirdObject.getId(), result2.toArray(new HazelcastExampleData[0])[0].getId());
	}

}

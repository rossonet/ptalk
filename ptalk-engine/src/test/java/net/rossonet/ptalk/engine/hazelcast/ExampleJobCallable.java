package net.rossonet.ptalk.engine.hazelcast;

import java.io.Serializable;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.HazelcastInstanceAware;
import com.hazelcast.map.IMap;

public class ExampleJobCallable implements Callable<ResultObject>, Serializable, HazelcastInstanceAware {

	private static final long serialVersionUID = -202014542041195670L;
	private long howMany = 1L;
	private HazelcastInstance hazelcastInstance;

	public ExampleJobCallable(long howMany) {
		this.howMany = howMany;
	}

	@Override
	public ResultObject call() throws Exception {
		final Random rd = new Random();
		final ResultObject result = new ResultObject();
		final IMap<Long, HazelcastExampleData> map = hazelcastInstance.getMap("my-replicated-objects-map");
		for (long i = 1; i < howMany; i++) {
			final String data = UUID.randomUUID().toString();
			final HazelcastExampleData record = new HazelcastExampleData();
			if (rd.nextBoolean()) {
				result.incrementFirst();
				record.setDataText1(data);
			} else {
				result.incrementSecond();
				record.setDataText2(data);
			}
			record.setNumber(i);
			map.set(record.getId(), record);
		}
		return result;
	}

	@Override
	public void setHazelcastInstance(HazelcastInstance hazelcastInstance) {
		this.hazelcastInstance = hazelcastInstance;

	}

}

package net.rossonet.ptalk.engine;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.jeasy.rules.api.Facts;
import org.json.JSONObject;

import net.rossonet.ptalk.ability.grpc.AbilityMessageReply;
import net.rossonet.ptalk.base.grpc.LifecycleStatus;
import net.rossonet.ptalk.channel.grpc.ChannelMessageReply;
import net.rossonet.ptalk.channel.grpc.ChannelMessageRequest;
import net.rossonet.ptalk.engine.exceptions.TaskManagerException;
import net.rossonet.ptalk.engine.grpc.GrpcCoreService;
import net.rossonet.ptalk.engine.runtime.fact.PTalkFactFactory;
import net.rossonet.ptalk.engine.runtime.fact.NextHop.NextHopSchedulerType;
import net.rossonet.ptalk.nlu.grpc.NluMessageReply;
import net.rossonet.ptalk.nlu.grpc.NluTrainingModelReply;
import net.rossonet.ptalk.utils.JsonHelper;

public class PTalkEngineRuntime {

//TODO impostare un TTL su un messaggio e tutto quello che genera

	private final HazelcastInstanceBuilder hazelcastInstanceBuilder;

	private final ConfigurationTasksManager configurationTasksManager;

	private final PTalkFactFactory memoryManagerFactFactory;

	private final PTalkFactFactory nextHopManagerFactFactory;

	private final PTalkFactFactory nluCommunicationFactFactory;

	private final PTalkFactFactory superManagerFactFactory;

	private final PTalkFactFactory aiManagerFactFactory;

	private final PTalkFactFactory extensionsManagerFactFactory;

	private final PTalkFactFactory abilityCommunicationFactFactory;

	private final PTalkFactFactory[] allPTalkFactFactory;
	private final ExecutionLogger executionLogger;

	private LifecycleStatus lifecycleStatus = LifecycleStatus.INIT;

	private final GrpcCoreService grpcCoreService;

	private final ExecutorService normalScheduler;
	private final ExecutorService lowScheduler;
	private final ExecutorService hightScheduler;

	private final GlobalConfiguration globalConfiguration;

	private final MemoryManager memoryManager;

	public PTalkEngineRuntime(GlobalConfiguration configuration) {
		this.globalConfiguration = configuration;
		hazelcastInstanceBuilder = new HazelcastInstanceBuilder(this);
		configurationTasksManager = new ConfigurationTasksManager(this);
		memoryManagerFactFactory = new MemoryManagerFactFactory(this);
		nextHopManagerFactFactory = new NextHopManagerFactFactory(this);
		nluCommunicationFactFactory = new NluCommunicationFactFactory(this);
		superManagerFactFactory = new SuperManagerFactFactory(this);
		aiManagerFactFactory = new AiManagerFactFactory(this);
		extensionsManagerFactFactory = new ExtensionsManagerFactFactory(this);
		abilityCommunicationFactFactory = new AbilityCommunicationFactFactory(this);
		executionLogger = new ExecutionLogger(this);
		memoryManager = new MemoryManager(this);
		lifecycleStatus = LifecycleStatus.CONFIGURED;
		normalScheduler = Executors.newFixedThreadPool(globalConfiguration.getNormalSchedulerThreadSize());
		lowScheduler = Executors.newSingleThreadExecutor();
		hightScheduler = Executors.newCachedThreadPool();
		grpcCoreService = new GrpcCoreService(this, globalConfiguration.getGrpcServerPort());
		allPTalkFactFactory = new PTalkFactFactory[] { superManagerFactFactory, memoryManagerFactFactory,
				nextHopManagerFactFactory, abilityCommunicationFactFactory, nluCommunicationFactFactory,
				aiManagerFactFactory, extensionsManagerFactFactory };
		updateConfigurationAllFactories();
		lifecycleStatus = LifecycleStatus.RUNNING;
	}

	public Future<ChannelMessageReply> channelMessage(ChannelMessageRequest request, boolean async) {
		// TODO call from channels
		return null;
	}

	public AbilityCommunicationFactFactory getAbilityCommunicationFactFactory() {
		return (AbilityCommunicationFactFactory) abilityCommunicationFactFactory;
	}

	public AiManagerFactFactory getAiManagerFactFactory() {
		return (AiManagerFactFactory) aiManagerFactFactory;
	}

	public ConfigurationTasksManager getConfigurationTasksManager() {
		return configurationTasksManager;
	}

	public ExecutionLogger getExecutionLogger() {
		return executionLogger;
	}

	public ExtensionsManagerFactFactory getExtensionsManagerFactFactory() {
		return (ExtensionsManagerFactFactory) extensionsManagerFactFactory;
	}

	public GlobalConfiguration getGlobalConfiguration() {
		return globalConfiguration;
	}

	public GrpcCoreService getGrpcAbilityCoreService() {
		return grpcCoreService;
	}

	public HazelcastInstanceBuilder getHazelcastInstanceBuilder() {
		return hazelcastInstanceBuilder;
	}

	public ExecutorService getHightScheduler() {
		return hightScheduler;
	}

	public JSONObject getJsonConfiguration() {
		return JsonHelper.generateJsonConfiguration(globalConfiguration, configurationTasksManager);
	}

	public LifecycleStatus getLifecycleStatus() {
		return lifecycleStatus;
	}

	public ExecutorService getLowScheduler() {
		return lowScheduler;
	}

	public MemoryManager getMemoryManager() {
		return memoryManager;
	}

	public MemoryManagerFactFactory getMemoryManagerFactFactory() {
		return (MemoryManagerFactFactory) memoryManagerFactFactory;
	}

	public NextHopManagerFactFactory getNextHopManagerFactFactory() {
		return (NextHopManagerFactFactory) nextHopManagerFactFactory;
	}

	public NluCommunicationFactFactory getNluCommunicationFactFactory() {
		return (NluCommunicationFactFactory) nluCommunicationFactFactory;
	}

	public ExecutorService getNormalScheduler() {
		return normalScheduler;
	}

	public SuperManagerFactFactory getSuperManagerFactFactory() {
		return (SuperManagerFactFactory) superManagerFactFactory;
	}

	public boolean isRunning() {
		return lifecycleStatus.equals(LifecycleStatus.RUNNING);
	}

	public void replaceJsonConfiguration(JSONObject jsonConfiguration) throws TaskManagerException {
		JsonHelper.updateJsonConfiguration(jsonConfiguration, globalConfiguration, configurationTasksManager);
		updateConfigurationAllFactories();
	}

	public void replyFromAbilityMessage(AbilityMessageReply request) {
		// TODO replyFromAbilityMessage

	}

	public Future<ChannelMessageReply> replyFromChannelMessage(ChannelMessageReply request) {
		// TODO reply of async channle message
		return null;
	}

	public void replyFromNluCall(NluMessageReply request) {
		// TODO reply From NLU call

	}

	public void replyFromNluTrainingRequest(NluTrainingModelReply request) {
		// TODO reply From NLU training request

	}

	public void stop() {
		try {
			grpcCoreService.shutdown();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		try {
			hazelcastInstanceBuilder.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		try {
			configurationTasksManager.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		try {
			memoryManagerFactFactory.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		try {
			nextHopManagerFactFactory.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		try {
			nluCommunicationFactFactory.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		try {
			superManagerFactFactory.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		try {
			aiManagerFactFactory.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		try {
			extensionsManagerFactFactory.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		try {
			abilityCommunicationFactFactory.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		try {
			executionLogger.close();
		} catch (final Exception e) {
			executionLogger.logGlobalException(e);
		}
		lifecycleStatus = LifecycleStatus.STOPPED;
		synchronized (this) {
			notifyAll();
		}
	}

	public Future<Facts> submit(NextHopSchedulerType nextHopSchedulerType, Callable<Facts> task) {
		Future<Facts> result;
		switch (nextHopSchedulerType) {
		case HAZELCAST:
			result = hazelcastInstanceBuilder.getScheduler().submit(task);
			break;
		case LOCAL:
			result = normalScheduler.submit(task);
			break;
		case LOCAL_HIGH_PRIORITY:
			result = hightScheduler.submit(task);
			break;
		case LOCAL_LOW_PRIORITY:
			result = lowScheduler.submit(task);
			break;
		default:
			result = normalScheduler.submit(task);
			break;
		}
		return result;
	}

	private void updateConfigurationAllFactories() {
		for (final PTalkFactFactory ff : allPTalkFactFactory) {
			ff.updateConfiguration();
		}
	}

}

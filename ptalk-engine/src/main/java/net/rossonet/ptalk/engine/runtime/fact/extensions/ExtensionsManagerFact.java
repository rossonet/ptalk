package net.rossonet.ptalk.engine.runtime.fact.extensions;

import org.jeasy.rules.api.Fact;

import net.rossonet.ptalk.engine.runtime.Task;
import net.rossonet.ptalk.engine.runtime.fact.PTalkFact;

public class ExtensionsManagerFact implements PTalkFact {

	private final Task runtime;

	public ExtensionsManagerFact(Task runtime) {
		this.runtime = runtime;
	}

	public void addFact(String name, PTalkFact fact) {
		runtime.getWorkingFacts().add(new Fact<>(name, fact));
	}

	@Override
	public String getTraceId() {
		return runtime.getTraceId();
	}

	public String getType(Object message) {
		return message.getClass().getName();
	}

	public void println(Object message) {
		System.out.println(message);
	}

	public void println(String message) {
		System.out.println(message);
	}
}

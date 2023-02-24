package net.rossonet.ptalk.engine.runtime.callable;

import java.util.concurrent.Callable;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;

import net.rossonet.ptalk.engine.runtime.Task;

public class RulesEngineRunnerCallable implements Callable<Facts> {

	private final Rules rules;
	private final Facts facts;
	private final Task task;

	public RulesEngineRunnerCallable(Task task, Rules rules, Facts facts) {
		this.task = task;
		this.rules = rules;
		this.facts = facts;
	}

	@Override
	public Facts call() throws Exception {
		final RulesEngine rulesEngine = new DefaultRulesEngine();
		rulesEngine.getRuleListeners().add(task);
		rulesEngine.getRulesEngineListeners().add(task);
		rulesEngine.fire(rules, facts);
		return facts;
	}

}

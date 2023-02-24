package net.rossonet.ptalk.engine.rules;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.StringReader;

import org.jeasy.rules.api.Fact;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.jeasy.rules.mvel.MVELRule;
import org.jeasy.rules.mvel.MVELRuleFactory;
import org.jeasy.rules.support.reader.JsonRuleDefinitionReader;
import org.jeasy.rules.support.reader.YamlRuleDefinitionReader;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class EasyRulesStudy {

	public class Person {
		int age = 5;
		boolean allowed = false;
		private boolean adult;

		public Person(int years) {
			age = years;
		}

		public int getAge() {
			return age;
		}

		public boolean isAdult() {
			return adult;
		}

		public boolean isAllowed() {
			return allowed;
		}

		public void setAdult(boolean adult) {
			this.adult = adult;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setAllowed(boolean allowed) {
			this.allowed = allowed;
		}
	}

	private Rules createJsonRule() throws Exception {
		final MVELRuleFactory ruleFactory = new MVELRuleFactory(new JsonRuleDefinitionReader());
		final String jsonRules = "[\n" + "  {\n" + "    \"name\": \"alcohol rule not allowed\",\n"
				+ "    \"description\": \"children are not allowed to buy alcohol\",\n" + "    \"priority\": 2,\n"
				+ "    \"condition\": \"person.isAdult() == false\",\n" + "    \"actions\": [\n"
				+ "      \"System.out.println(\\\"Shop: Sorry, you are not allowed to buy alcohol\\\");\",\n"
				+ "      \"person.setAllowed(false);\"\n" + "    ]\n" + "  },\n" + "  {\n"
				+ "    \"name\": \"alcohol rule allowed\",\n"
				+ "    \"description\": \"children are not allowed to buy alcohol\",\n" + "    \"priority\": 2,\n"
				+ "    \"condition\": \"person.isAdult() == true\",\n" + "    \"actions\": [\n"
				+ "      \"System.out.println(\\\"Shop: Ok, you are allowed to buy alcohol\\\");\",\n"
				+ "      \"person.setAllowed(true);\"\n" + "    ]\n" + "  }\n" + "]";
		System.out.println("RULE\n" + jsonRules);
		final Rules rules = ruleFactory.createRules(new StringReader(jsonRules));
		return rules;
	}

	@Test
	@Order(1)
	public void firstMVELRuleFromJsonFire() throws Exception {
		final Rules rules = createJsonRule();
		final Rule ruleCalcolate = new MVELRule().name("age rule")
				.description("Check if person's age is > 18 and marks the person as adult").priority(1)
				.when("person.getAge() > 18").then("person.setAdult(true);");
		rules.register(ruleCalcolate);
		final Person person = new Person(25);
		final Fact<Person> fact = new Fact<Person>("person", person);
		final Facts facts = new Facts();
		facts.add(fact);
		final RulesEngine rulesEngine = new DefaultRulesEngine();
		rulesEngine.fire(rules, facts);
		assertTrue(fact.getValue().isAllowed());
	}

	@Test
	@Order(2)
	public void firstMVELRuleFromYamlFire() throws Exception {
		final MVELRuleFactory ruleFactory = new MVELRuleFactory(new YamlRuleDefinitionReader());
		final String yamlRules = "---\n" + "name: adult rule\n"
				+ "description: when age is greater than 18, then mark as adult\n" + "priority: 1\n"
				+ "condition: \"person.getAge() > 18\"\n" + "actions:\n" + "  - \"person.setAdult(true);\"\n";
		final Rules rules = ruleFactory.createRules(new StringReader(yamlRules));
		for (final Rule r : createJsonRule()) {
			rules.register(r);
		}
		final Person person = new Person(37);
		final Fact<Person> fact = new Fact<Person>("person", person);
		final Facts facts = new Facts();
		facts.add(fact);
		final RulesEngine rulesEngine = new DefaultRulesEngine();
		rulesEngine.fire(rules, facts);
		assertTrue(fact.getValue().isAllowed());
	}

}

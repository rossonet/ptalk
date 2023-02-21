package net.rossonet.ptalk.engine.rules;

import java.io.StringReader;

import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.mvel.MVELRule;
import org.jeasy.rules.mvel.MVELRuleFactory;
import org.jeasy.rules.support.reader.JsonRuleDefinitionReader;
import org.jeasy.rules.support.reader.YamlRuleDefinitionReader;

public class EasyRulesStudy {

	public void firstMVELRuleFire() {
		final Rule rule = new MVELRule().name("age rule")
				.description("Check if person's age is > 18 and marks the person as adult").priority(1)
				.when("person.age > 18").then("person.setAdult(true);");
	}

	public void firstMVELRuleFromJsonFire() throws Exception {
		final MVELRuleFactory ruleFactory = new MVELRuleFactory(new JsonRuleDefinitionReader());
		final String jsonRules = "[\n" + "  {\n" + "    \"name\": \"alcohol rule\",\n"
				+ "    \"description\": \"children are not allowed to buy alcohol\",\n" + "    \"priority\": 2,\n"
				+ "    \"condition\": \"person.isAdult() == false\",\n" + "    \"actions\": [\n"
				+ "      \"System.out.println(\\\"Shop: Sorry, you are not allowed to buy alcohol\\\");\"\n" + "    ]\n"
				+ "  }\n" + "]";
		final Rules rules = ruleFactory.createRules(new StringReader(jsonRules));
	}

	public void firstMVELRuleFromYamlFire() throws Exception {
		final MVELRuleFactory ruleFactory = new MVELRuleFactory(new YamlRuleDefinitionReader());
		final String yamlRules = "---\n" + "name: adult rule\n"
				+ "description: when age is greater than 18, then mark as adult\n" + "priority: 1\n"
				+ "condition: \"person.age > 18\"\n" + "actions:\n" + "  - \"person.setAdult(true);\"\n" + "---\n"
				+ "name: weather rule\n" + "description: when it rains, then take an umbrella\n" + "priority: 2\n"
				+ "condition: \"rain == true\"\n" + "actions:\n"
				+ "  - \"System.out.println(\\\"It rains, take an umbrella!\\\");\"";
		final Rules rules = ruleFactory.createRules(new StringReader(yamlRules));
	}

}

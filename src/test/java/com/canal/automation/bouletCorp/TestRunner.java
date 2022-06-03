package com.canal.automation.bouletCorp;


	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;
	import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

	import org.junit.runner.RunWith;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features={"src/spec/features"},
			plugin={"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"},
			//glue= {""},
			tags= ("@aleatoire_ok"),
			snippets=CAMELCASE,
			monochrome=true
			)
	public class TestRunner {

	}



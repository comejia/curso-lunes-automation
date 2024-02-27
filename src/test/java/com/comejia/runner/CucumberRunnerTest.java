package com.comejia.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.comejia.stepDefinitions", "com.comejia.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

}

package org.example.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/org/example/Cucumber", glue = "org.example.StepDefinition",
monochrome = true,plugin = {"html:target/cucumber.html"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests {




}

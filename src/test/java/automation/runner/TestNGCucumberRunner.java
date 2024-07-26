package com.automation.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.automation.steps",
        plugin = {"pretty", "html:target/cucumber-reports.html",}

)
public class TestNGCucumberRunner extends AbstractTestNGCucumberTests {


}
package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "json:target/cucumber2.json",
        features = "src/test/resources/features/GoogleSearch.feature",
        glue = "com/cybertek/stepDefinitions"
)
public class GoogleParallelRunner {
}

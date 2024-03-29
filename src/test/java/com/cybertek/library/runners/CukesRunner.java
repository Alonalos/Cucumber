package com.cybertek.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/default-cucumber-reports",
        "rerun:target/return.txt",
        "json:target/cucumber.json"},

        features ="src/test/resources/features",
        glue="com/cybertek/library/step_definitions",
        dryRun=false,
        tags="@hw"

)

public class CukesRunner {

}

package com.cybertek.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/main/resources/features",
        glue="com/cybertek/library/step_definitions",
        dryRun=false,
        tags="@wip"

)

public class CukesRunner {

}

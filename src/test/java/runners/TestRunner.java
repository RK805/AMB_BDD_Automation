package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",   // Feature files location
        glue = {"stepdefinitions", "hooks"},       // Step defs & hooks packages
        plugin = {
                "pretty",
                "html:reports/html-report",
                "json:reports/json-report.json"
        },
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

}

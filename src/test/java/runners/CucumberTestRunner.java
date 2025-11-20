package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ConfigReader;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefinitions", "hooks"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "json:target/cucumber.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        monochrome = true
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

    static {
        ConfigReader.setBrowser(ConfigReader.get("browser"));
        ConfigReader.setEnvironment(ConfigReader.get("env"));

        System.out.println("🚀 Browser: " + ConfigReader.getBrowser());
        System.out.println("🌍 Environment: " + ConfigReader.getEnvironment());
        System.out.println("🔗 URL: " + ConfigReader.get("url"));
    }
}

package RunnerFile;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "org.RbcRoyalBank_StepDefination",
        plugin = { "com.aventstack.chaintest.plugins.ChainTestCucumberListener:" ,"pretty", "html:target/cucumber-report.html"},
        monochrome = true
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
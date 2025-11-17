package hooks;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import reports.ExtentManager;
import utilities.DriverFactory;
import utilities.Log;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class Hooks {

    public static WebDriver driver;
    private static ExtentReports extent = ExtentManager.getInstance();
    public static ExtentTest test;
    private static final org.apache.logging.log4j.Logger log = Log.getLogger(Hooks.class);


    @Before
    public void beforeScenario(Scenario scenario) {driver = DriverFactory.initializeDriver("chrome");
        test = extent.createTest(scenario.getName());
        log.info("Scenario started: " + scenario.getName());
        test.log(Status.INFO, "Scenario started: " + scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario) throws IOException {
        LocalDate today = LocalDate.now();
        String screenshotFolder = "reports/screenshots/" + today;
        new File(screenshotFolder).mkdirs();

        if (scenario.isFailed()) {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String path = screenshotFolder + "/" + scenario.getName() + ".png";
            FileUtils.copyFile(src, new File(path));
            log.error("Scenario failed: " + scenario.getName());
            test.fail("Scenario failed",
                    com.aventstack.extentreports.MediaEntityBuilder.createScreenCaptureFromPath(path).build());
        } else {
            log.info("Scenario passed: " + scenario.getName());
            test.pass("Scenario passed");
        }

        driver.quit();
        extent.flush();
    }

    public static WebDriver getDriver() {
        return driver;
    }

}

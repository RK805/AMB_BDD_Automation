package hooks;

import io.cucumber.java.*;
import utilities.ConfigReader;
import utilities.DriverFactory;
import utilities.ExtentTestManager;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.monte.screenrecorder.ScreenRecorder;
import utilities.VideoRecorder;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;

public class Hooks {

    private static final Logger log = LogManager.getLogger(Hooks.class);
    private WebDriver driver;
    private ScreenRecorder screenRecorder;

    @Before
    public void setup(Scenario scenario) {

        log.info("------ STARTING SCENARIO: {} ------", scenario.getName());

        ExtentTestManager.startTest(scenario.getName());

        String browser = ConfigReader.getBrowser();
        String env = ConfigReader.getEnvironment();

        log.info("Initializing WebDriver → Browser: {} | Env: {}", browser, env);
        DriverFactory.initDriver(browser, env);
        driver = DriverFactory.getDriver();

        // Start video recording for scenario
        try {
            File folder = new File("reports/videos");
            if (!folder.exists()) folder.mkdirs();

            screenRecorder = VideoRecorder.startRecording(folder, scenario.getName());
            log.info("🎥 Video recording started for scenario: {}", scenario.getName());
        } catch (Exception e) {
            log.error("❌ Failed to start video recording: {}", e.getMessage(), e);
        }

        // Allure log
        Allure.addAttachment("Test Started", "Scenario Name: " + scenario.getName());
    }

    @After
    public void teardown(Scenario scenario) {

        // Stop video recording and rename file
        if (screenRecorder != null) {
            try {
                screenRecorder.stop();

                File folder = new File("reports/videos");
                File recordedFile = screenRecorder.getCreatedMovieFiles().get(0);
                File renamedFile = new File(folder, scenario.getName().replaceAll("[^a-zA-Z0-9.-]", "_") + ".avi");
                recordedFile.renameTo(renamedFile);

                log.info("🎥 Video saved for scenario {} at: {}", scenario.getName(), renamedFile.getAbsolutePath());

                // Optionally attach video to Allure
                Allure.addAttachment("Execution Video", Files.newInputStream(Paths.get(renamedFile.getAbsolutePath())));

            } catch (Exception e) {
                log.error("❌ Failed to stop/rename video recording: {}", e.getMessage(), e);
            }
        }

        if (scenario.isFailed()) {
            log.error("❌ Scenario FAILED: {} — capturing screenshot", scenario.getName());

            try {
                File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

                String folder = "reports/screenshots/" + LocalDate.now();
                new File(folder).mkdirs();

                String time = LocalTime.now().toString().replace(":", "-");
                String filePath = folder + "/" + scenario.getName() + "_" + time + ".png";

                File dest = new File(filePath);
                FileUtils.copyFile(src, dest);

                // Attach screenshot to Cucumber report
                scenario.attach(FileUtils.readFileToByteArray(dest), "image/png", "Failed Screenshot");

                // Attach screenshot to Extent report
                ExtentTestManager.getTest().addScreenCaptureFromPath(filePath);

                // Attach screenshot to Allure
                Allure.addAttachment("Failed Screenshot", Files.newInputStream(Paths.get(filePath)));

                log.info("📸 Screenshot saved at: {}", filePath);

            } catch (Exception e) {
                log.error("❌ Failed to capture screenshot: {}", e.getMessage(), e);
            }
        }

        log.info("Closing Browser for scenario: {}", scenario.getName());
        DriverFactory.quitDriver();

        log.info("------ END OF SCENARIO ------");
    }

    @Attachment(value = "Execution Logs", type = "text/plain")
    public byte[] attachLogFile() {
        try {
            return Files.readAllBytes(Paths.get("logs/testng-info.log"));
        } catch (Exception e) {
            return "Log file not found".getBytes();
        }
    }
}

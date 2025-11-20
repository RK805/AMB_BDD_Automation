package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driverThread = new ThreadLocal<>();

    private static final Logger log = LogManager.getLogger(DriverFactory.class);

    public static WebDriver getDriver() {
        return driverThread.get();
    }

    public static void initDriver(String browser, String env) {
        WebDriver driver;

        log.info("Initializing WebDriver → Browser: {}, Env: {}", browser, env);

        if ("local".equalsIgnoreCase(env)) {
            driver = initLocalDriver(browser);
        } else {
            throw new RuntimeException("Environment not supported: " + env);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigReader.getInt("implicitWait")));

        driverThread.set(driver);

        log.info("✅ WebDriver initialized successfully → {}", browser);
    }

    private static WebDriver initLocalDriver(String browser) {

        switch (browser.toLowerCase()) {

            case "chrome":
                log.info("Launching Chrome browser");
                return new ChromeDriver(new ChromeOptions());

            case "firefox":
                log.info("Launching Firefox browser");
                return new FirefoxDriver(new FirefoxOptions());

            case "edge":
                log.info("Launching Edge browser");
                return new EdgeDriver(new EdgeOptions());

            default:
                throw new RuntimeException("❌ Browser not supported: " + browser);
        }
    }

    public static void quitDriver() {
        WebDriver driver = driverThread.get();

        if (driver != null) {
            try {
                log.info("Quitting WebDriver");
                driver.quit();
            } catch (Exception e) {
                log.error("❌ Failed to quit WebDriver", e);
            } finally {
                driverThread.remove();
                log.info("Driver removed from ThreadLocal");
            }
        }
    }
}

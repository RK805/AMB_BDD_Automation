package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class BrowserLaunchUtility extends BasePage{

    public BrowserLaunchUtility(WebDriver driver) {
        super(driver);
    }

    public static WebDriver getLocalDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            return  new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            return new FirefoxDriver();
        }
        throw new IllegalArgumentException("Unsupported browser: " + browser);
    }

    public static WebDriver getRemoteDriver(String browser, String remoteUrl) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser);
        return new RemoteWebDriver(new URL(remoteUrl), capabilities);
    }

}
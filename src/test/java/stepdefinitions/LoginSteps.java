package stepdefinitions;

import base.BaseTest;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.WebElementUtility;

public class LoginSteps extends BaseTest {

    private static final Logger log = LogManager.getLogger(LoginSteps.class);

    private LoginPage login;

    @Given("user opens login page")
    public void browserOpen() {

        log.info("🔧 Fetching driver from Hooks");
        login = new LoginPage(driver);

        try {
            String url = ConfigReader.getUrl();
            log.info("🌍 Navigating to URL: {}", url);
            driver.get(url);

            String expectedTitle = "AMB TestLab Mutual Funds";
            String actualTitle = driver.getTitle();

            log.info("🔎 Validating page title: {}", actualTitle);
            Assert.assertEquals(actualTitle, expectedTitle);

            log.info("👉 Clicking on Login button");
            login.clickOnTheLoginButton();

        } catch (Exception e) {
            log.error("❌ Error during login page validation: {}", e.getMessage(), e);
            Assert.fail(e.getMessage());
        }
    }

    @And("user enters username and password")
    public void userEntersUsernameAndPassword() {

        try {
            log.info("⌨ Entering login credentials");
            login.enterTheLoginDetails();
            WebElementUtility.shortWait(driver);

        } catch (Exception e) {
            log.error("❌ Error entering credentials: {}", e.getMessage(), e);
            Assert.fail(e.getMessage());
        }
    }

    @Then("close the Browser")
    public void closeTheBrowser() {
        log.info("🛑 Closing browser");
        quitDriver();
    }
}

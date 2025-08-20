package RbcRoyalBank_Pages;

import Utility.BasePage;
import Utility.WebElementUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RbcRoyal_RRSF_FutureValueCalculatorPage extends BasePage {

    private WebDriver driver;

    public RbcRoyal_RRSF_FutureValueCalculatorPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public static By investmentValue = By.xpath("//div[contains(@style,'display')]/following::input[@id='current-value-input']");
    public static By rateOfReturn = By.xpath("//div[@id='average-tooltip']/following::input[@id='rate-of-return-input']");
    public static By numberOfyears = By.xpath("//div//input[@id='years-until-retirement']");
    public static By CalculateButton = By.xpath("//button[text()='Calculate']");
    public static By valueOfInvestmentPrices = By.xpath("//h2[@id='years-retirement-result']/following::p[@id='value-years-result']/span");
    public static By recalculateButton = By.xpath("//button[text()='Recalculate']");

    public void enterInvestmentValue(String value) {
        WebElementUtility.implicitWait(driver, 5);
        WebElementUtility.sendkeysToElement(driver, investmentValue, value);
    }

    public void enterRateOfReturn(String rate) {
        WebElementUtility.implicitWait(driver, 5);
        WebElementUtility.clickElement(driver, rateOfReturn);
        WebElementUtility.sendkeysToElement(driver, rateOfReturn, rate);
    }

    public void enterNumberOfYears(String years) throws InterruptedException {
        WebElementUtility.implicitWait(driver, 5);
        WebElementUtility.scrollToElement(driver, numberOfyears);
        WebElementUtility.mouseHoverAndClick(driver, numberOfyears);
        WebElementUtility.sendkeysToElement(driver, numberOfyears, years);
    }

    public void clickCalculateButton() {
        WebElementUtility.implicitWait(driver, 5);
        WebElementUtility.JSclickElement(driver, CalculateButton);
    }

    public String getValueOfInvestment() {
        WebElementUtility.implicitWait(driver, 5);
        return WebElementUtility.getElementText(driver,valueOfInvestmentPrices );
    }

    public void clickRecalculateButton() {
        WebElementUtility.clickElement(driver, recalculateButton);
    }
}

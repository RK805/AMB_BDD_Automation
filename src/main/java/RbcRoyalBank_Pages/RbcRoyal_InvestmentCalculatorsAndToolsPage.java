package RbcRoyalBank_Pages;

import Utility.BasePage;
import Utility.WebElementUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RbcRoyal_InvestmentCalculatorsAndToolsPage extends BasePage {

    private WebDriver driver;

    public RbcRoyal_InvestmentCalculatorsAndToolsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public static By RRSPFutureValueCalculatorLink = By.xpath("//span[text()='RRSP Future Value Calculator']");
    public static By GICSelect = By.xpath("//span[text()='GIC Selector']");
    public static By EquityLinkedGICReturnCalculator = By.xpath("//span[text()='Equity-Linked GIC Return Calculator']");


    public void clickRRSPFutureValueCalculatorLink() {
        WebElementUtility.implicitWait(driver, 5);
        WebElementUtility.JSclickElement(driver, RRSPFutureValueCalculatorLink);
    }

    public void clickEquityLinkedGICReturnCalculator() {
        WebElementUtility.implicitWait(driver, 20);
        WebElementUtility.scrollToElement(driver, GICSelect);
        WebElementUtility.mouseHoverAndClick(driver, EquityLinkedGICReturnCalculator);
    }
}

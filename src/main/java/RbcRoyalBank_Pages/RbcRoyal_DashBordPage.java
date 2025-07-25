package RbcRoyalBank_Pages;


import Utility.BasePage;
import Utility.BrowserUtility;
import Utility.WebElementUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RbcRoyal_DashBordPage extends BasePage {

    By Investments=By.xpath("//a[text()='Investments' and @data-dig-action='Click Button']");
    By Investments_mutualFunds=By.xpath("//a[contains(@data-dig-label,'Investments - Mutual Funds')]");
    By Investments_AllInvestmentTools=By.xpath("//a[contains(@data-dig-label,'Investments - All Investment Tools & calculators')]");
    By allCalculate=By.xpath("//a[normalize-space()='All Investment Tools & Calculators']");


    public RbcRoyal_DashBordPage(WebDriver driver) {
        super(driver);
    }
    public void InvestmentsClick() {
        RbcRoyal_DashBordPage rbcRoyal_dashBordPage = new RbcRoyal_DashBordPage(driver);
       WebElementUtility.implicitWait(driver, 10);
        WebElementUtility.mouseHover(driver, Investments);
        WebElementUtility.mouseHoverAndClick(driver, Investments_mutualFunds);
    }
    public void AllInvestmentToolsClick() {
        RbcRoyal_DashBordPage rbcRoyal_dashBordPage = new RbcRoyal_DashBordPage(driver);
        WebElementUtility.mouseHover(driver, Investments);
        WebElementUtility.mouseHoverAndClick(driver, Investments_AllInvestmentTools);
    }


}

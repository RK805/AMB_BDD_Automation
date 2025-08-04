package RbcRoyalBank_Pages;


import Utility.BasePage;
import Utility.BrowserUtility;
import Utility.WebElementUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RbcRoyal_DashBordPage extends BasePage {

    private static final String HOME_PAGE_URL = "https://www.rbcroyalbank.com/";

    By Investments=By.xpath("//a[text()='Investments' and @data-dig-action='Click Button']");
    By Investments_mutualFunds=By.xpath("//a[contains(@data-dig-label,'Investments - Mutual Funds')]");
    By Investments_AllInvestmentTools=By.xpath("//a[contains(@data-dig-label,'Investments - All Investment Tools & calculators')]");
    By allCalculate=By.xpath("//a[normalize-space()='All Investment Tools & Calculators']");


    public RbcRoyal_DashBordPage(WebDriver driver) {
        super(driver);
    }

    public void navigateTOHomePage() {
        driver.get(HOME_PAGE_URL);
    }

    public void InvestmentsClick() {
        WebElementUtility.clickElement(driver, Investments);

    }

    public void AllInvestmentToolsClick() {
        WebElementUtility.clickElement(driver, Investments_AllInvestmentTools);
    }


}

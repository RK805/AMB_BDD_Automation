package RbcRoyalBank_Pages;

import Utility.BasePage;
import Utility.BrowserUtility;
import Utility.WebElementUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v136.network.Network;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.event.ChangeListener;
import java.util.ArrayList;
import java.util.List;

public class RbcRoyal_investmentPage extends BasePage {

    private WebDriver driver;

    public RbcRoyal_investmentPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public static By  Investments = By.xpath("//a[text()='Investments' and @data-dig-action='Click Button']");
    public static By Investments_mutualFunds = By.xpath("//a[contains(@data-dig-label,'Investments - Mutual Funds')]");
    public static  By MutualFunds = By.xpath("//a[@data-dig-label='pbmenu - Investments - Mutual Funds']");
    public static  By InvestmentPerformanceSnapshot = By.xpath("//span[text()='Investment Performance Snapshot']");
    public static  By InvestmentPerformanceSnapshotText = By.xpath("//h1[text()='Investment Performance Snapshot']");
    public static  By placeHolder = By.xpath("//input[@placeholder='Select fund']");
    public static  By ListOfThePlaceHolder = By.xpath("//ul[@class='rbc-autocomplete-search-results']/li");
    public static  By SelectSeriesTextBox = By.xpath("//div[contains(@class,'rbc-dropdown')]/child::button[normalize-space()='Select series']");
    public static  By listOfTheSeriesTextBox = By.xpath("//ul[@role='listbox']/li[normalize-space()='A' or normalize-space()='O'or normalize-space()='D' or normalize-space()='F']");
    public static  By InitialInvestment = By.xpath("//input[@placeholder='Initial investment']");
    public static  By ContributionAmount = By.xpath("//input[@placeholder='Contribution amount']");
    public static  By FrequencyTextBox = By.xpath("//button[@aria-expanded='false' and @data-selected='BIWEEKLY' or data-selected='WEEKLY' or data-selected='MONTHLY'][1]");
    public static  By selectingWeeklyOption = By.xpath("//li[@aria-selected='true' and normalize-space()='Weekly']");
    public static  By AnnualIncrese = By.xpath("//span[text()='Annual increase ']/../following-sibling::rbc-dropdown//following::button[normalize-space()='Select'][1]");
    public static  By DONotApplyOption = By.xpath("//li[@aria-selected='true' and normalize-space()='Do not apply']");
    public static  By WithdrawalAmount = By.xpath("//label[normalize-space()='Withdrawal amount']/../following::input");
    public static  By ViewFundPerformanceButton = By.xpath("//slot[normalize-space()='View fund performance']/..");
    // Investment Performance Snapshot view
    public static By InitialInvestmentPrice = By.xpath("//p[normalize-space()='Initial investment']/following-sibling::div");
    public static By TotalDistributionsPrice = By.xpath("//p[normalize-space()='Total distributions']/following-sibling::div/div/h4");
    // scenario:2
    public static By allInvestmentToolsAndCalculatorsLink = By.xpath("//div//a[normalize-space()='All Investment Tools & Calculators']");
    public static By Loans = By.xpath("//a[text()='Loans' and @data-dig-action='Click Button']");
    public static By personalLoans = By.xpath("//a[contains(@data-dig-label,'Personal Loans')]");

    public void clickMutualFunds() {
        WebElementUtility.implicitWait(driver, 10);
        WebElementUtility.waitForElementVisible(driver, Investments, 10);
          WebElementUtility.mouseHover(driver, Investments);
          WebElementUtility.mouseHoverAndClick(driver, Investments_mutualFunds);
    }

    public void clickInvestmentPerformanceSnapshot() {
        WebElementUtility.implicitWait(driver, 10);
        WebElementUtility.scrollToElement(driver, InvestmentPerformanceSnapshot);
        WebElementUtility.JSclickElement(driver, InvestmentPerformanceSnapshot);
    }

    public void waitForInvestmentPerformanceSnapshotText() {
       // WebElementUtility.waitForElementVisible(driver, InvestmentPerformanceSnapshotText, 10);
       BrowserUtility.switchToTabByIndex(driver, 1);
    }

    public void enterFundInPlaceHolder() {
        WebElementUtility.implicitWait(driver, 5);
        WebElementUtility.clickElement(driver, placeHolder);
        WebElementUtility.sendkeysToElement(driver, placeHolder, "BlueBay $U.S. Global High Yield Bond Fund (Canada)");
        WebElementUtility.ListOfElement(driver, ListOfThePlaceHolder, "BlueBay $U.S. Global High Yield Bond Fund (Canada)");
    }
    public  void clickSelectSeries()  {
        System.out.println("Clicking on Select Series");
        WebElementUtility.implicitWait(driver, 5);
        WebElementUtility.JSclickElement(driver, SelectSeriesTextBox);
        WebElementUtility.ListOfElement(driver, listOfTheSeriesTextBox, "F");
    }

    public void  getListOfSeriesTextBoxOptions() {
        WebElementUtility.implicitWait(driver, 10);

    }

    public void enterInitialInvestment(String investment) {
        WebElementUtility.clickElement(driver, InitialInvestment);
        WebElementUtility.enterText(driver, InitialInvestment, investment);
    }

    public void enterContributionAmount(String contribution) {
        WebElementUtility.clickElement(driver, ContributionAmount);
        WebElementUtility.enterText(driver, ContributionAmount, contribution);
    }

    public void clickFrequencyTextBox() {
        WebElementUtility.clickElement(driver,FrequencyTextBox);
        WebElementUtility.JSclickElement(driver, selectingWeeklyOption);
    }
    public void clickAnnualIncrease() {
        WebElementUtility.clickElement(driver, AnnualIncrese);
        WebElementUtility.JSclickElement(driver, DONotApplyOption);
    }
    public void enterWithdrawalAmount(String withdrawal) {
        WebElementUtility.clickElement(driver, WithdrawalAmount);
        WebElementUtility.enterText(driver, WithdrawalAmount, withdrawal);    }

    public void clickViewFundPerformanceButton() {
        WebElementUtility.JSclickElement(driver, ViewFundPerformanceButton);
    }

    public void checkInvestmentPerformanceSnapshotView() {
        WebElementUtility.getElementText(driver, InitialInvestmentPrice);
        WebElementUtility.getElementText(driver, TotalDistributionsPrice);
        BrowserUtility.closeBrowser(driver);

    }

   public void clickAllInvestmentToolsAndCalculators() {
       WebElementUtility.implicitWait(driver, 10);
       WebElementUtility.waitForElementVisible(driver, Investments, 10);
       WebElementUtility.mouseHover(driver, Investments);
        WebElementUtility.mouseHoverAndClick(driver,allInvestmentToolsAndCalculatorsLink);
    }

    public void clickPersonalLoans() {

        WebElementUtility.implicitWait(driver, 10);
        WebElementUtility.waitForElementVisible(driver, Loans, 10);
        WebElementUtility.mouseHover(driver, Loans);
        WebElementUtility.JSclickElement(driver, personalLoans);
    }

}


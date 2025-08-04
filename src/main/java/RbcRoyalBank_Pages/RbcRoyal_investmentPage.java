package RbcRoyalBank_Pages;

import Utility.BasePage;
import Utility.BrowserUtility;
import Utility.WebElementUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class RbcRoyal_investmentPage extends BasePage {

    private WebDriver driver;

    public RbcRoyal_investmentPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public static By  Investments = By.xpath("//a[text()='Investments' and @data-dig-action='Click Button']");
    public static By Investments_mutualFunds = By.xpath("//a[@aria-controls='section-content-mutual-funds-etfs-stocks']");
    public static  By MutualFunds = By.xpath("//h1[text()='Mutual Funds']");
    public static  By InvestmentPerformanceSnapshot = By.xpath("//span[text()='Investment Performance Snapshot']/..");
    public static  By InvestmentPerformanceSnapshotText = By.xpath("//h1[text()='Investment Performance Snapshot']");
    public static  By placeHolder = By.xpath("//input[@placeholder='Select fund']");
    public static  By ListOfThePlaceHolder = By.xpath("//ul[@class='rbc-autocomplete-search-results']/li");
    public static  By SelectSeriesTextBox = By.xpath("//button[text()='Select series ']");
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
    public static By AdditionalContributionsPrice = By.xpath("//p[normalize-space()='Additional contributions']/following-sibling::div");
    public static By TotalDistributionsPrice = By.xpath("//p[normalize-space()='Total distributions']/following-sibling::div/div/h4");
    public static By RateOfReturnPrice1Value = By.xpath("//p[text()=' Rate of return']/following::div/div/h4");
    public static By RateOfReturnPrice2Value = By.xpath("//p[text()=' Rate of return']/following::div/div/h5");
    public static By WithOutAnnuIncreasePrice = By.xpath("//p[text()=' Rate of return']/following::div/following::p[text()=' without annu. increase']/../h4");
    public static By WithAnnuIncerasePrice = By.xpath("//p[text()=' Rate of return']/following::div/following::p[text()=' with annu. increase']/../h5");

    // scenario:2
    public static By InvestmentCalculatorsAndToolsPage = By.xpath("//h1[text()='Investment Calculators and Tools']");
    public static By allCalculate = By.xpath("//a[normalize-space()='All Investment Tools & Calculators']");
    public static By RRSPValue = By.xpath("//span[text()='RRSP Future Value Calculator']");
    public static By RRSPValueText = By.xpath("//h1[text()='RRSP Future Value Calculator']");
    public static By investmentValue = By.xpath("//input[@id='current-value-input']");
    //   public static By investment = By.xpath("//input[@id='current-value-input']");
    //   public static By ErrorMassageInvestment = By.xpath("//span[contains(text(),'The entry made in the \"Number of years until retirement\"')]");
    public static By rateOfReturn = By.xpath("//input[@id='rate-of-return-input']");
    public static By numberOfyears = By.xpath("//input[@id='years-until-retirement']");
    public static By CalculateButton = By.xpath("//button[text()='Calculate']");
    public static By valueOfInvestment = By.xpath("//h2[text()='Value of your investments in ']/following::p");
    public static By recalculateButton = By.xpath("//button[text()='Recalculate']");
    // scenario:3
    //static  By allCalculate=By.xpath("//a[normalize-space()='All Investment Tools & Calculators']");
    public static By RRSPCalculator = By.xpath("//a[@ga-event-label='RSP Matic Calculator - Calculate']");
    public static By RRSPCalculatorText = By.xpath("//h1[text()='RRSP Calculator']");
    public static By planToRetireYear = By.xpath("//input[@data-dig-label='RRSP - years']");
    public static By contributionAmount = By.xpath("//input[@id='contribution']");
    public static By contributionFrequency = By.xpath("//select[@id='frequency']");
    public static By RateOfReturn = By.xpath("//input[@id='rate']");
    public static By calculateButton = By.xpath("//a[text()='Calculate']");
    public static By couldSaveAmount = By.xpath("//h2[text()='You could save ']/span");

    //scenario:4
    //  static  By allCalculate=By.xpath("//a[normalize-space()='All Investment Tools & Calculators']");
    public static By GICReturns = By.xpath("//span[text()='Equity-Linked GIC Return Calculator']/..");
    public static By GICReturnsText = By.xpath("//h1[text()='Equity-Linked GIC Return Calculator']");
    public static By InitialInvestmentAmount = By.xpath("//input[@id='principalamount']");
    public static By datePicker = By.xpath("//input[@class='date-picker-btn']");
    public static By years = By.xpath("//div[@class='datepicker--nav-title -disabled-']");
    public static By all_year = By.xpath("//div[@class='datepicker--cells datepicker--cells-years']/div");
    public static By select_year = By.xpath("//div[@class='datepicker--cell datepicker--cell-year -current-']");
    public static By all_month = By.xpath("//div[@class='datepicker--cells datepicker--cells-years']/div");
    public static By all_Month = By.xpath("//div[@class='datepicker--cells datepicker--cells-months']/div");
    public static By select_month = By.xpath("//div[text()='May']");
    public static By all_date = By.xpath("//div[@class='datepicker--cells datepicker--cells-days']/div");
    public static By select_date = By.xpath("//div[@data-date='1' and @data-month='4' and @data-year='2025']");
    public static By GIC_redioButten = By.xpath("//label[contains(@data-dig-label,' MarketSmart GIC Guaranteed Minimum Return')]");
    public static By GIC_usM = By.xpath("//label[contains(@data-dig-label,'- U.S. MarketSmart GIC')]");
    public static By GICs = By.xpath("//label[text()='2 years']");
    public static By returnValue = By.xpath("//button[text()='Calculate Return Value']");
    public static By graf = By.xpath("//*[contains(@class,'highcharts-markers highcharts-series') and @role='region'][1]/*");

    public void clickMutualFunds() {
        WebElementUtility.clickElement(driver, Investments);
        WebElementUtility.clickElement(driver,Investments_mutualFunds);
    }

    public void clickInvestmentPerformanceSnapshot() {
        WebElementUtility.clickElement(driver, InvestmentPerformanceSnapshot);
    }

    public void waitForInvestmentPerformanceSnapshotText() {
        WebElementUtility.waitForElementVisible(driver, InvestmentPerformanceSnapshotText, 10);
    }

    public void enterFundInPlaceHolder(String fundName) {
        WebElementUtility.enterText(driver, placeHolder, fundName);
    }

    public List<String> getListOfPlaceHolderOptions() {
        List<WebElement> options = WebElementUtility.findElements(driver, ListOfThePlaceHolder);
        List<String> texts = new ArrayList<>();
        for (WebElement option : options) {
            texts.add(option.getText());
        }
        return texts;
    }

    public void clickSelectSeriesTextBox() {
        WebElementUtility.clickElement(driver, SelectSeriesTextBox);
    }

    public List<String> getListOfSeriesTextBoxOptions() {
        List<WebElement> options = WebElementUtility.findElements(driver, listOfTheSeriesTextBox);
        List<String> texts = new ArrayList<>();
        for (WebElement option : options) {
            texts.add(option.getText());
        }
        return texts;
    }

    public void enterInitialInvestment(String value) {
        WebElementUtility.enterText(driver, InitialInvestment, value);
    }

    public void enterContributionAmount(String value) {
        WebElementUtility.enterText(driver, ContributionAmount, value);
    }

    public void clickFrequencyTextBox() {
        WebElementUtility.clickElement(driver, FrequencyTextBox);
    }

    public void selectWeeklyOption() {
        WebElementUtility.clickElement(driver, selectingWeeklyOption);
    }

    public void clickAnnualIncrease() {
        WebElementUtility.clickElement(driver, AnnualIncrese);
    }

    public void selectDoNotApplyOption() {
        WebElementUtility.clickElement(driver, DONotApplyOption);
    }

    public void enterWithdrawalAmount(String value) {
        WebElementUtility.enterText(driver, WithdrawalAmount, value);
    }

    public void clickViewFundPerformanceButton() {
        WebElementUtility.clickElement(driver, ViewFundPerformanceButton);
    }


    public void clickAllInvestmentTools() {
        WebElementUtility.clickElement(driver, allCalculate);
    }

    public void verifyAllInvestmentToolsPage() {
        WebElementUtility.waitForElementVisible(driver, InvestmentCalculatorsAndToolsPage, 10);
    }

    public void clickRRSPInvestmentPerformanceSnapshot() {
        WebElementUtility.clickElement(driver, RRSPValue);
    }

    public void verifyRRSPInvestmentPerformanceSnapshotPage() {
        WebElementUtility.waitForElementVisible(driver, RRSPValueText, 10);
    }

    public void addFundToViewInvestmentPerformance(String investment, String contribution, String withdrawal) {
        WebElementUtility.enterText(driver, InitialInvestment, investment);
        WebElementUtility.enterText(driver, ContributionAmount, contribution);
        WebElementUtility.enterText(driver, WithdrawalAmount, withdrawal);
    }

    public void checkPortfolioPerformanceSnapshot() {
        WebElementUtility.waitForElementVisible(driver, InitialInvestmentPrice, 10);
    }

    public void clickFutureValueCalculators() {
        WebElementUtility.clickElement(driver, RRSPCalculator);
    }

    public void verifyFutureValueCalculatorsPage() {
        WebElementUtility.waitForElementVisible(driver, RRSPCalculatorText, 10);
    }

    public void addFutureValueCalculators(String currentInvestment, String rateOfReturn, String yearsUnit) {
        WebElementUtility.enterText(driver, investmentValue, currentInvestment);
//        WebElementUtility.enterText(driver, "rateOfReturn", rateOfReturn);
        WebElementUtility.enterText(driver, numberOfyears, yearsUnit);
    }

    public void clickCalculate() {
        WebElementUtility.clickElement(driver, CalculateButton);
    }

    public void checkValueOfInvestmentsFutureValueCalculators() {
        WebElementUtility.waitForElementVisible(driver, valueOfInvestment, 10);
    }

    public void clickRbcEquityLinkedGicsReturnCalculator() {
        WebElementUtility.clickElement(driver, GICReturns);
    }

    public void verifyRbcEquityLinkedGicsReturnCalculatorPage() {
        WebElementUtility.waitForElementVisible(driver, GICReturnsText, 10);
    }

    public void addRbcEquityLinkedGicsReturnCalculator(String investment) {
        WebElementUtility.enterText(driver, InitialInvestmentAmount, investment);
    }

    public void clickCalculateRbc() {
        WebElementUtility.clickElement(driver, returnValue);
    }

    public void checkCalculateRbc() {
        WebElementUtility.waitForElementVisible(driver, graf, 10);
    }


}


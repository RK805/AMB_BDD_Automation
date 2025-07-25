package RbcRoyalBank_Pages;

import Utility.BrowserUtility;
import Utility.WebElementUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class RbcRoyal_investmentPage {
    private WebDriver driver;
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

    // utilityClass utility = new utilityClass();


    public String getMutualFundsText() {
        return driver.findElement(MutualFunds).getText();
    }
    public void InvestmentPerformanceSnapshotClick(WebDriver driver) {
        WebElementUtility.JSclickElement(driver, InvestmentPerformanceSnapshot);
    }
    // Switch to the new tab opened by clicking the Investment Performance Snapshot
    public void switchToNewTab(WebDriver driver) {
        BrowserUtility.switchToTabByIndex(driver, 1);
    }
    public String getInvestmentPerformanceSnapshotText() {
        return WebElementUtility.getElementText(driver, InvestmentPerformanceSnapshotText);
    }
    public void PlaceHolderClick(WebDriver driver, By placeHolder, By ListOfThePlaceHolder) {
        WebElementUtility.clickElement(driver, placeHolder);
        List<WebElement> listHolder = driver.findElements(ListOfThePlaceHolder);
        for (WebElement element : listHolder) {
            if (element.getText().trim().equalsIgnoreCase("BlueBay $U.S. Global High Yield Bond Fund (Canada)")) {
                element.click();
                break;
            }
        }
    }

    public void SelectSeriesTextBoxClick(WebDriver driver, By SelectSeriesTextBox, By listOfTheSeriesTextBox) {
        WebElementUtility.clickElement(driver, SelectSeriesTextBox);
        List<WebElement> seriesList = driver.findElements(listOfTheSeriesTextBox);
        for (WebElement element : seriesList) {
            if (element.getText().trim().equalsIgnoreCase("F")) {
                element.click();
                break;
            }
        }
    }

    public void InitialInvestmentClick(WebDriver driver, By InitialInvestment, String Investmentamount) {
        WebElementUtility.clickElement(driver, InitialInvestment);
        // WebElementUtility.clearElement(driver, InitialInvestment);
        WebElementUtility.sendkeysToElement(driver, InitialInvestment, Investmentamount);
    }

    public void ContributionAmountClick(WebDriver driver, By ContributionAmount,String  Contributionamount) {
        WebElementUtility.clickElement(driver, ContributionAmount);
        WebElementUtility.sendkeysToElement(driver, ContributionAmount, Contributionamount);
    }

    public void FrequencyTextBoxClick(WebDriver driver, By FrequencyTextBox, By selectingWeeklyOption) {
        WebElementUtility.clickElement(driver, FrequencyTextBox);
        WebElementUtility.JSclickElement(driver, selectingWeeklyOption);
    }

    public void AnnualIncreseClick(WebDriver driver, By AnnualIncrese, By DONotApplyOption) {
        WebElementUtility.clickElement(driver, AnnualIncrese);
        WebElementUtility.mouseHoverAndClick(driver, DONotApplyOption);
    }

    public void WithdrawalAmountClick(WebDriver driver, By WithdrawalAmount, String WithDrawalamount) {
        WebElementUtility.clickElement(driver, WithdrawalAmount);
        WebElementUtility.sendkeysToElement(driver, WithdrawalAmount, WithDrawalamount);
    }

    public void ViewFundPerformanceButtonClick(WebDriver driver, By ViewFundPerformanceButton) {
        WebElementUtility.JSclickElement(driver, ViewFundPerformanceButton);
    }

    public String getInitialInvestmentPrice() {
        return WebElementUtility.getElementText(driver, InitialInvestmentPrice);
    }

    public String getAdditionalContributionsPrice() {
        return WebElementUtility.getElementText(driver, AdditionalContributionsPrice);
    }

    public String getTotalDistributionsPrice() {
        return WebElementUtility.getElementText(driver, TotalDistributionsPrice);
    }

    public String getRateOfReturnPrice1Value() {
        return WebElementUtility.getElementText(driver, RateOfReturnPrice1Value);
    }

    public String getRateOfReturnPrice2Value() {
        return WebElementUtility.getElementText(driver, RateOfReturnPrice2Value);
    }

    public String getWithOutAnnuIncreasePrice() {
        return WebElementUtility.getElementText(driver, WithOutAnnuIncreasePrice);
    }
    public String getWithAnnuIncerasePrice() {
        return WebElementUtility.getElementText(driver, WithAnnuIncerasePrice);
    }
//    public void clearFields() {
//        driver.findElement(InitialInvestment).clear();
//
//        driver.findElement(ContributionAmount).clear();
//        driver.findElement(WithdrawalAmount).clear();
//    }

    // scenario:2
    public String getInvestmentCalculatorsAndToolsPageText() {
        return WebElementUtility.getElementText(driver, InvestmentCalculatorsAndToolsPage);
    }
    public void RRSPValueClick() {
        WebElementUtility.JSclickElement(driver, RRSPValue);
    }
    public String getRRSPValueText() {
        return WebElementUtility.getElementText(driver, RRSPValueText);
    }

    public void investmentValueClick(WebDriver driver,By investmentValue ,String investment) {
        WebElementUtility.sendkeysToElement(driver, investmentValue, investment);
    }
    public void rateOfReturnClick(WebDriver driver,By rateOfReturn,String rate) {
        WebElementUtility.sendkeysToElement(driver, rateOfReturn, rate);
    }
    public void numberOfyearsClick(WebDriver driver,By numberOfyears ,String years) {
        WebElementUtility.sendkeysToElement(driver, numberOfyears, years);
    }
    public void CalculateButtonClick(WebDriver driver) {
        WebElementUtility.JSclickElement(driver, CalculateButton);
    }
    public String getValueOfInvestment(WebDriver driver) {
        return WebElementUtility.getElementText(driver, valueOfInvestment);
    }
//    public void recalculateButtonClick() {
//        driver.findElement(recalculateButton).click();
//    }

    // scenario:3
    public void RRSPCalculatorClick(WebDriver driver) {
        WebElementUtility.JSclickElement(driver, RRSPCalculator);
    }
    public String getRRSPCalculatorText() {
        return WebElementUtility.getElementText(driver, RRSPCalculatorText);
    }
    public void planToRetireYearClick(WebDriver driver, By planToRetireYear, String year) {
       WebElementUtility.sendkeysToElement(driver, planToRetireYear, year);
    }
    public void contributionAmountClick(WebDriver driver, By contributionAmount, String amount) {
       WebElementUtility.sendkeysToElement(driver, contributionAmount, amount);
    }
    public void contributionFrequencyClick(WebDriver driver, By contributionFrequency) {
        WebElement frequencyField = driver.findElement(contributionFrequency);
        Select s=new Select(frequencyField);
        List<WebElement> listSelect=s.getOptions();
        for(WebElement list:listSelect)
        {
            if(list.getText().trim().equals("Annually"))
            {
                list.click();
            }

        }
    }
    public void RateOfReturnClick(WebDriver driver, By RateOfReturn, String rate) {
       WebElementUtility.sendkeysToElement(driver, RateOfReturn, rate);
    }
    public void calculateButtonClick(WebDriver driver) {
        WebElementUtility.JSclickElement(driver, calculateButton);
    }
    public String getCouldSaveAmount() {
        return WebElementUtility.getElementText(driver, couldSaveAmount);
    }

    // scenario:4
    public void GICReturnsClick(WebDriver driver) {
        WebElementUtility.JSclickElement(driver, GICReturns);
    }
    public String getGICReturnsText() {
        return WebElementUtility.getElementText(driver, GICReturnsText);
    }
    public void InitialInvestmentAmountClick(WebDriver driver, By InitialInvestmentAmount, String Investmentamount) {
        WebElementUtility.sendkeysToElement(driver, InitialInvestmentAmount, Investmentamount);
    }
    public void datePickerClick(WebDriver driver) {
        WebElementUtility.JSclickElement(driver, datePicker);
        WebElementUtility.mouseHoverAndClick(driver, years);
        List<WebElement> yearList = driver.findElements(all_year);
        for (WebElement element : yearList) {
            if (element.getText().trim().equalsIgnoreCase("2025")) {
                element.click();
                break;
            }
        }
        List<WebElement> monthList = driver.findElements(all_Month);
        for (WebElement element : monthList) {
            if (element.getText().trim().equalsIgnoreCase("May")) {
                element.click();
                break;
            }
        }
        List<WebElement> dateList = driver.findElements(all_date);
        for (WebElement element : dateList) {
            if (element.getText().trim().equalsIgnoreCase("1")) {
                element.click();
                break;
            }
        }
    }
    public void GIC_redioButtenClick(WebDriver driver, By GIC_redioButten) {
        WebElementUtility.selectRadioButton(driver, GIC_redioButten);
    }
    public void GIC_usMClick(WebDriver driver, By GIC_usM) {
        WebElementUtility.selectRadioButton(driver, GIC_usM);
    }
    public void GICsClick(WebDriver driver, By GICs) {
        WebElementUtility.selectRadioButton(driver, GICs);
    }
    public void returnValueClick(WebDriver driver, By returnValue) {
        WebElementUtility.JSclickElement(driver, returnValue);
    }
    public void getReturnValue() {
        Actions a=new Actions(driver);
        List<WebElement> listG=driver.findElements(graf);
        for(WebElement listgg:listG)
        {
            a.moveToElement(listgg).build().perform();

        }
    }
}


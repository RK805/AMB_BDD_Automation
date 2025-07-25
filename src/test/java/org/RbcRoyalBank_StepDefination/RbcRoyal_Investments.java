package org.RbcRoyalBank_StepDefination;
import RbcRoyalBank_Pages.RbcRoyal_DashBordPage;
import RbcRoyalBank_Pages.RbcRoyal_investmentPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class RbcRoyal_Investments {
    private WebDriver driver ;
    private RbcRoyal_investmentPage investmentPage = new RbcRoyal_investmentPage();
    private RbcRoyal_DashBordPage dashBordPage = new RbcRoyal_DashBordPage(driver);
    @Given("the user navigate the mouse into the Investments and click on the Mutual funds option")
    public void navigate_to_mutual_funds()
    {
        dashBordPage.InvestmentsClick();
        System.out.println("User is on the Mutual Funds page");
    }

    @When("user navigate the Mutual Funds window page")
    public void navigate_mutual_funds_window() {
        investmentPage.getMutualFundsText();
    }

    @And("user click on the option Investment Performance Snapshot")
    public void click_investment_performance_snapshot() {
        investmentPage.InvestmentPerformanceSnapshotClick(driver);
        investmentPage.switchToNewTab(driver);
    }

    @Then("user navigate the Investment Performance Snapshot page")
    public void navigate_investment_performance_snapshot_page() {
        investmentPage.getInvestmentPerformanceSnapshotText();
        System.out.println("User is on the Investment Performance Snapshot page");
    }

    @And("user Add fund to view performance {string} {string} {string}")
    public void add_fund_to_view_performance(String investment, String contribution, String withdrawal) {
        investmentPage.PlaceHolderClick(driver, RbcRoyal_investmentPage.placeHolder, RbcRoyal_investmentPage.ListOfThePlaceHolder);
        investmentPage.SelectSeriesTextBoxClick(driver, RbcRoyal_investmentPage.SelectSeriesTextBox, RbcRoyal_investmentPage.listOfTheSeriesTextBox);
        investmentPage.InitialInvestmentClick(driver, RbcRoyal_investmentPage.InitialInvestment, investment);
        investmentPage.ContributionAmountClick(driver, RbcRoyal_investmentPage.ContributionAmount, contribution);
        investmentPage.FrequencyTextBoxClick(driver, RbcRoyal_investmentPage.FrequencyTextBox, RbcRoyal_investmentPage.selectingWeeklyOption);
        investmentPage.AnnualIncreseClick(driver, RbcRoyal_investmentPage.AnnualIncrese, RbcRoyal_investmentPage.DONotApplyOption);
        investmentPage.WithdrawalAmountClick(driver, RbcRoyal_investmentPage.WithdrawalAmount, withdrawal);
    }

    @And("user click on the View Fund performance")
    public void click_view_fund_performance() {
        investmentPage.ViewFundPerformanceButtonClick(driver, RbcRoyal_investmentPage.ViewFundPerformanceButton);
    }

    @Then("user check the portfolio performance on Investment Performance Snapshot")
    public void check_portfolio_performance_snapshot() {
        investmentPage.getInitialInvestmentPrice();
        investmentPage.getAdditionalContributionsPrice();
        investmentPage.getTotalDistributionsPrice();
        investmentPage.getRateOfReturnPrice1Value();
        investmentPage.getRateOfReturnPrice2Value();
        investmentPage.getWithOutAnnuIncreasePrice();
        investmentPage.getWithAnnuIncerasePrice();

        System.out.println("Investment performance snapshot is displayed");

    }

    @Given("the user navigate the mouse into the Investments and click on the All Investment Tools and calculators option")
    public void navigate_to_all_investment_tools() {
        dashBordPage.AllInvestmentToolsClick();
        System.out.println("User is on the All Investment Tools & calculators page");
    }

    @When("user navigate All Investment Tools & calculators page")
    public void navigate_all_investment_tools_page() {
        investmentPage.getInvestmentCalculatorsAndToolsPageText();
    }

    @And("user click on the option RRSPInvestment Performance Snapshot")
    public void click_rrsp_investment_performance_snapshot() {
        investmentPage.RRSPValueClick();
    }

    @Then("user navigate the RRSPInvestment Performance Snapshot page")
    public void navigate_rrsp_investment_performance_snapshot_page() {
        investmentPage.getRRSPValueText();
    }

    @And("user Add fund to view Investment performance {string} {string} {string}")
    public void add_fund_to_view_investment_performance(String investment, String contribution, String withdrawal) {
        investmentPage.investmentValueClick(driver, RbcRoyal_investmentPage.investmentValue, investment);
        investmentPage.rateOfReturnClick(driver, RbcRoyal_investmentPage.rateOfReturn, contribution);
        investmentPage.numberOfyearsClick(driver, RbcRoyal_investmentPage.numberOfyears, withdrawal);
    }

//    @And("user click on the View Fund performance")
//    public void click_view_fund_performance_rrsp() {
//        investmentPage.CalculateButtonClick(driver);
//    }

    @Then("user check the portfolio performance on RRSPInvestment Performance Snapshot")
    public void check_portfolio_performance_rrsp_snapshot() {
        investmentPage.getValueOfInvestment(driver);
    }

    @When("user navigate the All Investment Tools & calculators window page")
    public void navigate_all_investment_tools_window_page() {
        investmentPage.getInvestmentCalculatorsAndToolsPageText();
    }

    @And("user click on the option Future value calculators")
    public void click_future_value_calculators() {
        investmentPage.RRSPCalculatorClick(driver);
    }

    @Then("user navigate the Future value calculators page")
    public void navigate_future_value_calculators_page() {
        investmentPage.getRRSPCalculatorText();
    }

    @And("user add the Future value calculators  {string} {string} {string}")
    public void add_future_value_calculators(String currentInvestment, String retaOfReturn, String yearsUnit) {
        investmentPage.planToRetireYearClick(driver, RbcRoyal_investmentPage.planToRetireYear, yearsUnit);
        investmentPage.contributionAmountClick(driver, RbcRoyal_investmentPage.contributionAmount, currentInvestment);
        investmentPage.contributionFrequencyClick(driver, RbcRoyal_investmentPage.contributionFrequency);
        investmentPage.rateOfReturnClick(driver, RbcRoyal_investmentPage.rateOfReturn, retaOfReturn);


    }

    @And("user click on the calculate")
    public void click_calculate() {
        investmentPage.calculateButtonClick(driver);

    }

    @Then("user check the Value of your investments Future value calculators")
    public void check_value_of_investments_future_value_calculators() {
        investmentPage.getCouldSaveAmount();

    }

    @And("user click on the option RBC Equity-Linked GICs Return Calculator")
    public void click_rbc_equity_linked_gics_return_calculator() {
        investmentPage.GICReturnsClick(driver);
    }

    @Then("user navigate the RBC Equity-Linked GICs Return Calculator page")
    public void navigate_rbc_equity_linked_gics_return_calculator_page() {
        investmentPage.getGICReturnsText();
        System.out.println("User is on the RBC Equity-Linked GICs Return Calculator page");
    }

    @And("user add the RBC Equity-Linked GICs Return Calculator  {string}")
    public void add_rbc_equity_linked_gics_return_calculator(String investment) {
        investmentPage.InitialInvestmentAmountClick(driver, RbcRoyal_investmentPage.InitialInvestmentAmount, investment);
        investmentPage.datePickerClick(driver);
        investmentPage.GIC_redioButtenClick(driver, RbcRoyal_investmentPage.GIC_redioButten);
        investmentPage.GIC_usMClick(driver, RbcRoyal_investmentPage.GIC_usM);
        investmentPage.GICsClick(driver, RbcRoyal_investmentPage.GICs);
    }

    @And("user click on the calculate RBC")
    public void click_calculate_rbc() {
        investmentPage.returnValueClick(driver, RbcRoyal_investmentPage.returnValue);
    }

    @Then("user check the calculate RBC")
    public void check_calculate_rbc() {
        investmentPage.getReturnValue();
    }
}

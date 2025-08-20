package org.RbcRoyalBank_StepDefination;
import RbcRoyalBank_Pages.*;
import Utility.BasePage;
import Utility.TestContext;
import Utility.WebElementUtility;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import Utility.TestContext;
import org.testng.Assert;


public class RbcRoyal_Investments{

    RbcRoyal_DashBordPage rbcRoyalDashBordPage;
    RbcRoyal_investmentPage rbcRoyalInvestmentPage;
    RbcRoyal_InvestmentCalculatorsAndToolsPage rbcRoyalInvestmentCalculatorsAndToolsPage;
    RbcRoyal_RRSF_FutureValueCalculatorPage rbcRoyalRRSFFutureValueCalculatorPage;
    RbcRoyal_Equity_linkedGICsPage rbcRoyalEquityLinkedGICsPage;
    RbcRoyal_personalLoansPage rbcRoyalPersonalLoansPage;

    public RbcRoyal_Investments(TestContext context) {

        this.rbcRoyalDashBordPage = new RbcRoyal_DashBordPage(context.getDriver());
        this.rbcRoyalInvestmentPage = new RbcRoyal_investmentPage(context.getDriver());
        this.rbcRoyalInvestmentCalculatorsAndToolsPage = new RbcRoyal_InvestmentCalculatorsAndToolsPage(context.getDriver());
        this.rbcRoyalRRSFFutureValueCalculatorPage = new RbcRoyal_RRSF_FutureValueCalculatorPage(context.getDriver());
        this.rbcRoyalEquityLinkedGICsPage = new RbcRoyal_Equity_linkedGICsPage(context.getDriver());
        this.rbcRoyalPersonalLoansPage = new RbcRoyal_personalLoansPage(context.getDriver());
    }
    @Given("the user navigate the mouse into the Investments and click on the All Investment Tools and calculators option")
    public void navigate_to_investments_and_click_on()
    {
       rbcRoyalInvestmentPage.clickAllInvestmentToolsAndCalculators();
    }

    @When("user navigate the All Investment Tools & calculators window page")
    public void navigate_to_all_investment_tools_and_calculators_window() {
//        rbcRoyalInvestmentCalculatorsAndToolsPage.getTitleOfthePage("Investment Calculators and Tools - RBC Royal Bank");
    }

    @And("user click on the option Future value calculators")
    public void click_on_rrsp_future_value_calculator_link() {
        rbcRoyalInvestmentCalculatorsAndToolsPage.clickRRSPFutureValueCalculatorLink();
    }

    @Then("user navigate the Future value calculators page")
    public void navigate_to_rrsp_future_value_calculator_page() {

    }

    @And("user add the Future value calculators  {string} {string} {string}")
    public void add_future_value_calculators(String initialInvestment, String annualContribution, String annualReturn) throws InterruptedException {
        rbcRoyalRRSFFutureValueCalculatorPage.enterInvestmentValue(initialInvestment);
        rbcRoyalRRSFFutureValueCalculatorPage.enterRateOfReturn(annualContribution);
        rbcRoyalRRSFFutureValueCalculatorPage.enterNumberOfYears(annualReturn);
    }

    @And("user click on the calculate")
    public void click_calculate_button() {
        rbcRoyalRRSFFutureValueCalculatorPage.clickCalculateButton();
    }

    @Then("user check the Value of your investments Future value calculators")
    public void check_future_value_calculator_result() {
        String value = rbcRoyalRRSFFutureValueCalculatorPage.getValueOfInvestment();
        System.out.println("The value of your investments is: " + value);
    }

    @Given("the user navigate the mouse into the Investments and click on the Mutual funds option")
    public void navigate_to_mutual_funds() {
        rbcRoyalInvestmentPage.clickMutualFunds();
    }

    @When("user navigate to the Mutual Funds window page")
    public void navigate_mutual_funds_window() {
    }

    @And("user click on the option Investment Performance Snapshot")
    public void click_investment_performance_snapshot()  {
        rbcRoyalInvestmentPage.clickInvestmentPerformanceSnapshot();
    }

    @Then("user navigate to the Investment Performance Snapshot page")
    public void navigate_investment_performance_snapshot_page() {
        rbcRoyalInvestmentPage.waitForInvestmentPerformanceSnapshotText();
    }
    @And("user Add fund to view performance {string} and {string} and {string}")
    public void addFundToViewPerformance(String investment, String contribution, String withdrawal)  {
        rbcRoyalInvestmentPage.enterFundInPlaceHolder();
        rbcRoyalInvestmentPage.clickSelectSeries();
        rbcRoyalInvestmentPage.getListOfSeriesTextBoxOptions();
        rbcRoyalInvestmentPage.enterInitialInvestment(investment);
        rbcRoyalInvestmentPage.enterContributionAmount(contribution);
        rbcRoyalInvestmentPage.clickFrequencyTextBox();
        rbcRoyalInvestmentPage.clickAnnualIncrease();
        rbcRoyalInvestmentPage.enterWithdrawalAmount(withdrawal);
    }


    @And("user click on the View Fund performance")
    public void click_view_fund_performance() {
        rbcRoyalInvestmentPage.clickViewFundPerformanceButton();
    }

    @Then("user check the portfolio performance on Investment Performance Snapshot")
    public void check_portfolio_performance_snapshot()
    {
       rbcRoyalInvestmentPage.checkInvestmentPerformanceSnapshotView();
    }

    @Given("the user navigate the mouse into the Investments and click on the All Investment Tools and calculators")
    public void navigate_to_equity_linked_gics() {

    }

    @When("user navigate the All Investment Tools & calculators page")
    public void navigate_to_all_investment_tools_and_calculators_page() {
    }

    @And("user click on the option RBC Equity-Linked GICs Return Calculator")
    public void click_on_equity_linked_gics_return_calculator() {
        rbcRoyalInvestmentCalculatorsAndToolsPage.clickEquityLinkedGICReturnCalculator();
    }

    @Then("user navigate the RBC Equity-Linked GICs Return Calculator page")
    public void navigate_to_equity_linked_gics_return_calculator_page() {
    }

    @And("user add the RBC Equity-Linked GICs Return Calculator {string}")
    public void add_equity_linked_gics_return_calculator(String investment) {
        rbcRoyalEquityLinkedGICsPage.enterInitialInvestment(investment);
        rbcRoyalEquityLinkedGICsPage.enterGICDate("05/15/2025");
        rbcRoyalEquityLinkedGICsPage.clickMarketSmartRedio();
        rbcRoyalEquityLinkedGICsPage.clickUSMarketSmartGICRedio();
        rbcRoyalEquityLinkedGICsPage.clickGICsTermYearsRedio();

    }

    @And("user click on the calculate RBC")
    public void click_calculate_rbc() {
        rbcRoyalEquityLinkedGICsPage.clickCalculateReturnValue();
    }

    @Then("user check the calculate RBC")
    public void check_calculate_rbc() {
        String currentValue = rbcRoyalEquityLinkedGICsPage.getCurrentValueOfInvestment();
//        String originalInvestment = rbcRoyalEquityLinkedGICsPage.getOriginalInvestment();
//        String minimumReturn = rbcRoyalEquityLinkedGICsPage.getMinimumReturnValue();
//        String maximumReturn = rbcRoyalEquityLinkedGICsPage.getMaximumReturnValue();
//        String ibl = rbcRoyalEquityLinkedGICsPage.getIBL();
//        String currentIndex = rbcRoyalEquityLinkedGICsPage.getCurrentIndexValue();

        System.out.println("Current Value of Investment: " + currentValue);
//        System.out.println("Original Investment: " + originalInvestment);
//        System.out.println("Minimum Return Value: " + minimumReturn);
//        System.out.println("Maximum Return Value: " + maximumReturn);
//        System.out.println("IBL Value: " + ibl);
//        System.out.println("Current Index Value: " + currentIndex);
    }

    @Given("the user navigate the mouse into the loans and click on the Personal loan option")
    public void navigate_to_personal_loans() {
        rbcRoyalInvestmentPage.clickPersonalLoans();
    }

    @When("user navigate to the Personal loan window page")
    public void navigate_to_personal_loans_window() {
       String title= rbcRoyalPersonalLoansPage.getTitle();
        Assert.assertEquals( "Personal Loans - RBC Royal Bank", title);

    }

    @Then("the user should see the Personal loan page")
    public void verify_personal_loans_page() {
        rbcRoyalPersonalLoansPage.clickBorrowingReasonDropdown();
        rbcRoyalPersonalLoansPage.selectBorrowingReason("Major Purchase");
        rbcRoyalPersonalLoansPage.enterLoanAmount("10000");
    }

    @And("the user click on the Apply now button")
    public void click_apply_now_button() {
        rbcRoyalPersonalLoansPage.clickGetResultsButton();
    }

    @Then("the user should see the Personal loan application page")
    public void verify_personal_loans_application_page() {
    }

    @And("the user should see the Personal loan application form")
    public void verify_personal_loans_application_form() {
        rbcRoyalPersonalLoansPage.enterInterestRate("10");
        rbcRoyalPersonalLoansPage.clickLoanButton();
        rbcRoyalPersonalLoansPage.selectRepaymentPeriod();
        rbcRoyalPersonalLoansPage.selectRepaymentPeriodOption("5 years");
        rbcRoyalPersonalLoansPage.selectMonthlyPayment("Semi-monthly");
    }

    @And("the user click on the Continue button")
    public void click_continue_button() {
        rbcRoyalPersonalLoansPage.clickGetRelust();
    }

    @Then("the user should see the Personal loan application form with error message")
    public void verify_personal_loans_application_form_with_error_message() {
        rbcRoyalPersonalLoansPage.getResultAmount();
    }



}
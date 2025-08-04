package org.RbcRoyalBank_StepDefination;
import RbcRoyalBank_Pages.RbcRoyal_DashBordPage;
import RbcRoyalBank_Pages.RbcRoyal_investmentPage;
import Utility.BasePage;
import Utility.TestContext;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import Utility.TestContext;

public class RbcRoyal_Investments{

    RbcRoyal_investmentPage rbcRoyalInvestmentPage;

    public RbcRoyal_Investments(TestContext context) {
        this.rbcRoyalInvestmentPage = new RbcRoyal_investmentPage(context.getDriver());
    }

    @Given("the user navigate the mouse into the Investments and click on the Mutual funds option")
    public void navigate_to_mutual_funds() {
        rbcRoyalInvestmentPage.clickMutualFunds();
    }

    @When("user navigate the Mutual Funds window page")
    public void navigate_mutual_funds_window() {
        rbcRoyalInvestmentPage.waitForInvestmentPerformanceSnapshotText();
    }

    @And("user click on the option Investment Performance Snapshot")
    public void click_investment_performance_snapshot() {
        rbcRoyalInvestmentPage.clickInvestmentPerformanceSnapshot();
    }

    @Then("user navigate the Investment Performance Snapshot page")
    public void navigate_investment_performance_snapshot_page() {
        rbcRoyalInvestmentPage.waitForInvestmentPerformanceSnapshotText();
    }

    @And("user click on the View Fund performance")
    public void click_view_fund_performance() {
        rbcRoyalInvestmentPage.clickViewFundPerformanceButton();
    }

    @Then("user check the portfolio performance on Investment Performance Snapshot")
    public void check_portfolio_performance_snapshot() {
        rbcRoyalInvestmentPage.checkPortfolioPerformanceSnapshot();
    }

    @Given("the user navigate the mouse into the Investments and click on the All Investment Tools and calculators option")
    public void navigate_to_all_investment_tools() {
        rbcRoyalInvestmentPage.clickAllInvestmentTools();
    }

    @When("user navigate All Investment Tools & calculators page")
    public void navigate_all_investment_tools_page() {
        rbcRoyalInvestmentPage.verifyAllInvestmentToolsPage();
    }

    @And("user click on the option RRSPInvestment Performance Snapshot")
    public void click_rrsp_investment_performance_snapshot() {
        rbcRoyalInvestmentPage.clickRRSPInvestmentPerformanceSnapshot();
    }

    @Then("user navigate the RRSPInvestment Performance Snapshot page")
    public void navigate_rrsp_investment_performance_snapshot_page() {
        rbcRoyalInvestmentPage.verifyRRSPInvestmentPerformanceSnapshotPage();
    }

    @And("user Add fund to view Investment performance {string} {string} {string}")
    public void add_fund_to_view_investment_performance(String investment, String contribution, String withdrawal) {
        rbcRoyalInvestmentPage.addFundToViewInvestmentPerformance(investment, contribution, withdrawal);
    }

    @Then("user check the portfolio performance on RRSPInvestment Performance Snapshot")
    public void check_portfolio_performance_rrsp_snapshot() {
        rbcRoyalInvestmentPage.checkPortfolioPerformanceSnapshot();
    }

    @When("user navigate the All Investment Tools & calculators window page")
    public void navigate_all_investment_tools_window_page() {
        rbcRoyalInvestmentPage.verifyAllInvestmentToolsPage();
    }

    @And("user click on the option Future value calculators")
    public void click_future_value_calculators() {
        rbcRoyalInvestmentPage.clickFutureValueCalculators();
    }

    @Then("user navigate the Future value calculators page")
    public void navigate_future_value_calculators_page() {
        rbcRoyalInvestmentPage.verifyFutureValueCalculatorsPage();
    }

    @And("user add the Future value calculators  {string} {string} {string}")
    public void add_future_value_calculators(String currentInvestment, String rateOfReturn, String yearsUnit) {
        rbcRoyalInvestmentPage.addFutureValueCalculators(currentInvestment, rateOfReturn, yearsUnit);
    }

    @And("user click on the calculate")
    public void click_calculate() {
        rbcRoyalInvestmentPage.clickCalculate();
    }

    @Then("user check the Value of your investments Future value calculators")
    public void check_value_of_investments_future_value_calculators() {
        rbcRoyalInvestmentPage.checkValueOfInvestmentsFutureValueCalculators();
    }

    @And("user click on the option RBC Equity-Linked GICs Return Calculator")
    public void click_rbc_equity_linked_gics_return_calculator() {
        rbcRoyalInvestmentPage.clickRbcEquityLinkedGicsReturnCalculator();
    }

    @Then("user navigate the RBC Equity-Linked GICs Return Calculator page")
    public void navigate_rbc_equity_linked_gics_return_calculator_page() {
        rbcRoyalInvestmentPage.verifyRbcEquityLinkedGicsReturnCalculatorPage();
    }

    @And("user add the RBC Equity-Linked GICs Return Calculator  {string}")
    public void add_rbc_equity_linked_gics_return_calculator(String investment) {
        rbcRoyalInvestmentPage.addRbcEquityLinkedGicsReturnCalculator(investment);
    }

    @And("user click on the calculate RBC")
    public void click_calculate_rbc() {
        rbcRoyalInvestmentPage.clickCalculateRbc();
    }

    @Then("user check the calculate RBC")
    public void check_calculate_rbc() {
        rbcRoyalInvestmentPage.checkCalculateRbc();
    }

    @And("user Add fund to view performance {string} and {string} and {string}")
    public void addFundToViewPerformance(String investment, String contribution, String withdrawal) {
        rbcRoyalInvestmentPage.addFundToViewInvestmentPerformance(investment, contribution, withdrawal);
    }

}

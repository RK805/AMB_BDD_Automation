package org.RbcRoyalBank_StepDefination;




import RbcRoyalBank_Pages.RbcRoyal_DashBordPage;
import Utility.TestContext;
import io.cucumber.java.en.Given;


public class RbcRoyalDashBord{
    private RbcRoyal_DashBordPage dashBordPage;

    public RbcRoyalDashBord(TestContext context) {
        this.dashBordPage = new RbcRoyal_DashBordPage(context.getDriver());
    }

    @Given("the user is open the Home page")
    public void the_user_is_open_the_Home_page() {
        dashBordPage.navigateTOHomePage();
    }
}

package org.RbcRoyalBank_StepDefination;




import Utility.*;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import org.picocontainer.annotations.Inject;


public class RbcRoyalDashBord extends BasePage {

    public RbcRoyalDashBord()
    {
        super(null);
            // update  commited
    }

    public RbcRoyalDashBord(WebDriver driver) {
        super(driver);
    }


    @Given("the user is open the Home page")
    public void the_user_is_open_the_Home_page()
    {
        RbcRoyalDashBord rc=new RbcRoyalDashBord(driver);
        driver= BrowserLaunchUtility.getLocalDriver("chrome");
        BrowserUtility.openUrl(driver, "https://www.rbcroyalbank.com/");
        WebElementUtility.implicitWait(driver,10);
        BrowserUtility.maximizeWindow(driver);
        System.out.println("Home page is opened");
           }
}

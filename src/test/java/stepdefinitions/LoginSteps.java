package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    WebDriver driver = Hooks.getDriver();

    @Given("user opens login page")
    public void openLoginPage(){
        driver.get("https://example.com/login");
    }

    @Given("user enters username {string} and password {string}")
    public void enterCredentials(String username, String password){
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("loginBtn")).click();
    }
}

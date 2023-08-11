package StepDefinitions;
import Pages.DialogContent;
import Utilities.BaseDriver;
import Utilities.MyMethods;
import Utilities.ParameterDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        ParameterDriver.getDriver().get("https://test.mersys.io/");


    }
    @When("Enter username and password")
    public void enter_username_and_password() {
        MyMethods.myWait(5);
        dc.sendKeysMethod(dc.username, "turkeyts");
        dc.sendKeysMethod(dc.password, "TechnoStudy123");


    }
    @When("Click on login button")
    public void click_on_login_button() {
        dc.loginButton.click();


    }
    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        dc.assertText(dc.dashBoard, "Dashboard");


    }

}

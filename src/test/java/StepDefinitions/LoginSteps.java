package StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        System.out.println("Step 1");

    }
    @Given("Enter username and password")
    public void enter_username_and_password() {
        System.out.println("Step 2");

    }
    @When("Click on login button")
    public void click_on_login_button() {
        System.out.println("Step 3");

    }
    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        System.out.println("Step 4");

    }
}

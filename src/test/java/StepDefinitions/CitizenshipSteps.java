package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CitizenshipSteps {

    LeftNavBar lb = new LeftNavBar();
    DialogContent dc = new DialogContent();

    @And("Navigate to Citizenship page")
    public void navigateToCitizenshipPage() {
        lb.clickMethod(lb.setUpButton);
        lb.clickMethod(lb.parametersButton);
        lb.clickMethod(lb.citizenshipButton);
    }

    @Then("Enter {string} as citizenship name and {string} as short name")
    public void enterAsCitizenshipNameAndAsShortName(String citizenshipName, String citizenshipShortName){
        dc.sendKeysMethod(dc.formNameInput,citizenshipName);
        dc.sendKeysMethod(dc.formShortNameInput,citizenshipShortName);
    }

    @And("Search for the citizenship with the name {string} and short name {string}")
    public void searchForTheCitizenshipWithTheNameAndShortName(String citizenshipName, String citizenshipShortName) {
        dc.sendKeysMethod(dc.searchNameInput,citizenshipName);
        dc.sendKeysMethod(dc.searchShortNameInput,citizenshipShortName);
        dc.clickMethod(dc.searchButton);

    }

    @When("Delete Citizenship")
    public void deleteCitizenship() {
        dc.wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//button[@color='warn']"), 1));
        dc.clickMethod(dc.deleteButton);
        dc.clickMethod(dc.deleteConfirmButton);
    }
}

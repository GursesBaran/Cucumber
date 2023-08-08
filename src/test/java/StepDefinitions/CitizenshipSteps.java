package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

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
}

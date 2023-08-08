package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import Utilities.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import java.time.Duration;

public class CountrySteps {
    DialogContent dc = new DialogContent();
    LeftNavBar lb = new LeftNavBar();

    @And("Navigate to Country page")
    public void navigateToCountryPage() {
        lb.clickMethod(lb.setUpButton);
        lb.clickMethod(lb.parametersButton);
        lb.clickMethod(lb.countriesButton);
    }

    @When("Create a new country")
    public void createANewCountry() {
        dc.clickMethod(dc.addButton);
        dc.sendKeysMethod(dc.formNameInput, "Batch 8");
        dc.sendKeysMethod(dc.formCodeInput, "BTC");
        dc.clickMethod(dc.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.assertText(dc.successMessage, "successfully");
    }

    @When("Delete a country")
    public void deleteACountry() {
        dc.sendKeysMethod(dc.searchNameInput, "Batch 8");
        dc.sendKeysMethod(dc.searchCodeInput, "BTC");
        dc.clickMethod(dc.searchButton);
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        dc.wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//button[@color='warn']"), 1));
        dc.clickMethod(dc.deleteButton);
        dc.clickMethod(dc.deleteConfirmButton);
    }

    @And("Click on add button")
    public void clickOnAddButton() {
        dc.clickMethod(dc.addButton);
    }

    @And("Enter {string} as country name and {string} as country code")
    public void enterAsCountryNameAndAsCountryCode(String countryName, String countryCode) {
        dc.sendKeysMethod(dc.formNameInput, countryName);
        dc.sendKeysMethod(dc.formCodeInput, countryCode);

    }

    @When("Click on save button")
    public void clickOnSaveButton() {
        dc.clickMethod(dc.saveButton);
    }
}


package StepDefinitions;

import Pages.DialogContent;
import Utilities.Excel;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;


public class CitizenshipWithApachePOI {
    @When("Create a citizenship with Apache POI")
    public void createACitizenshipWithApachePOI() {

        ArrayList<ArrayList<String>> citizenShipData =
                Excel.getDataFromExcel("src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx", "testCitizen", 2);

        DialogContent dc = new DialogContent();
        for (int i = 0; i < citizenShipData.size(); i++) {
            dc.clickMethod(dc.addButton);
            dc.sendKeysMethod(dc.formNameInput, citizenShipData.get(i).get(0));
            dc.sendKeysMethod(dc.formShortNameInput, citizenShipData.get(i).get(1));
            dc.clickMethod(dc.saveButton);
            dc.wait.until(ExpectedConditions.invisibilityOf(dc.successMessage));
            dc.assertText(dc.successMessage, "successfully");

        }
    }
}
package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import Utilities.BaseDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class FeeSteps {
    LeftNavBar lb = new LeftNavBar();
    DialogContent dc = new DialogContent();

    @And("Navigate to Fees page")
    public void navigateToFeesPage() {
        lb.clickMethod(lb.setUpButton);
        lb.clickMethod(lb.parametersButton);
        lb.clickMethod(lb.feesButton);
    }

    @And("Fill the add fee form")
    public void fillTheAddFeeForm(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        dc.sendKeysMethod(dc.formNameInput, dataList.get(0));
        dc.sendKeysMethod(dc.formCodeInput, dataList.get(1));
        dc.sendKeysMethod(dc.feeIntegrationCode, dataList.get(2));
        dc.sendKeysMethod(dc.feePriority, dataList.get(3));
        Actions actions = new Actions(BaseDriver.getDriver());
        Action action = actions.sendKeys(Keys.TAB).build();
        action.perform();
    }
}

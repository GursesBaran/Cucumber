package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class ScenarioOutlineWithDataTable {
    @Given("Step One")
    public void stepOne(DataTable dataTable) {
        List<List<String>> dataList = dataTable.asLists(String.class);
        System.out.println(dataList.get(0).get(0));
        System.out.println(dataList.get(0).get(1));
    }

    @When("Step Two")
    public void stepTwo() {
        System.out.println("Step 2");
    }

    @And("Step Three")
    public void stepThree(DataTable dataTable) {
        List<List<String>> dataList = dataTable.asLists(String.class);
        System.out.println(dataList.get(0).get(0));
        System.out.println(dataList.get(0).get(1));
    }

    @Then("Step Four")
    public void stepFour() {
        System.out.println("Step 4");
    }
}

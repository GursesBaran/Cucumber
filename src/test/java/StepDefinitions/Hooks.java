package StepDefinitions;

import Utilities.BaseDriver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void beforeScenario() {
        System.out.println("Before Scenario");
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] byteImage = ((TakesScreenshot) BaseDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(byteImage, "image/png", scenario.getName());


        }

        BaseDriver.quitDriver();

    }

        //@BeforeStep
        //public void beforeStep()
        //System.out.println("Before Step");
        //@AfterStep
        //public void afterStep() {
        //System.out.println("After Step");
        //}

    }
package StepDefinitions;

import Utilities.Excel;
import Utilities.ParameterDriver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.time.Duration;
import java.time.LocalDateTime;

public class Hooks {
    LocalDateTime startTime;
    LocalDateTime endTime;

    @Before
    public void beforeScenario() {
        startTime = LocalDateTime.now();
        System.out.println("Before Scenario");
    }

    @After
    public void afterScenario(Scenario scenario) {
        endTime = LocalDateTime.now();
        Duration duration = Duration.between(startTime,endTime);
        if (scenario.isFailed()) { // take screen shot when the scenario fails
            final byte[] byteImage = ((TakesScreenshot) ParameterDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(byteImage, "image/png", scenario.getName());
        }
        Excel.writeInExcel("src/test/java/ApachePOI/Resources/CampusScenarioResults.xlsx", scenario,startTime, endTime,duration);
        ParameterDriver.quitDriver();


        ParameterDriver.quitDriver();

    }

        //@BeforeStep
        //public void beforeStep()
        //System.out.println("Before Step");
        //@AfterStep
        //public void afterStep() {
        //System.out.println("After Step");
        //}

    }
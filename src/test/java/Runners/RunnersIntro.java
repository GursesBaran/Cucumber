package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/FeatureFiles/Login.feature",
        glue = "StepDefinitions"





)
public class RunnersIntro extends AbstractTestNGCucumberTests {


}

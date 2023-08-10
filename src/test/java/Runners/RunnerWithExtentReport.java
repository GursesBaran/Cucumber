package Runners;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        features = "src/test/java/FeatureFiles",
        glue = "StepDefinitions",
        tags = "@Smoke",
        plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"







)
public class RunnerWithExtentReport extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void writeOnExtentReport(){

        ExtentService.getInstance().setSystemInfo("Windows UserName", System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("TimeZone", System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("Tester Name","Baran");
        ExtentService.getInstance().setSystemInfo("Application Name","Campus");
        ExtentService.getInstance().setSystemInfo("Operating System",System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department","QA");






















    }










}

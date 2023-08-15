package Runners;

import Utilities.ParameterDriver;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = "src/test/java/FeatureFiles",
        glue = "StepDefinitions",
        plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        tags = "@Regression"
)

public class RunnerForParallelTest extends AbstractTestNGCucumberTests {
    @BeforeClass
    @Parameters(value = "browser")
    public void beforeClass(String browsername){
        ParameterDriver.setThreadDriverName(browsername);
    }
    @AfterClass
    public void ExtentReport (){
        ExtentService.getInstance().setSystemInfo("Windows UserName", System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("TimeZone", System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("Tester Name","Baran");
        ExtentService.getInstance().setSystemInfo("Application Name","Campus");
        ExtentService.getInstance().setSystemInfo("Operating System",System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department","QA");

    }
}

package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }
            return driver;


        }
    }
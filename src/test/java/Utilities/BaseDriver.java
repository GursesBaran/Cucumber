package Utilities;

import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;

public class BaseDriver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            closePreviousDrivers();

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
        driver = null;

    }

    public static void closePreviousDrivers() {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
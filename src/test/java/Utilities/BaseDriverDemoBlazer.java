package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriverDemoBlazer {
    public static WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void createDriver() {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass(alwaysRun = true)
    public void quitDriver() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
        driver.quit();

    }

    public void login() {
        driver.get("https://www.demoblaze.com/index.html");
        MyMethods.myWait(2);

        WebElement loginButton = driver.findElement(By.id("login2"));
        loginButton.click();
        MyMethods.myWait(2);

        WebElement userName = driver.findElement(By.id("loginusername"));
        userName.sendKeys("BaranGurses");

        WebElement password = driver.findElement(By.id("loginpassword"));
        password.sendKeys("Demo2023");

        WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
        login.click();

        MyMethods.myWait(3);

        WebElement verification = driver.findElement(By.xpath("//h5[normalize-space()='$360']"));

        Assert.assertTrue(verification.isDisplayed());
        Assert.assertEquals(verification.getText(), "$360");

    }

}


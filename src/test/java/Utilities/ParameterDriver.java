package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ParameterDriver {
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    private static ThreadLocal<String> threadDriverName = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (threadDriver.get() == null) {

            if (threadDriverName.get()==null){
                threadDriverName.set("chrome");
            }
            Logger logger = Logger.getLogger("");
            logger.setLevel(Level.SEVERE);

            switch (threadDriverName.get()) {
                case "firefox":
                    threadDriver.set(new FirefoxDriver());
                    break;
                case "safari":
                    threadDriver.set(new SafariDriver());
                    break;
                case "edge":
                    threadDriver.set(new EdgeDriver());

                    break;
                default:
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*"); // To solve the error with Chrome v111
                    if (!runningFromIntellij()) {
                        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1400,2400");
                    }
                    threadDriver.set(new ChromeDriver(options));
                    break;
            }
            threadDriver.get().manage().window().maximize();
        }
        return threadDriver.get();
    }

    public static void quitDriver(){
        if (threadDriver!=null){
            threadDriver.get().quit();
            WebDriver driver = null;
            threadDriver.set(driver);
        }
    }
    public static void setThreadDriverName(String browserName){
        threadDriverName.set(browserName.toLowerCase());
    }

    public static boolean runningFromIntellij() { // checks if the test is being run by intellij
        String classpath = System.getProperty("java.class.path");
        return classpath.contains("idea_rt.jar");
    }
}
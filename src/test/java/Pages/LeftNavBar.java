package Pages;

import Utilities.ParameterDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavBar extends MyMethods {
    public LeftNavBar() {
        PageFactory.initElements(ParameterDriver.getDriver(), this);

    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setUpButton;

    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    public WebElement parametersButton;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countriesButton;

    @FindBy(xpath = "//span[text()='Citizenships']")
    public WebElement citizenshipButton;

    @FindBy(xpath = "//span[normalize-space()='Fees']")
    public WebElement feesButton;

    @FindBy(xpath = "(//span[contains(text(),'Entrance Exams')])[1]")
    public WebElement entranceExamsButton1;

    @FindBy(xpath = "(//span[contains(text(),'Setup')])[3]")
    public WebElement entranceExamsSetupButton;

    @FindBy(xpath = "(//span[contains(text(),'Entrance Exams')])[2]")
    public WebElement entranceExamsButton2;
}


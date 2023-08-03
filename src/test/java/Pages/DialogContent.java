package Pages;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends MyMethods {
    public DialogContent() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(css = "input[placeholder='Username']")
    public WebElement username;

    @FindBy(css = "input[placeholder='Password']")
    public WebElement password;

    @FindBy(xpath = "//span[normalize-space()='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='ng-star-inserted']//span[contains(text(),'Dashboard')]")
    public WebElement dashBoard;

    @FindBy(css = "svg[class='svg-inline--fa fa-plus']")
    public WebElement addButton;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    public WebElement formNameInput;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    public WebElement formCodeInput;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;


}

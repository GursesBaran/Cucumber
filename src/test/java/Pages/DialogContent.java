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

    @FindBy(xpath = "//input[starts-with(@id, 'ms-text-field-') and @data-placeholder=\"Name\"]")
    public WebElement searchNameInput;

    @FindBy(xpath = "//input[@data-placeholder='Code']")
    public WebElement searchCodeInput;

    @FindBy(xpath = "//span[text()='Search']")
    public WebElement searchButton;

    @FindBy(xpath = "//button[@color='warn']")
    public WebElement deleteButton;

    @FindBy(xpath = "(//span[normalize-space()='Delete'])[1]")
    public WebElement deleteConfirmButton;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[2]")
    public WebElement formShortNameInput;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[1]")
    public WebElement SearchShortNameInput;

    @FindBy(xpath = "//span[text()='Integration Code']")
    public WebElement feeIntegrationCode;

    @FindBy(xpath = "(//input[@data-placeholder='Priority'])[2]")
    public WebElement feePriority;


}


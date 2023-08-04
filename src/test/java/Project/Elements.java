package Project;

import Utilities.BaseDriver;
import Utilities.BaseDriverDemoBlazer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {
    public Elements() {
        PageFactory.initElements(BaseDriverDemoBlazer.driver, this);
    }

    @FindBy(xpath = "//a[text()='Phones']")
    public WebElement phones;

    @FindBy(xpath = "//a[text() ='Samsung galaxy s6']")
    public WebElement verifyPhone;

    @FindBy(xpath = "//a[text() ='Laptops']")
    public WebElement laptop;

    @FindBy(xpath = "//a[text() ='Sony vaio i5']")
    public WebElement verifyLaptop;

    @FindBy(xpath = "//a[text() ='Monitors']")
    public WebElement monitors;

    @FindBy(xpath = "//a[text() ='ASUS Full HD']")
    public WebElement verifyMonitor;

    @FindBy(xpath = "//a[@id ='logout2']")
    public WebElement logout;

    @FindBy(id = "login2")
    public WebElement logoutVerify;

    @FindBy(xpath = "//a[text() ='Add to cart']")
    public WebElement addToCart;

    @FindBy(id = "cartur")
    public WebElement goToCart;

    @FindBy(xpath = "//td[text()='360']")
    public WebElement price;

    @FindBy(id = "totalp")
    public WebElement totalPrice;

    @FindBy(xpath = "//button[text()='Place Order']")
    public WebElement placeOrder;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement name;

    @FindBy(xpath = "//input[@id='country']")
    public WebElement country;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "card")
    public WebElement creditCard;

    @FindBy(id = "month")
    public WebElement month;

    @FindBy(id = "year")
    public WebElement year;

    @FindBy(xpath = "//button[text()='Purchase']")
    public WebElement purchase;

    @FindBy(xpath = "//p[text()='Amount: 360 USD']")
    public WebElement amount;

    @FindBy(xpath = "//p[text()='Card Number: 12345678910']")
    public WebElement cardNumber;

    @FindBy(xpath = "//p[text()='Name: Baran']")
    public WebElement name2;

    @FindBy(xpath = "//p[text()='Date: 4/7/2023']")
    public WebElement date;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement okkay;


}


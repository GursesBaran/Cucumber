package Project;

import Utilities.BaseDriver;
import Utilities.BaseDriverDemoBlazer;
import Utilities.MyMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LogInWithPom extends BaseDriverDemoBlazer {
    @Test
    void test1() {
        login("BaranGurses", "Demo2023");

        Elements elements = new Elements();
        elements.phones.click();
        Assert.assertTrue(elements.verifyPhone.getText().contains("Samsung"));

        elements.laptop.click();
        MyMethods.myWait(3);
        Assert.assertTrue(elements.verifyLaptop.getText().contains("Sony vaio i5"));

        elements.monitors.click();
        MyMethods.myWait(3);
        Assert.assertTrue(elements.verifyMonitor.getText().contains("ASUS Full HD"));

        elements.logout.click();
        MyMethods.myWait(3);

        Assert.assertTrue(elements.logoutVerify.getText().contains("Log in"));

    }

    @Test
    void test2() {
        MyMethods.myWait(1);
        login("yarenss", "353535");
        Elements elements = new Elements();
        elements.phones.click();
        MyMethods.myWait(1);

        elements.verifyPhone.click(); //for adding to cart
        MyMethods.myWait(1);

        elements.addToCart.click();
        MyMethods.myWait(1);

        Assert.assertTrue(BaseDriverDemoBlazer.driver.switchTo().alert().getText().contains("Product added."));
        BaseDriverDemoBlazer.driver.switchTo().alert().accept();

        elements.goToCart.click();

        MyMethods.myWait(3);

        Assert.assertTrue(elements.price.getText().equals(elements.totalPrice.getText()));
        elements.placeOrder.click();
        MyMethods.myWait(1);
        elements.name.sendKeys("yaren");
        elements.country.sendKeys("USA");
        elements.city.sendKeys("California");
        elements.creditCard.sendKeys("12345678910");
        elements.month.sendKeys("11");
        elements.year.sendKeys("2023");
        elements.purchase.click();

        MyMethods.myWait(3);
        Assert.assertTrue(elements.amount.getText().contains("360"));
        Assert.assertTrue(elements.cardNumber.getText().contains("12345678910"));
        Assert.assertTrue(elements.name2.getText().contains("yaren"));
       Assert.assertTrue(elements.date.getText().contains("2023"));
        MyMethods.myWait(2);

        elements.okkay.click();
    }
}

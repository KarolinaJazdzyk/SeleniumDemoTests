package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class ShopTest extends BaseTest {

    @Test
    public void AddingToCartTest() {
        WebElement message = new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addingToCart()
                .getMessage();


        Assert.assertTrue(message.getText().contains("has been added to your cart"));

    }
}

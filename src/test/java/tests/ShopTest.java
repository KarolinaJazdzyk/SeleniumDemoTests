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

  /*  @Test
    public void updateCartTest() {
     WebElement totalPrice = new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addingToCart()
                .viewCart()
                .changeQuantity("3")
                .updatingCart()
                .getTotalPrice();

        Assert.assertTrue(totalPrice.getText().contains("3,00"));
*/

    @Test
    public void checkoutTest() {
        WebElement orderHeader=  new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addingToCart()
                .viewCart()
                .proceedToCheckout()
                .getOrdersHeader();

        Assert.assertEquals(orderHeader.getText(), "Orders");
    }

    @Test
    public void OrderProductTest() {
        new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addingToCart()
                .viewCart()
                .proceedToCheckout();

    }

}

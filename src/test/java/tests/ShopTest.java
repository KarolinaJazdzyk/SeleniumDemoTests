package tests;

import customers.Customer;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.OrderDetailsPage;


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
        WebElement orderHeader = new HomePage(driver)
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
        Customer customer = new Customer();

        OrderDetailsPage orderDetailsPage = new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .addingToCart()
                .viewCart()
                .proceedToCheckout()
                .fillPersonalDetails(customer, "random comments");

        Assert.assertEquals(orderDetailsPage.getConfirmationText().getText(), "Thank you. Your order has been received.");
        Assert.assertEquals(orderDetailsPage.getProductName().getText(), "Java Selenium WebDriver × 1");
    }

}

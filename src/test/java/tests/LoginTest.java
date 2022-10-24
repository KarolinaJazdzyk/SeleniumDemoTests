package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidDataTest() {
        WebElement logoutLink = new HomePage(driver).openMyAccount()
                .setLogin("tester1@tester.com")
                .setLoginPassword("123qwe!Tester")
                .loginValidData()
                .getLogoutLink();

        Assert.assertEquals(logoutLink.getText(), "Logout");
    }

    @Test
    public void loginWithInvalidDataTest() {
        WebElement error = new HomePage(driver).openMyAccount()
                .setLogin("tester1@tester.com")
                .setLoginPassword("123qwe!Tester123")
                .loginInvalidData()
                .getError();

        Assert.assertTrue(error.getText().contains("Incorrect username or password."));

    }
}

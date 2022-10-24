package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


import java.util.Random;

public class RegisterTest extends BaseTest{

    Random random= new Random();
    int n= random.nextInt(1000);
    @Test
    public void registerUserTest(){
        WebElement logoutLink= new HomePage(driver).openMyAccount()
                     .setEmail("tester" + n + "@tester.com")
                    .setPassword("123qwe!Tester")
                    .clickRegister().getLogoutLink();

        Assert.assertEquals(logoutLink.getText(),"Logout");
    }
}

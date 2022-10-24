package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoggedUserPage;

public class RegisterTest extends BaseTest{

    @Test
    public void registerUserTest(){
        new HomePage(driver).openMyAccount()
                .setEmail("tester567@tester.com")
                .setPassword("123qwetester")
                .clickRegister();
    }

}

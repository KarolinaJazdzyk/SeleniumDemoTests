package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class RegisterTest extends BaseTest{

    @Test
    public void registerUserTest(){
        new HomePage(driver).openMyAccount();
    }

}

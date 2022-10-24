package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    private WebDriver driver;

    public MyAccountPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

}

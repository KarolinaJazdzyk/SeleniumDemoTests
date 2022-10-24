package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedUserPage {


    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logoutLink;

    private WebDriver driver;

    public LoggedUserPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

    public WebElement getLogoutLink() {
        return logoutLink;
    }

}

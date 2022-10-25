package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//span[text()='My account']")
       private WebElement MyAccountLink;

    @FindBy(xpath = "//span[text()='Shop']")
    private WebElement ShopLink;

    WebDriver driver;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

    public MyAccountPage openMyAccount(){
        MyAccountLink.click();
        return new MyAccountPage(driver);
    }

    public ShopPage openShopPage(){
        ShopLink.click();
        return new ShopPage(driver);
    }


}

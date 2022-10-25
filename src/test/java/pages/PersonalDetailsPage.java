package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetailsPage {

    @FindBy(xpath = "//h1[@class='entry-title']")
    private WebElement ordersHeader;

    private WebDriver driver;
    public PersonalDetailsPage (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

    public WebElement getOrdersHeader() {
        return ordersHeader;
    }
}

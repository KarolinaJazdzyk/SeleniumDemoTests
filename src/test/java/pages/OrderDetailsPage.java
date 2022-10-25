package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderDetailsPage {

    @FindBy(xpath = "//div[@class='woocommerce-order']//p")
    private WebElement orderConfirmationText;

    @FindBy(xpath = "//td[contains(@class,'product-name')]")
    private WebElement productName;


    private WebDriver driver;

    public OrderDetailsPage(WebDriver driver) {

    }

    public WebElement getConfirmationText() {

        return orderConfirmationText;
    }

    public WebElement getProductName() {
        return productName;

    }
}

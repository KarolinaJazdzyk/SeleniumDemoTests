package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    @FindBy(name = "add-to-cart")
    private WebElement addToCartButton;

    @FindBy(className = "woocommerce-message")
    private WebElement message;

    @FindBy(xpath = "//div[@class='woocommerce-message']//a[text()='View cart']")
    private WebElement viewCartButton;


    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public ProductPage addingToCart() {
        addToCartButton.click();
        return this;
    }

    public WebElement getMessage() {
        return message;
    }

    public CartPage viewCart() {
        viewCartButton.click();
        return new CartPage(driver);
    }
}
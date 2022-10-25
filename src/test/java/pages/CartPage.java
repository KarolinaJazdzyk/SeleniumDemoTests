package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    @FindBy(xpath = "//input[@class= 'input-text qty text']")
    private WebElement quantityInput;

    @FindBy(name = "update_cart")
    private WebElement updateCartButton;

    @FindBy(xpath = "//td[@class='product-price] //span[@class='woocommerce-Price-amount amount']")
    private WebElement productPrice;

    @FindBy(xpath = "//tr[@class='order-total']//span[@class='woocommerce-Price-amount amount']")
    private WebElement totalPrice;

    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
    private WebElement proceedToCheckoutLink;

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public CartPage changeQuantity(String amount) {
        quantityInput.clear();
        quantityInput.sendKeys(amount);
        return this;
    }

    public CartPage updatingCart() {
        updateCartButton.click();
        return this;
    }

    public WebElement getTotalPrice() {
        return totalPrice;
    }

    public PersonalDetailsPage proceedToCheckout() {
        proceedToCheckoutLink.click();
        return new PersonalDetailsPage(driver);
    }
}

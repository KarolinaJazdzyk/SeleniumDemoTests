package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import customers.Customer;


public class PersonalDetailsPage {

    @FindBy(xpath = "//h1[@class='entry-title']")
    private WebElement ordersHeader;

    @FindBy(id = "billing_first_name")
    private WebElement fistNameInput;

    @FindBy(id = "billing_last_name")
    private WebElement lastNameInput;

    @FindBy(id = "billing_country")
    private WebElement billingCountry;

    @FindBy(id = "billing_address_1")
    private WebElement billingAddress;

    @FindBy(id = "billing_postcode")
    private WebElement billingPostcode;

    @FindBy(id = "billing_city")
    private WebElement billingCity;

    @FindBy(id = "billing_phone")
    private WebElement billingPhone;

    @FindBy(id = "billing_email")
    private WebElement billingEmail;

    @FindBy(id = "order_comments")
    private WebElement orderComments;

    @FindBy(id = "place_order")
    private WebElement placeOrderButton;

    private WebDriver driver;

    public PersonalDetailsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getOrdersHeader() {
        return ordersHeader;
    }

    public OrderDetailsPage fillPersonalDetails(Customer customer, String comments) {
        fistNameInput.sendKeys(customer.getFirstName());
        lastNameInput.sendKeys(customer.getLastName());

        Select countrySelect = new Select(billingCountry);
        countrySelect.selectByVisibleText(customer.getCountry());
        billingAddress.sendKeys(customer.getAddress());
        billingPostcode.sendKeys(customer.getPostcode());
        billingCity.sendKeys(customer.getCity());
        billingPhone.sendKeys(customer.getPhone());
        billingEmail.sendKeys(customer.getEmail());
        orderComments.sendKeys(comments);
        placeOrderButton.click();

        return new OrderDetailsPage(driver);
    }
}

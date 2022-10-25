package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    @FindBy(id = "reg_email")
    private WebElement regEmailInput;

    @FindBy(id = "reg_password")
    private WebElement regPasswordInput;

    @FindBy(name = "register")
    private WebElement registerButton;

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(name = "login")
    private WebElement loginButton;

    @FindBy(xpath = "//ul[@class='woocommerce-error']")
    private WebElement error;

    private WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public MyAccountPage setEmail(String email) {
        regEmailInput.sendKeys(email);
        return this;
    }

    public MyAccountPage setPassword(String password) {
        regPasswordInput.sendKeys(password);
        return this;
    }

    public LoggedUserPage clickRegister() {
        registerButton.click();
        return new LoggedUserPage(driver);
    }

    public MyAccountPage setLogin(String email) {
        usernameInput.sendKeys(email);
        return this;
    }

    public MyAccountPage setLoginPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public LoggedUserPage loginValidData() {
        loginButton.click();
        return new LoggedUserPage(driver);
    }

    public MyAccountPage loginInvalidData() {
        loginButton.click();
        return this;
    }

    public WebElement getError() {
        return error;
    }
}

package Malik;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements {
    public Elements() {PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(linkText = "Log out")
    public List<WebElement> logout;
    @FindBy(linkText = "Register")
    public WebElement register;
    @FindBy(id = "gender-male")
    public WebElement genderMale;
    @FindBy(id = "FirstName")
    public WebElement firstName;
    @FindBy(id = "LastName")
    public WebElement lastName;
    @FindBy(name = "DateOfBirthDay")
    public WebElement brthDay;
    @FindBy(name = "DateOfBirthMonth")
    public WebElement brthMonth;
    @FindBy(name = "DateOfBirthYear")
    public WebElement brthYear;
    @FindBy(id = "Email")
    public WebElement email;
    @FindBy(id = "Company")
    public WebElement companyName;
    @FindBy(id = "Password")
    public WebElement password;
    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPassword;
    @FindBy(id = "register-button")
    public WebElement registerBtn;
    @FindBy(xpath = "//div[text()='Your registration completed']")
    public WebElement registerMsg;
    @FindBy(linkText = "Log in")
    public WebElement login;
    @FindBy(css = "[placeholder='Search store']")
    public WebElement searchInput;
    @FindBy(css = ".item-grid div.item-box")
    public List<WebElement> resultList;
    @FindBy(xpath = "//button[text()='Add to cart']")
    public List<WebElement> addToCart;
    @FindBy(css = "ul[class='top-menu notmobile']>li")
    public List<WebElement> tabMenu;
    @FindBy(xpath = "(//a[@href='/computers'])[1] ")
    public WebElement computers;
    @FindBy(css = "[class='button-1 login-button']")
    public WebElement loginBtn;
    @FindBy(css = ".product-name>h1")
    public WebElement productName;
    @FindBy(linkText = "Home")
    public WebElement homePage;
    @FindBy(xpath = "(//a[@href='/notebooks'])[1]")
    public WebElement notebooks;



}

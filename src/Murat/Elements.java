package Murat;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends BaseDriver {
    public Elements(){
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy (xpath = "//a[text()='Register']")
    public WebElement register;

    @FindBy(id = "gender-male")
    public WebElement cinsiyet;

    @FindBy(id = "FirstName")
    public WebElement firstname;

    @FindBy(id ="LastName")
    public WebElement lastname;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id="Password")
    public WebElement password;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPassword;

    @FindBy(id = "register-button")
    public  WebElement onayla;

    @FindBy(xpath = "//div[text()='Your registration completed']")
    public WebElement dogrulama;

    @FindBy(xpath = "//a[text()='Continue']")
    public WebElement devam;

    @FindBy(xpath = "(//a[text()='Gift Cards '])[1]")
    public WebElement giftCard;

    @FindBy(xpath = "(//button[@class='button-2 product-box-add-to-cart-button'])[2]")
    public WebElement addToCart;

    @FindBy(id = "giftcard_44_RecipientName")
    public WebElement recipientName;

    @FindBy(id = "giftcard_44_SenderName")
    public WebElement senderName;

    @FindBy(id = "giftcard_44_Message")
    public WebElement giftMesaj;

    @FindBy(id = "add-to-cart-button-44")
    public WebElement addBtn;

    @FindBy(xpath = "//div[@id='bar-notification']/div/p")
    public WebElement bosAssert;

    @FindBy(xpath = "//*[@id='bar-notification']/div/p")
    public  WebElement asert;

    @FindBy(xpath = "//span[@class='close']")
    public WebElement asertKapama;

    @FindBy(xpath = "//a[@class='ico-login']")
    public WebElement login;

    @FindBy(css = "[class='button-1 login-button']")
    public WebElement loginBttn;

}

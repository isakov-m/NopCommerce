import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements {
    public  Elements() {
        PageFactory.initElements(BaseDriver.driver,this);
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

    //Emre
    @FindBy (xpath = "//a[@href='/logout']")
    public  WebElement logoutDogrulama;
    @FindBy(id = "small-searchterms")
    public  WebElement search;
    @FindBy(xpath = "//a[text()='Adobe Photoshop CS4']")
    public WebElement searcdgrlma;



    //Senol
    @FindBy(xpath = "(//a[text()='Computers '])[1]")
    public WebElement computersTabMenu;
    @FindBy(xpath = "(//a[text()='Desktops '])[1]")
    public WebElement desktopLink;
    @FindBy(xpath = "//div[@class='page-title']//h1")
    public WebElement pageTitle;
    @FindBy(xpath = "//div[@data-productid='1']")
    public WebElement builYourOwnComputerLink;
    @FindBy(xpath = "//select[@name='product_attribute_2']")
    public WebElement ramSelectButton;
    @FindBy(xpath = "//option[contains( text(), 'GB' )]")
    public List<WebElement> ramList;
    @FindBy(xpath = "//ul[@data-attr='3']//li/input")
    public List<WebElement> hddList;
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    public WebElement addToCartButton;
    @FindBy(xpath = "//p[text()='The product has been added to your ']")
    public WebElement shoppingCartMessage;
    @FindBy(xpath = "(//a[@href='/notebooks'])[1]")
    public WebElement  notebooksLink;
    @FindBy(xpath = "(//a[@href='/software'])[1]")
    public WebElement   softwareLink;
    @FindBy(xpath = "(//a[text()='Electronics '])[1]")
    public WebElement   electronicsTabMenu;
    @FindBy(xpath = "(//a[@href='/camera-photo'])[1]")
    public WebElement    cameraPhotoLink;
    @FindBy(xpath = "(//a[@href='/cell-phones'])[1]")
    public WebElement    cellPhonesLink;
    @FindBy(xpath = "(//a[@href='/others'])[1]")
    public WebElement    othersLink;
    @FindBy(xpath = "(//ul[@class='top-menu notmobile']//li)[9]/a")
    public WebElement    apparelTabMenu;
    @FindBy(xpath = "(//a[@href='/shoes'])[1]")
    public WebElement    shoesLink;
    @FindBy(xpath = "(//a[@href='/clothing'])[1]")
    public WebElement     clothingLink;
    @FindBy(xpath = "(//a[@href='/accessories'])[1]")
    public WebElement      accessoriesLink;
    @FindBy(xpath = "(//a[text()='Digital downloads '])[1]")
    public WebElement       digitalDownloadLinks;
    @FindBy(xpath = "(//a[text()='Books '])[1]")
    public WebElement       booksLinks;
    @FindBy(xpath = "(//a[text()='Jewelry '])[1]")
    public WebElement       jewelryLinks;
    @FindBy(xpath = "(//a[text()='Gift Cards '])[1]")
    public WebElement       giftCardLinks;


    //Murat
    @FindBy(xpath = "(//a[text()='Gift Cards '])[1]")
    public WebElement giftCard;

    @FindBy(xpath = "(//button[@class='button-2 product-box-add-to-cart-button'])[2]")
    public WebElement addToCartBtn;

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

}

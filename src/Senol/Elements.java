package Senol;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements {

    public Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginLink;
    @FindBy(xpath = "//input[@id='Email']")
    public WebElement emailInput;
    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[text()='Log in']")
    public WebElement loginButton;
    @FindBy(xpath = "(//a[text()='Computers '])[1]")
    public WebElement computersTab;
    @FindBy(xpath = "(//a[text()='Desktops '])[1]")
    public WebElement desktopLink;
    @FindBy(xpath = "//div[@class='page-title']//h1")
    public WebElement pageTitle;
    @FindBy(xpath = "//div[@data-productid='1']")
    public WebElement builYourOwnComputerLink;
    @FindBy(xpath = "//select[@name='product_attribute_2']")
    public  WebElement ramSelectButton;
    @FindBy(xpath = "//option[contains( text(), 'GB' )]")
    public List<WebElement> ramList;
    @FindBy(xpath = "//ul[@data-attr='3']//li/input")
    public List<WebElement> hddList;
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    public WebElement  addToCartButton;
    @FindBy(xpath = "//p[text()='The product has been added to your ']")
    public WebElement shoppingCartMessage;


}


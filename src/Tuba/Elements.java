package Tuba;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {

    public Elements() {

        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(linkText = "//*[@class='ico-login']")
    public WebElement login;

    @FindBy(xpath ="//*[@class='email']")
    public WebElement email;

    @FindBy(xpath ="//*[@class='password']")
    public WebElement password;

    @FindBy(xpath ="//input[@id='RememberMe']")
    public WebElement rememberMe;

    @FindBy(xpath ="//*[@class='button-1 login-button']")
    public WebElement loginBtn;

//    @FindBy(linkText = "//*[@class='Log out']")
//    public WebElement logout;
//
//    @FindBy(className = "//*[@class='message-error validation-summary-errors']")
//    public WebElement loginErrorMsg ;



}

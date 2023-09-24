package Emre;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class Elements {

        public  Elements() {
            PageFactory.initElements(BaseDriver.driver,this);
        }


        @FindBy (xpath = "//a[@class='ico-login']")
        public WebElement lgn;

        @FindBy  (id ="Email")
        public  WebElement eml;
        @FindBy  (id ="Password")
        public  WebElement pss;
        @FindBy (xpath = "//button[@class='button-1 login-button' and text()='Log in']")
        public WebElement lbtn;
        @FindBy (xpath = "//a[@href='/logout']")
        public  WebElement dogrulama;
        @FindBy(id = "small-searchterms")
        public  WebElement search;
        @FindBy(xpath = "//a[text()='Adobe Photoshop CS4']")
        public WebElement searcdgrlma;


    }


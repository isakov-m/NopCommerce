package Murat;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class US_05_Gift01_HediyeSiparişiVermeİşlemi extends BaseDriver {
    @Test(priority = 1)
    public <def> void TestRegister(){
        Elements e=new Elements();


        e.myClick(e.register);
        e.myClick(e.cinsiyet);
        e.mySendKeys(e.firstname,"Murat");
        e.mySendKeys(e.lastname,"Sahin");
        e.mySendKeys(e.email,"mrtt@gmail.com");
        e.mySendKeys(e.password,"mrt12345");
        e.mySendKeys(e.confirmPassword,"mrt12345");
        e.myClick(e.onayla);
        Assert.assertTrue(e.dogrulama.getText().equals("Your registration completed"));
        e.myClick(e.devam);
    }
    @Test(priority = 2)
    public void Testlogin(){
        Elements e=new Elements();

        e.myClick(e.login);
        e.mySendKeys(e.email,"mrt@gmail.com");
        e.mySendKeys(e.password,"mrt12345");
        e.myClick(e.loginBttn);

    }
    @Test(priority = 3)
    public void TestGiftCard(){
        Elements e=new Elements();

        e.myClick(e.giftCard);
        e.myClick(e.addToCart);
        e.myClick(e.addBtn);
        Assert.assertTrue(e.bosAssert.getText().equals("Enter valid recipient name"));
        e.myClick(e.asertKapama);
        e.mySendKeys(e.recipientName,"Abbas");
        e.mySendKeys(e.senderName,"Murat");
        e.mySendKeys(e.giftMesaj,"GÜLE GÜLE KULLAN!");
        e.myClick(e.addBtn);
        Assert.assertTrue(e.asert.getText().equals("The product has been added to your shopping cart"));
        e.myClick(e.asertKapama);
    }
}

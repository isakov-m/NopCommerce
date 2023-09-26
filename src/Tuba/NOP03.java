package Tuba;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class NOP03 extends BaseDriver {

    @Test(dataProvider = "datalar")
    public void Login(String email, String password) {

        Elements e=new Elements();
        //myClick(e.login);
        WebElement loginButton = driver.findElement(By.linkText("//*[@class='ico-login']"));
        loginButton.click();
//        mySendKeys(e.email, email);
//        mySendKeys(e.password, password);
        e.email.sendKeys(email);
        e.password.sendKeys(password);
        myClick(e.rememberMe);
        myClick(e.loginBtn);


        WebElement unsuccessful = driver.findElement(By.cssSelector("div[class='message-error validation-summary-errors']"));
        Assert.assertTrue(unsuccessful.getText().contains("Login was unsuccessful"));

//        if (driver.getCurrentUrl().equals(loginS))
//        {
//            Assert.assertTrue(e.loginErrorMsg.getText().contains("Login was unsuccessful"),"Login in Hata Mesaj verilmedi");
//        }else
//        {
//            Assert.assertEquals(e.logout.getText(), "Log out", "Hata");
//        }
    }

    @DataProvider
    public Object[][] datalar() {
        return new Object[][]{{"email", "sifre"}, {"", "sifre"},
                {"email", ""}, {"", ""}, {"a", "sifre"}, {"email", "b"}, {"tuba_caglar@hotmail.de", "TubaXXX"}};
    }


}



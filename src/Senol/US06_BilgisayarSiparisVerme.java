package Senol;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class US06_BilgisayarSiparisVerme extends BaseDriver {

    @Test

    public void nopCommerce() {

        Elements e = new Elements();

        driver.get("https://demo.nopcommerce.com/");

        myClick(e.loginLink);
        mySendKeys(e.emailInput, "aliCabbar@gmail.com");
        mySendKeys(e.passwordInput, "123456");
        myClick(e.loginButton);
        visibilityOf(e.computersTab);
        moveToElement(e.computersTab);
        myClick(e.desktopLink);
        visibilityOf(e.pageTitle);
        Assert.assertTrue(e.pageTitle.getText().toLowerCase().contains("desktop"), "Desktop sayfasinda degilsiniz");
        myClick(e.builYourOwnComputerLink);
        toBeClickable(e.ramSelectButton);
        myClick(e.ramSelectButton);
        e.ramList.get(new Random().nextInt(e.ramList.size())).click();
        e.hddList.get(new Random().nextInt(e.hddList.size())).click();
        scrollToElement(e.addToCartButton);
        myClick(e.addToCartButton);
        visibilityOf(e.shoppingCartMessage);
        Assert.assertTrue(e.shoppingCartMessage.getText().toLowerCase().contains("product has been added"));


    }
}

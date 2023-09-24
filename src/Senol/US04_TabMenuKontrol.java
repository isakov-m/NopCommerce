package Senol;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US04_TabMenuKontrol extends BaseDriver {

    @Test

    public void nopCommerce() throws InterruptedException {

        Elements e = new Elements();

        driver.get("https://demo.nopcommerce.com/");

        myClick(e.loginLink);
        mySendKeys(e.emailInput, "aliCabbar@gmail.com");
        mySendKeys(e.passwordInput, "123456");
        myClick(e.loginButton);

        //computers
        visibilityOf(e.computersTabMenu);
        moveToElement(e.computersTabMenu);
        toBeClickable(e.desktopLink);
        myClick(e.desktopLink);
        waitUrlContains("desktop");
        Assert.assertTrue(driver.getCurrentUrl().contains("desktop"));
        driver.navigate().back();

        visibilityOf(e.computersTabMenu);
        moveToElement(e.computersTabMenu);
        toBeClickable(e.notebooksLink);
        myClick(e.notebooksLink);
        waitUrlContains("notebooks");
        Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
        driver.navigate().back();

        visibilityOf(e.computersTabMenu);
        moveToElement(e.computersTabMenu);
        toBeClickable(e.softwareLink);
        myClick(e.softwareLink);
        waitUrlContains("software");
        Assert.assertTrue(driver.getCurrentUrl().contains("software"));
        driver.navigate().back();

        //Electronis
        visibilityOf(e.electronicsTabMenu);
        moveToElement(e.electronicsTabMenu);
        toBeClickable(e.cameraPhotoLink);
        myClick(e.cameraPhotoLink);
        waitUrlContains("camera-photo");
        Assert.assertTrue(driver.getCurrentUrl().contains("camera-photo"));
        driver.navigate().back();

        visibilityOf(e.electronicsTabMenu);
        moveToElement(e.electronicsTabMenu);
        toBeClickable(e.cellPhonesLink);
        myClick(e.cellPhonesLink);
        waitUrlContains("cell-phones");
        Assert.assertTrue(driver.getCurrentUrl().contains("cell-phones"));
        driver.navigate().back();

        visibilityOf(e.electronicsTabMenu);
        moveToElement(e.electronicsTabMenu);
        toBeClickable(e.othersLink);
        myClick(e.othersLink);
        waitUrlContains("others");
        Assert.assertTrue(driver.getCurrentUrl().contains("others"));
        driver.navigate().back();

        //Apparel
        visibilityOf(e.apparelTabMenu);
        moveToElement(e.apparelTabMenu);
        toBeClickable(e.shoesLink);
        myClick(e.shoesLink);
        waitUrlContains("shoes");
        Assert.assertTrue(driver.getCurrentUrl().contains("shoes"));
        driver.navigate().back();

        visibilityOf(e.apparelTabMenu);
        moveToElement(e.apparelTabMenu);
        toBeClickable(e.clothingLink);
        myClick(e.clothingLink);
        waitUrlContains("clothing");
        Assert.assertTrue(driver.getCurrentUrl().contains("clothing"));
        driver.navigate().back();

        visibilityOf(e.apparelTabMenu);
        moveToElement(e.apparelTabMenu);
        toBeClickable(e.accessoriesLink);
        myClick(e.accessoriesLink);
        waitUrlContains("accessories");
        Assert.assertTrue(driver.getCurrentUrl().contains("accessories"));
        driver.navigate().back();

        //digital Downloads
        toBeClickable(e.digitalDownloadLinks);
        myClick(e.digitalDownloadLinks);
        waitUrlContains("digital-downloads");
        Assert.assertTrue(driver.getCurrentUrl().contains("digital-downloads"));
        driver.navigate().back();

        //books
        toBeClickable(e.booksLinks);
        myClick(e.booksLinks);
        waitUrlContains("books");
        Assert.assertTrue(driver.getCurrentUrl().contains("books"));
        driver.navigate().back();

        //jewelry
        toBeClickable(e.jewelryLinks);
        myClick(e.jewelryLinks);
        waitUrlContains("jewelry");
        Assert.assertTrue(driver.getCurrentUrl().contains("jewelry"));
        driver.navigate().back();

        //gift cards
        toBeClickable(e.giftCardLinks);
        myClick(e.giftCardLinks);
        waitUrlContains("gift-cards");
        Assert.assertTrue(driver.getCurrentUrl().contains("gift-cards"));
        driver.navigate().back();

    }
}







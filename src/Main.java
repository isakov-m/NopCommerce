
import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Main extends BaseDriver {

    @Test(groups = {"Smoke", "UserRegistiration"})
    public void NOP01_Register() throws IOException {
        Elements e = new Elements();

        driver.get("https://demo.nopcommerce.com");
        myClick(e.register);
        myClick(e.genderMale);
        mySendKeys(e.firstName, "Techno Eighteen");
        mySendKeys(e.lastName, "Techno");
        selectByIndexRandom(e.brthDay);
        selectByIndexRandom(e.brthMonth);
        selectByIndexRandom(e.brthYear);
        mySendKeys(e.email, "tech111111@mail.ru");
        mySendKeys(e.companyName, "TECH");
        mySendKeys(e.password, "DoubleGG");
        mySendKeys(e.confirmPassword, "DoubleGG");
        myClick(e.registerBtn);
        visibilityOf(e.registerMsg);
        Assert.assertTrue(e.registerMsg.getText().equals("Your registration completed"), "Kayit olusturulamadi.");

        if (e.logout.size()<=0) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File hafizadakiHali = ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
            FileUtils.copyFile(hafizadakiHali, new File("SC\\loginFail.png"));
        }
    }

    @Test(groups = {"LoginTest", "Smoke"})
    public void NOP02_Login() {
        Elements e = new Elements();
        driver.get("https://demo.nopcommerce.com");
        myClick(e.login);
        mySendKeys(e.email, "qwerty@mail.ru");
        mySendKeys(e.password, "DoubleGG");
        myClick(e.loginBtn);
        visibilityOf(e.logoutDogrulama);
        Assert.assertTrue(e.logoutDogrulama.getText().contains("Log out"), "Login islemi basarisiz oldu.");
    }

    @Test(dataProvider = "datalar", groups = {"LoginTest", "Smoke"})
    public void NOP03(String email, String password) {

        Elements e = new Elements();
        driver.get("https://demo.nopcommerce.com");

        myClick(e.login);
        e.email.sendKeys(email);
        e.password.sendKeys(password);
        myClick(e.rememberMe);
        myClick(e.loginBtn);
        String loginS = driver.getCurrentUrl();
        if (driver.getCurrentUrl().equals(loginS)) {
            Assert.assertTrue(e.unsuccesfulMsg.getText().contains("Login was unsuccessful"), "Login in Hata Mesaj verilmedi");
        } else {
            Assert.assertEquals(e.logOut.getText(), "Log out", "Hata");
        }
    }

    @DataProvider
    public Object[][] datalar() {
        return new Object[][]{{"tuba_caglar@hotmail.de", "sifre"}, {"tuba_caglar@hotmail.de", "sifre"},
                {"tuba_caglar@hotmail.de", ""}, {"tuba_caglar@hotmail.de", ""}, {"tuba_caglar@hotmail.de", "sifre"}, {"tuba_caglar@hotmail.de", "b"}, {"tuba_caglar@hotmail.de", "TubaXXX"}};
    }


    @Test(groups = {"TAB Menu", "UI Testing"})
    public void NOP04_TabMenu() throws InterruptedException {

        Elements e = new Elements();

        Login();

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

    @Test(groups = {"parametreli", "UI Testing", "Search", "TAB Menu", "Regression"})
    @Parameters("searchNotebook")
    public void NOP04_TabMenu2(String searchtext) {
        Elements e = new Elements();
        Login();
        mySendKeys(e.searchInput, searchtext + Keys.ENTER);
        e.resultList.get(new Random().nextInt(e.resultList.size())).click();
        myClick(e.homePage);
        scrollToElement(e.computers);

        boolean bulundu = false;
        do {
            moveToElement(e.computers);
            myClick(e.notebooks);
            MyFunc.Bekle(3);

            for (WebElement ell : e.resultList) {
                if (ell.getText().contains(searchtext)) {
                    bulundu = true;
                    System.out.println("bulundu");
                    break;
                }
            }
        } while (bulundu);
    }

    @Test(groups = {"UI Testing", "TAB Menu", "Siparis Testleri"})
    public void NOP05_GiftCard() {
        Elements e = new Elements();

        Login();
        visibilityOf(e.logoutDogrulama);
        Assert.assertTrue(e.logoutDogrulama.getText().contains("Log out"), "Login islemi basarisiz oldu.");

        myClick(e.giftCard);
        myClick(e.addToCartBtn);
        myClick(e.addBtn);
        Assert.assertTrue(e.errorMsg.getText().equals("Enter valid recipient name"));
        myClick(e.asertKapama);
        mySendKeys(e.recipientName, "Abbas");
        mySendKeys(e.senderName, "Murat");
        mySendKeys(e.giftMesaj, "GÜLE GÜLE KULLAN!");
        myClick(e.addBtn);
        visibilityOf(e.succesMsg);
        System.out.println("e.Assert.getText() = " + e.succesMsg.getText());
        Assert.assertTrue(e.succesMsg.getText().contains("The product has been added to your "), "Gift Card eklenemedi.");
    }


    @Test(groups = {"UI Testing", "TAB Menu", "Order Tests"})
    public void NOP06_Siparis() {

        Elements e = new Elements();

        Login();
        visibilityOf(e.computersTabMenu);
        moveToElement(e.computersTabMenu);
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

    @Test(groups = {"parametreli", "UI Testing", "Search", "Smoke", "Regression"})
    @Parameters("searchAdobe")
    public void NOP07_ParametreliArama(String aranacakKelime) {
        Elements e = new Elements();

        Login();
        mySendKeys(e.search, aranacakKelime + Keys.ENTER);
        visibilityOf(e.searcdgrlma);
        Assert.assertTrue(e.searcdgrlma.getText().contains("Adobe Photoshop CS4"), "Dogrulanamadi");
        bekleVeKapat();
    }


    public void Login() {
        Elements e = new Elements();

        driver.get("https://demo.nopcommerce.com");
        MyFunc.Bekle(5);
        myClick(e.login);
        mySendKeys(e.email, "qwerty@mail.ru");
        mySendKeys(e.password, "DoubleGG");
        myClick(e.loginBtn);
        visibilityOf(e.logoutDogrulama);
        Assert.assertTrue(e.logoutDogrulama.getText().contains("Log out"), "Login islemi basarisiz oldu.");
    }


}

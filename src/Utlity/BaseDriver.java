package Utlity;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BaseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeMethod
    public void baslangicIslemleri() {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://demo.nopcommerce.com");

    }
    @AfterMethod
    public void bekleVeKapat() {
        MyFunc.Bekle(3);
        driver.quit();
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("window.scrollBy(0, -50);");

        MyFunc.Bekle(1);
    }

    public void myClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void mySendKeys(WebElement element, String yazi) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(yazi);
    }

    public void moveToElement(WebElement element) {
        MyFunc.Bekle(3);
        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.moveToElement(element).build();
        aksiyon.perform();
    }

    public void visibilityOf(WebElement e) {
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void toBeClickable(WebElement e) {
        wait.until(ExpectedConditions.elementToBeClickable(e));
    }
    public void selectByIndexRandom(WebElement e){
        wait.until(ExpectedConditions.elementToBeClickable(e));
        Select s=new Select(e);
        s.selectByIndex(new Random().nextInt(10));

    }

    public void waitUrlContains(String text) {
        wait.until(ExpectedConditions.urlContains(""));
    }



    }

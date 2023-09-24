
    package Emre;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

    public class _US7_SearchParametre extends BaseDriver {
        @Test
        @Parameters("searchText")
        public void TS7(String aranacakKelime) {

            Elements e = new Elements();

            e.lgn.click();
            e.eml.sendKeys("testng@gmail.com");
            e.pss.sendKeys("123456");
            e.lbtn.click();
            visibilityOf(e.search);
            e.search.sendKeys(aranacakKelime + Keys.ENTER);
            visibilityOf(e.searcdgrlma);
            Assert.assertTrue(e.searcdgrlma.getText().contains("Adobe Photoshop CS4"), "Dogrulanamadi");


            bekleVeKapat();
        }
    }



    package Emre;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class _US2_Login extends BaseDriver {

        @Test
        public void  TS2(){

            Elements e=new Elements();

            e.lgn.click();
            e.eml.sendKeys("testng@gmail.com");
            e.pss.sendKeys("123456");
            e.lbtn.click();
            visibilityOf(e.logoutDogrulama);
            Assert.assertTrue(e.logoutDogrulama.getText().contains("Log out"), "Dogrulanamadi");


        }
    }


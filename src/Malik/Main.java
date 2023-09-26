package Malik;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Main extends BaseDriver {
    @Test(enabled = false)
    public void NOP01() throws IOException {
        Elements e=new Elements();

        myClick(e.register);
        myClick(e.genderMale);
        mySendKeys(e.firstName, "Techno Eighteen");
        mySendKeys(e.lastName, "Techno");
        selectByIndexRandom(e.brthDay);
        //selectByIndexRandom(e.brthMonth);
        selectByIndexRandom(e.brthYear);
        mySendKeys(e.email,"tech1@mail.ru");
        mySendKeys(e.companyName,"TECH");
        mySendKeys(e.password,"DoubleGG");
        mySendKeys(e.confirmPassword,"DoubleGG");
        myClick(e.registerBtn);
        visibilityOf(e.registerMsg);
        Assert.assertTrue(e.registerMsg.getText().equals("Your registration completed"),"Kayit olusturulamadi.");

        if (e.logout.isEmpty()) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File hafizadakiHali = ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
            FileUtils.copyFile(hafizadakiHali, new File("SC\\lofinFail.png"));
        }
    }


    @Test
    @Parameters("searchText")
    public void NOP04_TabMenu2(String searchtext){
        Elements e=new Elements();
        myClick(e.login);
        mySendKeys(e.email,"tech@mail.ru");
        mySendKeys(e.password,"Bishkek123");
        myClick(e.loginBtn);
        mySendKeys(e.searchInput,searchtext+ Keys.ENTER);
        e.resultList.get(new Random().nextInt(e.resultList.size())).click();
        myClick(e.homePage);
        scrollToElement(e.computers);

        boolean bulundu = false;
        do {
            moveToElement(e.computers);
            myClick(e.notebooks);
            MyFunc.Bekle(3);


                for (WebElement ell : e.resultList) {
                    if (ell.getText().contains(searchtext))
                    {
                        bulundu = true;
                        System.out.println("bulundu");
                        break;
                    }
            }
        }while (bulundu);
    }
}

package tests.day21;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.Set;

public class C01_WindowHandleReusableMethods {

    @Test
    public void test01(){
        // https://demoqa.com/browser-windows
        // new tab tuşuna basın
        // new taba geçip titlein new tab oldugunu test edin

        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaWindowHandle=Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.linkText("Click Here")).click();

        Set<String>handleSeti=Driver.getDriver().getWindowHandles();

        String ikinciSayfaHandle="";


        for (String e:handleSeti
             ) {
            if (e.equals(ilkSayfaWindowHandle)) {
                ikinciSayfaHandle=e;
            }
        }


        Driver.getDriver().switchTo().window(ikinciSayfaHandle);

        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);



    }


    @Test
    public void windowHandlereusableTest() throws IOException {

        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        ReusableMethods.switchToWindow("New Window");


        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
        ReusableMethods.getScreenshot("WindowSwitch");
        Driver.closeDriver();



    }



}

package tests.day22;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class C01_TestNGReports extends TestBaseRapor {

    @Test
    public void windowHandleTest() throws IOException {

        extentTest=extentReports.createTest("window handle","title ile 2.sayfaya geçis yapılmalıdır");
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        extentTest.info("herokuapp sayfasına gidildi.");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        extentTest.info("yeni window linkine tıklandı.");

        ReusableMethods.switchToWindow("New Window");
        extentTest.info("resusable method kullanarak açılan ikinci sayfaya gidildi");
        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
        extentTest.pass("titlein beklenen deger ile aynı oldugu test edildi.");


    }



}

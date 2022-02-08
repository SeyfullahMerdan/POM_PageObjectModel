package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageIlkClass {

    // Amazona gidelim, Nutellayı aratalım, Sonuçların Nutella içerdigini test edelim.

    // POM de farklı classlara farklı şekilde ulaşılması benimsenmiştir.
    // Driver class'ı için static yöntemi kullanıyoruz.
    // Page class'ları için ise obje üzerinden kullanılması tercih edilmiştir.
    // Bu bir GENEL KONSEPTTİR.

    @Test
    public void test01(){

        Driver.getDriver().get("https://www.amazon.com");
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        String actualSonucStr=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualSonucStr.contains("Nutella"));
        Driver.closeDriver();
    }

    @Test (groups="miniRegression")
    public void Test02(){
        // amazona gidelim java için arama yapalım, sonucun java içerdigini test edelim.

        Driver.getDriver().get("https://www.amazon.com");
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("java" + Keys.ENTER);
        String sonucYazisiStr=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(sonucYazisiStr.contains("java"));






    }








}

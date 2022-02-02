package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest {

    @Test
    public void test01(){

        // amazona gidelim ,gittigimizi test edelim.

        Driver.getDriver().get("https://www.amazon.com");


        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Amazon"));

        String actualUrl=Driver.getDriver().getCurrentUrl();


        // Driver.getDriver methodu her çalıştırılıgında driver=new ChromeDriver komutundan
        // ötürü yeni bir driver oluşturuyor.

        // Biz driver class'dan getDriveri ilk çalıştırdıgımızda new ataması olsun
        // sonraki çalıştırmalarda atama olmasın istiyoruz

        // Bunun için bu satırı bir if blogu içine alacagız
        Driver.closeDriver();
    }

    @Test
    public void test02(){

        // BestBuy ana sayfaya gidelim. BEstBuya gittigimizi dogrulayalım.

        Driver.getDriver().get("https://www.bestbuy.com");

        String actualURL=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains("bestbuy"));


        Driver.closeDriver();

    }







    }

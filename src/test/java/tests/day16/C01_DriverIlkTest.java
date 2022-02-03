package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest {

    // Normalde her bir classda extends ile chil yapuıyorduk şimdi ise bunu bıraktık.
    // Extends olmadan şuanda İki ihtimalimiz var:
    // Ya static yapıp class ismi ile ulaşacagız; ya da static yapmayıp obje ile ulaşacagız.
    // POM'da driveri static methodlarla kullanırız. Page sayfalarını ise obje oluşturarak kullanırız.
    // POM'da bu tercih bize bırakılmamış, bu şekilde kullanılması uygun görülmüş.

    // Artık drivera ihtiyaç varsa Driver.getDriver() yazacagız.

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
     // POM temelde 3 class içerir. Tests ve Pages ve Utilities...
    // -- Sadece testleri execute etmek için gerekli adımlar yazılacak. Data giriş olmayack
    // -- Test yapıalcak sayfadaki WebElementlerini locate etmek ve methodlar için kullanılır
    // -- Driver,TestBase ve ConfigurationReader classlarını içerir.

    // Tekrar tekrar locate etmekten kurtulmak için yapıyoruz. Bu şekilde bir defa locate edip sürekli kullanıyoruz.
    }

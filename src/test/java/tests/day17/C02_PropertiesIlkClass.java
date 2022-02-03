package tests.day17;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PropertiesIlkClass {

    @Test
    public void pozitifLoginTest(){
        // Hotel My Camp siteine positiv login testini POM'a tam uygun olarak yapınız

        //    https://www. hotelmycamp.com/ adresine git
        //        login butonuna bas
        //    test data username: manager ,
        //    test data password : Manager1!
        //    Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

  //Driver.getDriver().get("buraya properties dosyasına git HMCUrl'e karşılık gelen degeri getir demek istiyoruz");

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginButonu.click();

        // Burada önemli olan daha kısa veya daha uzun olması degil, önemli olan daha dinamik olmasıdır



    }

}

package tests.day16;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_Facebook {

    // 1 - https://www.facebook.com/ adresine gidin
    //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
    //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
    //4- Basarili giris yapilamadigini test edin


    @Test
    public void facebookTest(){

        Driver.getDriver().get("https://www.facebook.com");
        FacebookPage facebookPage=new FacebookPage();
        facebookPage.facebookCookies.click();


        Faker faker=new Faker();
        facebookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
        facebookPage.passKutusu.sendKeys(faker.internet().password());
        facebookPage.loginButonu.click();

        Assert.assertFalse(facebookPage.girilemediYazisi.isDisplayed());



    }



}

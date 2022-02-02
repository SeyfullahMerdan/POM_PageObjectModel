package tests.day16;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C04_HotelMyCampPositiveLogin {

    // 1 ) Bir Class olustur : PositiveTest
    //2) Bir test method olustur positiveLoginTest()
    //        https://www. hotelmycamp.com/ adresine git
    //        login butonuna bas
    //    test data username: manager ,
    //    test data password : Manager1!
    //    Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

    @Test
    public void pozitifLoginTest(){

        Driver.getDriver().get("https://www.hotelmycamp.com");

        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();

        hotelMyCampPage.usernameBox.sendKeys("manager");

        hotelMyCampPage.passwordBox.sendKeys("Manager1!");

        hotelMyCampPage.loginButonu.click();


        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(hotelMyCampPage.managerButonu);

        Assert.assertTrue( hotelMyCampPage.managerButonu.isDisplayed() , "Can not acces" );


    }


}

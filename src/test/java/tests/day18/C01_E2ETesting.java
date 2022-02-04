package tests.day18;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_E2ETesting{

    // 1. Tests packagenin altına class olusturun: CreateHotel
    //2. Bir metod olusturun: createHotel
    //3. https://www.hotelmycamp.com adresine git.
    //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri    girin.
    //    a. Username : manager
    //    b. Password  : Manager1!
    //5. Login butonuna tıklayın.
    //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
    //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
    //8. Save butonuna tıklayın.
    //9. “Hotel was inserted successfully” textinin göründüğünü test edin.
    //10. OK butonuna tıklayın.

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        hotelMyCampPage.bekle(2);
        hotelMyCampPage.hotelManagementLinki.click();
        hotelMyCampPage.hotelListLinki.click();
        hotelMyCampPage.addHotelLinki.click();

        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();

        actions.click(hotelMyCampPage.addHotelCodeKutusu)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).perform();

        Select select=new Select(hotelMyCampPage.addHotelDropdown);
        select.selectByVisibleText("Hotel Type2");

        hotelMyCampPage.addHotelSaveButonu.click();



    }


















}

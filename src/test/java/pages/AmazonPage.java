package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    // Bir page class'i açtıgımızda ilk yapmamız gereken şey parametresiz bir constructor oluşturup
    // bu constructor içinde PageFactory ile drivera ilk deger ataması yapmak olmalıdır.

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
   // Bizim driverimizi bu classdada kullanılır hale getiriyor.


    @FindBy(id="twotabsearchtextbox")       // Biz arama kutusunu bu şekilde buluyoruz.
    public WebElement amazonAramaKutusu;   // locaterin hangi webelemente ait oldugunu söylememiz gerekiyor.
    // isim vermek tercih meselesi, daha sonra kolay bulma adına kendi istegimize göre verebiliriz.

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYazisiElementi;




}

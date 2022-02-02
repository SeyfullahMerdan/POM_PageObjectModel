package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    // Br page class'i açtıgımızda ilk yapmamaız gereken şey parametresiz bir constructor oluşturup
    // bu constructor içinde PageFactory ile drivera ilk deger ataması yapmak olmalıdır.

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id="twotabsearchtextbox")
    public WebElement amazonAramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYazisiElementi;




}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HotelMyCampPage {


     public HotelMyCampPage() {
        PageFactory.initElements(Driver.getDriver() , this);
      }


     @FindBy(xpath="//a[.='Log in']")
     public WebElement ilkLoginLinki;

     @FindBy(xpath="//input[@id='UserName']")
     public WebElement usernameBox;

     @FindBy(xpath="//input[@id='Password']")
     public WebElement passwordBox;

     @FindBy(xpath="//input[@id='btnSubmit']")
     public WebElement loginButonu;

     @FindBy(xpath="//span[@class='username username-hide-on-mobile']")
     public WebElement managerButonu;

     @FindBy(xpath = "//div[@class='validation-summary-errors']")
     public WebElement girisYapilamadiYaziElementi;

     @FindBy(xpath="//span[text()='ListOfUsers']")
     public WebElement basariliGirisYaziElementi;


     @FindBy (xpath = "//a[@id='menuHotels']")
     public WebElement hotelManagementLinki;


     @FindBy (xpath = "//a[@href='/admin/HotelAdmin']")
     public WebElement hotelListLinki;

     @FindBy (xpath = "//a[@class='btn btn-circle btn-default']")
     public WebElement addHotelLinki;

     @FindBy (xpath = "//input[@id='Code']")
     public WebElement addHotelCodeKutusu;


     @FindBy ( xpath="//select[@id='IDGroup']")
     public WebElement addHotelDropdown;


     @FindBy (xpath = "//button[@id='btnSubmit']")
     public WebElement addHotelSaveButonu;

     @FindBy (xpath = "//div[.='Hotel was inserted successfully']")
     public WebElement basariliGirisOnayTexti;

     @FindBy (xpath = "//button[@data-bb-handler='ok']")
     public WebElement basariliGirisOnayTextiOKButonu;




     public void bekle (int saniye) {
          try {
               Thread.sleep(saniye * 1000);
          } catch (InterruptedException e) {
               e.printStackTrace();
          }
     }


     public void girisYap(){
          Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
          ilkLoginLinki.click();
          usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
          passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
          loginButonu.click();
     }



}

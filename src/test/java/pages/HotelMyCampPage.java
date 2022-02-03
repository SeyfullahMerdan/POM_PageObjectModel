package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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


}

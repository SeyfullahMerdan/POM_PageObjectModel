package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HMCWebTablePage {

    public HMCWebTablePage(){
    PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy (xpath = "//thead//tr[1]//th")
    public List<WebElement> headerBirinciSatirDatalar;

    @FindBy (xpath = "//tbody")
    public WebElement tumBodyWebElementi;

    @FindBy (xpath = "//tbody//td")
    public List<WebElement> tumBodyDatalariList;

    @FindBy (xpath = "//tbody//tr")
    public List<WebElement> satirlarListesi;


    public WebElement satirGetir(int satirNo){
        String satirDinamikXpath="//tbody//tr["+satirNo+"]";
        WebElement satirElementi=Driver.getDriver().findElement(By.xpath(satirDinamikXpath));
        return satirElementi;
    }


    public String hucreWebElementGetir(int satir, int sutun) {
        String dinamikHucreXpath="//tbody//tr["+satir+"]//td["+sutun+"]";
        WebElement istenenHucreElementi=Driver.getDriver().findElement(By.xpath(dinamikHucreXpath));
        String hucreDatasi=istenenHucreElementi.getText();
        return hucreDatasi;
    }


    public void sutunYazdir(int sutun) {
        // Her bir satırdaki istenen sütun elementini yazdırbilmek için önce satır sayısını bilmeye ihtiyacım var.
        // Satır sayısını locateden bulabilirm daha önce locate etmiştim.
        int satirSayisi=satirlarListesi.size();
        // Satırların listesini önceden locate etmiştim.
        // size() alarak table'da kaç tane satır olduğunu öğrendim.
        // Şimdi For loop ile her satıra gidip her satırın hangi sutununu istedigimi söyleyecegim. Her satırın aynı sutunu
        // bana komple o sutunu verecek
        for (int i=1 ; i<=satirSayisi ; i++) {
            System.out.println(hucreWebElementGetir(i,sutun));}
    }






}

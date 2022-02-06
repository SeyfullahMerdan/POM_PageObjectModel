package tests.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class C02_WebTableDemoqa {

    // Bir Class olusturun D19_WebtablesHomework
    //  1. “https://demoqa.com/webtables” sayfasina gidin

    @Test
    public void demoqaTest() {

        Driver.getDriver().get(ConfigReader.getProperty("DemoqaUrl"));

        //  2. Headers da bulunan department isimlerini yazdirin
        // Normalde thead//th olurdu ancak bu tablo class isimleri ile organize edilmiş
        DemoqaPage demoqaPage=new DemoqaPage();
        System.out.println("Başlık satırı elementi: " + demoqaPage.baslikSatiriElementi.getText());
        // ikinci yöntem olarak başlıkları bir listeye koyabilirim
        System.out.println("==============================================================================");
        List<WebElement> basliklarListesi=demoqaPage.basliklarWebelementiListesi;
        int sayac=1;
        for (WebElement e:basliklarListesi
             ) {
            System.out.println( sayac + ". başlık ForEach ile: " + e.getText());
            sayac++;
        }
        System.out.println("==============================================================================");

        for (int i=1 ; i<demoqaPage.basliklarWebelementiListesi.size(); i++) {
            System.out.println( "Başlıklar ForLoop ile: " + demoqaPage.basliklarWebelementiListesi.get(i).getText() );
        }


        //  3. 3.sutunun basligini yazdirin
        System.out.println("==============================================================================");
       System.out.println("3.sutun başlıgı: " + demoqaPage.basliklarWebelementiListesi.get(2).getText());

        //  4. Tablodaki tum datalari yazdirin
        System.out.println("=============================TÜM BODY DATALARI======================================");
        System.out.println( demoqaPage.bodyTekWebElement.getText() );

        //  5. Tabloda kac cell (data) oldugunu yazdirin
        System.out.println("==============================================================================");
        System.out.println("Tabloda bulunan tüm dataların sayısı: "+demoqaPage.tumDataWebElementlist.size());

        //  6. Tablodaki satir sayisini yazdirin
        System.out.println("==============================================================================");
        System.out.println("Tabloda bulunan tüm satırların sayısı: " + demoqaPage.tumSatirlarWebElementList.size());

        //  7. Tablodaki sutun sayisini yazdirin

        // -->> WebTablelarda sutun sayısını direk göremyorduk bu yüzden farklı işlemlere tabi tutarak
        //      Tabloda kaç tane sutun oldugunu anlayabiliriz.
        // -->> Farklı yollardan hesaplanabilir ama biz hucre-data sayısı / satır sayısı yapalım.
        //      70 tane data var 10 tane satır var
        // -->> WebTabledeki başlıklar satırını ve ordaki data sayısını bulmuştum. Başlıklar satırındaki data sayısı
        //      kadar sutun vrdır. Yani baliklarListesi.size() yaparsam yine sutun sayısını bulurum. <-- Farklı bir yol.
        System.out.println("==============================================================================");
        System.out.println("Tablodaki sutun sayısı:" + (demoqaPage.tumDataWebElementlist.size()/demoqaPage.tumSatirlarWebElementList.size()));

        //  8. Tablodaki 3.kolonu/sutunu yazdirin
        System.out.println("=================================3.SUTUN=====================================");
        demoqaPage.sutunYazdir(3);

        //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        System.out.println("=================================SALARY BİLGİSİ=====================================");
        demoqaPage.ismeGoreMaasYazdir("Alden");

        // Page kısmında Dinamik bir satır ve data yapılı Method oluşturdum.
        // Satırdan --> Dataya kadar olan Absolute Xpathi alıyorum. Bu sayede findelement ile elementi get.text yaparak
        // yazısını alıyorum ve Stringe atıyorum. Sonra....
        // Eğer gönderdigim isim ile senin for içerisinde döndürdügün isim aynı denk gelirse
        // o satırı yakala ve o satırın Salary (5. datasını) al bana getir diyorum.

        // 10. Page sayfasinda bir method olusturun,
        //  Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin
        System.out.println("=============================Satır ve Sutuna göre Data===============================");
        demoqaPage.hucreYazdir(2,3);


    }

}

package tests.day19;

import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_WebTables {

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

        //  3. 3.sutunun basligini yazdirin

        System.out.println("3.sutun başlıgı "+demoqaPage.basliklarWebelementiListesi.get(2).getText());

        //  4. Tablodaki tum datalari yazdirin
        System.out.println("==========TUM BODY=============");
        System.out.println(demoqaPage.bodyTekWebElement.getText());

        //  5. Tabloda kac cell (data) oldugunu yazdirin
        System.out.println("Tabloda bulunan data sayısı: "+demoqaPage.tumDataWebElementlist.size());


        //  6. Tablodaki satir sayisini yazdirin
        System.out.println("Tabloda bulunan satırlar sayısı: " + demoqaPage.tumSatirlarWebElementList.size());

        //  7. Tablodaki sutun sayisini yazdirin
        // farklı yollardan hesaplanabilir ama biz hucresayısı/satırsayısı yapalım.
        System.out.println("Tablodaki sutun sayısı:" + (demoqaPage.tumDataWebElementlist.size()/demoqaPage.tumSatirlarWebElementList.size()));
        //  8. Tablodaki 3.kolonu yazdirin
        demoqaPage.sutunYazdir(3);

        //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        demoqaPage.ismeGoreMaasYazdir("Alden");

        // 10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin

        demoqaPage.hucreYazdir(2,3);





    }






}

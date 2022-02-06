package tests.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

import java.util.Scanner;

public class C01_WebTableDinamikLocate {

    // 3 Test methodu oluşturalım.
    // 1.Method satır numarası verdigimde bana o satırdaki dataları yazdırsın.
    // 2.Method satır no ve data numarası girdigimde verdigim datayı yazdırsın.
    // 3.Method sutun numarası verdigimde bana tüm sutunu yazdırsın

    HMCWebTablePage hmcWebTablePage;
    HotelMyCampPage hotelMyCampPage;

    @Test
    public void satirYazdirTesti(){
        // 2.satır ---> //tbody//tr[2]         7.satır ---> //tbody//tr[2]
        // 8 satirdaki 5 inci data          //tbody//tr[8]//td[5]
        // 10. satırdaki 3.data derse:       //tbody//tr[10]//td[5]
        // 2. satır 4.data                  //tbody//tr[2]//td[4]

        hotelMyCampPage=new HotelMyCampPage();
        hmcWebTablePage=new HMCWebTablePage();
        hotelMyCampPage.girisYap();

        WebElement ucuncuSatirElementi=hmcWebTablePage.satirGetir(3);
        System.out.println(ucuncuSatirElementi.getText());
        Driver.closeDriver();
    }


    @Test
    public void hucreGetirTesti() { // 2.Method satır no ve data numarası girdigimde verdigim datayı yazdırsın.
        hotelMyCampPage = new HotelMyCampPage();
        hmcWebTablePage = new HMCWebTablePage();
        hotelMyCampPage.girisYap();
        // 2. satırın 4 datası desek:  //tbody//tr[2]//td[4] demeliyim
        // 4.satırın 5.datası          //tbody//tr[4]//td[5] demeliyim
      /*  Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen satır ve sutun sayısı griniz: ");
        int satir=scan.nextInt();
        int sutun=scan.nextInt(); */
        hotelMyCampPage.bekle(3);
        System.out.println("Girilen hücredeki element: " + hmcWebTablePage.hucreWebElementGetir(5,3));
        Driver.closeDriver();
        // Projemizde WebTablelar var ise elimizde satır ve sutunu alabilecegimiz methodlar oluşturarak
        // hazır methodlar ile dataları alabiliriz. Oluşturacagımız Dinamik methodları Page sayfasında tutarak
        // lazım oldugunda methodu dinamik bir şekilde kullanrak istedigimiz veriye ulaşabiliriz.
    }

    @Test
    public void sutunYazdirTesti() { // 3.Method sutun numarası verdigimde bana tüm sutunu yazdırsın
        hotelMyCampPage = new HotelMyCampPage();
        hmcWebTablePage = new HMCWebTablePage();
        hotelMyCampPage.girisYap();
        hmcWebTablePage.sutunYazdir(4);  //Methoda dedim ki 4. sutunu yazdır. Gidecek her bir satırdan 4. datayı alacak
        Driver.closeDriver();
    }

    // WebTablelarda sutun bulma yoktur. Sadece satır ve o satırdaki datalara ulaşıp,onları bulabiliriz
    // Ancak bir Sutunu komple görmek veya ulaşmak istiyorsak;
    // Her bir satırın aynı sıradaki/veya sutunundaki dataya ulaşırsak o zaman istedigimiz sutun elemanlarına
    // ulaşabiliriz.

    //WebTable da satırı bulmak için //tbody//tr ile tüm satırı buluruz []yaparsak spesifik bir satırı verir.

    //WebTable da satırın datasını bulmak için //tbody//td ile tüm dataları buluruz []yaparsak spesifik bir satırı verir.

    //WevTable da bir satırın bir sutunu/veya datasını bulmak için;
    //   //tbody//tr[..]//td[..] şeklinde buluruz.  O zaman eğer bir sutunu bulacaksak;
    //     tek tek tr leri dolaşıp spesifik bir td yi alıp getirmemiz lazım
    //   yani...      //tbody//tr[1-2-3-4-5..]//td[3]
    //  egerr...      //tbody//tr//td dersem tüm satırlar tüm datalar gelir...








    }
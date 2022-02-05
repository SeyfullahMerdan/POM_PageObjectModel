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

        // 2.satır     //tbody//tr[2]
        // 7.satır     //tbody//tr[2]
        //tbody//tr[8]//td[5]  8 satirdaki 5 inci data

        hotelMyCampPage=new HotelMyCampPage();
        hmcWebTablePage=new HMCWebTablePage();

        hotelMyCampPage.girisYap();

        WebElement ucuncuSatirElementi=hmcWebTablePage.satirGetir(3);

        System.out.println(ucuncuSatirElementi.getText());

        Driver.closeDriver();
    }

    @Test
    public void hucreGetirTesti() {

        hotelMyCampPage = new HotelMyCampPage();
        hmcWebTablePage = new HMCWebTablePage();

        hotelMyCampPage.girisYap();

        // 2. satırın 4 datası desek:  //tbody//tr[2]//td[4] demeliyim
        // 4.satırın 5.datası          //tbody//tr[4]//td[5] demeliyim

      /*  Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen satır ve sutun sayısı griniz: ");
        int satir=scan.nextInt();
        int sutun=scan.nextInt(); */
        hotelMyCampPage.bekle(5);
        System.out.println( "Girilen hücredeki element:" + hmcWebTablePage.hucreWebElementGetir(5,3));

        Driver.closeDriver();
    }

    @Test
    public void sutunYazdirTesti() {

        hotelMyCampPage = new HotelMyCampPage();
        hmcWebTablePage = new HMCWebTablePage();

        hotelMyCampPage.girisYap();

        hmcWebTablePage.sutunYazdir(4);

        Driver.closeDriver();
    }


    }
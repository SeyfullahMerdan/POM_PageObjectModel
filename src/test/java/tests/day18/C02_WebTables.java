package tests.day18;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;

import java.util.List;

public class C02_WebTables {

    HotelMyCampPage hotelMyCampPage;
    HMCWebTablePage hmcWebTablePage;
    @Test
    public void table(){

        // ● Bir class oluşturun : C02_WebTables
        //● login( ) metodun oluşturun ve oturum açın.
        //● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
        //            ○ Username : manager
        //            ○ Password : Manager1!
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();

        //● printRows( ) metodu oluşturun //tr
        //            ○ table body’sinde bulunan toplam satir(row) sayısını bulun.
        //            ○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        //            ○ 4.satirdaki(row) elementleri konsolda yazdırın.


    }


    @Test
    public void printsRow(){

        //● table( ) metodu oluşturun
        //            ○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
        //            ○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
        hmcWebTablePage = new HMCWebTablePage();
        List<WebElement> headerDataList=hmcWebTablePage.headerBirinciSatirDatalar;
        System.out.println("tablodaki sutun: " + headerDataList.size());

        System.out.println(hmcWebTablePage.tumBodyWebElementi.getText());


        // Eger body tek bir webelement olarak locate edersek
        // icindeki tum datalari getText() ile yazdirabiliriz
        // ancak bu durumda bu elementler ayri ayri degil
        // body'nin icindeki tek bir String'in parcalari olurlar
        // dolayisiyla bu elementlere tek tek ulasmamaiz mumkun olmaz
        // sadece contains methodu ile body'de olup olmadiklarini test edebiliriz
        // Eger her bir data'yi ayri ayri almak istersek
        // //tbody//td seklinde locate edip bir list'e atabiliriz


    }

    // yarın tamamlanacak..!

    @Test
    public void test(){

        //● printRows( ) metodu oluşturun //tr
        //            ○ table body’sinde bulunan toplam satir(row) sayısını bulun.
        //            ○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        //            ○ 4.satirdaki(row) elementleri konsolda yazdırın.






   // yarın tamamlanacak





    }




}

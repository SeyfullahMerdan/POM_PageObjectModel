package tests.day18;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;

import java.util.List;

public class C02_WebTables {

    // WebTable çok kullanılan bir yapıdır. Farklı oluşturulma türleri olsa da normal şartlarda genel olarak oluşturulma
    // tipi bellidir. Sutun ve satırlardan oluşan Tablolar şeklinde diyebilriz, Excel formatındaki gibi.
    //  table -- thead/tbody -- tr (row -- satır) -- th-/-td (data,bilgi,satırdaki her bir bilgi sutunu,sonraki sutun)
    //  table içerisinde  iki bölüm vardır:  thead ve tbody
    //  thead ve tbody de satırlar vardır.
    //    Mesela ikinci satır üçüncü sutuna gitmek istersek:
    //        ((//tbody//tr)[2]//td)[3]

    HotelMyCampPage hotelMyCampPage;
    HMCWebTablePage hmcWebTablePage;


    @Test
    public void loginTest(){
        // ● Bir class oluşturun : C02_WebTables
        //● login( ) metodun oluşturun ve oturum açın.
        //● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
        //            ○ Username : manager
        //            ○ Password : Manager1!
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
    }



    @Test (dependsOnMethods = "loginTest")
    public void table(){

        //● table( ) metodu oluşturun
        //            ○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
        //            ○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.

        // Header kısımında birinci satır ve altındaki dataları locate edelim. (//thead//tr[1])th
        hmcWebTablePage = new HMCWebTablePage();
        List<WebElement> headerDataList=hmcWebTablePage.headerBirinciSatirDatalar;
        System.out.println("Tablodaki sutun sayısı: " + headerDataList.size());

        System.out.println(hmcWebTablePage.tumBodyWebElementi.getText());
        // Body bu şekilde bütün elementlerini gösterebiliyor.

        //*****Sutun sayısını görmedik. WebTableların en önemli özelligi biz sutun sayısına bakmıyoruz.****
        //*****Bir satırda kaç data var onu bulabiliriz*****


        // Eger body tek bir webelement olarak locate edersek
        // icindeki tum datalari getText() ile yazdirabiliriz
        // ancak bu durumda bu elementler ayri ayri degil
        // body'nin icindeki tek bir String'in parcalari olurlar
        // dolayisiyla bu elementlere tek tek ulasmamaiz mumkun olmaz
        // sadece contains methodu ile body'de olup olmadiklarini test edebiliriz

        // Eger her bir data'yi ayri ayri almak istersek
        // //tbody//td seklinde locate edip bir list'e atabiliriz

        List<WebElement> bodyTumDataList=hmcWebTablePage.tumBodyDatalariList;

        System.out.println("Body'deki data sayısı: " + bodyTumDataList.size());

        for (WebElement e:bodyTumDataList) {
            System.out.println( "Body tek String olarak: "  + e.getText());
        }

    }


    @Test (dependsOnMethods = "loginTest")
    public void printRows(){

        //● printRows( ) metodu oluşturun //tr
        //            ○ table body’sinde bulunan toplam satir(row) sayısını bulun.
        //       //tbody//tr

        hmcWebTablePage=new HMCWebTablePage();
        System.out.println(hmcWebTablePage.satirlarListesi.size());

        //            ○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.

        List<WebElement> satirlarWebElementListesi=hmcWebTablePage.satirlarListesi;

        for (WebElement e:satirlarWebElementListesi
             ) {
            System.out.println(e.getText());
        }

        //            ○ 4.satirdaki(row) elementleri konsolda yazdırın.
        System.out.println( "4.satır: " + satirlarWebElementListesi.get(3).getText());
 // 4. satırdaki elementleri tüm listenin içindeki 3. indextedir, listenin 3. indexini getirirsem 4.satırı getirir.


    }

}

package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_SatirSayisi {

    @Test
    public void test01() throws IOException {

        // ülkeler excelindeki sayfa1 ve sayfa2deki satır sayılarını ve kullanılan satır sayılarını bulun.

        String path= "src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fis);


        int sayfa1SatirSayisi=workbook.getSheet("Sayfa1").getLastRowNum();
        int sayfa1FizikiKullanılanSatirSayisi=workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();


        System.out.println( "1.sayfa satır sayisi: " + sayfa1SatirSayisi);
        System.out.println( "1.sayfa fiziki kullanılan satir sayısı: " + sayfa1FizikiKullanılanSatirSayisi );

        // Fiziki kullanılan satır sayısı index ile degil sayma sayıları ile çalışır.


        int sayfa2SatirSayisi=workbook.getSheet("Sayfa2").getLastRowNum();
        int sayfa2FizikiKullanılanSatirSayisi=workbook.getSheet("Sayfa2").getPhysicalNumberOfRows();


        System.out.println( "2.sayfa satır sayisi: " + sayfa2SatirSayisi);
        System.out.println( "2.sayfa fiziki kullanılan satir sayısı: " + sayfa2FizikiKullanılanSatirSayisi );




    }


}

package tests.day20;

import org.testng.annotations.Test;

public class C05_ExceliMapeYukleme {

    @Test
    public void test01(){

        //dosya yolu ve sayfa ismi verilen bir excel sheeti map olarak kaydeden reusable bir method oluşturalım

        String path="src/test/java/resources/ulkeler.xlsx";
        String sayfaAdi="Sayfa1";

        ReusableMethodsExcel.mapOlustur(path, sayfaAdi);











    }




}

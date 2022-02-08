package tests.day20;

import org.apache.poi.ss.usermodel.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {


    @Test
    public void test01() throws IOException {

        String path="src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);  //File ı getir ve oku diyorum, Hangi fail diyor ve bir path istiyor
        // Okuyamazsam diyerekten kendini garantiye alıyor ve exception istiyor.


        Workbook workbook = WorkbookFactory.create(fis); // Hem okuma hem yazma ile ilgili exception verdi.
        Sheet sheet=workbook.getSheet("sayfa1");
        Row row=sheet.getRow(4);
        Cell cell=row.getCell(2);

        System.out.println(cell);

        // Biz FİS ile okudugumuz excel dosyasını projemiz içerisinde kullanabilmek için
        // Apachi POI dependency yardımı ile bir WorkBook oluşturduk

        // Bu workbook bixim projemizin içersinde ülkeler excelinin bir kopyasını kullanamızı saglıyor

        // Excelin yapısı geregi bir hücreye(Cell) ulaşabilmek için workbookdan başlayarak sıraıyla sheet,row ve
        // cell objeleri
        // oluşturmamız lazım


        // indexi 4 olan satırdaki, indexi 2 olan hucrenin Andorra oldugunu test ediniz.

        String expectedData="Andorra";
        Assert.assertEquals(cell.getStringCellValue(),expectedData);

        // 5. indexdeki satırın 3. indexdeki hucre bilgisini yazdıralım.

        row=sheet.getRow(5);
        cell= row.getCell(3);

        System.out.println(cell);


    }

}

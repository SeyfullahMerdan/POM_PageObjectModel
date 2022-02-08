package tests.day20;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReusableMethodsExcel {

    // Bir method oluşturalım
    // Dosya yolu ve satır , hucre indexini verince hucre bilgisini döndürsün

    public static Cell hucreGetir(String path,String sayfaIsmi, int satirIndex, int hucreIndex){

        Cell cell=null;

        try {

            FileInputStream fileInputStream=new FileInputStream(path);
            Workbook workbook= WorkbookFactory.create(fileInputStream);
            cell=workbook.getSheet(sayfaIsmi).getRow(satirIndex).getCell(hucreIndex);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return cell;
    }


    public static Map <String, String> mapOlustur(String path, String sayfaAdi) {

        Map <String, String> excelMap=new HashMap();
        Workbook workbook=null;
        try {
            FileInputStream fis=new FileInputStream(path);
            workbook=WorkbookFactory.create(fis);


        } catch (IOException e) {
            e.printStackTrace();
        }


        int satirSayisi=workbook.getSheet(sayfaAdi).getLastRowNum();
        String key="";
        String value="";

        for (int i = 0; i <=satirSayisi; i++) {
            //2.adim tablodaki hucreleri map'e uygun hale donusturmek
            key=workbook.getSheet(sayfaAdi).getRow(i).getCell(0).toString();
            value=workbook.getSheet(sayfaAdi).getRow(i).getCell(1).toString() +
                    ", " + workbook.getSheet(sayfaAdi).getRow(i).getCell(2).toString() +
                    ", " + workbook.getSheet(sayfaAdi).getRow(i).getCell(3).toString();
            //3.adim key-value haline getirdigimz satirlari map'e eklemek
            excelMap.put(key,value);
        }


        return excelMap;
    }





}

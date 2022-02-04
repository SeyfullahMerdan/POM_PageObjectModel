package tests.day17;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_YanlisKeyKullanimi {

    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("HMcurl"));
        // Eğer key olarak girdigimiz String configuration.properties dosyasında yoksa
        // Örnegin: HCMUrl
        // C.reader.getPropertiy o keyi bulamaz
        // ve nullpointer exception atar.



    }
}

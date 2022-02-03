package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {


    public static WebDriver driver;

    public static WebDriver getDriver(){
        WebDriverManager.chromedriver().setup();
        if (driver==null) { // bu if sayesinde kod çalışırken bir kere new keyword ile driver oluşturulacak
                             // diger kullanımlarda devreye girmeyecek.
            driver=new ChromeDriver(); }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver;
    }
// Bu methodu her çagırdıgımda yeni bir driver çagırıyor. Tekrardan oluşturuyor.


    public static void closeDriver() {

        if (driver!=null) {
            driver.quit();
            driver=null; // null ataması yapmazsam açılırken nulla eşit olmadıgı için yeni sayfa açmaz ve hata verir
            // kapattıktan sonra driveri sıfırlıyorum ki bir daha çagırdıgımda nulla takılsın ve setup methodunda driveri
            // çagırsın ve çalıştırsın
        }
    }




}

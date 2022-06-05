package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    /*
    POM de Driver icin TestBase class ina extends etmek yerine
    Driver classindan static methodlar kullanarak driver olusturup
    ilgili ayarlarin yapilmasi ve en sonda driver in kapatilmasi
    tercih edilmistir.

    POM daki getDriver methoduna obj olusturarark kullanilomasini engellemk icin
    Singleton pattern kullanimi benimsenmistir

    Singleton Pattern : tekli kullanim demek, bir class in farkli claslarda obj
    olusturulurak kullanimini engellemek icn kullanilir

    Bunu saglamak icin obj olusturmak icin Ypilan constructor u private yapinca
    baska class lardan ulasilamaz
     */

    private Driver() {

    }

    static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {

            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();


            }

           // WebDriverManager.chromedriver().setup();
            //driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }

    public static void closeDriver() {

        if (driver != null) {

            driver.close();
            driver = null;

        }

    }
}



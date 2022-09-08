package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
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
                case "remote_chrome":
                    try {
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName(BrowserType.CHROME);
                        desiredCapabilities.setCapability("platform", Platform.ANY);
                        driver=(new RemoteWebDriver(new URL("http://192.168.0.14:4444"), desiredCapabilities));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "remote_firefox":
                    try {
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName(BrowserType.FIREFOX);
                        desiredCapabilities.setCapability("platform", Platform.ANY);
                        driver=(new RemoteWebDriver(new URL("http://192.168.0.14:4444"), desiredCapabilities));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
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



package stepDefinitions;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid3 {
    // browser lerin ayrintili ozelliklweeini kullanmak icin gerekli class
    public static void main(String[] args) throws MalformedURLException {


        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.ANY); // herhangi bir patfor bunlari uzaktaki bilgisyar adi ile yazabiliri
        cap.setVersion("104.0.5112.102");

        ChromeOptions options=new ChromeOptions();
        options.merge(cap); // birlestirdik

        String hubURL="http://192.168.0.14:4444";
        WebDriver driver=new RemoteWebDriver(new URL(hubURL),options);

        driver.get("https://www.medunna.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


    }
}
package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    /*
    step definitions package icerisinde @before @after gibi bir notasyon varsa
     extends testBase dememize gerek kalmadan  her scenario dan once ve sonra bu methodlar calisacakti

     Buda isteyecegimiz bir durum degildr

     Cucumbur da @before @after kullanma ihtiyacimiz olursa bunu stepdefinitions
      package altinda olusturacagimiz hook class ina koyariz

      biz her scenerio dan sonra test sonucu kontrol edip
      failed olan scenario lar icin screenshoot olmasi amaciyla @After methodu olusturacagiz

     */


    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.closeDriver();
    }
}



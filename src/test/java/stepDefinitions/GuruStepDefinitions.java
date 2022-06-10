package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {

    GuruPage guru = new GuruPage();

    @Given("cookies sorulursa kabul eder")
    public void cookies_sorulursa_kabul_eder() {
        Driver.getDriver().switchTo().frame(guru.cookiesIframe);

        guru.akzeptierencookies.click();

    }


    @And("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String istenenSutun) {

        List<WebElement> tabloBaslikListesi = guru.basliklarListesi;

        int istenenBaslikIndex = -3;

        for (int i = 0; i < tabloBaslikListesi.size(); i++) {
            if (tabloBaslikListesi.get(i).equals(istenenSutun)) {
                istenenBaslikIndex = i+1;
                break;
            }

        }

        // foor loop ile tum sutun basliklarini bana verilen istenenSutun degeri ile
        //karsilastirdim loop bittiginder basligin bulunup bulunmadigini kontrol etmek ve
        //bulundu ise yoluma devam etmek istiyorum

       if (istenenBaslikIndex!=-3){ //baslik bulundu
List<WebElement> istenenSutundakiElementler=
        Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaslikIndex+"]"));
           for (WebElement each:istenenSutundakiElementler
                ) {
               System.out.println(each.getText());
           }

        } else {// baslik bulunamadi
            System.out.println("istenen baslik bulunamadi");

        }
    }
}

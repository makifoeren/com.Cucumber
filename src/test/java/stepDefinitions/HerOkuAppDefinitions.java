package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerOkuAppPage;
import utilities.Driver;

import java.time.Duration;

public class HerOkuAppDefinitions {


    HerOkuAppPage herOku = new HerOkuAppPage();

    @Given("add element butonuna basar")
    public void add_element_butonuna_basar() {
        herOku.addElement.click();

    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herOku.deleteElement));

    }
    @Then("Delete butonunun gorunur oldugunu test edin")
    public void delete_butonunun_gorunur_oldugunu_test_edin() {
        Assert.assertTrue(herOku.deleteElement.isDisplayed());

    }
    @Then("Delete butonuna basar")
    public void delete_butonuna_basar() {
        String liste= String.valueOf(herOku.deleteList);
        System.out.println(liste);
        herOku.deleteElement.click();

    }
    @Then("Delete butonunun gorunmedigini test edin")
    public void delete_butonunun_gorunmedigini_test_edin() {
        Assert.assertTrue(herOku.deleteList.isEmpty());
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }


    }

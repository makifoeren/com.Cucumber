package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;


import java.io.IOException;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("Benutzer auf der Amazon-Homepage")
    public void benutzer_auf_der_amazon_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @Then("Benutzer sucht nach Nutella")
    public void benutzer_sucht_nach_nutella() {
        amazonPage.suchbox.sendKeys("Nutella"+ Keys.ENTER);

    }

    @Then("Testergebnisse enthalten Nutella")
    public void testergebnisse_enthalten_nutella() {
        Assert.assertTrue(amazonPage.anzahlderErgebnisse.getText().contains("Nutella"));

    }

    @Then("schließt die Seite")
    public void schließt_die_seite() {
        Driver.closeDriver();

    }

    @Then("Benutzer sucht nach Java")
    public void benutzer_sucht_nach_java() {
        amazonPage.suchbox.sendKeys("Java"+ Keys.ENTER);

    }
    @Then("Testergebnisse enthalten Java")
    public void testergebnisse_enthalten_java() {
        Assert.assertTrue(amazonPage.anzahlderErgebnisse.getText().contains("Java"));
    }

    @Then("Benutzer sucht nach iphone")
    public void benutzer_sucht_nach_iphone() {
        amazonPage.suchbox.sendKeys("iphone"+ Keys.ENTER);

    }

    @And("Testergebnisse enthalten iphone")
    public void testergebnisseEnthaltenIphone() {
        Assert.assertTrue(amazonPage.anzahlderErgebnisse.getText().contains("iphone"));

    }

    @Then("Testen Sie, ob Sie auf die Amazon-Seite gehen")
    public void testen_sie_ob_sie_auf_die_amazon_seite_gehen() {
        Assert.assertTrue(amazonPage.homePageTest.isDisplayed());

    }

    @Then("Benutzer sucht nach Laptop")
    public void benutzer_sucht_nach_laptop() {
        amazonPage.suchbox.sendKeys("Laptop"+Keys.ENTER);

    }
    @Then("Testergebnisse enthalten Laptop")
    public void testergebnisse_enthalten_laptop() {
        Assert.assertTrue(amazonPage.anzahlderErgebnisse.getText().contains("Laptop"));

    }
    @Then("Klicken Sie auf ein Produkt")
    public void klicken_sie_auf_ein_produkt() {
        amazonPage.klickProdukt.click();

    }
    @Then("Testergebnisse enthalten Produkt")
    public void testergebnisse_enthalten_produkt() {
        Assert.assertTrue(amazonPage.erhaltenProduktTest.isDisplayed());

    }
    @Then("Produkt in den Warenkorb legent")
    public void produkt_in_den_warenkorb_legent() {
        amazonPage.warenkorbLegent.click();

    }
    @Then("Prüfung hinzugefügt")
    public void prüfung_hinzugefügt() {

        Assert.assertTrue(amazonPage.hinzugefügtTest.isDisplayed());

    }


    @Then("Benutzer sucht nach {string}")
    public void benutzerSuchtNach(String gewünschtesWort) {
        amazonPage.suchbox.sendKeys(gewünschtesWort+Keys.ENTER);
        
    }

    @And("Testergebnisse enthalten {string}")
    public void testergebnisseEnthalten(String gewünschtesWort) {
        Assert.assertTrue(amazonPage.anzahlderErgebnisse.getText().contains(gewünschtesWort));

    }

    @Given("kullanici {string} anasayfasinda") //amazonUrl
    public void kullaniciAnasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String istenenKelime) {
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


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
    }


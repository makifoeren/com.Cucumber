package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.NinjaPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Arrays;

public class NinjaStepDef {
/*
    ~ Navigate to http://tutorialsninja.com/demo/index.php?route=common/home
    ~ click on Phones & PDAs
    ~ get the brandName of phones
    ~ click on add to button for all elements
    ~ click on black total added cart button
    ~ get the names of list from the cart
    ~ compare the names from displaying list and cart list

    Navigieren Sie zu http://tutorialsninja.com/demo/index.php?route=common/home
    ~ Klicken Sie auf Telefone & PDAs
    ~ Holen Sie sich den Markennamen von Telefonen
    ~ Klicken Sie für alle Elemente auf die Schaltfläche Hinzufügen
    ~ Klicken Sie auf die schwarze Schaltfläche zum Hinzufügen des Einkaufswagens
    ~ Holen Sie sich die Namen der Liste aus dem Warenkorb
    ~ Vergleichen Sie die Namen aus der Anzeigeliste und der Warenkorbliste
*/


    NinjaPage ninja = new NinjaPage();

    @Given("navigate to tutorials ninja")
    public void navigateToTutorialsNinja() {
        Driver.getDriver().get(ConfigReader.getProperty("ninjaUrl"));
    }

    @Then("click on Phones & PDAs")
    public void clickOnPhonesPDAs() {
        ninja.phonesPads.click();
    }

    @And("get the brandName of phones")
    public void getTheBrandNameOfPhones() throws InterruptedException {
        ninja.brands.forEach(t -> System.out.println(t.getText()));
        Thread.sleep(4000);

    }

    @And("click on add to button for all elements")
    public void clickOnAddToButtonForAllElements() throws InterruptedException {
        ninja.addButtons.forEach(WebElement::click);
        Thread.sleep(4000);
    }

    @And("click on black total added cart button")
    public void clickOnBlackTotalAddedCartButton() {
        ninja.cartButton.click();
    }

    @And("get the names of list from the cart")
    public void getTheNamesOfListFromTheCart() {
        ninja.cartItems.forEach(t-> System.out.println(t.getText()));

    }

    @And("compare the names from displaying list and cart list")
    public void compareTheNamesFromDisplayingListAndCartList() {
        Object[] arr= ninja.cartItems.stream().map(WebElement::getText).sorted().toArray();
        System.out.println(Arrays.toString(arr));

        Object[] arr1= ninja.brands.stream().map(WebElement::getText).sorted().toArray();
        System.out.println(Arrays.toString(arr1));
        Assert.assertArrayEquals("karsilastima sonucu :",arr,arr1);


    }

    @And("close driver")
    public void closeDriver() {
        Driver.closeDriver();
    }
}

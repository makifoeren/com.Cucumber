package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DataTablePage;

public class DataTableStepDefinitions {


    DataTablePage dataTablePage = new DataTablePage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dataTablePage.newButonunaBasar.click();
    }

    @Then("isim bolumune {string} yazar")
    public void isim_bolumune_yazar(String firstname) {
        dataTablePage.firstName.sendKeys(firstname);

    }

    @Then("soyisim bolumune {string} yazar")
    public void soyisim_bolumune_yazar(String lastName) {
        dataTablePage.lastName.sendKeys(lastName);
    }

    @Then("position bolumune {string} yazar")
    public void position_bolumune_yazar(String position) {
        dataTablePage.position.sendKeys(position);

    }

    @Then("office bolumune {string} yazar")
    public void office_bolumune_yazar(String office) {
        dataTablePage.office.sendKeys(office);

    }

    @Then("extension bolumune {string} yazar")
    public void extension_bolumune_yazar(String extension) {
        dataTablePage.extn.sendKeys(extension);

    }

    @Then("starDate bolumune {string} yazar")
    public void star_date_bolumune_yazar(String starDate) {
        dataTablePage.startDate.sendKeys(starDate);

    }

    @Then("salary bolumune {string} yazar")
    public void salary_bolumune_yazar(String salary) {

        dataTablePage.salary.sendKeys(salary);
    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dataTablePage.create.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        dataTablePage.search.sendKeys(firstname);

    }


    @Then("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String firstname) {

        Assert.assertTrue(dataTablePage.aramaSonucIlkElement.getText().contains(firstname));
    }


}

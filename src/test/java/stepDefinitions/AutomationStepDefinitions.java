package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutoPage;
import utilities.Driver;

public class AutomationStepDefinitions {

    AutoPage automation = new AutoPage();
    Faker faker = new Faker();

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
        automation.singInButton.click();
    }

    @Given("user Create and account bolumune email adresi girer")
    public void user_create_and_account_bolumune_email_adresi_girer() {
        automation.emailTextBox.sendKeys(faker.internet().emailAddress());

    }

    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {
        automation.createAccountButton.click();
    }

    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        automation.gender.click();
        Actions action=new Actions(Driver.getDriver());
        action.
                click(automation.firstName)
                .sendKeys(faker.name().firstName()+ Keys.TAB)
                .sendKeys(faker.name().lastName() +Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password() + Keys.TAB)
                .sendKeys("28" +Keys.TAB)
                .sendKeys("April" +Keys.TAB)
                .sendKeys("1993" +Keys.TAB)
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().cityName())
                .sendKeys(Keys.TAB)
                .sendKeys("Alaska" + Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys("United States" + Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys("ALSK")
                .perform();

    }

    @Given("user Register butonuna basar")
    public void user_register_butonuna_basar() {
        automation.registerButton.click();

    }

    @Then("hesap olustugunu dogrular")
    public void hesap_olustugunu_dogrular() {


    }

}
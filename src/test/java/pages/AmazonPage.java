package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement suchbox;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement anzahlderErgebnisse;

    @FindBy(xpath = "//a[@id='nav-logo-sprites']")
    public WebElement homePageTest;

    @FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
    public WebElement klickProdukt;

    @FindBy(xpath = "//span[@id='productTitle']")
    public WebElement erhaltenProduktTest;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement warenkorbLegent;

    @FindBy(xpath = "//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")
    public WebElement hinzugefügtTest;




}

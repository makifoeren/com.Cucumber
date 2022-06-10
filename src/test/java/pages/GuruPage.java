package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GuruPage {

    public GuruPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Alle akzeptieren']")
    public WebElement akzeptierencookies;

    @FindBy(xpath = "//thead//tr//th[1]")
    public List<WebElement> basliklarListesi;

    @FindBy(xpath = "//iframe[@id='gdpr-consent-notice']")
    public WebElement cookiesIframe;


}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class NinjaPage {

    public NinjaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//ul[@class='nav navbar-nav']//li)[15]")
    public WebElement phonesPads;

    @FindBy(xpath = "//*[@id='content']//h4")
    public List<WebElement> brands;

    @FindBy(xpath = "(//*[@class='button-group']//button[1])")
    public List<WebElement> addButtons;

    @FindBy(xpath = "//span[@id='cart-total']")
    public WebElement cartButton;

    @FindBy(xpath = "//td[@class='text-left']")
    public List<WebElement> cartItems;

}

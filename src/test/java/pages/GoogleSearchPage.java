package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    public GoogleSearchPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@jsaction=\"paste:puy29d;\"]")
    public WebElement searchBar;

    @FindBy(xpath = "//a[@class=\"MV3Tnb\"][2]")
    public WebElement storeLink;
}

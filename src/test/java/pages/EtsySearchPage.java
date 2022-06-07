package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EtsySearchPage {

    public EtsySearchPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    //Locate all Etsy Search Page web elements here
    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchInputBox;

    @FindBy(css = "button[data-id='gnav-search-submit-button']")
    public WebElement searchButton;

    @FindBy(id = "logo")
    public WebElement logo;

    @FindBy(css = ".wt-display-inline-flex-sm>span")
    public WebElement resultTag;

    @FindBy(xpath = "//li[@class=\"top-nav-item wt-pb-xs-2 wt-mr-xs-2 wt-display-flex-xs wt-align-items-center\"]")
    public List<WebElement> mainHeaderLinks;

    @FindBy(xpath = "//nav[@aria-label=\"Main navigation\"]")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@aria-label=\"Sign In or Register Overlay\"]")
    public WebElement signInModal;

    @FindBy(id = "join-neu-overlay-title")
    public WebElement signInModalHeading;

}
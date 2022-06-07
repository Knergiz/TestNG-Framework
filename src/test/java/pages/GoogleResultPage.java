package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultPage {

    public GoogleResultPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "result-stats")
    public WebElement results;
}

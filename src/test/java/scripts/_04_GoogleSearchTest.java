package scripts;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_GoogleSearchTest extends Base{

    @Test
    public void testSearch(){
        driver.get("https://www.google.com/");
        googleSearchPage.searchBar.sendKeys("Selenium", Keys.ENTER);
        String str = googleResultPage.results.getText();
        str = str.substring(0, str.indexOf("results"));
        Assert.assertTrue(Long.parseLong(str.replaceAll("[^0-9]", "")) > 0);

    }

    @Test(priority = 2, description = "TC123: Validate Google Store link")
    public void testGoogleStoreLink(){
        driver.get("https://www.google.com/");

        googleSearchPage.storeLink.click();

        Assert.assertEquals(driver.getTitle(), "Google Store for Google Made Devices & Accessories");
    }
}

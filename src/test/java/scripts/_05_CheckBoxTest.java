package scripts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _05_CheckBoxTest extends Base{

    @Test(priority = 1, description = "TC001: Validate checkbox in hero app")
    public void testCheckBoxInHeroApp(){
        driver.get("https://the-internet.herokuapp.com/");

        heroAppPage.clickOnLink("Checkboxes");

        //validate that both checkboxes are displayed and enabled
        for (WebElement element : heroAppPage.checkboxes){
            Assert.assertTrue(element.isDisplayed());
            Assert.assertTrue(element.isEnabled());
        }

        //validate that checkbox 1 is not selected and checkbox 2 is selected
        Assert.assertFalse(heroAppPage.checkboxes.get(0).isSelected());
        Assert.assertTrue(heroAppPage.checkboxes.get(1).isSelected());

        //click on checkbox 1 and validate that it is selected
        heroAppPage.checkboxes.get(0).click();
        Assert.assertTrue(heroAppPage.checkboxes.get(0).isSelected());

        //deselect both checkboxes and validate that they are both deselected
        for (WebElement element : heroAppPage.checkboxes){
            element.click();
            Assert.assertFalse(element.isSelected());
        }


    }

}

package scripts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _06_RadioButtonTest extends Base{

    @Test(priority = 1, description = "TC234: Validate Facebook gender radio buttons")
    public void testFacebookGenderRadioButtons(){
        driver.get("https://www.facebook.com/");

        faceBookPage.createNewAccountLink.click();

        for (WebElement element : faceBookPage.genderRadioButtons){
            softAssert.assertTrue(element.isDisplayed());
            softAssert.assertTrue(element.isEnabled());
            softAssert.assertFalse(element.isSelected());
        }

        faceBookPage.genderRadioButtons.get(0).click();
        Assert.assertTrue(faceBookPage.genderRadioButtons.get(0).isSelected());

        faceBookPage.genderRadioButtons.get(1).click();
        Assert.assertTrue(faceBookPage.genderRadioButtons.get(1).isSelected());
        Assert.assertFalse(faceBookPage.genderRadioButtons.get(0).isSelected());


    }




}

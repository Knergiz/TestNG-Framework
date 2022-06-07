package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class _02_TechGlobalTest extends Base{


    @Test
    public void testHeading(){
        driver.get("https://www.techglobalschool.com/apply-now");

        WebElement actualHeading = driver.findElement(By.id("comp-kh9s3kyz3"));
        String expectedHeading = "Application Form";

        Assert.assertEquals(actualHeading.getText(), expectedHeading);
    }


}

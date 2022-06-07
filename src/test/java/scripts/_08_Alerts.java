package scripts;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.AlertHandler;
import utilities.Waiter;


public class _08_Alerts extends Base {

    @Test(priority = 1, description = "Task 1")
    public void testEtsySignInModal(){
        driver.get("https://www.etsy.com/");

        etsySearchPage.signInButton.click();

        Assert.assertTrue(etsySearchPage.signInModal.isDisplayed());
        Assert.assertEquals(etsySearchPage.signInModalHeading.getText(), "Sign in to continue");
    }

    @Test(priority = 2, description = "Task 2")
    public void testInformationWarningAlert(){
        driver.get("https://the-internet.herokuapp.com/");

        heroAppPage.clickOnLink("JavaScript Alerts");

        heroAppPage.clickOnAlertButton("Click for JS Alert");

        Alert alert = driver.switchTo().alert();

        Assert.assertEquals(alert.getText(), "I am a JS Alert");

        alert.accept();

        Assert.assertEquals(heroAppPage.resultParagraph.getText(), "You successfully clicked an alert");

    }

    @Test(priority = 3, description = " TASK-3 Confirmation Alert")
    public void testConfirmationAlert(){
        driver.get("https://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("JavaScript Alerts");
        heroAppPage.clickOnAlertButton("Click for JS Confirm");
        Assert.assertEquals(AlertHandler.getAlertsText(driver), "I am a JS Confirm");
        AlertHandler.dismissAlert(driver);
        Assert.assertEquals(heroAppPage.resultParagraph.getText(), "You clicked: Cancel");
        heroAppPage.clickOnAlertButton("Click for JS Confirm");
        AlertHandler.acceptAlert(driver);
        Assert.assertEquals(heroAppPage.resultParagraph.getText(), "You clicked: Ok");
    }

    @Test(priority = 4, description = "Task 4")
    public void testPromptAlert(){
        driver.get("https://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("JavaScript Alerts");
        heroAppPage.clickOnAlertButton("Click for JS Prompt");
        Assert.assertEquals(AlertHandler.getAlertsText(driver), "I am a JS prompt");
        AlertHandler.dismissAlert(driver);
        Assert.assertEquals(heroAppPage.resultParagraph.getText(), "You entered: null");
        heroAppPage.clickOnAlertButton("Click for JS Prompt");
        AlertHandler.sendKeysToAlert(driver, "Hello");
        AlertHandler.acceptAlert(driver);
        Assert.assertEquals(heroAppPage.resultParagraph.getText(), "You entered: Hello");
    }

    @Test(priority = 5, description = "TASK-5 - Amazon Address Modal")
    public void testAmazonAddressModal(){

    }




}

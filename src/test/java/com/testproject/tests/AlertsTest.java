package com.testproject.tests;

import com.testproject.pages.AlertsPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTest extends TestBase {

    @Test
    public void testButtonFunctionality() {
        driver.findElement(By.linkText("JavaScript Alerts")).click();

        AlertsPage alertsPage = new AlertsPage(driver);


        alertsPage.triggerJsAlert();
        Assert.assertTrue(alertsPage.getAlertText().contains("I am a JS Alert"), "Alert text is incorrect");
        alertsPage.acceptAlert();


        alertsPage.triggerJsConfirm();
        Assert.assertTrue(alertsPage.getAlertText().contains("I am a JS Confirm"), "Confirm text is incorrect");
        alertsPage.dismissAlert();


        String promptText = "TestPrompt";
        alertsPage.triggerJsPrompt();
        Assert.assertTrue(alertsPage.getAlertText().contains("I am a JS prompt"), "Prompt text is incorrect");
        alertsPage.sendTextToPrompt(promptText);
        alertsPage.acceptAlert();
    }
}
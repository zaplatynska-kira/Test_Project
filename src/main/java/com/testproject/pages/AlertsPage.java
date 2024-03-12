package com.testproject.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage extends BasePage {

    @FindBy(xpath = "//button[@onclick='jsAlert()']")
     WebElement jsAlertButton;

    @FindBy(xpath = "//button[@onclick='jsConfirm()']")
     WebElement jsConfirmButton;

    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
     WebElement jsPromptButton;

    public AlertsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void triggerJsAlert() {
        click(jsAlertButton);
    }

    public void triggerJsConfirm() {
        click(jsConfirmButton);
    }

    public void triggerJsPrompt() {
        click(jsPromptButton);
    }

    public String getAlertText() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void dismissAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void sendTextToPrompt(String text) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
    }
}

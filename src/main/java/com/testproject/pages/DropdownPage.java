package com.testproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage {

    @FindBy(id = "dropdown")
    private WebElement dropdown;

    public DropdownPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void selectOptionByValue(String value) {
        Select select = new Select(dropdown);
        select.selectByValue(value);
    }

    public String getSelectedOptionValue() {
        Select select = new Select(dropdown);
        return select.getFirstSelectedOption().getAttribute("value");
    }
}


package com.testproject.tests;

import com.testproject.pages.DropdownPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends TestBase {

    @Test
    public void testDropdownFunctionality() {
        driver.findElement(By.linkText("Dropdown")).click();

        DropdownPage dropdownPage = new DropdownPage(driver);

        String selectedValue = "1";
        dropdownPage.selectOptionByValue(selectedValue);

        Assert.assertEquals(dropdownPage.getSelectedOptionValue(), selectedValue);

        String selectedValue2 = "2";
        dropdownPage.selectOptionByValue(selectedValue2);

        Assert.assertEquals(dropdownPage.getSelectedOptionValue(), selectedValue2);
    }
}


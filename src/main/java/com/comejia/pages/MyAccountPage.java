package com.comejia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
    By titleBy = By.xpath("//h2[text()=\"My Account\"]");

    private WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean titleIsDisplayed() {
        WebElement titleEl = driver.findElement(titleBy);
        return titleEl.isDisplayed();
    }

}

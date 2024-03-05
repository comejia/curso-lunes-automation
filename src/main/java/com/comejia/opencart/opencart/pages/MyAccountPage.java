package com.comejia.opencart.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {
    By titleBy = By.xpath("//h2[text()=\"My Account\"]");

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean titleIsDisplayed() {
        return isDisplayed(titleBy);
    }

}

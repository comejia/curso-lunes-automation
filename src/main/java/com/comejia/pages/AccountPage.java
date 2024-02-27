package com.comejia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {


    private By title = By.xpath("//h1[text()=\"Account\"]");
    private By description =
            By.xpath("//p[contains(text(), \"Your new account has been successfully created\")]");

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean titleIsDisplayed() {
        return isDisplayed(title);
    }

    public boolean descriptionIsDisplayed() {
        return isDisplayed(description);
    }
}

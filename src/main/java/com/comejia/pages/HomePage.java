package com.comejia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By inputBy = By.name("search");
    private By carrouselBy = By.id("content");
    private By menuBy = By.id("menu");
    private By myAccountBy = By.xpath("//a[@title=\"My Account\"]");
    private By loginBy = By.xpath("//a[text()=\"Login\"]");
    private By registerBy = By.xpath("//a[text()='Register']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean inputIsDisplayed() {
        return isDisplayed(inputBy);
    }

    public boolean carrouselIsDisplayed() {
        return isDisplayed(carrouselBy);
    }

    public boolean menuIsDisplayed() {
        return isDisplayed(menuBy);
    }

    public boolean myAccountIsDisplayed() {
        return isDisplayed(myAccountBy);
    }

    public void clickMyAccount() {
        click(myAccountBy);
    }

    public void clickLoginDropdown() {
        click(loginBy);
    }

    public void clickRegisterDropdown() {
        click(registerBy);
    }
}

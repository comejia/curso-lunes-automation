package com.comejia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By inputEmailBy = By.id("input-email");
    By inputPassBy = By.id("input-password");
    By buttonLoginBy = By.xpath("//input[@value=\"Login\"]");
    By errorBy = By.xpath("//div[contains(text(), \"No match for E-Mail Address and/or Password\")]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setEmail(String email) {
        clear(inputEmailBy);
        sendKeys(inputEmailBy, email);
    }

    public void setPassword(String password) {
        sendKeys(inputPassBy, password);
    }

    public void clickLogin() {
        click(buttonLoginBy);
    }

    public boolean credentialsErrorIsDisplayed() {
        return isDisplayed(errorBy);
    }

    public void login(String email, String password) {
        setEmail(email);
        setPassword(password);
        clickLogin();
    }
}

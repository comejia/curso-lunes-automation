package com.comejia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    By inputEmailBy = By.id("input-email");
    By inputPassBy = By.id("input-password");
    By buttonLoginBy = By.xpath("//input[@value=\"Login\"]");
    By errorBy = By.xpath("//div[contains(text(), \"No match for E-Mail Address and/or Password\")]");

    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void setEmail(String email) {
        WebElement inputEmailEl = wait.until(ExpectedConditions.presenceOfElementLocated(inputEmailBy));
        inputEmailEl.sendKeys(email);
    }

    public void setPassword(String password) {
        WebElement inputPassEl = wait.until(ExpectedConditions.presenceOfElementLocated(inputPassBy));
        inputPassEl.sendKeys(password);
    }

    public void clickLogin() {
        WebElement buttonLoginEl = wait.until(ExpectedConditions.elementToBeClickable(buttonLoginBy));
        buttonLoginEl.click();
    }

    public boolean credentialsErrorIsDisplayed() {
        WebElement errorEl = wait.until(ExpectedConditions.visibilityOfElementLocated(errorBy));
        return errorEl.isDisplayed();
    }

    public void login(String email, String password) {
        setEmail(email);
        setPassword(password);
        clickLogin();
    }
}

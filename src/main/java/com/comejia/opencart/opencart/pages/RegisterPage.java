package com.comejia.opencart.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    private By firstNameInput = By.id("input-firstname");
    private By lastNameInput = By.id("input-lastname");
    private By inputEmail = By.id("input-email");
    private By phoneInput = By.id("input-telephone");
    private By passwordInput = By.id("input-password");
    private By confirmPasswordInput = By.id("input-confirm");
    private By checkbox = By.name("agree");
    private By continueButton = By.xpath("//input[@value=\"Continue\"]");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void completarFormulario(String firstName,
                                    String lastName,
                                    String email,
                                    String phone,
                                    String password) {

        sendKeys(firstNameInput, firstName);
        sendKeys(lastNameInput, lastName);
        sendKeys(inputEmail, email);
        sendKeys(phoneInput, phone);
        sendKeys(passwordInput, password);
        sendKeys(confirmPasswordInput, password);
        click(checkbox);
        click(continueButton);
    }
}

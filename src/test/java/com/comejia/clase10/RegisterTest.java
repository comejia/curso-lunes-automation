package com.comejia.clase10;

import com.comejia.clase8.BaseTest;
import com.comejia.pages.AccountPage;
import com.comejia.pages.HomePage;
import com.comejia.pages.RegisterPage;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void crearCuenta() {
        HomePage homePage = new HomePage(getDriver());
        RegisterPage registerPage = new RegisterPage(getDriver());
        AccountPage accountPage = new AccountPage(getDriver());

        Faker faker = new Faker();

        getDriver().get("https://opencart.abstracta.us/");

        homePage.clickMyAccount();
        homePage.clickRegisterDropdown();

        registerPage.completarFormulario(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.phoneNumber().phoneNumber(),
                faker.internet().password()
        );

        Assert.assertTrue(accountPage.titleIsDisplayed());
        Assert.assertTrue(accountPage.descriptionIsDisplayed());
    }
}

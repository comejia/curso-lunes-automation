package com.comejia.clase8;

import com.comejia.pages.HomePage;
import com.comejia.pages.LoginPage;
import com.comejia.pages.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());

        // Paso 1: levantar la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // Paso 2: click en My Account
        homePage.clickMyAccount();

        // Paso 3: click en Login del dropdown
        homePage.clickLoginDropdown();

        // Paso 4: hacer login (ingresar user, pass y click en boton login)
//        loginPage.setEmail("cursolunes@gmail.com");
//        loginPage.setPassword("cursolunes");
//        loginPage.clickLogin();
        loginPage.login("cursolunes@gmail.com", "cursolunes");

        // Paso 5: validaciones
        Assert.assertTrue(myAccountPage.titleIsDisplayed());
    }

    @Test
    public void loginInvalid() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());

        // Paso 1: levantar la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // Paso 2: click en My Account
        homePage.clickMyAccount();

        // Paso 3: click en Login del dropdown
        homePage.clickLoginDropdown();

        // Paso 4: hacer login (ingresar user, pass y click en boton login)
        loginPage.login("cursolunes2222@gmail.com", "cursolunes");

        // Paso 5: validaciones
        Assert.assertTrue(loginPage.credentialsErrorIsDisplayed());
    }
}

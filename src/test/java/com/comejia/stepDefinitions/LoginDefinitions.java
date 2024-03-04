package com.comejia.stepDefinitions;

import com.comejia.hooks.Hooks;
import com.comejia.pages.HomePage;
import com.comejia.pages.LoginPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;

public class LoginDefinitions {

    private HomePage homePage;
    private LoginPage loginPage;

    public LoginDefinitions() {
        this.homePage = new HomePage(Hooks.getDriver());
        this.loginPage = new LoginPage(Hooks.getDriver());
    }

    @Dado("que el usuario ingresa a la página de login")
    public void queElUsuarioIngresaALaPáginaDeLogin() {
        Hooks.getDriver().get(Hooks.getProperty("url"));

        homePage.clickMyAccount();
        homePage.clickLoginDropdown();
    }

    @Cuando("el usuario se loguea con credenciales validas")
    public void elUsuarioSeLogueaConCredencialesValidas() {
        loginPage.login(Hooks.getProperty("username"), Hooks.getProperty("password"));
    }
}

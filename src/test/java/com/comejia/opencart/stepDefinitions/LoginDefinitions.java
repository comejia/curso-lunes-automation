package com.comejia.opencart.stepDefinitions;

import com.comejia.opencart.hooks.Hooks;
import com.comejia.opencart.opencart.pages.HomePage;
import com.comejia.opencart.opencart.pages.LoginPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;

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

    @Y("el usuario se loguea en la aplicacion")
    public void elUsuarioSeLogueaEnLaAplicacion() {
        homePage.clickMyAccount();
        homePage.clickLoginDropdown();

        loginPage.login(Hooks.getProperty("username"), Hooks.getProperty("password"));
    }
}

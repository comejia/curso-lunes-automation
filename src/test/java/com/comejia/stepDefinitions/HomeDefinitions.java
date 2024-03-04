package com.comejia.stepDefinitions;

import com.comejia.hooks.Hooks;
import com.comejia.pages.HomePage;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class HomeDefinitions {

    private HomePage homePage;

    public HomeDefinitions() {
        this.homePage = new HomePage(Hooks.getDriver());
    }

    @Dado("que el usuario ingresa a la pantalla de inicio")
    public void queElUsuarioIngresaALaPantallaDeInicio() {
        Hooks.getDriver().get(Hooks.getProperty("url"));
    }

    @Entonces("se valida que la pantalla de incio se muestre correctamente")
    public void seValidaQueLaPantallaDeIncioSeMuestreCorrectamente() {
        Assert.assertTrue(homePage.inputIsDisplayed());
        Assert.assertTrue(homePage.carrouselIsDisplayed());
        Assert.assertTrue(homePage.menuIsDisplayed());
        Assert.assertTrue(homePage.myAccountIsDisplayed());
    }
}

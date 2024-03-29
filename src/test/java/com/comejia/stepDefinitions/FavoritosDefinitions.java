package com.comejia.stepDefinitions;

import com.comejia.hooks.Hooks;
import com.comejia.pages.FavoritosPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class FavoritosDefinitions {

    private FavoritosPage favoritosPage;

    public FavoritosDefinitions() {
        this.favoritosPage = new FavoritosPage(Hooks.getDriver());
    }

    @Cuando("el usuario agrega un producto a favoritos")
    public void elUsuarioAgregaUnProductoAFavoritos() {
        favoritosPage.ingresarASeccionCamaras();
        favoritosPage.agregarUnProductoAFav();
        favoritosPage.ingresarAFavoritos();
    }

    @Entonces("se valida que se agrego un producto a favoritos")
    public void seValidaQueSeAgregoUnProductoAFavoritos() {
        Assert.assertTrue(favoritosPage.cameraInFavIsDisplayed());
    }
}

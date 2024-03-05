package com.comejia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FavoritosPage extends BasePage {

    private By cameraButton = By.xpath("//a[text()=\"Cameras\"]");
    private By favIcon = By.xpath("//button[@onclick=\"wishlist.add('30');\"]");
//            By.xpath("//div[./div/h4/a[text()=\"Canon EOS 5D\"]]/div/button[@data-original-title=\"Add to Wish List\"]");
    private By wishlistButton = By.id("wishlist-total");
    private By canonCamera = By.xpath("//td/a[text()=\"Canon EOS 5D\"]");


    public FavoritosPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarASeccionCamaras() {
        click(cameraButton);
    }

    public void agregarUnProductoAFav() {
        click(favIcon);
    }

    public void ingresarAFavoritos() {
        click(wishlistButton);
    }

    public boolean cameraInFavIsDisplayed() {
        return isDisplayed(canonCamera);
    }
}

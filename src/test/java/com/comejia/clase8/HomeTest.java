package com.comejia.clase8;

import com.comejia.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    @Test
    public void validarHome() {
        HomePage homePage = new HomePage(getDriver());

        // Paso 1: levantar la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // Paso 2: realizar las aserciones
        Assert.assertTrue(homePage.inputIsDisplayed());
        Assert.assertTrue(homePage.carrouselIsDisplayed());
        Assert.assertTrue(homePage.menuIsDisplayed());
        Assert.assertTrue(homePage.myAccountIsDisplayed());
    }
}

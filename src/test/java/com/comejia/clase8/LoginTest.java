package com.comejia.clase8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        // Paso 1: levantar la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // Paso 2: click en My Account
        By myAccountBy = By.xpath("//a[@title=\"My Account\"]");
        WebElement myAccountEl = getDriver().findElement(myAccountBy);
        myAccountEl.click();

        // Paso 3: click en Login del dropdown
        By loginBy = By.xpath("//a[text()=\"Login\"]");
        WebElement loginEl = getDriver().findElement(loginBy);
        loginEl.click();

        // Paso 4: hacer login (ingresar user, pass y click en boton login)
        By inputEmailBy = By.id("input-email");
        By inputPassBy = By.id("input-password");
        By buttonLoginBy = By.xpath("//input[@value=\"Login\"]");

        WebElement inputEmailEl = getDriver().findElement(inputEmailBy);
        WebElement inputPassEl = getDriver().findElement(inputPassBy);
        WebElement buttonLoginEl = getDriver().findElement(buttonLoginBy);

        inputEmailEl.sendKeys("cursolunes@gmail.com");
        inputPassEl.sendKeys("cursolunes");
        buttonLoginEl.click();

        // Paso 5: validaciones
        By titleBy = By.xpath("//h2[text()=\"My Account\"]");
        WebElement titleEl = getDriver().findElement(titleBy);

        Assert.assertTrue(titleEl.isDisplayed());
    }

}

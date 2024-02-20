package com.comejia.clase9;

import com.comejia.clase8.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class EsperasTest extends BaseTest {

    @Test
    public void esperaImplicit() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Paso 1: levantar la pagina
        getDriver().get("https://the-internet.herokuapp.com/dynamic_loading/1");

        By startBy = By.xpath("//div[@id=\"start\"]/button");
        WebElement startEl = getDriver().findElement(startBy);
        startEl.click();

        By helloBy = By.xpath("//div[@id=\"finish\"]/h4");
        WebElement helloEl = getDriver().findElement(helloBy);

        Assert.assertEquals(helloEl.getText(), "Hello World!");
    }

    @Test
    public void esperaExplicit() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        // Paso 1: levantar la pagina
        getDriver().get("https://the-internet.herokuapp.com/dynamic_loading/1");

        By startBy = By.xpath("//div[@id=\"start\"]/button");

        WebElement startEl = wait.until(ExpectedConditions.elementToBeClickable(startBy));
        startEl.click();

        By helloBy = By.xpath("//div[@id=\"finish\"]/h4");
        WebElement helloEl = wait.until(ExpectedConditions.visibilityOfElementLocated(helloBy));

        Assert.assertEquals(helloEl.getText(), "Hello World!");
    }
}

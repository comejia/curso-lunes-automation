package com.comejia.opencart.stepDefinitions;

import com.comejia.opencart.hooks.Hooks;
import com.comejia.opencart.opencart.pages.MyAccountPage;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class MyAccountDefinitions {

    private MyAccountPage myAccountPage;

    public MyAccountDefinitions() {
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
    }

    @Entonces("el usuario se encuentra en su cuenta")
    public void elUsuarioSeEncuentraEnSuCuenta() {
        Assert.assertTrue(myAccountPage.titleIsDisplayed());
    }
}

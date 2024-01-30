package com.comejia.clase7;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SoldadoTest {

    private Soldado sol;

    @BeforeMethod
    public void setup() { // este metodo se ejecuta antes de cada test
        sol = new Soldado(100);
    }

    @Test
    public void saludDespuesDePelear() {
        Soldado soldado = new Soldado(50);

        soldado.pelear(10);

        Assert.assertEquals(soldado.getSalud(), 45, "La salud no es correcta despues de peliar");
    }

    @Test
    public void soldadoMuerto() {
        Soldado soldado = new Soldado(50);

        soldado.pelear(120);

        Assert.assertTrue(soldado.estaMuerto(), "El soldado no esta muerto");
    }

    @Test
    public void elSoldadoDescanza() {
        Soldado soldado = new Soldado(15);

        soldado.descansar();

        Assert.assertEquals(soldado.getSalud(), 25);
    }

    @Test
    public void soldadoNoEstaMuerto() {
        sol.pelear(50);

        Assert.assertFalse(sol.estaMuerto());
    }
}

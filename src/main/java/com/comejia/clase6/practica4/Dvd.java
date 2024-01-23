package com.comejia.clase6.practica4;

public class Dvd {

    public void reproducir() {
        System.out.println("Reproduciendo contenido");
        throw new ReproducirException();
    }

    public void detener() throws DetenerException {
        System.out.println("Deteniendo contenido");

        throw new DetenerException();
    }
}

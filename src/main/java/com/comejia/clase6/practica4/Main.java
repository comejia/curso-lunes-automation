package com.comejia.clase6.practica4;

public class Main {

    public static void main(String[] args) throws DetenerException {
        Dvd dvd = new Dvd();

        Persona persona = new Persona(dvd);

        persona.mirarPelicula();

        persona.irADormir();
    }
}

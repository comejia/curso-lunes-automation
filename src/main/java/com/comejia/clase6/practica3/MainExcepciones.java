package com.comejia.clase6.practica3;

public class MainExcepciones {

    public static void main(String[] args) {

        Durmiendo durmiendo = new Durmiendo();

        durmiendo.dormir(2);

        try {
            durmiendo.dormir(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Manejando la excepcion");
        }

        System.out.println("Finalizando el programa");
    }
}

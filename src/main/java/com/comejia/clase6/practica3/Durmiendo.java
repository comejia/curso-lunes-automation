package com.comejia.clase6.practica3;

public class Durmiendo {

    public void dormir(long segundos) {

        System.out.println("Llendo a dormir");

        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            System.out.println("No se pudo dormir el proceso");
        }

        System.out.println("El proceso se levanto");
    }
}

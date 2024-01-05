package com.comejia.clase3;

public class P5Bucles {

    public static void main(String[] args) {

        // WHILE
        int contador = 0;

        while(contador < 5) {
            System.out.println("Hola mundo");

            contador = contador + 1;
        }

        System.out.println();

        // DO-WHILE
        int contadorDoWhile = 0;
        do {
            System.out.println("Hola mundo");
            contadorDoWhile++; // Equivale a: contadorDoWhile = contadorDoWhile + 1;
        } while(contadorDoWhile < 5);

        System.out.println();

        // FOR
        for (int i = 0; i < 5; i++) {
            System.out.println("Hola mundo");
        }
    }
}

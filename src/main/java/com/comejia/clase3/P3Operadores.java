package com.comejia.clase3;

public class P3Operadores {

    public static void main(String[] args) {

        // Operadores aritmeticos
        int suma = 10 + 10;
        int division = 10 / 5;

        System.out.println("Suma: " + suma);
        System.out.println("Division: " + division);

        // Operadores relaciones
        boolean menor = 20 < 10;
        boolean distinto = 5 != 10;
        boolean igualdad = 20 == 20;

        System.out.println("Menor: " + menor);
        System.out.println("Distinto: " + distinto);
        System.out.println("Igualdad: " + igualdad);

        // Operadores condicionales

        boolean and = (10 < 100) && (20 != 5);
        boolean or = (5 == 1) || ( 100 < 100);
        boolean or2 = (5 == 1) || ( 100 <= 100);

        System.out.println("And: " + and);
        System.out.println("Or: " + or);
        System.out.println("Or: " + or2);
    }
}

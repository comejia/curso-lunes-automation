package com.comejia.clase3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P2Colecciones {

    public static void main(String[] args) {

        // ARRAYS
        int[] arrayDeEnteros = new int[3];

        arrayDeEnteros[0] = 100;
        arrayDeEnteros[1] = 200;
        arrayDeEnteros[2] = 300;

        System.out.println("Posicion 0: " + arrayDeEnteros[0]);
        System.out.println("Posicion 1: " + arrayDeEnteros[1]);
        System.out.println("Posicion 2: " + arrayDeEnteros[2]);

        System.out.println("Array: " + Arrays.toString(arrayDeEnteros));

        arrayDeEnteros[1] = 1000; // aca estoy cambiando el valor de una posicion

//        arrayDeEnteros[3] = 4000; // Esto no se puede hacer!!
//        System.out.println("Posicion 3: " + arrayDeEnteros[3]); // Esto no se puede hacer!!


        // LISTAS
        List<String> listaDeString = new ArrayList<>();

        listaDeString.add("Hola");
        listaDeString.add("Como");
        listaDeString.add("estan?");

        System.out.println("La lista contiene: " + listaDeString);

        System.out.println("Posicion 0: " + listaDeString.get(0));
        System.out.println("Posicion 2: " + listaDeString.get(2));

//        System.out.println("Posicion 3: " + listaDeString.get(3)); // Esto no se puede hacer!!

        listaDeString.remove(1);

        System.out.println("La lista contiene: " + listaDeString);


    }
}

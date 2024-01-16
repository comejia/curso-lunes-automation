package com.comejia.clase5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P7Clase3 {

    /*
    Ingresar por consola un número mientras sea menor o igual a 500
    y almacenar el número en una lista. Al finalizar el ingreso mostrar
    los datos y la cantidad ingresada por pantalla.
    También, sí hubo menos de 10 ingresos mostrar “Se ingresaron pocos números”
    de los contrario mostrar “Se excedió la cantidad de ingresos”
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer numero; // Integer equivale int

        List<Integer> listaDeNumeros = new ArrayList<>();

        do {
            System.out.println("Ingrese un numero: ");
            numero = scanner.nextInt();

            listaDeNumeros.add(numero);
        } while(numero <= 500);

        System.out.println("Datos ingresados: " + listaDeNumeros);
        System.out.println("Cantidad ingresada: " + listaDeNumeros.size());

        if (listaDeNumeros.size() < 10) {
            System.out.println("Se ingresaron pocos números");
        } else {
            System.out.println("Se excedió la cantidad de ingresos");
        }
    }
}

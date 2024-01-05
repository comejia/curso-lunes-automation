package com.comejia.clase3;

public class P4Condicionales {

    public static void main(String[] args) {

        int var1 = 100;
        int var2 = 200;

        if (var1 < var2) {
            System.out.println("Var1 es menor a Var2");
        }

        int var3 = 1;
        int var4 = 10;

        if (var3 > var4) {
            System.out.println("Var3 es mayor a Var4");
        } else {
            System.out.println("Var3 es menor a Var4");
        }


        String diaDelaSemana = "Martes";

        switch (diaDelaSemana) {
            case "Lunes":
                System.out.println("Hoy es Lunes");
                break;
            case "Martes":
                System.out.println("Hoy es Martes");
                break;
            case "Miercoles":
                System.out.println("Hoy es Miercoles");
                break;
            default:
                System.out.println("No existe ese dia!!");
        }

        if (diaDelaSemana == "Lunes") {
            System.out.println("Hoy es Lunes");
        } else if (diaDelaSemana == "Martes") {
            System.out.println("Hoy es Martes");
        } else if (diaDelaSemana == "Miercoles") {
            System.out.println("Hoy es Miercoles");
        } else {
            System.out.println("No existe ese dia!!");
        }

    }
}

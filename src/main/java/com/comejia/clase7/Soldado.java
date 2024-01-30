package com.comejia.clase7;

/*
Crear la clase Soldado con las siguientes características:
tiene el atributo salud y los métodos pelear, descansar y estaMuerto.
Cuando un Soldado pelea pierde de salud la mitad del ataque que recibe.
Y cuando descansa recupera 10 de salud. El soldado está muerto si la salud es menor o igual a 0

Implementar tests sobre la clase Soldado.

 */
public class Soldado {

    private Integer salud;

    public Soldado(Integer salud) {
        this.salud = salud;
    }

    public void pelear(Integer ataque) {
        salud -= ataque / 2;
        //salud = salud - ataque / 2;
    }

    public void descansar() {
        salud += 10;
    }

    public boolean estaMuerto() {
        return salud <= 0;
    }

    public Integer getSalud() {
        return salud;
    }
}

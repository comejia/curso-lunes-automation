package com.comejia.clase6.practica1;

/*
Crear una clase Figura con el método abstracto calcularArea()
Crear 3 clases hijas: Cuadrado, Rectángulo y Triangulo.
Cada hijo debe implementar el método abstracto

 */
public abstract class Figura {

    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract Integer calcularArea();
}

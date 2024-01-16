package com.comejia.clase5.practica5;

import com.comejia.clase5.practica4.Alumno;
import com.comejia.clase5.practica4.Persona;
import com.comejia.clase5.practica4.Profesor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
    En una clase que contenga main, instanciar las clases hijas y una lista de Personas.
    Agregar a la lista los objetos instanciados y mediante un bucle acceder
    a cada elemento de la lista y usar el método saludar()
     */

    public static void main(String[] args) {

        List<String> materias = new ArrayList<>();
        materias.add("Fisica");

        Alumno alumno = new Alumno("pepe", "Pepito", "abc", 6, materias);

        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno);

        Profesor profesor = new Profesor("Jose", "Perez", alumnos);

        NoDocente noDocente = new NoDocente("No", "Docente");


        List<Persona> personas = new ArrayList<>();

        personas.add(alumno);
        personas.add(profesor);
        personas.add(noDocente);

        for (Persona p : personas) {
            p.saludar();
        }

        profesor.calificar(10);
        profesor.calificar(alumno, 2);
    }
}

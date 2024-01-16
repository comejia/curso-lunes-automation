package com.comejia.clase5.practica4;

import java.util.List;

public class Profesor extends Persona {

    private List<Alumno> alumnos;

    public Profesor(String nombre, String apellido, List<Alumno> alumnos) {
        super(nombre, apellido);
        this.alumnos = alumnos;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    @Override
    public void saludar() {
        System.out.println("Hola a todos");
    }

    public void calificar(Alumno alumno, Integer nota) {
        alumno.setNota(nota);
    }

    public void calificar(Integer nota) {
//        for (int i = 0; i < alumnos.size(); i++) {
//            Alumno a = alumnos.get(i);
//            a.setNota(nota);
//        }

        for (Alumno a : alumnos) {
            a.setNota(nota);
        }

    }
}

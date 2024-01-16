package com.comejia.clase5.practica4;

import java.util.List;

public class Alumno extends Persona {

    private String matricula;
    private Integer nota;
    private List<String> materias;

    public Alumno(String nombre, String apellido, String matricula, Integer nota, List<String> materias) {
        super(nombre, apellido);
        this.matricula = matricula;
        this.nota = nota;
        this.materias = materias;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public List<String> getMaterias() {
        return materias;
    }

    public void setMaterias(String materia) {
        this.materias.add(materia);
    }

    @Override
    public void saludar() {
        System.out.println("Que ondaaa");
    }
}

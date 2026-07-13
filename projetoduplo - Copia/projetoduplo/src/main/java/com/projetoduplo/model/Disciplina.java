package com.projetoduplo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDisciplina;

    @Column(nullable = false)
    private String nomeDisciplina;

    private String nomeDoProfessor;
    private int cargaHoraria;

    public Disciplina() {

    }

    public Disciplina(String nomeDisciplina, String nomeDoProfessor, int cargaHoraria) {
        this.nomeDisciplina = nomeDisciplina;
        this.nomeDoProfessor = nomeDoProfessor;
        this.cargaHoraria = cargaHoraria;
    }

    public Long getIdDisciplina() { 
        return idDisciplina; 
    }

    public String getNomeDisciplina() { 
        return nomeDisciplina; 
    }

    public String getNomeDoProfessor() { 
        return nomeDoProfessor; 
    }

    public int getCargaHoraria() { 
        return cargaHoraria; 
    }

    public void setNomeDisciplina(String nomeDisciplina) { 
        this.nomeDisciplina = nomeDisciplina; 
    }

    public void setNomeDoProfessor(String nomeDoProfessor) { 
        this.nomeDoProfessor = nomeDoProfessor; 
    }

    public void setCargaHoraria(int cargaHoraria) { 
        this.cargaHoraria = cargaHoraria; 
    }

    @Override
    public String toString() {
        return "ID: " + idDisciplina +
               "Nome: " + nomeDisciplina +
               "Professor: " + nomeDoProfessor +
               "Carga Horária: " + cargaHoraria;
    }
}

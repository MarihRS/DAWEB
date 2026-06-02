package com.projetocadastroduplo.dto;

import com.projetocadastroduplo.model.Estudantes;

public class DisciplinaDTO {

    private int idDisciplina;
    private String nomeDisciplina;
    private String nomeDoProfessor;
    private int cargaHoraria;
    private int qtdEstudantes;
    private Estudantes[] estudantes;

    public DisciplinaDTO(int idDisciplina, String nomeDisciplina, String nomeDoProfessor, int cargaHoraria) {
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.nomeDoProfessor = nomeDoProfessor;
        this.cargaHoraria = cargaHoraria;

        this.qtdEstudantes = 0;
        this.estudantes = new Estudantes[50];
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getNomeDoProfessor() {
        return nomeDoProfessor;
    }

    public void setNomeDoProfessor(String nomeDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Estudantes[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudantes[] estudantes) {
        this.estudantes = estudantes;
    }

    public int getQtdEstudantes() {
        return qtdEstudantes;
    }

    public void setQtdEstudantes(int qtdEstudantes) {
        this.qtdEstudantes = qtdEstudantes;
    }
}

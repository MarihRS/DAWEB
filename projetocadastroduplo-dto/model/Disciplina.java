package com.projetocadastroduplo.model;

public class Disciplina {

    private int idDisciplina;
    private String nomeDisciplina;
    private String NomeDoProfessor;
    private int cargaHoraria;
    private Estudantes[] estudantes;
    private int qtdEstudantes;

    public Disciplina(int idDisciplina, String nomeDisciplina, String NomeDoProfessor, int cargaHoraria) {
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.NomeDoProfessor = NomeDoProfessor;
        this.cargaHoraria = cargaHoraria;
        this.estudantes = new Estudantes[50];
        this.qtdEstudantes = 0;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }
    
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public String getNomeDoProfessor() {
        return NomeDoProfessor;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Estudantes[] getEstudantes() {
        return estudantes; 
    }

    public int getQtdEstudantes() {
        return qtdEstudantes; 
    }

    public void setIdDisciplina(int idDisciplina){
        this.idDisciplina = idDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    public void setNomeDoProfessor(String nomeDoProfessor){
        this.NomeDoProfessor = nomeDoProfessor;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public void setEstudantes(Estudantes[] estudantes) {
        this.estudantes = estudantes; 
    }

    public void setQtdEstudantes(int qtdEstudantes) {
        this.qtdEstudantes = qtdEstudantes; 
    }
}

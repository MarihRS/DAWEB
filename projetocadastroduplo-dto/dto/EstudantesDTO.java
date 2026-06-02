package com.projetocadastroduplo.dto;

public class EstudantesDTO {

    private int idAluno;
    private String nomeAluno;
    private int idade;
    private String endereco;
    private String telefone;
    private String curso;

    public EstudantesDTO() {
    }

    public EstudantesDTO(int idAluno, String nomeAluno, int idade, String endereco, String telefone, String curso) {
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.curso = curso;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

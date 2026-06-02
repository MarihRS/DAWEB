package com.projetocadastroduplo.model;

public class Estudantes {

    private int idAluno;
    private String nomeAluno;
    private int idade;
    private String endereco;
    private String telefone;
    private String curso;

    public Estudantes(int idAluno, String nomeAluno, int idade, String endereco, String telefone, String curso) {
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.curso = curso;
    }

    public int getIdAluno(){
        return idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCurso() {
        return curso;
    }

    public void setNomeAluno(String nomeAluno){
        this.nomeAluno = nomeAluno;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public String toString() {
        return  "ID: " + idAluno +
                "Nome: " + nomeAluno +
                "Idade: " + idade +
                "Endereço: " + endereco +
                "Telefone: " + telefone +
                "Curso: " + curso;
    }
}

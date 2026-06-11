package com.projetoduplo.model;

import jakarta.persistence.Column; //importações JPA
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //pra avisar que é uma tabela no banco
public class Estudantes {

    @Id //chave primária
    @GeneratedValue(strategy = GenerationType.AUTO) //gera id automaticamente
    private Long idAluno; //JPA funciona melhor com Long ao invés de int

    @Column(nullable = false) //n pode ficar vazia
    private String nomeAluno;

    private int idade;
    private String endereco;
    private String telefone;
    private String curso;

    public Estudantes() {//JPA exige pra recriar objetos que ele busca no banco

    } 

    public Estudantes(String nomeAluno, int idade, String endereco, String telefone, String curso) {
        this.nomeAluno = nomeAluno;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.curso = curso;
    }

    public Long getIdAluno() {
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

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno; 
    }

    public void setIdade(int idade) { 
        this.idade = idade; 
    }

    public void setEndereco(String endereco) { 
        this.endereco = endereco; 
    }

    public void setTelefone(String telefone) { 
        this.telefone = telefone; 
    }

    public void setCurso(String curso) { 
        this.curso = curso; 
    }

    @Override
    public String toString() {
        return "ID: " + idAluno +
               "Nome: " + nomeAluno +
               "Idade: " + idade +
               "Endereço: " + endereco +
               "Telefone: " + telefone +
               "Curso: " + curso;
    }
}

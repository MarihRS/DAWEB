package com.projetocadastroduplo.repository;

import com.projetocadastroduplo.model.Estudantes;

public class EstudanteRepository {
    private Estudantes[] estudantes;
    private int qtdEstudantes;

    public EstudanteRepository (int qtdEstudantes){
        this.estudantes = new Estudantes[100];
        this.qtdEstudantes = 0;
    }

    public Estudantes[] getEstudantes(){
        return estudantes;
    }

    public int getQtdEStudantes() {
        return qtdEstudantes; 
    }
    
    public void inserirEstudante(Estudantes estudante) {
        if (qtdEstudantes < estudantes.length) {
            estudantes[qtdEstudantes] = estudante;
            qtdEstudantes++;
            
        }
    }

    public Estudantes[] listarEstudantes() {
        Estudantes[] resultado = new Estudantes[qtdEstudantes];
        for (int i = 0; i < qtdEstudantes; i++) {
            resultado[i] = estudantes[i];
        }
        return resultado;
    }

    public Estudantes buscarEstudantePorId(int id) {
        for (int i = 0; i < qtdEstudantes; i++) {
            if (estudantes[i].getIdAluno() == id) {
                return estudantes[i];
            }
        }
        return null;
    }

    public boolean editarPorId(int id, String nome, int idade, String endereco, String telefone, String curso) {
        Estudantes estudantes = buscarEstudantePorId(id);
        if (estudantes != null) {
            estudantes.setNomeAluno(nome);
            estudantes.setIdade(idade);
            estudantes.setEndereco(endereco);
            estudantes.setTelefone(telefone);
            estudantes.setCurso(curso);
            return true;
        }
        return false;
    }
}

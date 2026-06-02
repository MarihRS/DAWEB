package com.projetocadastroduplo.repository;

import com.projetocadastroduplo.model.Disciplina;

public class DisciplinaRepository {
    private Disciplina[] disciplinas;
    private int qtdDisciplinas;

    public DisciplinaRepository (int qtdDisciplinas){
        this.disciplinas = new Disciplina[50];
        this.qtdDisciplinas = 0;
    }

    public Disciplina[] disciplinas() {
        return disciplinas;
    }
    
    public int getQtdDisciplinas() {
        return qtdDisciplinas;
    }

    public boolean inserirDisciplina(Disciplina disciplina) {
        if (qtdDisciplinas < disciplinas.length) {
            disciplinas[qtdDisciplinas] = disciplina;
            qtdDisciplinas++;
            return true;
        }
        return false;
    }

    public Disciplina[] listarDisciplinas() {
    Disciplina[] resultado = new Disciplina[qtdDisciplinas];
    for (int i = 0; i < qtdDisciplinas; i++) {
        resultado[i] = disciplinas[i];
    }
    return resultado;
}

    public Disciplina buscarDisciplinaPorId(int id) {
    for (int i = 0; i < qtdDisciplinas; i++) {
        if (disciplinas[i] != null && disciplinas[i].getIdDisciplina() == id) {
            return disciplinas[i];
        }
    }
    return null;
}
    public boolean editarDisplinaPorId(int id, String nome, String professor, int cargaHoraria) {
        Disciplina disciplina = buscarDisciplinaPorId(id);
        if (disciplina != null) {
            disciplina.setNomeDisciplina(nome);
            disciplina.setNomeDoProfessor(professor);
            disciplina.setCargaHoraria(cargaHoraria);
            return true;
        }
        return false;
    }
}

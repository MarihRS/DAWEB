package com.projetocadastroduplo.controller;

import com.projetocadastroduplo.dto.DisciplinaDTO;
import com.projetocadastroduplo.model.Disciplina;
import com.projetocadastroduplo.model.Estudantes;
import com.projetocadastroduplo.service.DisciplinaService;

public class DisciplinaController {
    private DisciplinaService disciplinaService;
    
    public DisciplinaController() {
        this.disciplinaService = new DisciplinaService();
    }
    
    public boolean cadastrar(DisciplinaDTO disciplinaDTO) {
        Disciplina disciplina = new Disciplina(
            disciplinaDTO.getIdDisciplina(),
            disciplinaDTO.getNomeDisciplina(),
            disciplinaDTO.getNomeDoProfessor(),
            disciplinaDTO.getCargaHoraria()
        );
        return disciplinaService.cadastrar(disciplinaDTO);
    }
    
    public Disciplina[] listarDisciplinas() {
        return disciplinaService.listarDisciplinas();
    }
    
    public Disciplina buscarDisciplinaPorId(int id) {
        return disciplinaService.buscarDisciplinaPorId(id);
    }
    
    public boolean editarDisciplinaPorId(int id, String nome, String professor, int cargaHoraria) {
        return disciplinaService.editarDisciplina(id, nome, professor, cargaHoraria);
    }
    
    public boolean matricularEstudante(int idDisciplina, Estudantes estudantes) {
        return disciplinaService.matricularEstudantes(idDisciplina, estudantes);
    }

    public int getQtdDisciplinas() {
        return disciplinaService.getQtdDisciplinas();
    }
}

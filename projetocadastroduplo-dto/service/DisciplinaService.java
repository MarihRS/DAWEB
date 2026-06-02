package com.projetocadastroduplo.service;

import com.projetocadastroduplo.dto.DisciplinaDTO;
import com.projetocadastroduplo.model.Disciplina;
import com.projetocadastroduplo.model.Estudantes;
import com.projetocadastroduplo.repository.DisciplinaRepository;

public class DisciplinaService {
    private DisciplinaRepository disciplinaRepository;
    private EstudanteService estudanteService;
    
    public DisciplinaService() {
        this.disciplinaRepository = new DisciplinaRepository(0);
        this.estudanteService = new EstudanteService();
    }
    
    public boolean cadastrar(DisciplinaDTO disciplinaDTO) {
        Disciplina disciplina = new Disciplina(
            disciplinaDTO.getIdDisciplina(),
            disciplinaDTO.getNomeDisciplina(),
            disciplinaDTO.getNomeDoProfessor(),
            disciplinaDTO.getCargaHoraria()
        );
        if (disciplina.getCargaHoraria() <= 0) {
            return false;
        }
        return disciplinaRepository.inserirDisciplina(disciplina);
    }

    public Disciplina[] listarDisciplinas() {
        return disciplinaRepository.listarDisciplinas();
    }
    
    public Disciplina buscarDisciplinaPorId(int idDisciplina) {
        return disciplinaRepository.buscarDisciplinaPorId(idDisciplina);
    }
    
    public boolean editarDisciplina(int id, String nome, String professor, int cargaHoraria) {
        return disciplinaRepository.editarDisplinaPorId(id, nome, professor, cargaHoraria);
    }
    
    public boolean matricularEstudantes(int idDisciplina, Estudantes estudantes) { 
        Disciplina disciplina = disciplinaRepository.buscarDisciplinaPorId(idDisciplina);
            if (disciplina == null) {
                return false;
        }

        Estudantes[] matriculados = disciplina.getEstudantes();
        for (int i = 0; i < disciplina.getQtdEstudantes(); i++) {
            if (matriculados[i].getIdAluno() == estudantes.getIdAluno()) {
                return false;
            }
        }
        return true;
    }

    public int getQtdDisciplinas() {
        return disciplinaRepository.getQtdDisciplinas();
    }
}

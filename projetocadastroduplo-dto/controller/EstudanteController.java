package com.projetocadastroduplo.controller;

import com.projetocadastroduplo.dto.EstudantesDTO;
import com.projetocadastroduplo.model.Estudantes;
import com.projetocadastroduplo.service.EstudanteService;

public class EstudanteController {
    private EstudanteService estudanteService;
    
    public EstudanteController() {
        this.estudanteService = new EstudanteService();
    }
    
    public boolean cadastrarEstudante(EstudantesDTO estudanteDTO) {
        Estudantes estudante = new Estudantes(
            estudanteDTO.getIdAluno(),
            estudanteDTO.getNomeAluno(),
            estudanteDTO.getIdade(),
            estudanteDTO.getEndereco(),
            estudanteDTO.getTelefone(),
            estudanteDTO.getCurso()
        );
        return estudanteService.cadastrarEstudante(estudanteDTO);
    }
    
    public Estudantes[] listarEstudantes() {
        return estudanteService.listarEstudantes();
    }
    
    public Estudantes buscarEstudantePorId(int idEstudante) {
        return estudanteService.buscarEstudantePorId(idEstudante);
    }
    
    public boolean editarEstudantePorId(int id, String nome, int idade, String endereco, String telefone, String curso) {
        return estudanteService.editarEstudantePorId(id, nome, idade, endereco, telefone, curso);
    }

    public int getQtdEStudantes() {
        return estudanteService.getQtdEStudantes();
    }
}

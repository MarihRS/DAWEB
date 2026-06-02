package com.projetocadastroduplo.service;

import com.projetocadastroduplo.dto.EstudantesDTO;
import com.projetocadastroduplo.model.Estudantes;
import com.projetocadastroduplo.repository.EstudanteRepository;


public class EstudanteService {
    private EstudanteRepository estudanteRepository;
    
    public EstudanteService() {
        this.estudanteRepository = new EstudanteRepository(0);
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
        if (estudante.getIdade() < 13) {
            return false;
        }
        estudanteRepository.inserirEstudante(estudante);
        return true;
    }
    
    public Estudantes[] listarEstudantes() {
        return estudanteRepository.listarEstudantes();
    }
    
    public Estudantes buscarEstudantePorId(int id) {
        return estudanteRepository.buscarEstudantePorId(id);
    }
    
    public boolean editarEstudantePorId(int id, String nome, int idade, String endereco, String telefone, String curso) {
        return estudanteRepository.editarPorId(id, nome, idade, endereco, telefone, curso);
    }

    public int getQtdEStudantes() {
        return estudanteRepository.getQtdEStudantes();
    }    
}

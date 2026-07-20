package com.projetoduplo.service;

import com.projetoduplo.model.Estudantes;
import com.projetoduplo.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; //importam as anotações

import java.util.List;

@Service //permite que o spring crie um objeto dessa classe automaticamente e guarde ele sem precisar do new
public class EstudanteService {
    
    @Autowired //dependencia
    private EstudanteRepository estudanteRepository;

    public List<Estudantes> listarEstudantes() {
        return estudanteRepository.findAll();
    }

    public Estudantes salvarEstudantes(Estudantes estudante) {
        return estudanteRepository.save(estudante);
    }

    public void deletarEstudantes(Long id) {
        estudanteRepository.deleteById(id);
    }
}

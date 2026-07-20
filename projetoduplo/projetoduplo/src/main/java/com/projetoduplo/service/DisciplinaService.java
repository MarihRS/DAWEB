package com.projetoduplo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.projetoduplo.model.Disciplina;
import com.projetoduplo.repository.DisciplinaRepository;

@Service
public class DisciplinaService {
    
    @Autowired //dependencia
    private DisciplinaRepository disciplinaRepository;

    public List<Disciplina> listarDisciplinas() {
        return disciplinaRepository.findAll();
    }

    public Disciplina salvarDisciplina (Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    public void deletarDisciplina(Long id) {
        disciplinaRepository.deleteById(id);
    }
}

    


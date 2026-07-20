package com.projetoduplo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.projetoduplo.model.Estudantes;
import com.projetoduplo.service.EstudanteService;
import com.projetoduplo.service.ValidationService;

@Controller
public class EstudanteController {
    private long id;
    private String nomeAluno;
    private int idade;
    private String endereco;
    private String telefone;
    private String curso;

    @Autowired
    private EstudanteService estudanteService;
    @Autowired
    private ValidationService validationService;

    public boolean save() {
        if(validationService.validateIdade(idade) && validationService.validateNomeAluno(nomeAluno)) {
            Estudantes estudante = new Estudantes();

            estudante.setNomeAluno(nomeAluno);
            estudante.setIdade(idade);
            estudante.setEndereco(endereco);
            estudante.setTelefone(telefone);
            estudante.setCurso(curso);

            estudanteService.salvarEstudantes(estudante);

            //addInfoMessage("Save", String.format("Um novo estudante foi criado. %s", nomeAluno));

            return true;
        } else {
            //addErrorMessage("Error", "Nome e/ou idade inválido.");
            return false;
        }
    }
}
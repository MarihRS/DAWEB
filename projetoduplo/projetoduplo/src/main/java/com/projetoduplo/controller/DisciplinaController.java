package com.projetoduplo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.projetoduplo.model.Disciplina;
import com.projetoduplo.service.DisciplinaService;
import com.projetoduplo.service.ValidationService;

@Controller
public class DisciplinaController {

    private long idDisciplina;
    private String nomeDisciplina;
    private String nomeDoProfessor;
    private int cargaHoraria;

    @Autowired
    private DisciplinaService disciplinaService;
    @Autowired
    private ValidationService validationService;

    public String save() {
        if(validationService.validateIdDisciplina(idDisciplina) && validationService.validateNomeDisciplina(nomeDisciplina)) {
            Disciplina disciplina = new Disciplina();

            disciplina.setNomeDisciplina(nomeDisciplina);
            disciplina.setNomeDoProfessor(nomeDoProfessor);            

            disciplinaService.salvarDisciplina(disciplina);

            return "sucesso";
        } else {
            
            return "Erro";
        }
    }
}


package com.projetoduplo.controller;

import com.projetoduplo.model.Estudantes;
import com.projetoduplo.service.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //diz ao spring que a classe recebe req. HTTP e devolve dados
@RequestMapping("/estudantes") //define url

public class EstudanteController {
    
    @Autowired
    private EstudanteService estudanteService;

    @GetMapping //responde quando acessam a url
    public List<Estudantes> listarEstudantesC() {
        return estudanteService.listarEstudantesS();
    }

    @PostMapping //responde quando enviam dados 
    public Estudantes salvarEstudantesC(@RequestBody Estudantes estudante) { //pega o json enviado e transforma em um obj estudante
        return estudanteService.salvarEstudantesS(estudante);
    }

    @DeleteMapping ("/{id}")
    public void deletarEstudantesC(@PathVariable Long id) { 
        estudanteService.deletarEstudantesS(id);
    }
}

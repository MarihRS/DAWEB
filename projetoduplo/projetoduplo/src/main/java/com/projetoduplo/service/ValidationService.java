package com.projetoduplo.service;

import org.springframework.stereotype.Service;

@Service
public class ValidationService {
    public boolean validateNomeAluno(String nomeAluno) {
        if(nomeAluno != null && !nomeAluno.trim().isEmpty()) {
            return true;
        } else{
            return false;
        }
    }

    public boolean validateIdade(int idade) {
        if(idade > 12 && idade < 100) {
            return true;
        } 
        
        return false;
    }

    public boolean validateIdDisciplina(long idDisciplina) {
        if(idDisciplina > 0) {
            return true;
        } else{
            return false;
        }

    }
    public boolean validateNomeDisciplina(String nomeDisciplina) {
        if(nomeDisciplina != null && !nomeDisciplina.trim().isEmpty()) {
            return true;
        } else{
            return false;
        }
    }

    
}

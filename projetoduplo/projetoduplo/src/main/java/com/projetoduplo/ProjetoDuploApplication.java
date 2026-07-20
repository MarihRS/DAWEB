package com.projetoduplo;

import com.projetoduplo.model.Disciplina;
import com.projetoduplo.model.Estudantes;
import com.projetoduplo.repository.DisciplinaRepository;
import com.projetoduplo.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoDuploApplication implements CommandLineRunner {

    @Autowired
    private EstudanteRepository estudanteRepository;

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProjetoDuploApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // Salvando dois estudantes no banco
        estudanteRepository.save(new Estudantes("Allie", 20, "Rua jj, 10", "999990001", "Informática"));
        estudanteRepository.save(new Estudantes("Hannah", 22, "Rua mm, 25", "999990002", "Contabilidade"));

        // Salvando duas disciplinas no banco
        disciplinaRepository.save(new Disciplina("Desenvolvimento Web", "Elenilson", 60));
        disciplinaRepository.save(new Disciplina("Banco de Dados", "Barros", 80));

        // Listando e imprimindo tudo
        System.out.println("\nESTUDANTES CADASTRADOS");
        for (Estudantes e : estudanteRepository.findAll()) {
            System.out.println(e);
        }

        System.out.println("\nDISCIPLINAS CADASTRADAS");
        for (Disciplina d : disciplinaRepository.findAll()) {
            System.out.println(d);
        }
    }
}

package com.projetocadastroduplo.view;

import com.projetocadastroduplo.controller.DisciplinaController;
import com.projetocadastroduplo.controller.EstudanteController;
import com.projetocadastroduplo.dto.DisciplinaDTO;
import com.projetocadastroduplo.dto.EstudantesDTO;
import com.projetocadastroduplo.model.Disciplina;
import com.projetocadastroduplo.model.Estudantes;

public class Menu {
    public static void main(String[] args) {
        // Cria os serviços
        ReaderService reader = new ReaderService();
        PrinterService printer = new PrinterService();
        EstudanteController estudanteController = new EstudanteController();
        DisciplinaController disciplinaController = new DisciplinaController();
        
        int opcao = 0;
        
        while (opcao != 7) {
            printer.mostrarMenu();  // Printer mostra o menu
            opcao = reader.lerOpcao();  // Reader lê a opção
            
            // OPÇÃO 1 - Cadastrar Disciplina
            if (opcao == 1) {
                Disciplina disciplina = reader.lerDadosDisciplina();
                DisciplinaDTO d = new DisciplinaDTO(
                    disciplina.getIdDisciplina(),
                    disciplina.getNomeDisciplina(),
                    disciplina.getNomeDoProfessor(),
                    disciplina.getCargaHoraria()
                );
                disciplinaController.cadastrar(d);
            }

            if (opcao == 2) {
                Estudantes e = reader.lerDadosEstudantes();  // Reader lê os dados
                EstudantesDTO ed = new EstudantesDTO(
                    e.getIdAluno(),
                    e.getNomeAluno(),
                    e.getIdade(),
                    e.getEndereco(),
                    e.getTelefone(),
                    e.getCurso()
                );
                estudanteController.cadastrarEstudante(ed);  // Service salva
            }
            
            // OPÇÃO 3 - Matricular estudante em disciplina
            if (opcao == 3) {
                // Mostra estudantes disponíveis
                Estudantes[] estudantes = estudanteController.listarEstudantes();
                printer.listarEstudantes(estudantes, estudanteController.getQtdEStudantes());
                if (estudanteController.getQtdEStudantes() > 0) {
                    System.out.print("Digite o ID do estudante: ");
                    int idEstudante = reader.lerOpcao();
                    Estudantes estudante = estudanteController.buscarEstudantePorId(idEstudante);
                }

                // Mostra disciplinas disponíveis
                Disciplina[] disciplinas = disciplinaController.listarDisciplinas();
                printer.listarDisciplinas(disciplinas, disciplinaController.getQtdDisciplinas());
                if (disciplinaController.getQtdDisciplinas() > 0) {
                System.out.println("Digite o ID da disciplina: ");
                int idDisciplina = reader.lerOpcao();
                Disciplina disciplina = disciplinaController.buscarDisciplinaPorId(idDisciplina);
                
                
                // Matricula
                disciplinaController.matricularEstudante(idDisciplina, null);
            }
        }

            // OPÇÃO 4 - Listar tudo
            if (opcao == 4) {
                Disciplina[] disciplinas = disciplinaController.listarDisciplinas();
                Estudantes[] estudantes = estudanteController.listarEstudantes();
                printer.listarEstudantes(estudantes, estudanteController.getQtdEStudantes());
                printer.listarDisciplinas(disciplinas, disciplinaController.getQtdDisciplinas());
            }
            // OPÇÃO 5 - Editar estudante
            if (opcao == 5) {
                Estudantes[] estudantes = estudanteController.listarEstudantes();
                printer.listarEstudantes(estudantes, estudanteController.getQtdEStudantes());
                
                if (estudanteController.getQtdEStudantes() > 0) {
                    System.out.print("Digite o ID do estudante a editar: ");
                    int idEstudante = reader.readInt();
                    Estudantes existente = estudanteController.buscarEstudantePorId(idEstudante);
                
                    System.out.println("Escolha o ID do estudante: ");
                    int i = reader.lerOpcao();
                
                // Lê os novos dados
                System.out.println("Novo nome: ");
                String nome = reader.readLine();
                System.out.println("Nova idade: ");
                int idade = reader.readInt();
                System.out.println("Novo endereço: ");
                String endereco = reader.readLine();
                System.out.println("Novo telefone: ");
                String telefone = reader.readLine();
                System.out.println("Novo curso: ");
                String curso = reader.readLine();
                
                estudanteController.editarEstudantePorId(idEstudante, nome, idade, endereco, telefone, curso);
            }
        }
            
            // OPÇÃO 6 - Editar disciplina
            if (opcao == 6) {
                Disciplina[] disciplinas = disciplinaController.listarDisciplinas();
                printer.listarDisciplinas(disciplinas, disciplinaController.getQtdDisciplinas());
                if (disciplinaController.getQtdDisciplinas() > 0) {
                System.out.println("Escolha o ID da disciplina: ");
                int i = reader.lerOpcao();
                
                System.out.println("Novo nome: ");
                String nome = reader.readLine();
                System.out.println("Novo professor: ");
                String professor = reader.readLine();
                System.out.println("Nova carga horária: ");
                int carga = reader.readInt();
                
                disciplinaController.editarDisciplinaPorId(i, nome, professor, carga);
            }
        }
            
            // OPÇÃO 7 - Sair
            if (opcao == 7) {
                System.out.println("Programa encerrado.");
            }
        }
    }
}
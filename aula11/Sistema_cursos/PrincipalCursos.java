package aula11.Sistema_cursos;

import java.util.Scanner;

public class PrincipalCursos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Curso curso = null;
        
        String nomeAluno = "";
        double valorMatriculaFinal = 0.0;

        while (true) {
            System.out.println("\n=== SISTEMA DE CURSOS E MATRICULAS ===");
            System.out.println("1. Cadastrar curso (Presencial ou Online)");
            System.out.println("2. Cadastrar nome do aluno");
            System.out.println("3. Realizar matricula");
            System.out.println("4. Realizar matricula com desconto");
            System.out.println("5. Mostrar dados do curso");
            System.out.println("6. Mostrar dados da matricula");
            System.out.println("7. Encerrar o programa");
            System.out.print("Escolha uma opçao: ");

            int opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("\nEscolha a modalidade do curso:");
                    System.out.println("1 - Presencial");
                    System.out.println("2 - Online");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    if (tipo != 1 && tipo != 2) {
                        System.out.println("Opçao de modalidade invalida!");
                        break;
                    }

                    System.out.print("Informe o código do curso: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Informe o nome do curso: ");
                    String nomeCurso = sc.nextLine();

                    System.out.print("Informe a carga horaria: ");
                    int cargaHoraria = sc.nextInt();

                    System.out.print("Informe o valor do curso: R$ ");
                    double valorCurso = sc.nextDouble();
                    sc.nextLine();

                    if (tipo == 1) {
                        System.out.print("Informe o nome da sala: ");
                        String sala = sc.nextLine();
                        System.out.print("Informe o turno (Ex: Manha, Noite): ");
                        String turno = sc.nextLine();
                        
                        curso = new CursoPresencial(codigo, nomeCurso, cargaHoraria, valorCurso, sala, turno);
                        System.out.println("Curso Presencial cadastrado com sucesso!");
                    } else if (tipo == 2) {
                        System.out.print("Informe o endereço da plataforma: ");
                        String plataforma = sc.nextLine();
                        System.out.print("Informe o codigo de acesso: ");
                        String codigoAcesso = sc.nextLine();
                        
                        curso = new CursoOnline(codigo, nomeCurso, cargaHoraria, valorCurso, plataforma, codigoAcesso);
                        System.out.println("Curso Online cadastrado com sucesso!");
                    }
                    break;

                case 2:
                    System.out.print("Informe o nome completo do aluno: ");
                    nomeAluno = sc.nextLine();
                    System.out.println("Nome do aluno registado com sucesso!");
                    break;

                case 3:
                    if (curso == null) {
                        System.out.println("Cadastre um curso primeiro na opçao 1.");
                    } else {
                        valorMatriculaFinal = curso.realizarMatricula();
                        System.out.println("Matricula realizada com sucesso!");
                        System.out.printf("Valor integral da matiícula: R$ %.2f\n", valorMatriculaFinal);
                    }
                    break;

                case 4:
                    if (curso == null) {
                        System.out.println("Cadastre um curso primeiro na opçao 1.");
                    } else {
                        System.out.print("Informe o valor do desconto: R$ ");
                        double desconto = sc.nextDouble();
                        valorMatriculaFinal = curso.realizarMatricula(desconto);
                        System.out.println("Matricula com desconto realizada com sucesso!");
                        System.out.printf("Valor da matricula com desconto: R$ %.2f\n", valorMatriculaFinal);
                    }
                    break;

                case 5:
                    if (curso != null) {
                        System.out.println("\n--- DADOS DO CURSO ---");
                        System.out.println(curso.exibirDados());
                    } else {
                        System.out.println("Cadastre um curso primeiro na opçao 1.");
                    }
                    break;

                case 6:
                    if (nomeAluno.isEmpty()) {
                        System.out.println("Informe primeiro o nome do aluno na opçao 2.");
                    } else if (curso == null) {
                        System.out.println("Cadastre o curso na opçao 1.");
                    } else if (valorMatriculaFinal <= 0) {
                        System.out.println("Realize a matrícula na opçao 3 ou 4.");
                    } else {
                        System.out.println("\n--- RESUMO DA MATRICULA ---");
                        System.out.println("Aluno: " + nomeAluno);
                        System.out.println("Curso: " + curso.getNome());
                        System.out.printf("Valor Pago na Matricula: R$ %.2f\n", valorMatriculaFinal);
                    }
                    break;

                case 7:
                    System.out.println("Encerrando o programa...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opçao invalida. Tente novamente.");
            }
        }
    }
}
package aula11;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionarios funcionario = null;

        String tempNome = "";
        String tempCpf = "";

        while (true) {
            System.out.println("\n=== SISTEMA DE FUNCIONARIOS ===");
            System.out.println("1. Cadastrar o funcionario (dados basicos)");
            System.out.println("2. Escolher o tipo de funcionario");
            System.out.println("3. Mostrar os dados cadastrados");
            System.out.println("4. Calcular o pagamento");
            System.out.println("5. Calcular o pagamento com bonus");
            System.out.println("6. Consultar os dados do funcionario");
            System.out.println("7. Encerrar o programa");
            System.out.print("Opçao: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    tempNome = sc.nextLine();
                    System.out.print("CPF: ");
                    tempCpf = sc.nextLine();
                    System.out.println("Dados basicos guardados!");
                    break;
                case 2:
                    if(tempNome.isEmpty() || tempCpf.isEmpty()){
                        System.out.println("Aviso: Cadastre primeiro o nome e CPF na opçao 1.");
                        break;
                    }
                    System.out.println("Selecione o tipo de funcionario:");
                    System.out.println("1 - CLT");
                    System.out.println("2 - Freelancer");
                    int tipo = sc.nextInt();

                    if (tipo == 1) {
                        System.out.print("Informe o salario mensal: R$ ");
                        double salario = sc.nextDouble();
                        funcionario = new FuncionarioCLT(tempNome, tempCpf, salario);
                        System.out.println("Funcionario CLT registado!");
                    } else if (tipo == 2) {
                        System.out.print("Informe as horas trabalhadas: ");
                        int horas = sc.nextInt();
                        funcionario = new FuncionariosFree(tempNome, tempCpf, horas);
                        System.out.println("Funcionario Freelancer registado!");
                    } else {
                        System.out.println("Tipo invalido.");
                    }
                    break;
                case 3:
                    if (funcionario != null) {
                        System.out.println("\n--- DADOS COMPLETOS ---");
                        System.out.println(funcionario.exibirDados());
                    } else {
                        System.out.println("Complete primeiro o cadastro do funcionario (opções 1 e 2).");
                    }
                    break;

                case 4:
                    if (funcionario != null) {
                        System.out.printf("Pagamento: R$ %.2f\n", funcionario.calcularPagamento());
                    } else {
                        System.out.println("Cadastre um funcionario primeiro.");
                    }
                    break;

                case 5:
                    if (funcionario != null) {
                        System.out.print("Informe o valor do bónus: R$ ");
                        double bonus = sc.nextDouble();
                        System.out.printf("Pagamento com bonus: R$ %.2f\n", funcionario.calcularPagamento(bonus));
                    } else {
                        System.out.println("Cadastre um funcionario primeiro.");
                    }
                    break;

                case 6:
                    if (funcionario != null) {
                        System.out.println("\n--- CONSULTA RAPIDA ---");
                        System.out.println("Nome: " + funcionario.getNome());
                        System.out.println("CPF: " + funcionario.getCpf());
                    } else {
                        System.out.println("Nenhum funcionario registado.");
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

package aulaPOO8;

import java.util.Scanner;

public class ClienteApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n=== Sistema de cadastro de clientes ===");
            System.out.println("1 - Pessoa Fisica");
            System.out.println("2 - Pessoa Juridica");
            System.out.println("0 - Sair");
            System.out.print("Escolha a opção: ");

            while (!sc.hasNextInt()) {
                System.out.println("Opção inválida. Digite 0, 1 ou 2:");
                sc.next();
            }
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1: {
                    System.out.println("\n--- Cadastro Pessoa Física ---");
                    System.out.print("Informe o nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Informe o endereço: ");
                    String endereco = sc.nextLine();

                    System.out.print("Informe o CPF: ");
                    String cpf = sc.nextLine();

                    ClientePF pf = new ClientePF(nome, endereco, cpf);
                    System.out.println("\n--- Dados do Cliente Cadastrado ---");
                    pf.exibirDados();
                    break;
                }
                case 2: {
                    System.out.println("\n--- Cadastro Pessoa Jurídica ---");
                    System.out.print("Informe a razão social: ");
                    String nome = sc.nextLine();

                    System.out.print("Informe o endereço: ");
                    String endereco = sc.nextLine();

                    System.out.print("Informe o CNPJ: ");
                    String cnpj = sc.nextLine();

                    ClientePJ pj = new ClientePJ(nome, endereco, cnpj);
                    System.out.println("\n--- Dados da Empresa Cadastrada ---");
                    pj.exibirDados();
                    break;
                }
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (op != 0);

        sc.close();
    }
}
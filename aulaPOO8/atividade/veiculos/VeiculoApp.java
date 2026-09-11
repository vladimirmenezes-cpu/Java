package aulaPOO8.atividade.veiculos;

import java.util.Scanner;

public class VeiculoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        VeiculoCarro vc = null;
        VeiculoMoto vm = null;

        do {
            System.out.println("\n>>> MENU DE VEÍCULOS <<<");
            System.out.println("1 - Cadastrar Carro");
            System.out.println("2 - Cadastrar Moto");
            System.out.println("3 - Exibir dados do carro");
            System.out.println("4 - Exibir dados da moto");
            System.out.println("0 - Sair");
            System.out.print("Escolha a opção: ");

            while (!sc.hasNextInt()) {
                System.out.println("Opção inválida! Digite um número de 0 a 4.");
                sc.next();
            }
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1: {
                    System.out.println("\n--- Cadastro de carro ---");
                    System.out.print("Informe a marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Informe o ano: ");
                    int ano = sc.nextInt();

                    System.out.print("Informe a quantidade de portas: ");
                    int qntportas = sc.nextInt();
                    sc.nextLine();

                    vc = new VeiculoCarro(marca, ano, qntportas);
                    System.out.println("Carro cadastrado com sucesso!");
                    break;
                }
                case 2: {
                    System.out.println("\n--- Cadastro de moto ---");
                    System.out.print("Informe a marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Informe o ano: ");
                    int ano = sc.nextInt();

                    System.out.print("Informe a cilindrada: ");
                    float cilindrada = sc.nextFloat();
                    sc.nextLine();

                    vm = new VeiculoMoto(marca, ano, cilindrada);
                    System.out.println("Moto cadastrada com sucesso!");
                    break;
                }
                case 3: {
                    System.out.println("\n--- Dados do Carro ---");
                    if (vc != null) {
                        vc.exibirDados();
                    } else {
                        System.out.println("Nenhum carro cadastrado ainda!");
                    }
                    break;
                }
                case 4: {
                    System.out.println("\n--- Dados da Moto ---");
                    if (vm != null) {
                        vm.exibirDados();
                    } else {
                        System.out.println("Nenhuma moto cadastrada ainda!");
                    }
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
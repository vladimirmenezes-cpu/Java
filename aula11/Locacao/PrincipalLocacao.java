package aula11.Locacao;

import java.util.Scanner;

public class PrincipalLocacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Veiculo veiculo = null;

        int diasLocacao = 0;

        while (true) {
            System.out.println("\n=== SISTEMA DE LOCAÇAO DE VEICULOS ===");
            System.out.println("1. Cadastrar um veiculo (Carro ou Moto)");
            System.out.println("2. Mostrar os dados do veículo");
            System.out.println("3. Informar a quantidade de dias");
            System.out.println("4. Calcular o valor do aluguel");
            System.out.println("5. Calcular o aluguel com desconto");
            System.out.println("6. Encerrar o programa");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("Escolha o tipo de veiculo:");
                    System.out.println("1 - Carro");
                    System.out.println("2 - Moto");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    if (tipo != 1 && tipo != 2) {
                        System.out.println("Tipo invalido!");
                        break;
                    }

                    System.out.print("Informe a placa: ");
                    String placa = sc.nextLine();

                    System.out.print("Informe o modelo: ");
                    String modelo = sc.nextLine();

                    System.out.print("Informe o ano: ");
                    int ano = sc.nextInt();

                    System.out.print("Informe o valor da diaria: R$ ");
                    double valorDiaria = sc.nextDouble();

                    if (tipo == 1) {
                        veiculo = new Carro(placa, modelo, ano, valorDiaria);
                        System.out.println("Carro cadastrado com sucesso!");
                    } else if (tipo == 2) {
                        veiculo = new Moto(placa, modelo, ano, valorDiaria);
                        System.out.println("Moto cadastrada com sucesso!");
                    }
                    break;

                case 2:
                    if (veiculo != null) {
                        System.out.println("\n--- DADOS DO VEICULO ---");
                        System.out.println(veiculo.exibirDados());
                    } else {
                        System.out.println("Cadastre um veiculo primeiro na opção 1.");
                    }
                    break;

                case 3:
                    System.out.print("Informe a quantidade de dias de locaçao: ");
                    diasLocacao = sc.nextInt();
                    System.out.println("Quantidade de dias registada: " + diasLocacao);
                    break;

                case 4:
                    if (veiculo == null) {
                        System.out.println("Cadastre um veiculo primeiro.");
                    } else if (diasLocacao <= 0) {
                        System.out.println("Informe primeiro a quantidade de dias na opçao 3.");
                    } else {
                        double total = veiculo.calcularAluguel(diasLocacao);
                        System.out.printf("Valor do aluguel para %d dias: R$ %.2f\n", diasLocacao, total);
                    }
                    break;

                case 5:
                    if (veiculo == null) {
                        System.out.println("Cadastre um veiculo primeiro.");
                    } else if (diasLocacao <= 0) {
                        System.out.println("Informe primeiro a quantidade de dias na opçao 3.");
                    } else {
                        System.out.print("Informe o valor do desconto: R$ ");
                        double desconto = sc.nextDouble();
                        double totalComDesconto = veiculo.calcularAluguel(diasLocacao, desconto);
                        System.out.printf("Valor do aluguel com desconto: R$ %.2f\n", totalComDesconto);
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o programa...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opçao invalida. Tente novamente.");
            }
        }
    }
}
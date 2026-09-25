package aula11.Locacao;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Veiculo veiculo = null;

        String tempPlaca = "";
        String tempModelo = "";
        int tempAno = 0;
        double tempValorDiaria = 0.0;
        int diasLocacao = 0;

        while (true) {
            System.out.println("\n=== SISTEMA DE LOCAÇAO DE VEICULOS ===");
            System.out.println("1. Cadastrar um veiculo");
            System.out.println("2. Escolher entre carro ou moto");
            System.out.println("3. Mostrar os dados do veículo");
            System.out.println("4. Informar a quantidade de dias");
            System.out.println("5. Calcular o valor do aluguel");
            System.out.println("6. Calcular o aluguel com desconto");
            System.out.println("7. Encerrar o programa");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Informe a placa: ");
                    tempPlaca = sc.nextLine();
                    System.out.print("Informe o modelo: ");
                    tempModelo = sc.nextLine();
                    System.out.print("Informe o ano: ");
                    tempAno = sc.nextInt();
                    System.out.print("Informe o valor da diaria: R$ ");
                    tempValorDiaria = sc.nextDouble();
                    System.out.println("Dados do veículo guardados temporariamente!");
                    break;

                case 2:
                    if (tempPlaca.isEmpty() || tempModelo.isEmpty() || tempValorDiaria <= 0) {
                        System.out.println("Aviso: Cadastre primeiro os dados do veiculo na opçao 1.");
                        break;
                    }

                    System.out.println("Escolha o tipo de veiculo:");
                    System.out.println("1 - Carro");
                    System.out.println("2 - Moto");
                    int tipo = sc.nextInt();

                    if (tipo == 1) {
                        veiculo = new Carro(tempPlaca, tempModelo, tempAno, tempValorDiaria);
                        System.out.println("Carro cadastrado com sucesso!");
                    } else if (tipo == 2) {
                        veiculo = new Moto(tempPlaca, tempModelo, tempAno, tempValorDiaria);
                        System.out.println("Moto cadastrada com sucesso!");
                    } else {
                        System.out.println("Tipo invalido!");
                    }
                    break;

                case 3:
                    if (veiculo != null) {
                        System.out.println("\n--- DADOS DO VEICULO ---");
                        System.out.println(veiculo.exibirDados());
                    } else {
                        System.out.println("Conclua o cadastro do veiculo nas opções 1 e 2.");
                    }
                    break;

                case 4:
                    System.out.print("Informe a quantidade de dias de locaçao: ");
                    diasLocacao = sc.nextInt();
                    System.out.println("Quantidade de dias registada: " + diasLocacao);
                    break;

                case 5:
                    if (veiculo == null) {
                        System.out.println("Cadastre um veiculo primeiro.");
                    } else if (diasLocacao <= 0) {
                        System.out.println("Informe primeiro a quantidade de dias na opçao 4.");
                    } else {
                        double total = veiculo.calcularAluguel(diasLocacao);
                        System.out.printf("Valor do aluguel para %d dias: R$ %.2f\n", diasLocacao, total);
                    }
                    break;

                case 6:
                    if (veiculo == null) {
                        System.out.println("Cadastre um veiculo primeiro.");
                    } else if (diasLocacao <= 0) {
                        System.out.println("Informe primeiro a quantidade de dias na opçao 4.");
                    } else {
                        System.out.print("Informe o valor do desconto: R$ ");
                        double desconto = sc.nextDouble();
                        double totalComDesconto = veiculo.calcularAluguel(diasLocacao, desconto);
                        System.out.printf("Valor do aluguel com desconto: R$ %.2f\n", totalComDesconto);
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

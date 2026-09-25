package aula11.Produtos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Produto produto = null;

        int tempCodigo = 0;
        String tempNome = "";
        double tempPreco = 0.0;
        int quantidade = 0;
        double valorFinal = 0.0;

        while (true) {
            System.out.println("\n=== SISTEMA DE PRODUTOS E VENDAS ===");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Escolher produto fisico ou digital");
            System.out.println("3. Mostrar dados do produto");
            System.out.println("4. Informar quantidade");
            System.out.println("5. Realizar venda");
            System.out.println("6. Realizar venda com desconto");
            System.out.println("7. Mostrar valor final");
            System.out.println("8. Encerrar o programa");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Informe o codigo do produto: ");
                    tempCodigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Informe o nome do produto: ");
                    tempNome = sc.nextLine();
                    System.out.print("Informe o preço unitario: R$ ");
                    tempPreco = sc.nextDouble();
                    System.out.println("Dados basicos do produto guardados!");
                    break;

                case 2:
                    if (tempNome.isEmpty() || tempPreco <= 0) {
                        System.out.println("Aviso: Cadastre primeiro os dados do produto na opçao 1.");
                        break;
                    }

                    System.out.println("Escolha o tipo de produto:");
                    System.out.println("1 - Produto Fisico");
                    System.out.println("2 - Produto Digital");
                    int tipo = sc.nextInt();

                    if (tipo == 1) {
                        System.out.print("Informe o valor do frete: R$ ");
                        double frete = sc.nextDouble();
                        produto = new ProdutoFisico(tempCodigo, tempNome, tempPreco, frete);
                        System.out.println("Produto Fisico cadastrado com sucesso!");
                    } else if (tipo == 2) {
                        produto = new ProdutoDigital(tempCodigo, tempNome, tempPreco);
                        System.out.println("Produto Digital cadastrado com sucesso!");
                    } else {
                        System.out.println("Tipo invalido!");
                    }
                    break;

                case 3:
                    if (produto != null) {
                        System.out.println("\n--- DADOS DO PRODUTO ---");
                        System.out.println(produto.exibirDados());
                    } else {
                        System.out.println("Conclua o cadastro do produto nas opçoes 1 e 2.");
                    }
                    break;

                case 4:
                    System.out.print("Informe a quantidade desejada: ");
                    quantidade = sc.nextInt();
                    System.out.println("Quantidade registada: " + quantidade);
                    break;

                case 5:
                    if (produto == null) {
                        System.out.println("Cadastre um produto primeiro.");
                    } else if (quantidade <= 0) {
                        System.out.println("Informe primeiro a quantidade na opçao 4.");
                    } else {
                        valorFinal = produto.calcularVenda(quantidade);
                        System.out.println("Venda realizada com sucesso!");
                        System.out.printf("Valor calculado: R$ %.2f\n", valorFinal);
                    }
                    break;

                case 6:
                    if (produto == null) {
                        System.out.println("Cadastre um produto primeiro.");
                    } else if (quantidade <= 0) {
                        System.out.println("Informe primeiro a quantidade na opçao 4.");
                    } else {
                        System.out.print("Informe a percentagem de desconto (%): ");
                        double desconto = sc.nextDouble();
                        valorFinal = produto.calcularVenda(quantidade, desconto);
                        System.out.println("Venda com desconto realizada com sucesso!");
                        System.out.printf("Valor calculado com desconto: R$ %.2f\n", valorFinal);
                    }
                    break;

                case 7:
                    if (valorFinal > 0) {
                        System.out.printf("\n--- VALOR FINAL DA VENDA ---\nR$ %.2f\n", valorFinal);
                    } else {
                        System.out.println("Realize o calculo de uma venda primeiro (opçoes 5 ou 6).");
                    }
                    break;

                case 8:
                    System.out.println("Encerrando o programa...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção invalida. Tente novamente.");
            }
        }

    }
}

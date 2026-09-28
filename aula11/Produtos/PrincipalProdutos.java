package aula11.Produtos;

import java.util.Scanner;

public class PrincipalProdutos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Produto produto = null;

        int quantidade = 0;
        double valorFinal = 0.0;

        while (true) {
            System.out.println("\n=== SISTEMA DE PRODUTOS E VENDAS ===");
            System.out.println("1. Cadastrar produto (Fisico ou Digital)");
            System.out.println("2. Mostrar dados do produto");
            System.out.println("3. Informar quantidade");
            System.out.println("4. Realizar venda");
            System.out.println("5. Realizar venda com desconto");
            System.out.println("6. Mostrar valor final");
            System.out.println("7. Encerrar o programa");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("Escolha o tipo de produto:");
                    System.out.println("1 - Produto Fisico");
                    System.out.println("2 - Produto Digital");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    if (tipo != 1 && tipo != 2) {
                        System.out.println("Tipo invalido!");
                        break;
                    }

                    System.out.print("Informe o codigo do produto: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Informe o nome do produto: ");
                    String nome = sc.nextLine();

                    System.out.print("Informe o preço unitario: R$ ");
                    double preco = sc.nextDouble();

                    if (tipo == 1) {
                        System.out.print("Informe o valor do frete: R$ ");
                        double frete = sc.nextDouble();
                        

                        produto = new ProdutoFisico(codigo, nome, preco, frete);
                        System.out.println("Produto Fisico cadastrado com sucesso!");
                    } else if (tipo == 2) {

                        produto = new ProdutoDigital(codigo, nome, preco);
                        System.out.println("Produto Digital cadastrado com sucesso!");
                    }
                    break;

                case 2:
                    if (produto != null) {
                        System.out.println("\n--- DADOS DO PRODUTO ---");
                        System.out.println(produto.exibirDados());
                    } else {
                        System.out.println("Cadastre um produto primeiro na opçao 1.");
                    }
                    break;

                case 3:
                    System.out.print("Informe a quantidade desejada: ");
                    quantidade = sc.nextInt();
                    System.out.println("Quantidade registada: " + quantidade);
                    break;

                case 4:
                    if (produto == null) {
                        System.out.println("Cadastre um produto primeiro.");
                    } else if (quantidade <= 0) {
                        System.out.println("Informe primeiro a quantidade na opçao 3.");
                    } else {
                        valorFinal = produto.calcularVenda(quantidade);
                        System.out.println("Venda realizada com sucesso!");
                        System.out.printf("Valor calculado: R$ %.2f\n", valorFinal);
                    }
                    break;

                case 5:
                    if (produto == null) {
                        System.out.println("Cadastre um produto primeiro.");
                    } else if (quantidade <= 0) {
                        System.out.println("Informe primeiro a quantidade na opçao 3.");
                    } else {
                        System.out.print("Informe a percentagem de desconto (%): ");
                        double desconto = sc.nextDouble();
                        valorFinal = produto.calcularVenda(quantidade, desconto);
                        System.out.println("Venda com desconto realizada com sucesso!");
                        System.out.printf("Valor calculado com desconto: R$ %.2f\n", valorFinal);
                    }
                    break;

                case 6:
                    if (valorFinal > 0) {
                        System.out.printf("\n--- VALOR FINAL DA VENDA ---\nR$ %.2f\n", valorFinal);
                    } else {
                        System.out.println("Realize o calculo de uma venda primeiro (opçoes 4 ou 5).");
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
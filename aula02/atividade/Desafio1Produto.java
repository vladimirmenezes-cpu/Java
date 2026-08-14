package aula02.atividade;

import java.util.Scanner;

public class Desafio1Produto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o produto: ");
        String produto = scanner.nextLine();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço: ");
        double preco = scanner.nextDouble();

        System.out.printf("%nProduto: %s%n", produto);
        System.out.printf("Quantidade: %d%n", quantidade);
        System.out.printf("Preço unitário: R$ %.2f%n", preco);

        scanner.close();
    }
}
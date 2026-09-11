package aulaPOO8.atividade;

import java.util.Scanner;

public class LojaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Loja c = new Loja(null, 0.0, 0);

        System.out.println("Informe o nome do produto: ");
        c.setNome(sc.nextLine());

        System.out.println("Informe o preço: ");
        c.setPreco(sc.nextDouble());

        System.out.println("Informe a quantidade: ");
        c.setQuantidade(sc.nextInt());

        sc.close();

        System.out.println("O nome do produto: " + c.getNome());
        System.out.println("O preço: " + c.getPreco());
        System.out.println("Essa foi a quantidade escolhida: " + c.getQuantidade());
    }
}
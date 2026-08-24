package atividade;

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Calcular a tabuada de um número");
            System.out.println("2 - Realizar contagem regressiva");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Digite um número para ver a tabuada: ");
                int numero = sc.nextInt();
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }
            } else if (opcao == 2) {
                System.out.print("Digite o numero inicial da contagem: ");
                int inicio = sc.nextInt();
                for (int i = inicio; i >= 0; i--) {
                    System.out.println(i);
                }
            } else if (opcao == 0) {
                System.out.println("Saindo do programa...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
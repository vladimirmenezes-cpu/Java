package atividade;

import java.util.Scanner;

public class LojaDvd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a cor do CD:");
        String cor = sc.nextLine();

        if (cor.equalsIgnoreCase("verde")) {
            System.out.println("O preço é 10.");
        } else if (cor.equalsIgnoreCase("azul")) {
            System.out.println("O preço é 20.");
        } else if (cor.equalsIgnoreCase("amarelo")) {
            System.out.println("O preço é 30.");
        } else if (cor.equalsIgnoreCase("vermelho")) {
            System.out.println("O preço é 40.");
        } else {
            System.out.println("Cor inválida.");
        }

        sc.close();
    }
}

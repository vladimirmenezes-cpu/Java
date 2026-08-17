package atividade;

import java.util.Scanner;

public class Maiordeidade_ou_nao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a sua idade:");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else if (idade >= 0) {
            System.out.println("Você é menor de idade.");
        } else {
            System.out.println("Idade inválida.");
        }

        sc.close();
    }
}

package atividade;

import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza um número inteiro: ");
        int numero = sc.nextInt();

        if (numero / 2 == 0) {
            System.out.println("O numero é par.");
        } else {
            System.out.println("O numero é impar.");
        }
    sc.close();
    }
}

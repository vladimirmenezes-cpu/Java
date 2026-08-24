package atividade;

import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número que deseja multiplicar: ");
        int numero = scanner.nextInt();

        System.out.println("\n--- Tabuada do " + numero + " (de 1 a 10) ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}

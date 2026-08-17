package atividade;

import java.util.Scanner;

public class Positivo_nulo_negativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza um número inteiro: ");
        int numero = sc.nextInt();

        if (numero > 0){
            System.out.println("O numero é positivo.");
        } else if (numero < 0){
            System.out.println("O numero é negativo.");
        }else{
            System.out.println("O numero é nulo.");
        }
    
        sc.close();
    
    }
}

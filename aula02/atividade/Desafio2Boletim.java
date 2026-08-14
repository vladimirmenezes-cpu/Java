package aula02.atividade;

import java.util.Scanner;

public class Desafio2Boletim {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();
        
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();
        
        double media = (nota1 + nota2) / 2;

        System.out.println();
        System.out.println(" Aluno:"+nome);
        System.out.printf(" Nota 1: %.2f%n Nota 2: %.2f%n Media: %.2f%n", nota1,nota2,media);

        scanner.close();


    }
}

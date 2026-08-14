package aula02.atividade;

import java.util.Scanner;

public class Desafio3Notalfiscal {
    
        public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nome do Cliente: ");
        String nome = scanner.nextLine();
        
        System.out.print("Nome do produto: ");
        String produto = scanner.nextLine();
        
        System.out.print("Quantidade do produto: ");
        int quantidade = scanner.nextInt();

        System.out.print("Valor unitário do produto: ");
        double valorunitario = scanner.nextDouble();
        
        double total = quantidade * valorunitario;
        
        System.out.println();
        System.out.printf(
            "----------- NOTA FISCAL -----------%n" +
            "Cliente: %s%n" +
            "Produto: %s%n" +
            "Quantidade: %d%n" +
            "Valor unitário: R$ %.2f%n" +
            "Total: R$ %.2f%n" +
            "-----------------------------------%n",
            nome,produto,quantidade,valorunitario, total      
        );
        
        scanner.close();

        }
}

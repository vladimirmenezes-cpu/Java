package aula06;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3];

        //inserir 
        for(int i=0;i<nomes.length;i++){
            System.out.println("Digite o nome da posição "+i+":");
            nomes[i]=sc.nextLine();
        }
        System.out.println("Nomes cadastrados são:");

        for(String nome : nomes){
            System.out.println(nome);
        }
        for (int i=0;i<nomes.length;i++){
            System.out.println("Nomes[i]");
        }
        sc.close();
    }
}

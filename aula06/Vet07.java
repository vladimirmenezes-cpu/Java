package aula06;

import java.util.Scanner;

public class Vet07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3];

        // Cadastrar
        System.out.println("Cadastro de nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome:");
            nomes[i] = sc.nextLine();
        }

        // Listar
        System.out.println("\nLista atual:");
        listar(nomes);

        // Alterar
        System.out.println("\nDigite a posição que deseja alterar:");
        int posAlterar = sc.nextInt();
        sc.nextLine(); // Consome a quebra de linha

        if (posAlterar >= 0 && posAlterar < nomes.length) {
            System.out.println("Digite o novo nome:");
            nomes[posAlterar] = sc.nextLine();
        } else {
            System.out.println("Posição inválida!");
        }

        System.out.println("\nLista atualizada:");
        listar(nomes);

        // Remover
        System.out.println("\nDigite a posição para remover:");
        int posRemover = sc.nextInt();

        if (posRemover >= 0 && posRemover < nomes.length) {
            // Desloca os elementos posteriores para a esquerda
            for (int i = posRemover; i < nomes.length - 1; i++) {
                nomes[i] = nomes[i + 1];
            }
            // Correção da linha 46: Anula a última posição
            nomes[nomes.length - 1] = null;

            System.out.println("\nLista após remoção:");
            listar(nomes);
        } else {
            System.out.println("Posição inválida!");
        }

        sc.close();
    }

    // Método responsável por imprimir o vetor
    public static void listar(String[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println(i + ": " + vet[i]);
        }
    }
}
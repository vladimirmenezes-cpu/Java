package aula04;

import java.util.Scanner;

public class While05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op=0;

        while (op!=5) {
            System.out.println("\n====Menu===");
            System.out.println("1-Cadastro");
            System.out.println("2-Listar");
            System.out.println("3-Alterar");
            System.out.println("4-Remover");
            System.out.println("5-Sair");
            System.out.println("Escolha outra opção");
            op=sc.nextInt();


            switch (op) {
                case 1:
                    System.out.println("Produto cadastrado");
                    break;
                case 2:
                    System.out.println("Listar");
                    break;
                case 3:
                    System.out.println("Alterar");
                    break;
                case 4:
                    System.out.println("Excluir");
                    break;
                case 5:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Escolha outra opçãp");
                    break;
            }

        }
    sc.close();
    }
}

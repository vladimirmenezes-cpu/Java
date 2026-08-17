package atividade;

import java.util.Scanner;

public class Acesso_Aporta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a senha para acesso:");
        String senha = sc.nextLine();

        if (senha.equals("12345F")) {
            System.out.println("Acesso liberado.");
    } else {
        System.out.println("Acesso negado.");
    }
    sc.close();
}
}

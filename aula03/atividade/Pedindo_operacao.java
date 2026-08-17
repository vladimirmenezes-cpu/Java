package atividade;

import java.util.Scanner;

public class Pedindo_operacao {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro numero:");
        double num1 = sc.nextDouble();

        System.out.println("Informe o segundo numero:");
        double num2 = sc.nextDouble();

        System.out.println("Digite a operação que deseja realizar (+, -, *, /):");
        char operacao = sc.next().charAt(0);

        double resultado;

        if (operacao == '+'){
            resultado = num1 + num2;
        } else if (operacao == '-'){
            resultado = num1 - num2;
        } else if (operacao == '*'){
            resultado = num1 * num2;
        } else if (operacao == '/') {
            resultado = num1 / num2;
        } else {
            System.out.println("Operação invalida.");
            sc.close();
            return;
        }

        System.out.println("Resultado:" + resultado);

        sc.close();
    }
}

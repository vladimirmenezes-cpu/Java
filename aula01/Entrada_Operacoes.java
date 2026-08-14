import java.util.Scanner;

public class Entrada_Operacoes {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe N1:");
        double N1=sc.nextDouble();

        System.out.println("Informe N2:");
        double N2=sc.nextDouble();

        double divisao=N1/N2;
        double soma = N1+N2;
        double subtracao= N1-N2;
        double Multiplicação= N1*N2;


        System.out.println("Ola, os RESULTADOS SÃO: Soma:"+soma+" Subtração:"+subtracao+ "Multiplicação:"+Multiplicação+ " Divisão:"+divisao);

        sc.close();

    }

    
}

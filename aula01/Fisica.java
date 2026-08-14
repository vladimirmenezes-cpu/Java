import java.util.Scanner;

public class Fisica {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a força aplicada:");
        double forca=sc.nextDouble();

        System.out.println("Digite a distancia percorrida:");
        double distancia=sc.nextDouble();

        double trabalho= forca*distancia;

        System.out.println("Trabalho realizado foi: "+trabalho);

        sc.close();

    }




    
}

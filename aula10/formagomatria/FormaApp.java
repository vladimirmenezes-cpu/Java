package aula10.formagomatria;

public class FormaApp {
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(6);
        Retangulo retangulo = new  Retangulo(4, 6);
        System.out.println("Area do circulo" + circulo.CalcularArea());
        System.out.println("Area do retangulo: "+retangulo.CalcularArea());
    }
}

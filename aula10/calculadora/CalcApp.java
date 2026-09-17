package aula10.calculadora;

public class CalcApp {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(10, 5));
        System.out.println(calc.somar(11, 20, 4));
        System.out.println(calc.somar(1.0, 2.0));
    }
}

package aulaPOO8;

public class PessoaApp {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Edivandecidecleide");
        Pessoa p2 = new Pessoa(2, "Carla");

        // Acessador (Corrigido os () e o espaçamento do texto)
        System.out.println("Pessoa: " + p1.getCodigo() + " | Nome: " + p1.getNome());

        // Modificador
        p1.setNome("Vanessa");

        System.out.println("Pessoa: " + p1.getCodigo() + " | Nome: " + p1.getNome());
        System.out.println("Pessoa: " + p2.getCodigo() + " | Nome: " + p2.getNome());
    }
}
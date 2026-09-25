package aula11.Locacao;

public interface Aluguel {
    double calcularAluguel(int dias);

    double calcularAluguel(int dias, double desconto);
}

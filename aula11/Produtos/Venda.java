package aula11.Produtos;

public interface Venda {
    double calcularVenda(int quantidade);
    double calcularVenda(int quantidade, double percentualDesconto);
}

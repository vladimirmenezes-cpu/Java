package aula11.sistema_pedidos;

public interface Pagamento {
    String pagar(double pagar);

    String pagar(double valor, String chavePix);

    String pagar(double valor, int parcelas);
}

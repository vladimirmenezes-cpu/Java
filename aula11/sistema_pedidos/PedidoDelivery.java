package aula11.sistema_pedidos;

public class PedidoDelivery extends Pedido {
    
    private String endereco;
    private double taxaEntrega;

    public PedidoDelivery(int numeroPedido, String nomeCliente, double valorPedido, String endereco, double taxaEntrega) {
        super(numeroPedido, nomeCliente, valorPedido);
        this.endereco = endereco;
        this.taxaEntrega = taxaEntrega;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    @Override
    public double getValorPedido() {
        return super.getValorPedido() + taxaEntrega;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() +
               "\nTipo: Pedido Delivery" +
               "\nEndereço: " + endereco +
               "\nTaxa de Entrega: R$ " + String.format("%.2f", taxaEntrega) +
               "\nValor Total com Entrega: R$ " + String.format("%.2f", getValorPedido());
    }
}

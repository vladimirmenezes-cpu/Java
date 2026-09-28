package aula11.sistema_pedidos;

public class PedidoLocal extends Pedido {
    
    public PedidoLocal(int numeroPedido, String nomeCliente, double valorPedido) {
        super(numeroPedido, nomeCliente, valorPedido);
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + "\nTipo: Pedido Local (Consumo no Restaurante)";
    }
}

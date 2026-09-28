package aula11.sistema_pedidos;

public abstract class Pedido implements Pagamento {
    private int numeroPedido;
    private String nomeCliente;
    private double valorPedido;

    public Pedido(int numeroPedido, String nomeCliente, double valorPedido){
        this.numeroPedido = numeroPedido;
        this.nomeCliente = nomeCliente;
        this.valorPedido = valorPedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public String exibirDados(){
        return "Numero do Pedido: " + numeroPedido +
               "\nCliente: " + nomeCliente +
               "\nValor do Pedido: R$ " + String.format("%.2f", valorPedido);
    }

    @Override
    public String pagar(double valor) {
        return "Pagamento efetuado em dinheiro no valor de R$ " + String.format("%.2f", valor) + ". Sucesso!";
    }

    @Override
    public String pagar(double valor, String chavePix) {
        return "Pagamento via PIX de R$ " + String.format("%.2f", valor) + 
               " para a chave [" + chavePix + "] efetuado com sucesso!";
    }

    @Override
    public String pagar(double valor, int parcelas) {
        double valorParcela = valor / parcelas;
        return "Pagamento no Cartão de R$ " + String.format("%.2f", valor) + 
               " parcelado em " + parcelas + "x de R$ " + String.format("%.2f", valorParcela) + " efetuado com sucesso!";


    }
}

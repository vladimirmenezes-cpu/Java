package aula11.Produtos;

public class ProdutoDigital extends Produto {
    public ProdutoDigital(int codigo, String nome, double preco) {
        super(codigo, nome, preco);
    }

    @Override 
    public String exibirDados() {
        return super.exibirDados() + 
        "\nTipo: Produto Digital" +
        "\nFrete: R$ 0.00";
    }
}

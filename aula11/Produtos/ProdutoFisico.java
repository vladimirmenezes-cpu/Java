package aula11.Produtos;

public class ProdutoFisico extends Produto {
    private double frete;

    public ProdutoFisico(int codigo, String nome, double preco, double frete) {
        super(codigo, nome, preco);
        this.frete = frete;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    @Override 
    public double calcularVenda(int quantidade) {
        return super.calcularVenda(quantidade) + frete;
    }

    @Override 
    public  String exibirDados() {
        return super.exibirDados() + 
        "\nFrete: R$ " + 
        String.format("%.2f", frete);
    }
}

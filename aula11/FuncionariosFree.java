package aula11;

public class FuncionariosFree extends Funcionarios {
    private int horastrabalhadas;
    private static final double VALOR_POR_HORA = 50.0;

    public FuncionariosFree(String nome, String cpf, int horastrabalhadas){
        super(nome, cpf);
        this.horastrabalhadas = horastrabalhadas;
    }

    public int getHorastrabalhadas(){
        return horastrabalhadas;
    }

    public void setHorastrabalhadas(int horastrabalhadas){
        this.horastrabalhadas = horastrabalhadas;
    }

    public double getValorPorHora(){
        return VALOR_POR_HORA;
    }

    @Override 
    public double calcularPagamento(){
        return horastrabalhadas *VALOR_POR_HORA;
    }



    @Override
    public String exibirDados(){
        return super.exibirDados() + 
        "\nTipo: Freelancer" +
        "\nHoras trabalhadas:" + horastrabalhadas +
        "\nValor por hora: R$" + String.format("%.2f", VALOR_POR_HORA);
    }

}

package aula11;

public class FuncionarioCLT extends Funcionarios{
    private double salarioMensal;


// Construtor que recebe nome, CPF e o salário fixo
    public FuncionarioCLT(String nome, String cpf, double salarioMensal){
        super(nome, cpf);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal(){
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal){
        this.salarioMensal = salarioMensal;
    }


// Implementação obrigatória do método de cálculo definido pela interface Pagamento
    @Override 
    public double calcularPagamento(){
        return salarioMensal;
    }


// Sobrescreve o método de exibir dados para incluir as informações específicas do CLT
    @Override 
    public String exibirDados(){
        return super.exibirDados() +
        "\nTipo: CLT"+
        "\nSalario mensal: RS$" + String.format("%.2", salarioMensal);
    }
}

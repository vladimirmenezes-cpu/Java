package aula11;

public class FuncionariosFree extends Funcionarios {
    private int horastrabalhadas;

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

    @Override
    public String exibirDados(){
        return super.exibirDados() + "\nHoras trabalhadas: " + horastrabalhadas;
    }

}

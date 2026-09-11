package aulaPOO8.atividade.veiculos;

public class VeiculoCarro extends Veiculo {
    private int qntportas;

    public VeiculoCarro(String marca, int ano, int qntportas){
        super(marca, ano);
        this.qntportas = qntportas;
    }

    public int getQntportas(){
        return qntportas;
    }

    public void setQntportas(int qntportas){
        this.qntportas = qntportas;
    }

    @Override 
    public void exibirDados(){
        super.exibirDados();
        System.out.println("CPF: "+qntportas);
    }
}

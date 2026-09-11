package aulaPOO8.atividade.veiculos;

public class VeiculoMoto extends Veiculo {
    private float cilindrada;

    public  VeiculoMoto(String marca, int ano, float cilindrada){
        super(marca, ano);
        this.cilindrada = cilindrada;
    }

    public float getCilindrada(){
        return cilindrada;
    }

    public void setCilindrada(float cilindrada){
        this.cilindrada = cilindrada;
    }

    @Override 
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Cilindrada; "+cilindrada);
    }
}

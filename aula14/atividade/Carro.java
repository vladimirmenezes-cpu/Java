package aula14.atividade;

public class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }

    @Override 
    public String exibirDetalhes(){
        return "=== FICHA DO CARRO ===\n " + super.exibirDetalhes();
    }
}

package aula10.animalnovo;

public class Cachorro extends Animal {
    private  String raca;

    public Cachorro(){}

    public Cachorro(String nome, int idade, String raca){
        super(nome,idade);
        this.raca = raca;
    }

    @Override 
    public  String exibirInfo(){
        return "Cachorro | Nome "+getNome()
        +"| Idade"+getIdade()
        +"| Raça"+(raca==null ? "" :raca);
    }
}

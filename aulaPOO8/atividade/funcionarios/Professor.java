package aulaPOO8.atividade.funcionarios;

public class Professor extends Funcionarios {
    private String disciplina;

    public Professor(String nome, double salario, String disciplina){
        super(nome,salario);
        this.disciplina = disciplina;
    }

    public int getDisciplina(){
        return  disciplina;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

    @Override 
    public void exibirDados(){
        super.exibirDados();
        System.out.println();


    }


}

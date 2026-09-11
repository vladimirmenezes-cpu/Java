package aulaPOO8.atividade.funcionarios;

public class Funcionarios {
    private String nome;
    private double salario;

    public Funcionarios(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}

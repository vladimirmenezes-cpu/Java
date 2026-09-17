package aula10.animalnovo;

import java.util.ArrayList;

import aula06.Array1;

public class Animais {
    
    private  ArrayList<Animal> listaAnimais;

    public Animais(){
        listaAnimais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal a){
        listaAnimais.add(a);

        System.out.println("Animal cadastrado");
    }

    public  void listaAnimais(){
        if (listaAnimais.isEmpty()) {
        System.out.println("Lista vazia");
        } else{
            System.out.println("\n--- Lista de Animais ---");
            for(int i=0;i<listaAnimais.size();i++)
            System.out.println((1+i)+ " - "+listaAnimais.get(i).exibirInfo());
        }
    }

    public void atualizarAnimal(int indice, Animal novoAnimal){
        if (indice>=0 && indice<listaAnimais.size()) {
            listaAnimais.set(indice, novoAnimal);
            System.out.println("Animal altarado");
        }else{
            System.out.println("Indice invalido");
        }
    }

    public void removerAnimal(int indice){
        if (indice>=0 && indice<listaAnimais.size()) {
            listaAnimais.remove(indice);
            System.out.println("Animal removido com sucesso");
        }else{
            System.out.println("Indice invalido");
        }
    }

    

}

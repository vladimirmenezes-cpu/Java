package aula06;

public class Array5 {
    public static void main(String[] args) {
        String[] alunos={"Ana","Bruno","Carlos","Daniela","Eduardo"};
        double[] notas={7.5,8.0,6.5,9.0,5.5};

        for(int i=0;i<alunos.length;i++){
            System.out.println("Aluno: "+alunos[i]+" Nota: "+notas[i]);
        }
    }

}

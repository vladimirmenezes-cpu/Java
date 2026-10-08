package aula14;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<>();

        boolean executando =true;

        while (executando) {
            String opcao = JOptionPane.showInputDialog(
                null,
                "Escolher uma opção:\n"+
                "1-Cadastrar produtos\n"+
                "2-Listar produtos\n"+
                "3-Sair",
                "Menu Principal",
                JOptionPane.QUESTION_MESSAGE
            );
            if (opcao ==null) {
                JOptionPane.showConfirmDialog(null, opcao)
            }
        }
    }
}

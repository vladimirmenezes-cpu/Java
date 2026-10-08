package aula14.atividade;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList; 

import javax.swing.JOptionPane;

public class VeiculoApp {
    public static void main(String[] args) {
        
        ArrayList<Carro> garagem = new ArrayList<>();

        boolean funcionando = true;

        while (funcionando) {
            String menu = "===Sistema De Garagem===\n" 
                    + "1- Cadastrar Carro\n"
                    + "2- Listar Carros\n"
                    + "3- Detalhar Carro\n"
                    + "4- Alterar Carro\n"
                    + "5- Remover Carro\n"
                    + "6- Gravar Informações em Arquivo\n"
                    + "7- Sair\n"
                    + "Escolha uma opção:";

            String opcaoString = JOptionPane.showInputDialog(null, menu);

            if (opcaoString == null) {
                break;
            }
            
            int opcao;
            try {
                opcao = Integer.parseInt(opcaoString);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números das opções!");
                continue;
            }

            switch (opcao) {
                case 1: 
                    String marca = JOptionPane.showInputDialog("Marca do carro:");
                    String modelo = JOptionPane.showInputDialog("Modelo do carro:");
                    String anoStr = JOptionPane.showInputDialog("Ano do carro:");

                    if (marca != null && modelo != null && anoStr != null) {
                        try {
                            int ano = Integer.parseInt(anoStr);
                            garagem.add(new Carro(marca, modelo, ano));
                            JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso! 🎉");
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Ano inválido! Insira um número.");
                        }
                    }
                    break;

                case 2: 
                    if (garagem.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "A garagem está vazia!");
                    } else {
                        String lista = "=== CARROS CADASTRADOS ===\n";
                        for (int i = 0; i < garagem.size(); i++) {
                            Carro c = garagem.get(i);
                            lista += (i + 1) + " - " + c.getMarca() + " " + c.getModelo() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, lista);
                    }
                    break;

                case 3: 
                    if (garagem.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "A garagem está vazia!");
                    } else {
                        String numStr = JOptionPane.showInputDialog("Digite o número do carro:");
                        try {
                            int indice = Integer.parseInt(numStr) - 1;
                            if (indice >= 0 && indice < garagem.size()) {
                                Carro c = garagem.get(indice);
                                JOptionPane.showMessageDialog(null, c.exibirDetalhes());
                            } else {
                                JOptionPane.showMessageDialog(null, "Número não encontrado!");
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Número inválido!");
                        }
                    }
                    break;

                case 4: 
                    if (garagem.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "A garagem está vazia!");
                    } else {
                        String numStr = JOptionPane.showInputDialog("Digite o número do carro a alterar:");
                        try {
                            int indice = Integer.parseInt(numStr) - 1;
                            if (indice >= 0 && indice < garagem.size()) {
                                String novaMarca = JOptionPane.showInputDialog("Nova Marca:");
                                String novoModelo = JOptionPane.showInputDialog("Novo Modelo:");
                                String novoAnoStr = JOptionPane.showInputDialog("Novo Ano:");
                                int novoAno = Integer.parseInt(novoAnoStr);

                                garagem.set(indice, new Carro(novaMarca, novoModelo, novoAno));
                                JOptionPane.showMessageDialog(null, "Carro atualizado! ✨");
                            } else {
                                JOptionPane.showMessageDialog(null, "Número não encontrado!");
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Dados inválidos!");
                        }
                    }
                    break;

                case 5:
                    if (garagem.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "A garagem está vazia!");
                    } else {
                        String numStr = JOptionPane.showInputDialog("Digite o número do carro para remover:");
                        try {
                            int indice = Integer.parseInt(numStr) - 1;
                            if (indice >= 0 && indice < garagem.size()) {
                                garagem.remove(indice);
                                JOptionPane.showMessageDialog(null, "Carro removido! 🗑️");
                            } else {
                                JOptionPane.showMessageDialog(null, "Número não encontrado!");
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Número inválido!");
                        }
                    }
                    break;

                case 6:
                    if (garagem.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não há carros para gravar!");
                    } else {
                        try (PrintWriter writer = new PrintWriter(new FileWriter("carros.txt"))) {
                            for (Carro c : garagem) {
                                writer.println("Marca: " + c.getMarca() + " | Modelo: " + c.getModelo() + " | Ano: " + c.getAno());
                            }
                            JOptionPane.showMessageDialog(null, "Gravado em 'carros.txt' com sucesso! 💾");
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Erro ao gravar arquivo: " + e.getMessage());
                        }
                    }
                    break;

                case 7: 
                    funcionando = false; 
                    JOptionPane.showMessageDialog(null, "Programa encerrado. Até mais! 👋");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }
    }
}

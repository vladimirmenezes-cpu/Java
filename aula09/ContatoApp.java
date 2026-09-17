package aula09;

import java.util.ArrayList;
import java.util.Scanner;

public class ContatoApp {

    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcao = -1;
        while (opcao != 7) {
            System.out.println("\n========= AGENDA DE CONTATOS =========");
            System.out.println("1 - Cadastrar contato pessoal");
            System.out.println("2 - Cadastrar contato profissional");
            System.out.println("3 - Cadastrar contato de emergência");
            System.out.println("4 - Listar todos os contatos");
            System.out.println("5 - Pesquisar contato");
            System.out.println("6 - Alterar contato");
            System.out.println("7 - Excluir contato");
            System.out.println("8 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Telefone: ");
                String numero = sc.nextLine();
                System.out.print("Parentesco: ");
                String parentesco = sc.nextLine();
                contatos.add(new ContatoPessoal(nome, numero, parentesco));
                System.out.println("Contato pessoal adicionado com sucesso!");

            } else if (opcao == 2) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Telefone: ");
                String numero = sc.nextLine();
                System.out.print("Cargo: ");
                String cargo = sc.nextLine();
                System.out.print("Empresa: ");
                String empresa = sc.nextLine();
                contatos.add(new ContatoProfissional(nome, numero, cargo, empresa));
                System.out.println("Contato profissional adicionado com sucesso!");

            } else if (opcao == 3) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();




                }  else if (opcao == 3) {
                if (contatos.isEmpty()) {
                    System.out.println("Nenhum contato cadastrado.");
                } else {
                    System.out.println("Lista de contatos:");
                    for (int i = 0; i < contatos.size(); i++) {
                        System.out.println((i + 1) + " - " + contatos.get(i).exibirDados());
                        System.out.println("--------------------");
                    }
                }

            } else if (opcao == 4) {
                System.out.print("Digite o nome para pesquisar: ");
                String nomePesquisa = sc.nextLine();
                boolean encontrado = false;
                for (Contato contato : contatos) {
                    if (contato.getNome().equalsIgnoreCase(nomePesquisa)) {
                        System.out.println("Contato encontrado!");
                        System.out.println(contato.exibirDados());
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("Contato não encontrado.");
                }

            } else if (opcao == 5) {
                if (contatos.isEmpty()) {
                    System.out.println("Nenhum contato para alterar.");
                } else {
                    for (int i = 0; i < contatos.size(); i++) {
                        System.out.println((i + 1) + " - " + contatos.get(i).getNome());
                    }
                    System.out.print("Informe o número do contato que deseja alterar: ");
                    int pos = sc.nextInt();
                    sc.nextLine();

                    if (pos >= 1 && pos <= contatos.size()) {
                        Contato contato = contatos.get(pos - 1);
                        System.out.print("Digite o novo nome: ");
                        contato.setNome(sc.nextLine());
                        System.out.print("Digite o novo telefone: ");
                        contato.setNumero(sc.nextLine());
                        System.out.println("Contato alterado com sucesso!");
                    } else {
                        System.out.println("Contato inválido!");
                    }
                }

            } else if (opcao == 6) {
                if (contatos.isEmpty()) {
                    System.out.println("Nenhum contato para excluir.");
                } else {
                    for (int i = 0; i < contatos.size(); i++) {
                        System.out.println((i + 1) + " - " + contatos.get(i).getNome());
                    }
                    System.out.print("Informe o número do contato que deseja excluir: ");
                    int pos = sc.nextInt();
                    sc.nextLine();

                    if (pos >= 1 && pos <= contatos.size()) {
                        contatos.remove(pos - 1);
                        System.out.println("Contato excluído com sucesso!");
                    } else {
                        System.out.println("Contato inválido!");
                    }
                }

            } else if (opcao == 7) {
                System.out.println("Saindo do programa...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        sc.close();
    }
}
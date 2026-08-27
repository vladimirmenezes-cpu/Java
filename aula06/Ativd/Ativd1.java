package aula06.Ativd;
import java.util.Scanner;


public class Ativd1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];
        int[] quantidades = new int[5];
        int qtd = 0; 
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Pesquisar");
            System.out.println("4 - Alterar");
            System.out.println("5 - Remover");
            System.out.println("6 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
            
                if (qtd < 5) {
                    System.out.print("Nome: ");
                    nomes[qtd] = sc.nextLine();

                    System.out.print("Quantidade: ");
                    quantidades[qtd] = sc.nextInt();

                    qtd++;
                    System.out.println("Produto cadastrado!");
                } else {
                    System.out.println("Limite do array atingido!");
                }

            } else if (opcao == 2) {
                
                if (qtd == 0) {
                    System.out.println("Nenhum produto cadastrado.");
                } else {
                    for (int i = 0; i < qtd; i++) {
                        System.out.println("[" + i + "] Nome: " + nomes[i] + " | Qtd: " + quantidades[i]);
                    }
                }

            } else if (opcao == 3) {
                
                System.out.print("Digite o nome para buscar: ");
                String busca = sc.nextLine();
                boolean achou = false;

                for (int i = 0; i < qtd; i++) {
                    if (nomes[i].equalsIgnoreCase(busca)) {
                        System.out.println("Encontrado no índice [" + i + "] -> Nome: " + nomes[i] + " | Qtd: " + quantidades[i]);
                        achou = true;
                        break;
                    }
                }

                if (!achou) {
                    System.out.println("Produto não encontrado.");
                }

            } else if (opcao == 4) {
                
                System.out.print("Digite o nome do produto para alterar: ");
                String busca = sc.nextLine();
                boolean achou = false;

                for (int i = 0; i < qtd; i++) {
                    if (nomes[i].equalsIgnoreCase(busca)) {
                        System.out.print("Novo nome: ");
                        nomes[i] = sc.nextLine();

                        System.out.print("Nova quantidade: ");
                        quantidades[i] = sc.nextInt();

                        achou = true;
                        System.out.println("Produto alterado com sucesso!");
                        break;
                    }
                }

                if (!achou) {
                    System.out.println("Produto não encontrado.");
                }

            } else if (opcao == 5) {
            
                System.out.print("Digite o nome do produto para remover: ");
                String busca = sc.nextLine();
                boolean achou = false;

                for (int i = 0; i < qtd; i++) {
                    if (nomes[i].equalsIgnoreCase(busca)) {
                        
                        for (int j = i; j < qtd - 1; j++) {
                            nomes[j] = nomes[j + 1];
                            quantidades[j] = quantidades[j + 1];
                        }
                        qtd--;
                        achou = true;
                        System.out.println("Produto removido!");
                        break;
                    }
                }

                if (!achou) {
                    System.out.println("Produto não encontrado.");
                }
                
            } else if (opcao == 6) {
                System.out.println("Saindo do programa...");

            } else {
                System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}

package aula11.sistema_pedidos;

import java.util.Scanner;

public class PrincipalPedidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pedido pedido = null;

        while (true) {
            System.out.println("\n=== SISTEMA DE PEDIDOS E PAGAMENTOS ===");
            System.out.println("1. Cadastrar pedido (Local ou Delivery)");
            System.out.println("2. Mostrar dados do pedido");
            System.out.println("3. Escolher forma de pagamento ");
            System.out.println("4. Pagar em dinheiro");
            System.out.println("5. Pagar via PIX");
            System.out.println("6. Pagar com cartao");
            System.out.println("7. Encerrar o programa");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nEscolha o tipo de pedido:");
                    System.out.println("1 - Pedido no Local");
                    System.out.println("2 - Pedido Delivery");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Informe o numero do pedido: ");
                    int numero = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Informe o nome do cliente: ");
                    String cliente = sc.nextLine();

                    System.out.print("Informe o valor do pedido: R$ ");
                    double valor = sc.nextDouble();
                    sc.nextLine();

                    if (tipo == 1) {
                        pedido = new PedidoLocal(numero, cliente, valor);
                        System.out.println("Pedido Local cadastrado com sucesso!");
                    } else if (tipo == 2) {
                        System.out.print("Informe o endereço de entrega: ");
                        String endereco = sc.nextLine();

                        System.out.print("Informe a taxa de entrega: R$ ");
                        double taxa = sc.nextDouble();

                        pedido = new PedidoDelivery(numero, cliente, valor, endereco, taxa);
                        System.out.println("Pedido Delivery cadastrado com sucesso!");
                    } else {
                        System.out.println("Tipo de pedido inválido!");
                    }
                    break;

                case 2:
                    if (pedido != null) {
                        System.out.println("\n--- DADOS DO PEDIDO ---");
                        System.out.println(pedido.exibirDados());
                    } else {
                        System.out.println("Cadastre um pedido primeiro na opçao 1.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- FORMAS DE PAGAMENTO DISPONIVEIS ---");
                    System.out.println("Opçao 4 -> Pagamento em Dinheiro");
                    System.out.println("Opçao 5 -> Pagamento via PIX");
                    System.out.println("Opçao 6 -> Pagamento no Cartao (Parcelado)");
                    break;

                case 4:
                    if (pedido == null) {
                        System.out.println("Cadastre um pedido primeiro na opçao 1.");
                    } else {
                        System.out.println("\n" + pedido.pagar(pedido.getValorPedido()));
                    }
                    break;

                case 5:
                    if (pedido == null) {
                        System.out.println("Cadastre um pedido primeiro na opçao 1.");
                    } else {
                        System.out.print("Informe a sua chave PIX: ");
                        String chavePix = sc.nextLine();
                        System.out.println("\n" + pedido.pagar(pedido.getValorPedido(), chavePix));
                    }
                    break;

                case 6:
                    if (pedido == null) {
                        System.out.println("Cadastre um pedido primeiro na opçao 1.");
                    } else {
                        System.out.print("Informe a quantidade de parcelas: ");
                        int parcelas = sc.nextInt();
                        if (parcelas <= 0) {
                            System.out.println("O numero de parcelas deve ser maior que zero.");
                        } else {
                            System.out.println("\n" + pedido.pagar(pedido.getValorPedido(), parcelas));
                        }
                    }
                    break;

                case 7:
                    System.out.println("Encerrando o programa...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opçao invalida. Tente novamente.");
            }
        }
    }
}

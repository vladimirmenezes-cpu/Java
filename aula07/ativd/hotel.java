package aula07.ativd;

import java.util.Scanner;

public class hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalquartos = 0;
        while (totalquartos <= 0 || totalquartos > 5) {
            System.out.println("\nInforme a quantidade de quartos disponiveis no hotel:");
            totalquartos = sc.nextInt();
            if (totalquartos <= 0 || totalquartos > 5) {
                System.out.println("\nQuantidade inválida! o hotel aceita no maximo 5 quartos");
            }
        }

        int[] numerosdquartos = new int[totalquartos];
        int[] camaslivres = new int[totalquartos];

        String[] nomehospedes = new String[25];
        int[] quartosreservados = new int[25];

        int totalreservas = 0;
        boolean cadastrounumero = false;
        int opcao = 0;

        do {
            System.out.println("\n---- Menu dos sistema ----");
            System.out.println("1 - Registrar numero dos quartos.");
            System.out.println("2 - Registrar quantidade de camas.");
            System.out.println("3 - Reservar quarto.");
            System.out.println("4 - Consultar reservas por quarto.");
            System.out.println("5 - Consultar reservas por hospede.");
            System.out.println("6 - Encerrar sistema.");
            System.out.println("Escolha uma opção:");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    for (int i = 0; i < totalquartos; i++) {
                        System.out.println("Informe o numero do quarto" + (i + 1));
                        numerosdquartos[i] = sc.nextInt();
                    }
                    cadastrounumero = true;
                    break;

                case 2:
                    if (!cadastrounumero) {
                        System.out.println("Registe os numeros dos quartos primeiro ");
                        break;
                    }
                    for (int i = 0; i < totalquartos; i++) {
                        System.out.println("Quarto" + numerosdquartos[i] + "Quantidade de camas:");
                        camaslivres[i] = sc.nextInt();
                    }
                    break;

                case 3:
                    if (totalreservas >= 25) {
                        System.out.println("Limite de 25 reservas atingido!");
                        break;
                    }

                    System.out.println("Informe o numero do quarto:");
                    int numquartoreserva = sc.nextInt();
                    sc.nextLine();

                    int posicaoencontrada = -1;
                    for (int i = 0; i < totalquartos; i++) {
                        if (numerosdquartos[i] == numquartoreserva) {
                            posicaoencontrada = i;
                            break;
                        }
                    }
                    if (posicaoencontrada == -1) {
                        System.out.println("Este quarto não existe!");
                    } else if (camaslivres[posicaoencontrada] <= 0) {
                        System.out.println("Não tem camas disponiveis neste quarto.");
                    } else {
                        System.out.println("Informe o nome do hospede");
                        String nomehospede = sc.nextLine();

                        nomehospedes[totalreservas] = nomehospede;
                        quartosreservados[totalreservas] = numquartoreserva;

                        totalreservas++;
                        camaslivres[posicaoencontrada]--;

                        System.out.println("Reserva realizada com suecesso");
                    }
                    break;

                case 4:
                    System.out.println("Informe o numero do quarto: ");
                    int numconsultaquarto = sc.nextInt();

                    boolean quartoexiste = false;
                    for (int i = 0; i < totalquartos; i++) {
                        if (numerosdquartos[i] == numconsultaquarto) {
                            quartoexiste = true;
                            break;
                        }
                    }
                    if (!quartoexiste) {
                        System.out.println("Este quarto não existe!");
                    } else {
                        boolean encontroureserva = false;
                        for (int i = 0; i < totalreservas; i++) {
                            if (quartosreservados[i] == numconsultaquarto) {
                                System.out.println("Hospde:" + nomehospedes[i]);
                                encontroureserva = true;
                            }
                        }
                        if (!encontroureserva) {
                            System.out.println("Não tem reservas para este quarto!");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Informe o nome do hospede:");
                    String nomeconsulta = sc.nextLine();

                    boolean encontrouhospede = false;
                    for (int i = 0; i < totalreservas; i++) {
                        if (nomehospedes[i].equalsIgnoreCase(nomeconsulta)) {
                            System.out.println("Quarto reservado:" + quartosreservados[i]);
                            encontrouhospede = true;
                        }
                    }
                    if (!encontrouhospede) {
                        System.out.println("Não tem reservas para este hospede!");
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção invalida!");
                    break;
            }

        } while (opcao != 6);

        sc.close();
    }
}
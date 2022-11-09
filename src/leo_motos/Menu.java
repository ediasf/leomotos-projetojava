import leo_motos.util.Cores;

import java.util.Scanner;

public class Menu {

    public static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;
        Moto moto1= new Moto(22,2013,"Bis",7000,"Honda");

        while (true) {

            // 70 *
            System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "******************* BEM VINDO *************************");
            System.out.println("\n" +
                    "  __  __ ___ _____ _   _      __  __  ___ _____ ___  ___ \n" +
                    " |  \\/  | __|_   _/_\\ | |    |  \\/  |/ _ \\_   _/ _ \\/ __|\n" +
                    " | |\\/| | _|  | |/ _ \\| |__  | |\\/| | (_) || || (_) \\__ \\\n" +
                    " |_|  |_|___| |_/_/ \\_\\____| |_|  |_|\\___/ |_| \\___/|___/\n" +
                    "                                                         \n");
                                                System.out.println(
                                "        _  //\n" +
                                "       |_)//(''''':\n" +
                                "         //  \\_____:_____.-----.P\n" +
                                "        //   | ===  |   /        \\\n" +
                                "    .:'//.   \\ \\=|   \\ /  .:'':.\n" +
                                "   :' // ':   \\ \\ ''..'--:'-.. ':\n" +
                                "   '. '' .'    \\:.....:--'.-'' .'\n" +
                                "    ':..:'                ':..:'");
            System.out.println("**********************************************************************");
            System.out.println("                                                                      ");
            System.out.println("            1 - Cadastrar nova motocicleta                            ");
            System.out.println("            2 - Editar motocicleta                                    ");
            System.out.println("            3 - Listar motocicletas                                   ");
            System.out.println("            4 - Remover motocicleta                                   ");
            System.out.println("            5 - Encerrar                                              ");
            System.out.println("                                                                      ");
            System.out.println("**********************************************************************");
            System.out.println(" Entre com a opção desejada:                                          ");
            System.out.println("                                                     " + Cores.TEXT_RESET);
            opcao = leia.nextInt();

            if (opcao == 5) {
                System.out.println("\nLÉO MOTOS - MOTOS DE ALTA PERFORMANCE");
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar nova motocicleta: \n\n");

                    break;
                case 2:
                    System.out.println("Editar motocicleta:\n\n");

                    break;
                case 3:

                    System.out.println("Listar motocicleta:\n\n");
                    moto1.visualizar();
                    break;
                case 4:
                    System.out.println("Remover motocicleta:\n\n");

                    break;
                default:

                    System.out.println("\nOpção Inválida!");

                    break;
            }
        }

    }

}
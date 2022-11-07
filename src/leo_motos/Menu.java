import java.util.Scanner;

public class Menu {

    public static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        while (true) {

            // 70 *
            System.out.println("******************* BEM VINDO *************************");
            System.out.println("\n" +
                    "  _     _____ ___    __  __  ___ _____ ___  ____  \n" +
                    " | |   | ____/ _ \\  |  \\/  |/ _ \\_   _/ _ \\/ ___| \n" +
                    " | |   |  _|| | | | | |\\/| | | | || || | | \\___ \\ \n" +
                    " | |___| |__| |_| | | |  | | |_| || || |_| |___) |\n" +
                    " |_____|_____\\___/  |_|  |_|\\___/ |_| \\___/|____/ \n");
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
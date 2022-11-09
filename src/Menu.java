import leo_motos.util.Cores;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        MotoController motos = new MotoController();


        int opcao, ano,tipo,cilindrada=0, quantidadeBateria=0, idMoto;
        String modelo, marca, combustivel;
        float preco;
        MotoEletrica moto1= new MotoEletrica(1,2022,"EVS Work",19290,"Voltz",2,2);
        MotoCombustao moto2= new MotoCombustao(2,2017,"PCX",11900,"Honda",1,150,"Gasolina");
        motos.cadastrarMotocicleta(moto1);
        motos.cadastrarMotocicleta(moto2);
        while (true) {

            // 70 *
            System.out.println(Cores.TEXT_RED_BRIGHT + Cores.ANSI_BLACK_BACKGROUND + "******************* BEM VINDO *************************");
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
            System.out.println("            5 - Buscar Moto por ID                                   ");
            System.out.println("            6 - Encerrar                                              ");
            System.out.println("                                                                      ");
            System.out.println("**********************************************************************");
            System.out.println(" Entre com a opção desejada:                                          ");
            System.out.println("                                                     " + Cores.TEXT_RESET);

            try {
                opcao = leia.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros!");
                leia.nextLine();
                opcao = 0;
            }
            if (opcao == 6) {
                System.out.println("\nMETAL MOTOS - MOTOS DE ALTA PERFORMANCE");
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite o ano da moto: ");
                    ano= leia.nextInt();
                    leia.skip("\\R?");
                    System.out.println("Digite o modelo da moto: ");
                    modelo=leia.nextLine();

                    System.out.println("Digite o preço da moto: ");
                    preco=leia.nextFloat();
                    leia.skip("\\R?");
                    System.out.println("Digite a marca da moto: ");
                    marca= leia.nextLine();


                    System.out.println("Digite o tipo da moto (1- Combustao 2- Elétrica): ");
                    tipo= leia.nextInt();
                    leia.skip("\\R?");


                    switch (tipo) {
                        case 1 -> {
                            System.out.println("Digite o tipo de combustível: ");
                            combustivel = leia.nextLine();
                            System.out.println("Digite a quantidade de cilindradas: ");
                            cilindrada = leia.nextInt();
                            motos.cadastrarMotocicleta(
                                    new MotoCombustao(motos.gerarID(),ano,modelo,preco,marca,tipo,cilindrada,combustivel));

                        }


                        case 2 -> {
                            System.out.println("Digite a quantidade de baterias da moto: ");
                            quantidadeBateria = leia.nextInt();
                            motos.cadastrarMotocicleta(
                                    new MotoEletrica(motos.gerarID(),ano,modelo,preco,marca,tipo,quantidadeBateria));
                        }
                    }

                    keyPress();
                    break;
                case 2:
                    System.out.println("Digite o ID da moto que deseja editar: ");
                    idMoto = leia.nextInt();

                    if (motos.buscarNaCollection(idMoto) != null) {

                        System.out.println("Digite o ano da moto: ");
                        ano= leia.nextInt();
                        leia.skip("\\R?");
                        System.out.println("Digite o modelo da moto: ");
                        modelo=leia.nextLine();

                        System.out.println("Digite o preço da moto: ");
                        preco=leia.nextFloat();
                        leia.skip("\\R?");
                        System.out.println("Digite a marca da moto: ");
                        marca= leia.nextLine();

                        tipo = motos.retornaTipo(idMoto);

                        switch (tipo) {
                            case 1 -> {
                                System.out.println("Digite o tipo de combustível: ");
                                combustivel = leia.nextLine();
                                System.out.println("Digite a quantidade de cilindradas: ");
                                cilindrada = leia.nextInt();
                                motos.editarMotocicleta(
                                        new MotoCombustao(idMoto,ano,modelo,preco,marca,tipo,cilindrada,combustivel));

                            }
                            case 2 -> {
                                System.out.println("Digite a quantidade de baterias da moto: ");
                                quantidadeBateria = leia.nextInt();
                                motos.editarMotocicleta(
                                        new MotoEletrica(idMoto,ano,modelo,preco,marca,tipo,quantidadeBateria));
                            }
                            default -> {
                                System.out.println("A moto não foi encontrada!");
                            }
                        }

                    } else
                        System.out.println("A moto não foi encontrada!");

                    keyPress();
                    break;


                case 3:

                    System.out.println("Listar motocicleta:\n");
                    motos.listarTodas();
                    keyPress();
                    break;
                case 4:
                    System.out.println("Remover motocicleta:\n");
                    System.out.println("Digite o ID da moto que deseja remover ");
                    idMoto= leia.nextInt();

                    motos.removerMotocicleta(idMoto);

                    keyPress();

                    break;
                case 5:
                    System.out.println("Digite o núemro ID da moto que deseja buscar: ");
                    idMoto = leia.nextInt();

                    motos.buscarPorId(idMoto);

                    keyPress();
                default:

                    System.out.println("\nOpção Inválida!");

                    break;
            }
        }

    }

    private static void keyPress() {

            try {

                System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
                System.in.read();

            } catch (IOException e) {

                System.out.println("Você pressionou uma tecla diferente de enter!");

            }

    }

}
/*
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        //criação da agenda do petshop
        AgendaPetshop agenda = new AgendaPetshop();

        //cadastro do primeiro animal
        Cachorro rex = new Cachorro("Rex", 'G');
        Pedidos pedidoRex = new Pedidos(rex);
        pedidoRex.adicionarTosa(new Tosa(rex));
        pedidoRex.adicionarAdicional(new Adicional(rex, "HIDRATACAO"));
        pedidoRex.adicionarAdicional(new Adicional(rex, "CORTE_UNHA"));

        //agendamento do Rex
        agenda.agendar(
                LocalDateTime.of(
                        2026, //ano
                        6,    //mes
                        30,   //dia
                        14,   //hora
                        0     //minuto
                ),
                pedidoRex
        );

        //cadastro do segundo animal
        Gato mimi = new Gato("Mimi", 'P');
        Pedidos pedidoMimi = new Pedidos(mimi);
        pedidoMimi.adicionarTosa(new Tosa(mimi));

        //tentativa de agendar no mesmo horario do primeiro animal
        //irá retornar "Horário já ocupado"
        agenda.agendar(

                LocalDateTime.of(
                        2026,
                        6,
                        30,
                        14,
                        0
                ),

                pedidoMimi
        );

        //cadastro do terceiro animal
        Cachorro lunna = new Cachorro("Lunna", 'p');
        Pedidos pedidoLunna = new Pedidos(lunna);
        pedidoLunna.adicionarTosa(new Tosa(lunna));
        pedidoLunna.adicionarAdicional(new Adicional(lunna, "ESCOVACAO"));
        pedidoLunna.adicionarAdicional(new Adicional(lunna, "ANIMAL_BRAVO"));

        //agendamento da lunna
        agenda.agendar(
                LocalDateTime.of(
                        2026, //ano
                        9,    //mes
                        10,   //dia
                        15,   //hora
                        30     //minuto
                ),
                pedidoLunna
        );


        //exibe todos os agendamentos realizados
        agenda.listarAgenda();
    }
}
*/
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criação da agenda do petshop
        AgendaPetshop agenda = new AgendaPetshop();

        System.out.println("===== SISTEMA PETSHOP =====");

        // Escolha do tipo de animal
        System.out.println("Digite o numero para selecionar o tipo do animal:");
        System.out.println("1 - Cachorro");
        System.out.println("2 - Gato");
        System.out.print("Opção: ");
        String tipoAnimal = scanner.nextLine().toLowerCase();

        System.out.print("Informe o nome do animal: ");
        String nome = scanner.nextLine();

        Animal animal;

        // Criação do animal conforme a escolha do usuário
        if (tipoAnimal.equals("1") || tipoAnimal.equals("cachorro")) {

            System.out.print("Informe o porte do cachorro (P, M ou G): ");
            char porte = scanner.nextLine().toUpperCase().charAt(0);

            animal = new Cachorro(nome, porte);

        } else if (tipoAnimal.equals("2") || tipoAnimal.equals("gato")) {

            // Se sua classe Gato ainda exige porte, use 'P' apenas para preencher o construtor.
            // O porte do gato não será usado nos cálculos, se Banho e Tosa estiverem tratando gato separadamente.
            animal = new Gato(nome, 'P');

        } else {

            System.out.println("Tipo de animal inválido.");
            scanner.close();
            return;
        }

        // Todo pedido já possui banho obrigatório
        Pedidos pedido = new Pedidos(animal);

        // Tosa opcional
        System.out.print("Deseja adicionar tosa? (S/N): ");
        String respostaTosa = scanner.nextLine();

        if (respostaTosa.equalsIgnoreCase("S")) {
            pedido.adicionarTosa(new Tosa(animal));
            System.out.println("Tosa adicionada.");
        }

        // Adicionais opcionais
        String opcaoAdicional;

        do {
            System.out.println();
            System.out.println("===== ADICIONAIS =====");
            System.out.println("1 - Escovação");
            System.out.println("2 - Muito sujo");
            System.out.println("3 - Hidratação");
            System.out.println("4 - Corte de unha");
            System.out.println("5 - Animal bravo");
            System.out.println("0 - Finalizar adicionais");
            System.out.print("Digite o número para escolher uma opção: ");

            opcaoAdicional = scanner.nextLine();

            switch (opcaoAdicional) {
                case "1":
                    pedido.adicionarAdicional(new Adicional(animal, "ESCOVACAO"));
                    System.out.println("Escovação adicionada.");
                    break;

                case "2":
                    pedido.adicionarAdicional(new Adicional(animal, "MUITO_SUJO"));
                    System.out.println("Adicional de animal muito sujo adicionado.");
                    break;

                case "3":
                    pedido.adicionarAdicional(new Adicional(animal, "HIDRATACAO"));
                    System.out.println("Hidratação adicionada.");
                    break;

                case "4":
                    pedido.adicionarAdicional(new Adicional(animal, "CORTE_UNHA"));
                    System.out.println("Corte de unha adicionado.");
                    break;

                case "5":
                    pedido.adicionarAdicional(new Adicional(animal, "ANIMAL_BRAVO"));
                    System.out.println("Adicional de animal bravo adicionado.");
                    break;

                case "0":
                    System.out.println("Adicionais finalizados.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (!opcaoAdicional.equals("0"));

        // Exibe resumo do pedido antes do agendamento
        System.out.println();
        pedido.exibirResumo();

        // Entrada dos dados do agendamento
        System.out.println();
        System.out.println("===== AGENDAMENTO =====");

        System.out.print("Informe o ano: ");
        int ano = Integer.parseInt(scanner.nextLine());

        System.out.print("Informe o mês: ");
        int mes = Integer.parseInt(scanner.nextLine());

        System.out.print("Informe o dia: ");
        int dia = Integer.parseInt(scanner.nextLine());

        System.out.print("Informe a hora: ");
        int hora = Integer.parseInt(scanner.nextLine());

        System.out.print("Informe o minuto: ");
        int minuto = Integer.parseInt(scanner.nextLine());

        LocalDateTime horario = LocalDateTime.of(ano, mes, dia, hora, minuto);

        // Realiza o agendamento
        agenda.agendar(horario, pedido);

        // Lista agenda final
        System.out.println();
        agenda.listarAgenda();

        scanner.close();
    }
}

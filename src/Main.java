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
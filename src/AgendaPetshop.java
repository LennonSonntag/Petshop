import java.time.LocalDateTime;
import java.util.ArrayList;

//classe controladora de todos os agendamentos do petshop
public class AgendaPetshop {

    //lista que armazena os agendamentos realizados
    private ArrayList<Agendamento> agenda;

    //inicia a lista de agendamentos
    public AgendaPetshop() {
        agenda = new ArrayList<>();
    }

    //realiza um novo agendamento caso o horário esteja disponível
    //obs: se nao tiver disponivel, acusa antes da "agenda petshop"
    public boolean agendar(LocalDateTime horario, Pedidos pedido) {

        //percorre as linhas para saber se o horario ja esta ocupado
        for (Agendamento a : agenda) {

            //se encontrar um agendamento igual, nao agenda
            if (a.getHorario().equals(horario)) {
                System.out.println("Horário já ocupado.");
                return false;
            }
        }

        //agenda o horario se estiver livre
        agenda.add(new Agendamento(horario, pedido));

        System.out.println("Agendamento realizado.");

        return true;
    }

    //exibe todos os agendamentos marcados
    public void listarAgenda() {

        System.out.println("---------------AGENDA DO PETSHOP---------------");

        //percorre todos os agendamentos da agenda
        for (Agendamento a : agenda) {

            System.out.println("Pedido Nº " + a.getPedido().getNumeroPedido());

            System.out.println("Horário: " + a.getHorario());

            //exibe o resumo completo do pedido
            a.getPedido().exibirResumo();

            System.out.println("----------------------------------");
        }
    }
}

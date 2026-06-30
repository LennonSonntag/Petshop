import java.time.LocalDateTime;
import java.util.ArrayList;

public class AgendaPetShop {

    private ArrayList<Agendamento> agenda;

    public AgendaPetShop() {
        agenda = new ArrayList<>();
    }

    public boolean agendar(LocalDateTime horario, Pedidos pedido) {

        for (Agendamento a : agenda) {

            if (a.getHorario().equals(horario)) {
                System.out.println("Horário já ocupado.");
                return false;
            }
        }

        agenda.add(new Agendamento(horario, pedido));

        System.out.println("Agendamento realizado.");

        return true;
    }

    public void listarAgenda() {

        for (Agendamento a : agenda) {

            System.out.println("--------------------------------");

            System.out.println(a.getHorario());

            a.getPedido().exibirResumo();
        }
    }

}

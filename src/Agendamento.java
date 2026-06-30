import java.time.LocalDateTime;

    //classe para o agendamento dos horarios
    public class Agendamento {

        private LocalDateTime horario;
        private Pedidos pedido;

        //construtor responsável por inicializar o horário e o pedido do agendamento
        public Agendamento(LocalDateTime horario, Pedidos pedido) {
            this.horario = horario;
            this.pedido = pedido;
        }

        public LocalDateTime getHorario() {
            return horario;
        }

        public Pedidos getPedido() {
            return pedido;
        }
    }



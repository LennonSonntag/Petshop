import java.util.ArrayList;

// Um pedido possui um animal, um banho obrigatório e pode ter adicionais.
public class Pedidos {

    private int numeroPedido;
    private static int contador = 1;

    private Animal animal;
    private Banho banho;
    private Tosa tosa;
    private ArrayList<Adicional> adicionais;

    //Todo pedido já recebe um animal e cria automaticamente um banho.
    public Pedidos(Animal animal) {
        this.animal = animal;

        //Gera automaticamente o número do pedido.
        this.numeroPedido = contador++;

        //Todo animal obrigatoriamente terá banho.
        this.banho = new Banho(animal);

        //A lista começa vazia e pode receber vários adicionais.
        this.adicionais = new ArrayList<>();
    }

    //getter do numero do pedido
    public int getNumeroPedido() {
        return numeroPedido;
    }
  
    public void adicionarTosa(Tosa tosa) {
        this.tosa = tosa;
    }

    //Como usamos ArrayList, o pedido pode ter vários adicionais.
    public void adicionarAdicional(Adicional adicional) {
        adicionais.add(adicional);
    }

    // Calcula o valor total do pedido.
    public double calcularTotal() {
        double total = 0;

        // Soma o banho, que é obrigatório.
        total += banho.precificacao();

        if (tosa != null) {
            total += tosa.precificacao();
        }

        for (Adicional adicional : adicionais) {
            total += adicional.precificacao();
        }

        return total;
    }

    //Método para exibir o resumo completo do pedido no terminal.
    public void exibirResumo() {
        System.out.println("===== PEDIDO Nº " + numeroPedido + " =====");

        System.out.println("Animal: " + animal);

        System.out.println("Banho: R$ " + banho.precificacao());

        if (tosa != null) {
            System.out.println("Tosa: R$ " + tosa.precificacao());
        } else {
            System.out.println("Tosa: Não adicionada");
        }

        if (adicionais.isEmpty()) {
            System.out.println("Adicionais: Nenhum adicional");
        } else {
            System.out.println("Adicionais:");

            for (Adicional adicional : adicionais) {
                System.out.println("- " + adicional.getDescricao() + ": R$ " + adicional.precificacao());
            }
        }

        System.out.println("----------------------------");
        System.out.println("Valor total: R$ " + calcularTotal());
    }
}


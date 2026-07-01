//Todo pedido vai ter obrigatoriamente um banho.
public class Banho extends Servico {

    public Banho(Animal animal) {
        super(animal, "Banho");
    }
    
    @Override
    public double precificacao() {

        switch (animal.getPorte()) {

            case 'P':
                return 50;

            case 'M':
                return 60;

            case 'G':
                return 70;

            default:
                return 0;
        }
    }
}

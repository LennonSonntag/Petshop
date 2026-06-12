public class Banho extends Servico {

    public Banho(Animal animal) {
        super(animal);
    }

    @Override
    public double precificacao() {

        switch (animal.getPorte()) {
            case 'p':
                return 50;

            case 'm':
                return 60;

            case 'g':
                return 70;

            default:
                return 0;
        }
    }
}

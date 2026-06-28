public class Banho extends Servico {

    public Banho(Animal animal) {
        super(animal);
    }

    @Override
    public double precificacao() {

        switch (animal.getPorte()) {
                //Darlan: alterei p, m e g para maiusculo.
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

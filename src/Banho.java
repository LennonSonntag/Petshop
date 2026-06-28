//Todo pedido vai ter obrigatoriamente um banho.
public class Banho extends Servico {

    public Banho(Animal animal) {
        super(animal);
    }
    
    //Darlan: Aqui fiz uma alteração, pois gato só tem um tamanho.
    
    /*    
    @Override
    public double precificacao() {

        // Gato tem valor único de banho, sem considerar porte.
        if (animal instanceof Gato) {
            return 60;
        }

        // Cachorro tem valor de banho conforme o porte.
        if (animal instanceof Cachorro) {
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

        return 0;
        */
    
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

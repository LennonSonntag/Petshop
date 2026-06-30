public class Tosa extends Servico{

    public Tosa(Animal animal) {
        super(animal, "tosa");
    }
    
    //Darlan: Fiz uma alteração pois gato não tem diferença de tamanho. Se formos utilizar, apagamos o outro.
    //(deixa o comentario acima)

     @Override
    public double precificacao() {

        // Regra para gato:
        // A tosa de gato possui valor único.
        if (animal instanceof Gato) {
            return 50;
        }

        // Regra para cachorro:
        // O valor da tosa muda conforme o porte.
        if (animal instanceof Cachorro) {
            switch (animal.getPorte()) {
                case 'P':
                    return 50;

                case 'M':
                    return 60;

                case 'G':
                    return 80;

                default:
                    return 0;
            }

        }
        return 0;
    }
}

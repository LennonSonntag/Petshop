// Classe para representar adicionais opcionais do serviço.
public class Adicional extends Servico {

    private String tipo;

    public Adicional(Animal animal, String tipo) {
        super(animal, tipo);
        this.tipo = tipo.toUpperCase();
    }

    @Override
    public double precificacao() {

        switch (tipo) {

            case "ESCOVACAO":
                return 10;

            case "MUITO_SUJO":
                return 20;

            case "HIDRATACAO":
                return 20;

            case "CORTE_UNHA":
                return 10;

            case "ANIMAL_BRAVO":
                return 10;

            default:
                return 0;
        }
    }

    public String getTipo() {
        return tipo;
    }
}

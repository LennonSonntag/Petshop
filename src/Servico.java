// Classe abstrata que representa qualquer serviço realizado no petshop.
public abstract class Servico {

    protected Animal animal;
    private String descricao;

    public Servico(Animal animal, String descricao) {
        this.animal = animal;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract double precificacao();
}

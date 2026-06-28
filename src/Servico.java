public abstract class Servico {

    protected Animal animal;

    private String descricao;

    public Servico(Animal animal) {
        //Darlan: Acho que precisa da linha abaixo:
        //this.animal = animal;
    }

    public void String(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract double precificacao();
}

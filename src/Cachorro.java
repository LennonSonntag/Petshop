public class Cachorro extends Animal{

    public Cachorro(String nome, char porte){
        super(nome, porte);
    }

    @Override
    public String toString() {
        return "Cachorro - Nome: " + getNome() +
                ", Porte: " + getPorte();
    }

}

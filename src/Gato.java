public class Gato extends Animal{

    public Gato(String nome, char porte){
        super(nome, porte);
    }

    @Override
    public String toString() {
        return "Gato - Nome: " + getNome() + ", Porte: " + getPorte();
    }
}

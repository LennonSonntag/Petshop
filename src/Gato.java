// Herda de animal.
public class Gato extends Animal{

    //Darlan: Aqui apaguei o porte do gato.

    /*
    public Gato(String nome){
        super(nome);
    }

    @Override
    public String toString() {
        return "Gato - Nome: " + getNome();
    }
    */

    public Gato(String nome, char porte){
        super(nome, porte);
    }

    @Override
    public String toString() {
        return "Gato - Nome: " + getNome() + ", Porte: " + getPorte();
    }
}

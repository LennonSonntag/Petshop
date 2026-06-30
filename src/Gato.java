// Herda de animal.
public class Gato extends Animal{

    public Gato(String nome, char porte){
        super(nome, porte);
    }

    //orverride para mostrar formatacao especi no terminal
    @Override
    public String toString() {
        return "Gato - Nome: " + getNome() + ", Porte: " + getPorte();
    }
}

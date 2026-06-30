//Herda de animal.
public class Cachorro extends Animal{

    public Cachorro(String nome, char porte){
        super(nome, porte);
    }

    //orverride para mostrar formatacao especi no terminal
    @Override
    public String toString() {
        return "Cachorro - Nome: " + getNome() +
                ", Porte: " + getPorte();
    }

}

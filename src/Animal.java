public abstract class Animal {

    private String nome;
    private char porte;

    //construtor responsável por inicializar o nome e validar o porte do animal
    public Animal(String nome, char porte) {
        this.nome = nome;
        setPorte(porte);
    }

    //getter
    public String getNome() {
        return nome;
    }

    //setter
    public char getPorte() {
        return porte;
    }

    //valida o porte informado (P, M ou G).
    public void setPorte(char porte) {
        porte = Character.toUpperCase(porte);

        if (porte == 'P' || porte == 'M' || porte == 'G') {
            this.porte = porte;
        } else {
            throw new IllegalArgumentException(
                    "Porte inválido! Use apenas P, M ou G."
            );
        }
    }
    //mais um override de formatacao
    @Override
    public String toString() {
        return "Nome: " + nome + ", Porte: " + porte;
    }
}

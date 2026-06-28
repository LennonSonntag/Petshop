public abstract class Animal {

    private String nome;
    private char porte;

    public Animal(String nome, char porte) {
        this.nome = nome;
        setPorte(porte);
    }

    public String getNome() {
        return nome;
    }

    public char getPorte() {
        return porte;
    }

    // Valida o porte informado (P, M ou G).
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
    @Override
    public String toString() {
        return "Nome: " + nome + ", Porte: " + porte;
    }
}

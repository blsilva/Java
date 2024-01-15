package instPratica05;

public class Cobrador {
    private String nome;

    public Cobrador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cobrador{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

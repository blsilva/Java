package instPratica05;

public class PontoDeParada {
    private String nome;

    public PontoDeParada(String nome) {
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
        return "PontoDeParada{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

package instPratica05;

public class Trecho {
    private PontoDeParada origem;
    private PontoDeParada destino;
    private int duracaoMinutos;

    public Trecho(PontoDeParada origem, PontoDeParada destino, int duracaoMinutos) {
        this.origem = origem;
        this.destino = destino;
        this.duracaoMinutos = duracaoMinutos;
    }

    public PontoDeParada getOrigem() {
        return origem;
    }

    public void setOrigem(PontoDeParada origem) {
        this.origem = origem;
    }

    public PontoDeParada getDestino() {
        return destino;
    }

    public void setDestino(PontoDeParada destino) {
        this.destino = destino;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public String toString() {
        return "Trecho{" +
                "origem=" + origem +
                ", destino=" + destino +
                ", duracaoMinutos=" + duracaoMinutos +
                '}';
    }
}

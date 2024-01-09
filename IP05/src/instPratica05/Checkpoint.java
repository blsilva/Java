package instPratica05;

import java.util.Date;

public class Checkpoint {
    private Date dataHoraChegada;
    private PontoDeParada pontoDeParada;

    public Checkpoint(Date dataHoraChegada, PontoDeParada pontoDeParada) {
        this.dataHoraChegada = dataHoraChegada;
        this.pontoDeParada = pontoDeParada;
    }

    public Date getDataHoraChegada() {
        return dataHoraChegada;
    }

    public void setDataHoraChegada(Date dataHoraChegada) {
        this.dataHoraChegada = dataHoraChegada;
    }

    public PontoDeParada getPontoDeParada() {
        return pontoDeParada;
    }

    public void setPontoDeParada(PontoDeParada pontoDeParada) {
        this.pontoDeParada = pontoDeParada;
    }

    @Override
    public String toString() {
        return "Checkpoint{" +
                "dataHoraChegada=" + dataHoraChegada +
                ", pontoDeParada=" + pontoDeParada +
                '}';
    }
}

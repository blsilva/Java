package instPratica05;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Jornada {
    private Motorista motorista;
    private Veiculo veiculo;
    private Trajeto trajeto;
    private Date inicioJornada;
    private Date fimJornada;
    private List<Checkpoint> checkpoints;

    public Jornada(Motorista motorista, Veiculo veiculo, Trajeto trajeto) {
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.trajeto = trajeto;
        this.checkpoints = new ArrayList<>();
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Trajeto getTrajeto() {
        return trajeto;
    }

    public void setTrajeto(Trajeto trajeto) {
        this.trajeto = trajeto;
    }

    public Date getInicioJornada() {
        return inicioJornada;
    }

    public void setInicioJornada(Date inicioJornada) {
        this.inicioJornada = inicioJornada;
    }

    public Date getFimJornada() {
        return fimJornada;
    }

    public void setFimJornada(Date fimJornada) {
        this.fimJornada = fimJornada;
    }

    public List<Checkpoint> getCheckpoints() {
        return checkpoints;
    }

    public void registrarInicio(Date dataHoraInicio) {
        this.inicioJornada = dataHoraInicio;
    }

    public void registrarFim(Date dataHoraFim) {
        this.fimJornada = dataHoraFim;
    }

    public void registrarCheckpoint(Checkpoint checkpoint) {
        checkpoints.add(checkpoint);
    }

    @Override
    public String toString() {
        return "Jornada{" +
                "motorista=" + motorista +
                ", veiculo=" + veiculo +
                ", trajeto=" + trajeto +
                ", inicioJornada=" + inicioJornada +
                ", fimJornada=" + fimJornada +
                ", checkpoints=" + checkpoints +
                '}';
    }
}

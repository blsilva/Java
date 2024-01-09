package instPratica05;

import java.util.ArrayList;
import java.util.List;

public class Trajeto {
    private Veiculo veiculo;
    private Motorista motorista;
    private Cobrador cobrador;
    private List<Trecho> trechos;
    private List<Checkpoint> checkpoints;

    public Trajeto(Veiculo veiculo, Motorista motorista, Cobrador cobrador) {
        this.veiculo = veiculo;
        this.motorista = motorista;
        this.cobrador = cobrador;
        this.trechos = new ArrayList<>();
        this.checkpoints = new ArrayList<>();
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Cobrador getCobrador() {
        return cobrador;
    }

    public void setCobrador(Cobrador cobrador) {
        this.cobrador = cobrador;
    }

    public List<Trecho> getTrechos() {
        return trechos;
    }

    public void adicionarTrecho(Trecho trecho) {
        trechos.add(trecho);
    }

    public List<Checkpoint> getCheckpoints() {
        return checkpoints;
    }

    public void adicionarCheckpoint(Checkpoint checkpoint) {
        checkpoints.add(checkpoint);
    }

    @Override
    public String toString() {
        return "Trajeto{" +
                "veiculo=" + veiculo +
                ", motorista=" + motorista +
                ", cobrador=" + cobrador +
                ", trechos=" + trechos +
                ", checkpoints=" + checkpoints +
                '}';
    }
}

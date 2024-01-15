package instPratica05;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemaTransporte implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Veiculo> veiculos;
    private List<Motorista> motoristas;
    private List<Cobrador> cobradores;
    private List<Passageiro> passageiros;
    private List<PontoDeParada> pontosDeParada;
    private List<Trecho> trechos;
    private List<Trajeto> trajetos;
    private List<Jornada> jornadas;

    public SistemaTransporte() {
        this.veiculos = new ArrayList<>();
        this.motoristas = new ArrayList<>();
        this.cobradores = new ArrayList<>();
        this.passageiros = new ArrayList<>();
        this.pontosDeParada = new ArrayList<>();
        this.trechos = new ArrayList<>();
        this.trajetos = new ArrayList<>();
        this.jornadas = new ArrayList<>();
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public List<Motorista> getMotoristas() {
        return motoristas;
    }

    public List<Cobrador> getCobradores() {
        return cobradores;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public List<PontoDeParada> getPontosDeParada() {
        return pontosDeParada;
    }

    public List<Trecho> getTrechos() {
        return trechos;
    }

    public List<Trajeto> getTrajetos() {
        return trajetos;
    }

    public List<Jornada> getJornadas() {
        return jornadas;
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void cadastrarMotorista(Motorista motorista) {
        motoristas.add(motorista);
    }

    public void cadastrarCobrador(Cobrador cobrador) {
        cobradores.add(cobrador);
    }

    public void cadastrarPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
    }

    public void cadastrarPontoDeParada(PontoDeParada pontoDeParada) {
        pontosDeParada.add(pontoDeParada);
    }

    public void cadastrarTrecho(Trecho trecho) {
        trechos.add(trecho);
    }

    public void cadastrarTrajeto(Trajeto trajeto) {
        trajetos.add(trajeto);
    }

    public void registrarJornada(Jornada jornada) {
        jornadas.add(jornada);
    }

    public void registrarInicioDeTrajeto(Jornada jornada, Date dataHoraInicio) {
        jornada.registrarInicio(dataHoraInicio);
    }

    public void registrarPassageiroEmbarcado(Passageiro passageiro, PontoDeParada pontoDeEmbarque, Cartao cartao) {
        if (passageiros.contains(passageiro) && pontosDeParada.contains(pontoDeEmbarque)) {
            Embarque embarque = new Embarque(new Date(), pontoDeEmbarque, cartao);
            passageiro.adicionarEmbarque(embarque);
        }
    }

    public void registrarCheckpoint(Jornada jornada, Checkpoint checkpoint) {
        jornada.registrarCheckpoint(checkpoint);
    }

    public void salvarDados() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dados.ser"))) {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SistemaTransporte carregarDados() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dados.ser"))) {
            return (SistemaTransporte) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new SistemaTransporte();
        }
    }
}

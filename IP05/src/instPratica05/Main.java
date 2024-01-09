package instPratica05;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SistemaTransporte sistemaTransporte = new SistemaTransporte();

        Veiculo veiculo = new Veiculo("ABC123", "Ônibus");
        Motorista motorista = new Motorista("João");
        Cobrador cobrador = new Cobrador("Maria");
        Passageiro passageiro = new Passageiro("Alice", "Estudante");
        PontoDeParada pontoDeParada = new PontoDeParada("Parada 1");
        Trecho trecho = new Trecho(pontoDeParada, pontoDeParada, 30);
        Trajeto trajeto = new Trajeto(veiculo, motorista, cobrador);
        Jornada jornada = new Jornada(motorista, veiculo, trajeto);
        Checkpoint checkpoint = new Checkpoint(new Date(), pontoDeParada);

        sistemaTransporte.cadastrarVeiculo(veiculo);
        sistemaTransporte.cadastrarMotorista(motorista);
        sistemaTransporte.cadastrarCobrador(cobrador);
        sistemaTransporte.cadastrarPassageiro(passageiro);
        sistemaTransporte.cadastrarPontoDeParada(pontoDeParada);
        sistemaTransporte.cadastrarTrecho(trecho);
        sistemaTransporte.cadastrarTrajeto(trajeto);

        sistemaTransporte.registrarJornada(jornada);
        sistemaTransporte.registrarInicioDeTrajeto(jornada, new Date());
        sistemaTransporte.registrarPassageiroEmbarcado(passageiro, pontoDeParada, new Cartao("123456", "Estudante"));
        sistemaTransporte.registrarCheckpoint(jornada, checkpoint);

        System.out.println("Veículos cadastrados: " + sistemaTransporte.getVeiculos());
        System.out.println("Motoristas cadastrados: " + sistemaTransporte.getMotoristas());
        System.out.println("Cobradores cadastrados: " + sistemaTransporte.getCobradores());
        System.out.println("Passageiros cadastrados: " + sistemaTransporte.getPassageiros());
        System.out.println("Pontos de Parada cadastrados: " + sistemaTransporte.getPontosDeParada());
        System.out.println("Trechos cadastrados: " + sistemaTransporte.getTrechos());
        System.out.println("Trajetos cadastrados: " + sistemaTransporte.getTrajetos());
        System.out.println("Jornadas cadastradas: " + sistemaTransporte.getJornadas());
    }
}

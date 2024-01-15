package instPratica05;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        SistemaTransporte sistemaTransporte = SistemaTransporte.carregarDados();

        Veiculo veiculo = new Veiculo("ABC123", "Ônibus");
        Motorista motorista = new Motorista("João Motorista");
        Cobrador cobrador = new Cobrador("Maria Cobradora");
        PontoDeParada pontoA = new PontoDeParada("Ponto A");
        PontoDeParada pontoB = new PontoDeParada("Ponto B");
        Trecho trechoAB = new Trecho(pontoA, pontoB, 30);
        Trajeto trajeto = new Trajeto(veiculo, motorista, cobrador);
        trajeto.adicionarTrecho(trechoAB);

        sistemaTransporte.cadastrarVeiculo(veiculo);
        sistemaTransporte.cadastrarMotorista(motorista);
        sistemaTransporte.cadastrarCobrador(cobrador);
        sistemaTransporte.cadastrarPontoDeParada(pontoA);
        sistemaTransporte.cadastrarPontoDeParada(pontoB);
        sistemaTransporte.cadastrarTrecho(trechoAB);
        sistemaTransporte.cadastrarTrajeto(trajeto);

        Jornada jornada = new Jornada(motorista, veiculo, trajeto);
        sistemaTransporte.registrarJornada(jornada);

        sistemaTransporte.registrarInicioDeTrajeto(jornada, new Date());

        Passageiro passageiro = new Passageiro("Lucas", "Estudante");
        Cartao cartao = new Cartao("123456789", "Estudante");
        sistemaTransporte.cadastrarPassageiro(passageiro);
        sistemaTransporte.registrarPassageiroEmbarcado(passageiro, pontoA, cartao);

        Checkpoint checkpoint = new Checkpoint(new Date(), pontoB);
        sistemaTransporte.registrarCheckpoint(jornada, checkpoint);

        exibirInformacoesSistema(sistemaTransporte);

        sistemaTransporte.salvarDados();
    }

    private static void exibirInformacoesSistema(SistemaTransporte sistemaTransporte) {
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

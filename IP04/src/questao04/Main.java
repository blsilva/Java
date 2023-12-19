package questao04;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fusca", "Azul", 2022, 4);
        Moto minhaMoto = new Moto("CG 125", "Preto", 2021, true);

        Veiculo veiculo1 = meuCarro;
        Veiculo veiculo2 = minhaMoto;

        Garagem minhaGaragem = new Garagem(true);

        veiculo1.estacionar(minhaGaragem);
        veiculo2.estacionar(minhaGaragem);

        System.out.println("Número de portas do carro: " + ((Carro) veiculo1).getNumeroPortas());
        System.out.println("Partida elétrica da moto: " + ((Moto) veiculo2).hasPartidaEletrica());
    }
}

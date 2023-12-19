package questao03;

public class Main {
    public static void main(String[] args) {
 
        Carro meuCarro = new Carro("Fusca", "Azul", 2022, 4);
        Moto minhaMoto = new Moto("CG 125", "Preto", 2021, true);

        Veiculo veiculo1 = meuCarro;
        Veiculo veiculo2 = minhaMoto;

        veiculo1.ligar();
        veiculo1.acelerar();
        veiculo1.parar();

        veiculo2.ligar();
        veiculo2.acelerar();
        veiculo2.parar();

        System.out.println("Número de portas do carro: " + ((Carro) veiculo1).getNumeroPortas());
        System.out.println("Partida elétrica da moto: " + ((Moto) veiculo2).hasPartidaEletrica());
    }
}
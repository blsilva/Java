package questao04;

public class Moto extends Veiculo {
    private boolean partidaEletrica;

    public Moto(String modelo, String cor, int ano, boolean partidaEletrica) {
        super(modelo, cor, ano, false); 
        this.partidaEletrica = partidaEletrica;
    }

    public boolean hasPartidaEletrica() {
        return partidaEletrica;
    }
}

package questao04;

import java.util.ArrayList;
import java.util.List;

public class Garagem {
    private List<Veiculo> veiculos;
    private boolean tomada;

    public Garagem(boolean tomada) {
        this.veiculos = new ArrayList<>();
        this.tomada = tomada;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void removerVeiculo(Veiculo veiculo) {
        veiculos.remove(veiculo);
    }

    public boolean temTomada() {
        return tomada;
    }
}

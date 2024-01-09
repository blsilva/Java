package instPratica05;

import java.util.ArrayList;
import java.util.List;

public class Passageiro {
    private String nome;
    private String tipoCartao;
    private List<Embarque> embarques;

    public Passageiro(String nome, String tipoCartao) {
        this.nome = nome;
        this.tipoCartao = tipoCartao;
        this.embarques = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    public List<Embarque> getEmbarques() {
        return embarques;
    }

    public void adicionarEmbarque(Embarque embarque) {
        embarques.add(embarque);
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "nome='" + nome + '\'' +
                ", tipoCartao='" + tipoCartao + '\'' +
                ", embarques=" + embarques +
                '}';
    }
}

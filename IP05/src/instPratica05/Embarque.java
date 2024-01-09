package instPratica05;

import java.util.Date;

public class Embarque {
    private Date dataHoraEmbarque;
    private PontoDeParada pontoDeEmbarque;
    private Cartao cartao;

    public Embarque(Date dataHoraEmbarque, PontoDeParada pontoDeEmbarque, Cartao cartao) {
        this.dataHoraEmbarque = dataHoraEmbarque;
        this.pontoDeEmbarque = pontoDeEmbarque;
        this.cartao = cartao;
    }

    public Date getDataHoraEmbarque() {
        return dataHoraEmbarque;
    }

    public void setDataHoraEmbarque(Date dataHoraEmbarque) {
        this.dataHoraEmbarque = dataHoraEmbarque;
    }

    public PontoDeParada getPontoDeEmbarque() {
        return pontoDeEmbarque;
    }

    public void setPontoDeEmbarque(PontoDeParada pontoDeEmbarque) {
        this.pontoDeEmbarque = pontoDeEmbarque;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    @Override
    public String toString() {
        return "Embarque{" +
                "dataHoraEmbarque=" + dataHoraEmbarque +
                ", pontoDeEmbarque=" + pontoDeEmbarque +
                ", cartao=" + cartao +
                '}';
    }
}

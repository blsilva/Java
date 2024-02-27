package jornada;

import java.io.Serializable;

public class Trecho implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private static int count = 0;
	private Ponto partida;
	private Ponto destino;
	
	public Trecho(Ponto partida, Ponto destino) {
		count++;
		this.id = "T" + count;
		this.partida = partida;
		this.destino = destino;
	}
	
	public Trecho(String id, Ponto partida, Ponto destino) {
		count++;
		this.id = id;
		this.partida = partida;
		this.destino = destino;
	}
	
	public String getId() {
		return id;
	}
	public Ponto getPartida() {
		return partida;
	}
	protected void setPartida(Ponto partida) {
		this.partida = partida;
	}
	public Ponto getDestino() {
		return destino;
	}
	protected void setDestino(Ponto destino) {
		this.destino = destino;
	}
	public double getTempo() {
		return partida.tempoAte(destino);
	}
	@Override
    public String toString() {
        return "Trecho [id=" + id + ", partida=" + partida.getLocal() + ", destino=" + destino.getLocal() + "]";
    }
}

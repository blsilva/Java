package questao03;

class Veiculo {
    private String modelo;
    private String cor;
    private int ano;

    public Veiculo(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void acelerar() {
        System.out.println("Veículo acelerando");
    }

    public void ligar() {
        System.out.println("Veículo ligado");
    }

    public void parar() {
        System.out.println("Veículo parado");
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }
}

class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String modelo, String cor, int ano, int numeroPortas) {
        super(modelo, cor, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void ligar() {
        System.out.println("Carro ligado");
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando");
    }

    @Override
    public void parar() {
        System.out.println("Carro parado");
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }
}

class Moto extends Veiculo {
    private boolean partidaEletrica;

    public Moto(String modelo, String cor, int ano, boolean partidaEletrica) {
        super(modelo, cor, ano);
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public void ligar() {
        System.out.println("Moto ligada");
    }

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando");
    }

    @Override
    public void parar() {
        System.out.println("Moto parada");
    }

    public boolean hasPartidaEletrica() {
        return partidaEletrica;
    }
}




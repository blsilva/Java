package caixaEletronico.semChec;

class ValorInvalidoException extends Exception {
    public ValorInvalidoException(String mensagem) {
        super(mensagem);
    }
}

class CaixaEletronicoChecado {
    private static int saldo = 1000;

    public static void sacar(int valor) throws ValorInvalidoException {
        if (valor % 10 != 0) {
            throw new ValorInvalidoException("Valor inválido. O valor deve ser múltiplo de 10.");
        }

        if (valor > saldo) {
            throw new ValorInvalidoException("Saldo insuficiente no caixa.");
        }

        saldo -= valor;

        System.out.println("Saque de " + valor + " realizado com sucesso. Saldo restante: " + saldo);
    }
}

public class CaixaEletronico {
    public static void main(String[] args) {
        try {
            CaixaEletronicoChecado.sacar(30);
        } catch (ValorInvalidoException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }
    }
}

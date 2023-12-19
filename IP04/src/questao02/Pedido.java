package questao02;

import java.util.ArrayList;

class ItemPedido {
    String descricao;
    double preco;

    public ItemPedido(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }
}

public class Pedido {
    int numeroPedido;
    String cpfCliente;
    ArrayList<ItemPedido> itens = new ArrayList<>();

    public Pedido(int numeroPedido, String cpfCliente) {
        this.numeroPedido = numeroPedido;
        this.cpfCliente = cpfCliente;
    }

    public void adicionarItem(String descricao, double preco) {
        itens.add(new ItemPedido(descricao, preco));
    }

    public void adicionarItens(ArrayList<ItemPedido> listaItens) {
        itens.addAll(listaItens);
    }

    public double calcularTotal(double percentualDesconto) {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.preco;
        }

        total -= total * (percentualDesconto / 100.0);
        return total;
    }

    public double calcularTotal(int numeroPrestacoes, double taxaJuros) {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.preco;
        }
  
        total += total * (taxaJuros / 100.0);
  
        total /= numeroPrestacoes;
        return total;
    }

    public void exibirInformacoes() {
        System.out.println("Número do Pedido: " + numeroPedido);
        System.out.println("CPF do Cliente: " + cpfCliente);
        System.out.println("Itens do Pedido:");

        for (ItemPedido item : itens) {
            System.out.println("  - " + item.descricao + ": R$ " + item.preco);
        }
    }

    public static void main(String[] args) {
   
        Pedido pedidoComDesconto = new Pedido(1, "123.456.789-00");
        pedidoComDesconto.adicionarItem("Produto 1", 50.0);
        pedidoComDesconto.adicionarItem("Produto 2", 30.0);

        double descontoPercentual = 10.0;
        double totalComDesconto = pedidoComDesconto.calcularTotal(descontoPercentual);

        System.out.println("Pedido com Desconto à Vista:");
        pedidoComDesconto.exibirInformacoes();
        System.out.println("Total com " + descontoPercentual + "% de desconto: R$ " + totalComDesconto);

        Pedido pedidoAPrazo = new Pedido(2, "987.654.321-00");
        pedidoAPrazo.adicionarItem("Produto 3", 40.0);
        pedidoAPrazo.adicionarItem("Produto 4", 25.0);

        int numeroPrestacoes = 3;
        double taxaJuros = 5.0;
        double totalAPrazo = pedidoAPrazo.calcularTotal(numeroPrestacoes, taxaJuros);

        System.out.println("\nPedido a Prazo:");
        pedidoAPrazo.exibirInformacoes();
        System.out.println("Total a Prazo (" + numeroPrestacoes + " prestações, " + taxaJuros + "% de juros): R$ " + totalAPrazo);
    }
}

package conversorMoedas;

import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a taxa de câmbio (por exemplo, de dólares para euros): ");
        double taxaDeCambio = scanner.nextDouble();

        System.out.print("Digite a quantidade em dólares: ");
        double quantidadeEmDolares = scanner.nextDouble();

        double valorConvertido = quantidadeEmDolares * taxaDeCambio;

        System.out.println("O valor convertido é: " + valorConvertido);

        scanner.close();
    }
}

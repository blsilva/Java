package instrPrat03;

import java.util.Scanner;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int dividendo, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }
        return dividendo / divisor;
    }

    public float dividir(float dividendo, float divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }
        return dividendo / divisor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.print("Digite o primeiro número: ");
        float num1 = scanner.nextFloat();

        System.out.print("Digite o segundo número: ");
        float num2 = scanner.nextFloat();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int escolha = scanner.nextInt();

        try {
            switch (escolha) {
                case 1:
                    System.out.println("Resultado: " + calculadora.somar((int) num1, (int) num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + calculadora.subtrair((int) num1, (int) num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + calculadora.multiplicar((int) num1, (int) num2));
                    break;
                case 4:
                    // Identificar o tipo de número e utilizar o método de divisão adequado
                    if (num1 == (int) num1 && num2 == (int) num2) {
                        System.out.println("Resultado: " + calculadora.dividir((int) num1, (int) num2));
                    } else {
                        System.out.println("Resultado: " + calculadora.dividir(num1, num2));
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } catch (DivisionByZeroException e) {
            System.err.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

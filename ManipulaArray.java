package manipulaArray;

import java.util.Scanner;
import java.util.Random;

public class ManipulaArray {
    public static void main(String[] args) {
     
        int[] arrayLido = lerArrayDoUsuario();
        exibirArray(arrayLido);

        int[] arrayAleatorio = criarArrayAleatorio(5, 1, 100);
        exibirArray(arrayAleatorio);

        int[] arrayCombinado = combinarArrays(arrayLido, arrayAleatorio);
        exibirArray(arrayCombinado);

        int soma = calcularSoma(arrayCombinado);
        System.out.println("Soma dos elementos: " + soma);

        int maiorValor = encontrarMaiorValor(arrayCombinado);
        System.out.println("Maior valor: " + maiorValor);

        int menorValor = encontrarMenorValor(arrayCombinado);
        System.out.println("Menor valor: " + menorValor);
    }

    public static int[] lerArrayDoUsuario() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite o tamanho do array: ");
			int tamanho = scanner.nextInt();

			int[] array = new int[tamanho];

			System.out.println("Digite os elementos do array:");
			for (int i = 0; i < tamanho; i++) {
			    System.out.print("Elemento " + (i + 1) + ": ");
			    array[i] = scanner.nextInt();
			}

			return array;
		}
    }

    public static int[] criarArrayAleatorio(int tamanho, int valorMinimo, int valorMaximo) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo;
        }

        return array;
    }

    public static int[] combinarArrays(int[] array1, int[] array2) {
        int[] arrayCombinado = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, arrayCombinado, 0, array1.length);
        System.arraycopy(array2, 0, arrayCombinado, array1.length, array2.length);

        return arrayCombinado;
    }

    public static int calcularSoma(int[] array) {
        int soma = 0;

        for (int elemento : array) {
            soma += elemento;
        }

        return soma;
    }

    public static int encontrarMaiorValor(int[] array) {
        int maior = array[0];

        for (int elemento : array) {
            if (elemento > maior) {
                maior = elemento;
            }
        }

        return maior;
    }

    public static int encontrarMenorValor(int[] array) {
        int menor = array[0];

        for (int elemento : array) {
            if (elemento < menor) {
                menor = elemento;
            }
        }

        return menor;
    }

    public static void exibirArray(int[] array) {
        System.out.print("Array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

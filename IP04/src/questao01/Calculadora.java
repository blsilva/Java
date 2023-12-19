package questao01;

import java.util.ArrayList;

public class Calculadora {

    public static int somar(int a, int b) {
        return a + b;
    }

    public static float somar(float a, float b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static float subtrair(float a, float b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static float multiplicar(float a, float b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: Divisão por zero.");
            return 0;
        }
    }

    public static float dividir(float a, float b) {
        if (b != 0.0f) {
            return a / b;
        } else {
            System.out.println("Erro: Divisão por zero.");
            return 0.0f;
        }
    }

    public static int somarListaInteiros(ArrayList<Integer> lista) {
        int resultado = 0;
        for (int numero : lista) {
            resultado += numero;
        }
        return resultado;
    }

    public static float somarListaFloats(ArrayList<Float> lista) {
        float resultado = 0.0f;
        for (float numero : lista) {
            resultado += numero;
        }
        return resultado;
    }

    public static int multiplicarListaInteiros(ArrayList<Integer> lista) {
        int resultado = 1;
        for (int numero : lista) {
            resultado *= numero;
        }
        return resultado;
    }

    public static float multiplicarListaFloats(ArrayList<Float> lista) {
        float resultado = 1.0f;
        for (float numero : lista) {
            resultado *= numero;
        }
        return resultado;
    }

    public static void main(String[] args) {
     
        System.out.println("Soma (int): " + somar(5, 3));
        System.out.println("Soma (float): " + somar(5.5f, 3.2f));
        System.out.println("Subtração (int): " + subtrair(5, 3));
        System.out.println("Subtração (float): " + subtrair(5.5f, 3.2f));
        System.out.println("Multiplicação (int): " + multiplicar(5, 3));
        System.out.println("Multiplicação (float): " + multiplicar(5.5f, 3.2f));
        System.out.println("Divisão (int): " + dividir(6, 2));
        System.out.println("Divisão (float): " + dividir(6.0f, 2.0f));

        ArrayList<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(2);
        listaInteiros.add(3);
        listaInteiros.add(4);

        ArrayList<Float> listaFloats = new ArrayList<>();
        listaFloats.add(2.5f);
        listaFloats.add(3.5f);
        listaFloats.add(4.5f);

        System.out.println("Soma da lista (int): " + somarListaInteiros(listaInteiros));
        System.out.println("Soma da lista (float): " + somarListaFloats(listaFloats));
        System.out.println("Multiplicação da lista (int): " + multiplicarListaInteiros(listaInteiros));
        System.out.println("Multiplicação da lista (float): " + multiplicarListaFloats(listaFloats));
    }
}

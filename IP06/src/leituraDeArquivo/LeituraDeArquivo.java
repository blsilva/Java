package leituraDeArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraDeArquivo {
    public static void main(String[] args) {

        String nomeArquivo = "entrada.txt";

        try {
            FileReader fileReader = new FileReader(nomeArquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

            bufferedReader.close();
        } catch (IOException e) {

            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}


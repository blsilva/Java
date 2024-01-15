package copiaDeArquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiaDeArquivo {
    public static void main(String[] args) {

        String nomeArquivoOrigem = "origem.txt";
        String nomeArquivoDestino = "destino.txt";

        try {
            FileReader fileReader = new FileReader(nomeArquivoOrigem);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(nomeArquivoDestino);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                bufferedWriter.write(linha);
                bufferedWriter.newLine();
            }

            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("Conteúdo do arquivo " + nomeArquivoOrigem + " copiado para " + nomeArquivoDestino);
        } catch (IOException e) {
            System.err.println("Erro ao copiar o arquivo: " + e.getMessage());
        }
    }
}

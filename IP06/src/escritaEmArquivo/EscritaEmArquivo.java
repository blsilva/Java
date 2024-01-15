package escritaEmArquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscritaEmArquivo {
    public static void main(String[] args) {

        String nomeArquivoSaida = "saida.txt";

        try {
            FileWriter fileWriter = new FileWriter(nomeArquivoSaida);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite as linhas de texto (digite 'fim' para encerrar):");

            String linha;
            while (!(linha = scanner.nextLine()).equalsIgnoreCase("fim")) {
        
                bufferedWriter.write(linha);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            scanner.close();

            System.out.println("Linhas gravadas com sucesso no arquivo " + nomeArquivoSaida);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}

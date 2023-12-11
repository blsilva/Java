package manipArquivos.semChec;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ArquivoNaoEncontradoException extends RuntimeException {
    public ArquivoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}

class ManipulacaoArquivo {
    public static void verificarArquivo(String nomeArquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
 
        } catch (IOException e) {
            throw new ArquivoNaoEncontradoException("Arquivo não encontrado: " + nomeArquivo);
        }
    }
}

class PersistenciaNaoChecada {
    public static void lerDados(String nomeArquivo) {
        try {
            ManipulacaoArquivo.verificarArquivo(nomeArquivo);

            System.out.println("Leitura de dados realizada com sucesso.");
        } catch (ArquivoNaoEncontradoException e) {
    
            System.out.println("Erro ao ler dados: " + e.getMessage());
        }
    }
}

public class MainNaoChecada {
    public static void main(String[] args) {
        PersistenciaNaoChecada.lerDados("arquivo_inexistente.txt");
    }
}

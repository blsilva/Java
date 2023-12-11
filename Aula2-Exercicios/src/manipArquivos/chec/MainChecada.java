package manipArquivos.chec;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ArquivoNaoEncontradoException extends Exception {
    public ArquivoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}

class ManipulacaoArquivo {
    public static void verificarArquivo(String nomeArquivo) throws ArquivoNaoEncontradoException {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
    
        } catch (IOException e) {
            throw new ArquivoNaoEncontradoException("Arquivo não encontrado: " + nomeArquivo);
        }
    }
}

class PersistenciaChecada {
    public static void lerDados(String nomeArquivo) throws ArquivoNaoEncontradoException {
        ManipulacaoArquivo.verificarArquivo(nomeArquivo);

        System.out.println("Leitura de dados realizada com sucesso.");
    }
}

public class MainChecada {
    public static void main(String[] args) {
        try {
            PersistenciaChecada.lerDados("arquivo.txt");
        } catch (ArquivoNaoEncontradoException e) {
            System.out.println("Erro ao ler dados: " + e.getMessage());
        }
    }
}

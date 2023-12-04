Em Java, as exceções são divididas em duas categorias principais: exceções verificadas (checked exceptions) e exceções não verificadas (unchecked exceptions). A distinção entre elas está relacionada ao momento em que o compilador verifica se o código que lida com a exceção está presente.

#Exceções Verificadas (Checked Exceptions):
- São exceções que o compilador exige que o programador lide explicitamente.
- Geralmente derivam da classe Exception (ou suas subclasses, exceto RuntimeException e suas subclasses).
- Obriga o uso de um bloco try-catch ou a declaração throws no método.
- Exemplos comuns incluem IOException, FileNotFoundException, SQLException, entre outros.
Exemplo de exceção verificada (IOException):

```
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExcecaoVerificadaExemplo {
    public static void main(String[] args) {
        try {
            lerArquivo("arquivo.txt");
        } catch (IOException e) {
            System.err.println("Erro de leitura: " + e.getMessage());
        }
    }

    public static void lerArquivo(String nomeArquivo) throws IOException {
        BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
        String linha = leitor.readLine();
        System.out.println("Conteúdo do arquivo: " + linha);
        leitor.close();
    }
} 
```
##Exceções Não Verificadas (Unchecked Exceptions):
- São exceções que o compilador não verifica se o programador lida explicitamente.
- Geralmente derivam da classe RuntimeException (ou suas subclasses).
- Podem ser tratadas opcionalmente e geralmente indicam erros de programação, como divisão por zero, acesso a índices inválidos em arrays, entre outros.
Exemplo de exceção não verificada (ArithmeticException):

```
public class ExcecaoNaoVerificadaExemplo {
    public static void main(String[] args) {
        try {
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Erro de divisão por zero: " + e.getMessage());
        }
    }

    public static int dividir(int numerador, int denominador) {
        return numerador / denominador;
    }
}
```
package validadorIdade.chec;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CadastroCliente {
    public static void main(String[] args) throws IdadeInvalidaException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a data de nascimento (DD/MM/AAAA): ");
            String dataNascimento = scanner.next();

            int idade = calcularIdade(dataNascimento);
            ValidadorIdade.validarIdade(idade);

            System.out.println("Cadastro do cliente realizado com sucesso!");
            System.out.println("Idade do cliente: " + idade + " anos");
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro ao cadastrar o cliente: " + e.getMessage());
            throw e; 
        }
    }

    public static int calcularIdade(String dataNascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNasc = LocalDate.parse(dataNascimento, formatter);
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNasc, dataAtual);
        return periodo.getYears();
    }
}

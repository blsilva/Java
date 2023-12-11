package validadorIdade.chec;

public class ValidadorIdade {
    public static void validarIdade(int idade) throws IdadeInvalidaException {
        if (idade < 0 || idade > 150) {
            throw new IdadeInvalidaException("Idade inválida. A idade deve estar entre 0 e 150.");
        }
    }
}


package Security.Validadores;

public class ValidadorPrimerLetraMayuscula implements Validador{
    @Override
    public boolean esValido(String password) {
        return Character.isUpperCase(password.charAt(0));
    }
}

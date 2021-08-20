package Security.Validadores;


public class ValidadorNull implements Validador{
    @Override
    public boolean esValido(String password) {
        return password.isEmpty();
    }
}

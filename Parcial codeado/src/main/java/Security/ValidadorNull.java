package Security;


public class ValidadorNull implements Validador{
    @Override
    public boolean esValido(String password) {
        if (password.isEmpty()) {
            return false;
        }
        else {
            return true;
        }
    }
}

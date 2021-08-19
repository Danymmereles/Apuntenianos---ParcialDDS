package Security;

public class ValidadorNull implements Validador{
    @Override
    public boolean esValido(String password) {
        if (password.isEmpty()) {
            //throw new NullException();
            return false;
        }
        else {
            return true;
    }
}

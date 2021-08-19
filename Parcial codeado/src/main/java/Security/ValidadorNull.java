package Security;

public class ValidadorNull implements Validador{
    @java.lang.Override
    public boolean esValido(String password) {
        if (password.isEmpty()) {
            //throw new NullException();
            return false;
        }
        else {
            return true;
    }
}

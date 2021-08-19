package Security;

public class ValidadorTamanio implements Validador{
    @java.lang.Override
    public boolean esValido(String password) {
        int tamanioPassword = password.length();

        if (tamanioPassword > 10) {
            return true;
        }
        else {
            //throw new TamanioException();
            return false;
        }
    }
}

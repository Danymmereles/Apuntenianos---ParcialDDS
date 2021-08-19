package Security.Validadores;

public class ValidadorTamanio implements Validador{
    @java.lang.Override
    public boolean esValido(String password) {
        int tamanioPassword = password.length();

        if (tamanioPassword > 10) {
            return true;
        }
        else {
            return false;
        }
    }
}

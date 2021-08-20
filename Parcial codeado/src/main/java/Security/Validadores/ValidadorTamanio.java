package Security.Validadores;

public class ValidadorTamanio implements Validador{

    @java.lang.Override
    public boolean esValido(String password) {

        return password.length() > 10;

    }


}

package Security.Validadores;

public class ValidadorConNumero implements Validador{
    @Override
    public boolean esValido(String password) {
        for (int i = 0; i<password.length();i++){
            if (Character.isDigit(password.charAt(i))){
                return true;
            }
        }
        return false;
    }
}

package Security.Validadores;

import java.util.Arrays;
import java.util.List;

public class ValidadoresEnAccion {

    private final List<Validador> AValidar;

    public ValidadoresEnAccion() {
        this.AValidar = Arrays.asList( new ValidadorNull(), new ValidadorTamanio(), new ValidadorConNumero(), new ValidadorPrimerLetraMayuscula());
    }

    public boolean esValida(String password) {
        return AValidar.stream().allMatch(validador -> validador.esValido(password));
    }

}

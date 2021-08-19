package Security;

import Security.Validadores.Validador;
import Security.Validadores.ValidadorNull;
import Security.Validadores.ValidadorTamanio;
import java.util.Arrays;
import java.util.List;

public class ValidadoresEnAccion {

    private final List<Validador> AValidar;

    public ValidadoresEnAccion() {
        this.AValidar = Arrays.asList( new ValidadorNull(), new ValidadorTamanio());
    }

    public boolean esValida(String password) {
        return AValidar.stream().allMatch(validador -> validador.esValido(password));
    }

}

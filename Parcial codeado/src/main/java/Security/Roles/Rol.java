package Security.Roles;

public interface Rol {
    boolean puedeComentar ();
    boolean puedeEnviarApunte ();
    boolean puedeHacerAdministradores();
    boolean puedeAdministrarApuntes();
    boolean puedeEnviarSugerencia();
}

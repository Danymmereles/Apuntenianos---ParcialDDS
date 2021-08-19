package Security.Roles;

public class Apunteniano implements Rol{

    @Override
    public boolean puedeComentar() {
        return true;
    }

    @Override
    public boolean puedeAdministrarApuntes() {
        return false;
    }

    @Override
    public boolean puedeHacerAdministradores() {
        return false;
    }

    @Override
    public boolean puedeEnviarSugerencia() {
        return true;
    }

    @Override
    public boolean puedeEnviarApunte() {
        return true;
    }

    @Override
    public boolean puedenHacerModeradores() {
        return false;
    }
}

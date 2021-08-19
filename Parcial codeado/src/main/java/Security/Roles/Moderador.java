package Security.Roles;

public class Moderador implements Rol{

    @Override
    public boolean puedeEnviarApunte() {
        return true;
    }

    @Override
    public boolean puedeEnviarSugerencia() {
        return true;
    }

    @Override
    public boolean puedeHacerAdministradores() {
        return false;
    }

    @Override
    public boolean puedeAdministrarApuntes() {
        return true;
    }

    @Override
    public boolean puedeComentar() {
        return true;
    }

}

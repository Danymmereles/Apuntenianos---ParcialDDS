package Security.Roles;

public class Administrador implements Rol{

    @Override
    public boolean puedeComentar() {
        return true;
    }

    @Override
    public boolean puedeAdministrarApuntes() {
        return true;
    }

    @Override
    public boolean puedeHacerAdministradores() {
        return true;
    }

    @Override
    public boolean puedeEnviarSugerencia() {
        return false;
    }

    @Override
    public boolean puedeEnviarApunte() {
        return true;
    }

    @Override
    public boolean puedenHacerModeradores() {
        return true;
    }

    @Override
    public boolean puedeBannear() {
        return true;
    }
}

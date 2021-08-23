package Security.Roles;

public class Visitante implements Rol{

    @Override
    public boolean puedeEnviarApunte() {
        return false;
    }

    @Override
    public boolean puedeEnviarSugerencia() {
        return false;
    }

    @Override
    public boolean puedeHacerAdministradores() {
        return false;
    }

    @Override
    public boolean puedeAdministrarApuntes() {
        return false;
    }

    @Override
    public boolean puedeComentar() {
        return false;
    }

    @Override
    public boolean puedenHacerModeradores() {
        return false;
    }

    @Override
    public boolean puedeBannear() {
        return false;
    }
}

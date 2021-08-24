package Security.Roles;

public class Apunteniano implements Rol{

    private static Apunteniano usuarioComun = null;

    public static Apunteniano getInstance(){
        if(usuarioComun== null){
            usuarioComun = new Apunteniano();
        }
        return usuarioComun;
    }

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

    @Override
    public boolean puedeBannear() {
        return false;
    }
}

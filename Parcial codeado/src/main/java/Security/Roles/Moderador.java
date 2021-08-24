package Security.Roles;

public class Moderador implements Rol{

    private static Moderador mod = null;

    public static Moderador getInstance (){
        if(mod== null){
            mod = new Moderador();
        }
        return mod;
    }

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

    @Override
    public boolean puedenHacerModeradores() {
        return true;
    }

    @Override
    public boolean puedeBannear() {
        return true;
    }
}

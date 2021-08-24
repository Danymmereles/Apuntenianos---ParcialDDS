package Security.Roles;

import Bussiness.Diccionario;

public class Administrador implements Rol{

    private static Administrador admi = null;

    public static Administrador getInstance (){
        if(admi== null){
            admi = new Administrador();
        }
        return admi;
    }

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

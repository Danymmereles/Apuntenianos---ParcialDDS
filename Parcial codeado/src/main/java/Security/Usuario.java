package Security;

import Bussiness.Persona;
import Security.Roles.Apunteniano;
import Security.Roles.Rol;
import Security.Roles.Visitante;
import Security.Validadores.ValidadoresEnAccion;

public class Usuario {

    //ATRIBUTOS ----------------------------------------------------------
    private String nombreUsuario;
    private String password;
    private Rol rol;
    private Persona persona;

    //CONSTRUCTOR ----------------------------------------------------------
    public Usuario(String usuario, String supuestaClave, Persona aRegistrar){

        this.nombreUsuario = usuario;

        if(new ValidadoresEnAccion().esValida(supuestaClave)){
            this.password = supuestaClave;
        } else {
            this.password = "";
        }

        this.rol = new Apunteniano();
        this.persona = aRegistrar;
    }

    public Usuario(){
        this.nombreUsuario = "visitante";
        this.password = "";
        this.rol = new Visitante();
        this.persona = new Persona("SinNombre");
    }

    //GETTERS ----------------------------------------------------------
    public String getNombreUsuario(){
        return nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public Rol getRol() {
        return rol;
    }

    public Persona getPersona() {
        return persona;
    }

    //SETTERS ----------------------------------------------------------
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setPassword(String password) {
        if(new ValidadoresEnAccion().esValida(password)){
            this.password = password;
        }
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}

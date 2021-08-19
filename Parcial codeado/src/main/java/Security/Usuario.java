package Security;

import Security.Roles.Apunteniano;
import Security.Roles.Rol;
import Security.Roles.Visitante;

public class Usuario {

    //ATRIBUTOS ----------------------------------------------------------
    private String nombreUsuario;
    private String password;
    private Rol rol;

    //CONSTRUCTOR ----------------------------------------------------------
    public Usuario(String usuario, String supuestaClave){
        if(new ValidadoresEnAccion().esValida(supuestaClave)){
            this.nombreUsuario = usuario;
            this.password = supuestaClave;
            this.rol = new Apunteniano();
        }
    }

    public Usuario(){
        this.nombreUsuario = "visitante";
        this.password = "";
        this.rol = new Visitante();
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

    //SETTERS ----------------------------------------------------------
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

}

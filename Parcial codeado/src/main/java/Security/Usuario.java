package Security;

import Security.Roles.Rol;


public class Usuario {

    //ATRIBUTOS ----------------------------------------------------------
    private String nombreUsuario;
    private String password;
    private Rol rol;

    //CONSTRUCTOR ----------------------------------------------------------
    public Usuario(String usuario, String contrasenia){
        if(new ValidadoresEnAccion().esValida(contrasenia)){
            this.nombreUsuario = usuario;
            this.password = contrasenia;
        }
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

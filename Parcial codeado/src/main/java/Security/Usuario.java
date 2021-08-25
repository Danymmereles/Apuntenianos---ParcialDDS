package Security;

import Bussiness.EstadosTrabajados.EstadoPersona;
import Bussiness.Persona;
import Database.DBUsuario;
import Security.Roles.Apunteniano;
import Security.Roles.Rol;
import Security.Roles.Visitante;
import Security.Validadores.ValidadoresEnAccion;

import java.time.LocalDate;

public class Usuario {

    //ATRIBUTOS ----------------------------------------------------------
    private String mail;
    private String password;
    private Rol rol;
    private Persona persona;

    //CONSTRUCTOR ----------------------------------------------------------
    public Usuario(String mail, String supuestaClave, Persona aRegistrar){

        this.mail = mail;

        if(new ValidadoresEnAccion().esValida(supuestaClave)){
            this.password = supuestaClave;
        } else {
            this.password = "";
        }

        this.rol = Apunteniano.getInstance();
        this.persona = aRegistrar;
        //DBUsuario.agregarUsuario(this);
    }

    public Usuario(){
        this.mail = "";
        this.password = "";
        this.rol = Visitante.getInstance();
        this.persona = new Persona("SinNombre");
    }

    //GETTERS ----------------------------------------------------------
    public String getMail() {
        return mail;
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
    public void setMail(String mail) {
        this.mail = mail;
        //DBUsuario.actualizarUsuario(this);
    }

    public void setPassword(String password) {
        if(new ValidadoresEnAccion().esValida(password)){
            this.password = password;
            //DBUsuario.actualizarUsuario(this);
        }
    }

    public void setRol(Rol rol) {
        this.rol = rol;
        //DBUsuario.actualizarUsuario(this);
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
        //DBUsuario.actualizarUsuario(this);
    }

    //METODOS PROPIOS ----------------------------------------------------------
    public boolean accesoLimitado (){
        return !(this.persona.getEstadoUsuario() == EstadoPersona.HABILITADO);
    }

    public void habilitarUsuario (){
        this.persona.setEstadoUsuario(EstadoPersona.HABILITADO);
    }

    public void deshabilitarUsuario (){
        if (puedeSuspenderse()){
            this.persona.setEstadoUsuario(EstadoPersona.INHABILITADO);
        }
    }

    public void banearUsuario (int dias){
        this.persona.setEstadoUsuario(EstadoPersona.BLOQUEADO);
        LocalDate diaActual = LocalDate.now();
        this.persona.setSuspension(diaActual.plusDays(dias));
    }

    public boolean sigueSuspendido (){
        LocalDate diaDeLaFecha = LocalDate.now();
        return this.persona.getSuspension().isAfter(diaDeLaFecha);
    }

    public boolean puedeSuspenderse (){
        return (this.rolUsuario().equals("Apunteniano"));
    }

    //METODOS AUXILIARES
    public String rolUsuario (){
        return this.rol.getClass().getName();
    }

}

package Bussiness;

import Bussiness.Apuntes.ApunteSubido;

import java.util.List;

public class Persona {

    //ATRIBUTOS ----------------------------------------------------------
    private String nombre;
    private List <Universidad> universidad;
    private List <String> carrera;
    private int cantApuntes;
    private List <ApunteSubido> apuntes;
    private List <Sugerencia> sugerenciasEnviadas;
    private EstadoPersona estadoUsuario;

    //GETTERS ----------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public EstadoPersona getEstadoUsuario() {
        return estadoUsuario;
    }

    public int getCantApuntes() {
        return cantApuntes;
    }

    public List<ApunteSubido> getApuntes() {
        return apuntes;
    }

    public List<Sugerencia> getSugerenciasEnviadas() {
        return sugerenciasEnviadas;
    }

    public List<Universidad> getUniversidad() {
        return universidad;
    }

    public List<String> getCarrera() {
        return carrera;
    }

    //SETTERS ----------------------------------------------------------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstadoUsuario(EstadoPersona estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    //los siguientes set no los agregue porque siempre va a ser progresivo
        //setApuntesSubidos
        //setCantApuntes
        //setSugerenciasEnviadas
        //setUniversidad
        //setCarrera

    //CONSTRUCTOR ----------------------------------------------------------
    public Persona (String suNombre){
        this.nombre = suNombre;
        this.estadoUsuario = EstadoPersona.BLOQUEADO;
        //Porque debe validarlo
    }

    //METODOS ----------------------------------------------------------
    public void realizarSugerencia (String descripcion){
        Sugerencia nuevaSugerencia = new Sugerencia(descripcion, this);
        sugerenciasEnviadas.add(nuevaSugerencia);
    }

    public void agregarApunte (ApunteSubido nuevoApunte){
        this.apuntes.add(nuevoApunte);
    }
    //Administrar apunte, en realidad son botones, nosotros tenemos que aprobarlos o no y eso es un metodo de apuntes

}

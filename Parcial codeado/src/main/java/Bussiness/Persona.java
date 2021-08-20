package Bussiness;

import Bussiness.Apuntes.ApunteSubido;

import java.util.List;

public class Persona {

    //ATRIBUTOS
    private String nombre;
    private List <Universidad> universidad;
    private List <String> carrera;
    private int cantApuntes;
    private List <ApunteSubido> apuntes;
    private List <Sugerencia> sugerenciasEnviadas;
    private Estado estadoUsuario;
    //El estado va aca o en security?

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public Estado getEstadoUsuario() {
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

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstadoUsuario(Estado estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    //los siguientes set no los agregue porque siempre va a ser progresivo
        //setApuntesSubidos
        //setCantApuntes
        //setSugerenciasEnviadas
        //setUniversidad
        //setCarrera

    //CONSTRUCTOR
    public Persona (String suNombre){
        this.nombre = suNombre;
    }
}

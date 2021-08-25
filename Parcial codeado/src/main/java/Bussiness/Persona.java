package Bussiness;

import Bussiness.Apuntes.ApunteSubido;
import Bussiness.EstadosTrabajados.EstadoPersona;

import java.time.LocalDate;
import java.util.List;

public class Persona {

    //ATRIBUTOS ----------------------------------------------------------
    private String nombre;
    private List <Universidad> universidad;
    private List <String> carrera;
    private List <ApunteSubido> apuntes;
    private List <Sugerencia> sugerenciasEnviadas;
    private EstadoPersona estadoUsuario;
    private LocalDate suspension;

    //GETTERS ----------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public EstadoPersona getEstadoUsuario() {
        return estadoUsuario;
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

    public LocalDate getSuspension() {
        return suspension;
    }

    //SETTERS ----------------------------------------------------------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstadoUsuario(EstadoPersona estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public void setSuspension(LocalDate suspension) {
        this.suspension = suspension;
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

    //METODOS PROPIOS ----------------------------------------------------------
    public void realizarSugerencia (String descripcion){
        Sugerencia nuevaSugerencia = new Sugerencia(descripcion, this);
        sugerenciasEnviadas.add(nuevaSugerencia);
    }

    public void agregarApunte (ApunteSubido nuevoApunte){
        this.apuntes.add(nuevoApunte);
    }

    public void eliminarApunte (ApunteSubido apunteAEliminar){
        this.apuntes.remove(apunteAEliminar);
    }

    public void editarUniversidad (Universidad universidad){
        if (this.universidad.contains(universidad)){
            this.universidad.remove(universidad);
        } else {
            this.universidad.add(universidad);
        }
    }

    public void editarCarrera (String carrera){
        if (this.carrera.contains(carrera)){
            this.carrera.remove(carrera);
        } else {
            this.carrera.add(carrera);
        }
    }

}

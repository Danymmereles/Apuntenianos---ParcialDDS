package Bussiness;

import Bussiness.EstadosTrabajados.Estado;

import java.util.List;

public class Sugerencia {

    //ATRIBUTOS ----------------------------------------------------------
    private Persona quienSugirio;
    private Estado situacion;
    private String descripcion;
    private List<Respuesta> respuestas;

    //GETTERS ----------------------------------------------------------
    public Estado getSituacion() {
        return situacion;
    }

    public Persona getQuienSugirio() {
        return quienSugirio;
    }

    public List<Respuesta> getRespuestas() {
        return respuestas;
    }

    //SETTERS ----------------------------------------------------------
    public void setQuienSugirio(Persona quienSugirio) {
        this.quienSugirio = quienSugirio;
    }

    public void setSituacion(Estado situacion) {
        this.situacion = situacion;
    }

    //CONSTRUCTOR ----------------------------------------------------------
    public Sugerencia(String descripcion, Persona sugeridor){
        this.descripcion = descripcion;
        this.quienSugirio = sugeridor;
        this.situacion = Estado.PENDIENTE;
    }

    //METODOS ----------------------------------------------------------
    public void realizarRespuesta (String mensaje, Persona responde){
        Respuesta aResponder = new Respuesta(mensaje, responde);
        this.respuestas.add(aResponder);
    }

    public void rechazarSugerencia (){
        this.situacion = Estado.DESAPROBADO;
    }

    public void cumplirSugerencia (){
        this.situacion = Estado.APROBADO;
    }

}

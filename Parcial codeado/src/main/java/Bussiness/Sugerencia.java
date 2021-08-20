package Bussiness;

public class Sugerencia {

    //ATRIBUTOS
    private Persona quienSugirio;
    private Estado situacion;

    //GETTERS
    public Estado getSituacion() {
        return situacion;
    }

    public Persona getQuienSugirio() {
        return quienSugirio;
    }

    //SETTERS
    public void setQuienSugirio(Persona quienSugirio) {
        this.quienSugirio = quienSugirio;
    }

    public void setSituacion(Estado situacion) {
        this.situacion = situacion;
    }

    //METODOS
    public Respuesta realizarRespuesta ( ){
        Respuesta aResponder = new Respuesta();
        return aResponder;
    }

}

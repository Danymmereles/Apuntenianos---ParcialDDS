package Bussiness;

public class Respuesta {

    //ATRIBUTOS ----------------------------------------------------------
    private String descripcion;
    private Persona quienResponde;

    //GETTERS ----------------------------------------------------------
    public Persona getQuienResponde() {
        return quienResponde;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //SETTERS ----------------------------------------------------------
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setQuienResponde(Persona quienResponde) {
        this.quienResponde = quienResponde;
    }

    //CONSTRUCTOR
    public Respuesta (String mensaje, Persona responde){
        this.descripcion = mensaje;
        this.quienResponde = responde;
    }

    //METODOS ----------------------------------------------------------
    //FIJARSE

}

package Bussiness;

public class Persona {

    //ATRIBUTOS
    private String nombre;

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //CONSTRUCTOR
    public Persona (String suNombre){
        this.nombre = suNombre;
    }
}

package Bussiness.Tematicas;

import Bussiness.Universidad;

public class Materia extends Tematica{

    //ATRIBUTOS ----------------------------------------------------------
    private String carrera;
    private Universidad universidad;

    //GETTERS ----------------------------------------------------------
    public Universidad getUniversidad() {
        return universidad;
    }

    public String getCarrera() {
        return carrera;
    }

    //SETTERS ----------------------------------------------------------
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    //CONSTRUCTOR ----------------------------------------------------------
    public Materia (String nombre, String carrera, Universidad universidad){
        this.nombre = nombre;
        this.carrera = carrera;
        this.universidad = universidad;
    }

}

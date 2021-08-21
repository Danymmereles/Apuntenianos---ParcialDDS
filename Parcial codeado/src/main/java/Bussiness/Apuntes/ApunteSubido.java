package Bussiness.Apuntes;

import Bussiness.Estado;
import Bussiness.Tematicas.Tematica;

public abstract class ApunteSubido {

    //ATRIBUTOS
    private Tematica temaApunte;
    private Estado situacion;

    //GETTERS
    public Estado getSituacion() {
        return situacion;
    }

    public Tematica getTemaApunte() {
        return temaApunte;
    }

    //SETTERS
    public void setSituacion(Estado situacion) {
        this.situacion = situacion;
    }

    public void setTemaApunte(Tematica temaApunte) {
        this.temaApunte = temaApunte;
    }

    //METODOS PROPIOS
    //FIJARSE

}

package Bussiness.Apuntes;

import Bussiness.EstadosTrabajados.Estado;
import Bussiness.Tematicas.Tematica;

public abstract class ApunteSubido {

    //ATRIBUTOS ----------------------------------------------------------
    protected Tematica temaApunte;
    protected Estado situacion;

    //GETTERS ----------------------------------------------------------
    public Estado getSituacion() {
        return situacion;
    }

    public Tematica getTemaApunte() {
        return temaApunte;
    }

    //SETTERS ----------------------------------------------------------
    public void setSituacion(Estado situacion) {
        this.situacion = situacion;
    }

    public void setTemaApunte(Tematica temaApunte) {
        this.temaApunte = temaApunte;
    }

    //METODOS PROPIOS ----------------------------------------------------------

}

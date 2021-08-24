package Bussiness.Apuntes;

import Bussiness.EstadosTrabajados.Estado;

import java.io.FileInputStream;

public class MiniApunte extends ApunteSubido{

    //ATRIBUTOS ----------------------------------------------------------
    //FALTAN
    private FileInputStream miDocumento;
    private int visualizaciones;

    //GETTERS ----------------------------------------------------------
    public FileInputStream getMiDocumento() {
        return miDocumento;
    }

    public int getVisualizaciones() {
        return visualizaciones;
    }

    //SETTERS ----------------------------------------------------------
    public void setMiDocumento(FileInputStream miDocumento) {
        this.miDocumento = miDocumento;
    }

    //CONSTRUCTOR ----------------------------------------------------------
    public MiniApunte(FileInputStream nuevoDocumento){
        this.miDocumento = nuevoDocumento;
        this.situacion = Estado.PENDIENTE;
        this.visualizaciones = 0;
    }

    //METODOS PROPIOS ----------------------------------------------------------
    public void aprobarApunte (){
        this.situacion = Estado.APROBADO;
    }

    public void desaprobarApunte (){
        this.situacion = Estado.DESAPROBADO;
    }

    public void seVio (){
        this.visualizaciones++;
    }

}

package Bussiness.Apuntes;

import Bussiness.EstadosTrabajados.Estado;

import java.io.FileInputStream;

public class MiniApunte extends ApunteSubido{

    //ATRIBUTOS ----------------------------------------------------------
    //FALTAN
    private FileInputStream miDocumento;

    //GETTERS ----------------------------------------------------------


    //SETTERS ----------------------------------------------------------


    //CONSTRUCTOR ----------------------------------------------------------
    public MiniApunte(){
            this.situacion = Estado.PENDIENTE;
    }

    //METODOS PROPIOS ----------------------------------------------------------
    public void aprobarApunte (){
        this.situacion = Estado.APROBADO;
    }

    public void desaprobarApunte (){
        this.situacion = Estado.DESAPROBADO;
    }

}

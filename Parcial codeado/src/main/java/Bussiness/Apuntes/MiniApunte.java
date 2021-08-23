package Bussiness.Apuntes;

import Bussiness.Estado;

public class MiniApunte extends ApunteSubido{

    //ATRIBUTOS ----------------------------------------------------------
    //FALTAN

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

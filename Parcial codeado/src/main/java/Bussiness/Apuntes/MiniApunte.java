package Bussiness.Apuntes;

import Bussiness.Estado;

public class MiniApunte extends ApunteSubido{
    @Override
    public Estado getSituacion() {
        return super.getSituacion();
    }

    public void aprobarApunte (){
        this.situacion = Estado.APROBADO;
    }
    public void desaprobarApunte (){
        this.situacion = Estado.DESAPROBADO;
    }

    public MiniApunte(){
        this.situacion = Estado.PENDIENTE;
    }
}

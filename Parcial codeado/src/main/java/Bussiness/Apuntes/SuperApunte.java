package Bussiness.Apuntes;

import Bussiness.Estado;
import Bussiness.Tematicas.Tematica;

import java.util.List;

public class SuperApunte extends ApunteSubido{

    //ATRIBUTOS
    private List<ApunteSubido> apuntecitos;

    //GETTER
    public List<ApunteSubido> getApuntecitos() {
        return apuntecitos;
    }

    //CONSTRUCTOR
    //PROBLEMAS
    
    public void administrarApunte (){

        int contadorPendientes = 0;

        for (ApunteSubido miniApunte : this.apuntecitos) {

            if (miniApunte.getSituacion() == Estado.DESAPROBADO){
                this.situacion = Estado.DESAPROBADO;
                return;
            }

            if (miniApunte.getSituacion() == Estado.PENDIENTE){
                contadorPendientes ++;
            }
        }

        if (contadorPendientes > 0){
            this.situacion = Estado.PENDIENTE;
        } else {
            this.situacion = Estado.APROBADO;
        }
    }
}

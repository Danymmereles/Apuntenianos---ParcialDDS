package Bussiness.Apuntes;

import Bussiness.EstadosTrabajados.Estado;

import javax.swing.*;

public class MiniApunte extends ApunteSubido{

    //ATRIBUTOS ----------------------------------------------------------
    //FALTAN
    JFileChooser miDocumento;

    //GETTERS ----------------------------------------------------------
    public JFileChooser getMiDocumento() {
        return miDocumento;
    }

    //SETTERS ----------------------------------------------------------
    public void setMiDocumento(JFileChooser miDocumento) {
        this.miDocumento = miDocumento;
    }

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

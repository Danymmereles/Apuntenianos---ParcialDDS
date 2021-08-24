package Bussiness;

import Bussiness.Apuntes.ApunteSubido;

import java.util.List;

public class Buscador {

    //METODOS PROPIOS ----------------------------------------------------------
    public List<ApunteSubido> buscarSegun (List<String> criterios){
        boolean encontroCurso = false;
        for (String aEvaluar: criterios) {
            if(Diccionario.getInstance().getCursosHabiles().contains(aEvaluar)){
                encontroCurso = true;
                continue;
            }
        }
        if (encontroCurso == true && criterios.size()>1){
            return null;
        }
        //CONEXION CON BASE DE DATOS -> JSON
        return null;
    }

}

package Bussiness;

import Bussiness.Apuntes.ApunteSubido;

import java.util.List;

public class Buscador {

    //METODOS PROPIOS ----------------------------------------------------------
    public List<ApunteSubido> buscarSegun (List<String> criterios){
        for (String aEvaluar: criterios) {
            if(Diccionario.getInstance().tenesEsteCurso(aEvaluar)){
                if (criterios.size()>1){
                    return null;
                }
            }
        }

        //CONEXION CON BASE DE DATOS -> JSON
        return null;
    }

}

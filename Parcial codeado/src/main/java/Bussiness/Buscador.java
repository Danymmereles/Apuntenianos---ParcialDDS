package Bussiness;

import Bussiness.Apuntes.ApunteSubido;

import java.io.IOException;
import java.util.List;

public class Buscador {

    //METODOS PROPIOS ----------------------------------------------------------
    public List<ApunteSubido> buscarSegun (List<String> criterios) throws IOException {
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

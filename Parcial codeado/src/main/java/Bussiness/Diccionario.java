package Bussiness;

import Bussiness.Tematicas.Curso;
import Bussiness.Tematicas.Materia;

import java.util.List;

public class Diccionario {

    //ATRIBUTOS  ----------------------------------------------------------
    private List<Curso> cursosHabiles;
    private List<Materia> materiasHabiles;
    private List<String> carrerasHabiles;
    private List<Universidad> universidadesHabiles;

    //GETTERS  ----------------------------------------------------------
    public List<Curso> getCursosHabiles() {
        return cursosHabiles;
    }

    public List<Materia> getMateriasHabiles() {
        return materiasHabiles;
    }

    public List<String> getCarrerasHabiles() {
        return carrerasHabiles;
    }

    public List<Universidad> getUniversidadesHabiles() {
        return universidadesHabiles;
    }

    //SETTERS
    //NO HAY PORQUE SE AGREGAN DE A POCO

    //CONSTRUCTOR -> VER QUE ONDA
    public static Diccionario getInstance() {
        return ;
    }

    //METODOS PROPIOS  ----------------------------------------------------------
}

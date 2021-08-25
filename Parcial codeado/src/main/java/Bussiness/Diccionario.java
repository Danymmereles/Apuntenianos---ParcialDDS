package Bussiness;

import Bussiness.APIS.AdapterApi;
import Bussiness.APIS.ListadoUniversidades;
import Bussiness.Tematicas.Curso;
import Bussiness.Tematicas.Materia;

import java.io.IOException;
import java.util.List;

public class Diccionario {

    //ATRIBUTOS  ----------------------------------------------------------
    private List<Curso> cursosHabiles;
    private List<Materia> materiasHabiles;
    private List<String> carrerasHabiles;
    private List<Universidad> universidadesHabiles;
    private static Diccionario diccionarioGlobal = null;

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

    //CONSTRUCTOR  ----------------------------------------------------------
    public static Diccionario getInstance() throws IOException {
        if(diccionarioGlobal== null){
            diccionarioGlobal = new Diccionario();
        }
        return diccionarioGlobal;
    }

    private Diccionario () throws IOException {
        ListadoUniversidades universidadObtenidas = AdapterApi.getInstance().obtenerUniversidades();
        for (Universidad unaUniversidad:universidadObtenidas.universidades) {
            this.universidadesHabiles.add(unaUniversidad);
        }
    }

    //METODOS PROPIOS  ----------------------------------------------------------
    public boolean tenesEsteCurso (String curso){
        for (Curso esteCurso: this.cursosHabiles) {
            if (esteCurso.getNombre() == curso){
                return true;
            }
        }
        return false;
    }

    public boolean tenesEsteMateria (String materia){
        for (Materia estaMateria: this.materiasHabiles) {
            if (estaMateria.getNombre() == materia){
                return true;
            }
        }
        return false;
    }

    public boolean tenesEstaCarrera (String carrera){
        return this.carrerasHabiles.contains(carrera);
    }

    public boolean tenesEstaUniversidad (String universidad){
        for (Universidad estaUniversidad: this.universidadesHabiles) {
            if (estaUniversidad.getName() == universidad){
                return true;
            }
        }
        return false;
    }

    public void agregarCarrera (String Carrera){
        this.carrerasHabiles.add(Carrera);
    }

    public void agregarMateria (Materia nuevaMateria){
        this.materiasHabiles.add(nuevaMateria);
    }

    public void agregarCurso (Curso nuevoCurso){
        this.cursosHabiles.add(nuevoCurso);
    }

    public void agregarUniversidad (Universidad nuevaUniversidad){
        this.universidadesHabiles.add(nuevaUniversidad);
    }

}

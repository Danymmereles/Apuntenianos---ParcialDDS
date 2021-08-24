package Bussiness.Tematicas;

public class Curso extends Tematica{

    //ATRIBUTOS ----------------------------------------------------------
    private String link;

    //GETTERS ----------------------------------------------------------
    public String getLink() {
        return link;
    }

    //SETTERS ----------------------------------------------------------
    public void setLink(String link) {
        this.link = link;
    }

    //COSTRUCTOR ----------------------------------------------------------
    public Curso (String Nombre, String link){
        this.nombre = Nombre;
        this.link = link;
    }

}

package Bussiness;

import java.util.List;

public class Universidad {

    //ATRIBUTOS
    private String name;
    private List<String> web_pages;


    //GETTERS
    public String getName() {
        return name;
    }

    public List<String> getWeb_pages() {
        return web_pages;
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setWeb_pages(List<String> web_pages) {
        this.web_pages = web_pages;
    }
}

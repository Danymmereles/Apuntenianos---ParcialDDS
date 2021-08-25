package Bussiness;

import java.util.List;

public class Universidad {

    //ATRIBUTOS ----------------------------------------------------------
    private String name;
    private List<String> web_pages;
    private String stateprovince;

    //GETTERS ----------------------------------------------------------
    public String getName() {
        return name;
    }

    public List<String> getWeb_pages() {
        return web_pages;
    }

    public String getStateprovince() {
        return stateprovince;
    }

    //SETTERS ----------------------------------------------------------
    public void setName(String name) {
        this.name = name;
    }

    public void setWeb_pages(List<String> web_pages) {
        this.web_pages = web_pages;
    }

    public void setStateprovince(String stateprovince) {
        this.stateprovince = stateprovince;
    }

}

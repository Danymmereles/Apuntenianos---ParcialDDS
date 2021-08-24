package Bussiness.APIS;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AdapterApi {

    private static AdapterApi instancia = null;
    private static final String urlApi = "http://universities.hipolabs.com/search?country=argentina";
    private Retrofit retrofit;

    private AdapterApi() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(urlApi)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static AdapterApi getInstance(){
        if(instancia== null){
            instancia = new AdapterApi();
        }
        return instancia;
    }

}

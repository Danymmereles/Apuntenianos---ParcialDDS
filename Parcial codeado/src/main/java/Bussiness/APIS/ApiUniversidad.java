package Bussiness.APIS;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUniversidad {

    private static ApiUniversidad instancia = null;
    private static final String urlApi = "http://universities.hipolabs.com/search?country=argentina";
    private Retrofit retrofit;

    private ApiUniversidad() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(urlApi)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiUniversidad getInstance(){
        if(instancia== null){
            instancia = new ApiUniversidad();
        }
        return instancia;
    }

}

package Bussiness.APIS;

import Bussiness.Universidad;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class AdapterApi {

    private static AdapterApi instancia = null;
    private static final String urlApi = "http://universities.hipolabs.com/";
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

    public ListadoUniversidades obtenerUniversidades () throws IOException {
        ServicioApi apiUniversidad = this.retrofit.create(ServicioApi.class);
        Call<ListadoUniversidades> listadoUniversidades = apiUniversidad.universidades("argentina");
        Response<ListadoUniversidades> universidadesArgentinas = listadoUniversidades.execute();
        return universidadesArgentinas.body();
    }

}

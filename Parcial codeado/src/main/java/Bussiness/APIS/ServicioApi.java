package Bussiness.APIS;

import Bussiness.Universidad;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface ServicioApi {
    @GET("/search")
    Call<ListadoUniversidades> universidades (@Query("country") String pais);
}

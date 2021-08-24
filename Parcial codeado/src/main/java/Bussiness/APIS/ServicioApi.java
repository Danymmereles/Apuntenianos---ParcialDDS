package Bussiness.APIS;

import Bussiness.Universidad;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface ServicioApi {
    @GET("universidades")
    Call<List<Universidad>> univesidades (@Query("name") String name, @Query("web_pages") List<String> web_pages, @Query("state-province") String stateprovince);
}

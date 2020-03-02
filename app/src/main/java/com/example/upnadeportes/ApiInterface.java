package com.example.upnadeportes;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("actividades/reservas/actividades")
    Call<ResponseBody> getWeb(
    );

    @FormUrlEncoded
    @POST("actividades/ajax/TInnova_v2/ReservaClasesPuntuales_Selector/llamadaAjax/solicitaDisponibilidad")
    Call<ResponseBody> getActividades(
            @Field("fechaInicio") String fecha
    );
}
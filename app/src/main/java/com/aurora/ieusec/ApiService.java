package com.aurora.ieusec;

import com.aurora.ieusec.model.ForecastIoResponse;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by sinan on 12.11.2015.
 */
public interface ApiService {

    @GET("bc24804d52ee957ecde6b38ef33ae9f3/{latitude},{longitude}")
    Call<ForecastIoResponse> getWeather(@Path("latitude") String latitude,
                                        @Path("longitude") String longitude,
                                        @Query("exclude") String query,
                                        @Query("units") String units);

}

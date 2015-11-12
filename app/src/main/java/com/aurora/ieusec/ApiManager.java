package com.aurora.ieusec;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

public class ApiManager {

    public static ApiService getApi(String url) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(ApiService.class);
    }

}

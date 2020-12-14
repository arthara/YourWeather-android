package com.kimi.tenki.current;

import com.kimi.tenki.BuildConfig;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CurrentService {
    @GET("weather?appid=" + BuildConfig.openWeatherKey + "&lang=id")
    Call<CurrentModel> getByLocation(@Query("lat") float latitude, @Query("lon") float longitude);
}

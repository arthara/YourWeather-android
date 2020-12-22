package com.kimi.tenki.current;

import com.kimi.tenki.BuildConfig;
import com.kimi.tenki.shared.model.QueryParameter;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CurrentService {
    @GET("weather?" + QueryParameter.apiKey + "&" + QueryParameter.language)
    Call<CurrentModel> getByLocation(@Query("lat") float latitude, @Query("lon") float longitude);
}

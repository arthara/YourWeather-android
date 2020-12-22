package com.kimi.tenki.forecast;

import com.kimi.tenki.current.CurrentModel;
import com.kimi.tenki.shared.model.QueryParameter;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ForecastService {
    @GET("onecall?" + QueryParameter.apiKey + "&" + QueryParameter.language + "&exclude=current,hourly,minutely,alerts")
    Call<ForecastModel> getByLocation(@Query("lat") float latitude, @Query("lon") float longitude);
}

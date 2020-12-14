package com.kimi.tenki.forecast;

import com.google.gson.annotations.SerializedName;
import com.kimi.tenki.shared.model.BaseWeatherData;
import com.kimi.tenki.shared.model.DailyFeels;

public class Daily extends BaseWeatherData {
    @SerializedName("feels_like")
    private DailyFeels feelsLike;
    @SerializedName("temp")
    private DailyTemperatures temperatures;
}

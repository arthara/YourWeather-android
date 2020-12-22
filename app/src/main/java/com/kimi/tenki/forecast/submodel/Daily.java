package com.kimi.tenki.forecast.submodel;

import com.google.gson.annotations.SerializedName;
import com.kimi.tenki.shared.model.DailyFeels;

public class Daily extends BaseWeatherData {
    @SerializedName("feels_like")
    private DailyFeels feelsLike;
    @SerializedName("temp")
    private DailyTemperatures temperatures;
    private int sunrise;
    private int sunset;
    private float uvi;

    public DailyFeels getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(DailyFeels feelsLike) {
        this.feelsLike = feelsLike;
    }

    public DailyTemperatures getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(DailyTemperatures temperatures) {
        this.temperatures = temperatures;
    }

    public int getSunrise() {
        return sunrise;
    }

    public void setSunrise(int sunrise) {
        this.sunrise = sunrise;
    }

    public int getSunset() {
        return sunset;
    }

    public void setSunset(int sunset) {
        this.sunset = sunset;
    }

    public float getUvi() {
        return uvi;
    }

    public void setUvi(float uvi) {
        this.uvi = uvi;
    }
}

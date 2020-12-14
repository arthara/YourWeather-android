package com.kimi.tenki.shared.model;

import com.google.gson.annotations.SerializedName;

public class BaseWeatherData {
    protected Main main;
    protected Wind wind;
    protected Clouds clouds;
    protected Rain rain;
    protected Snow snow;
    @SerializedName("dt")
    protected int dataTime;
    protected Weather weather;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public Snow getSnow() {
        return snow;
    }

    public void setSnow(Snow snow) {
        this.snow = snow;
    }

    public int getDataTime() {
        return dataTime;
    }

    public void setDataTime(int dataTime) {
        this.dataTime = dataTime;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}

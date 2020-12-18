package com.kimi.tenki.forecast.submodel;

import com.google.gson.annotations.SerializedName;
import com.kimi.tenki.shared.model.Rain;
import com.kimi.tenki.shared.model.Snow;
import com.kimi.tenki.shared.model.Weather;

public class BaseWeatherData {
    @SerializedName("dt")
    protected long dataTime;
    protected int pressure;
    protected int humidity;
    @SerializedName("dew_point")
    protected float dewPoint;
    protected int clouds;
    protected int visibility;
    @SerializedName("wind_gust")
    protected int windGust;
    @SerializedName("wind_speed")
    protected float windSpeed;
    @SerializedName("wind_degree")
    protected int windDegrees;
    protected float rain;
    protected float snow;
    protected Weather weather[];

    public long getDataTime() {
        return dataTime;
    }

    public void setDataTime(long dataTime) {
        this.dataTime = dataTime;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public float getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(float dewPoint) {
        this.dewPoint = dewPoint;
    }

    public int getClouds() {
        return clouds;
    }

    public void setClouds(int clouds) {
        this.clouds = clouds;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public int getWindGust() {
        return windGust;
    }

    public void setWindGust(int windGust) {
        this.windGust = windGust;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getWindDegrees() {
        return windDegrees;
    }

    public void setWindDegrees(int windDegrees) {
        this.windDegrees = windDegrees;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public void setWeather(Weather[] weather) {
        this.weather = weather;
    }

    public float getRain() {
        return rain;
    }

    public void setRain(float rain) {
        this.rain = rain;
    }

    public float getSnow() {
        return snow;
    }

    public void setSnow(float snow) {
        this.snow = snow;
    }
}

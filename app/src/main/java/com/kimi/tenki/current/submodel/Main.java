package com.kimi.tenki.current.submodel;

import com.google.gson.annotations.SerializedName;

public class Main {
    private float temperature;
    @SerializedName("feels_like")
    private float feelsLike;
    @SerializedName("temp_min")
    private float minTemperature;
    @SerializedName("temp_max")
    private float maxTemperature;
    private int pressure;
    private int humidity;
    @SerializedName("sea_level")
    private float seaLevel;
    @SerializedName("grnd_level")
    private float groundLevel;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(float feelsLike) {
        this.feelsLike = feelsLike;
    }

    public float getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(float minTemperature) {
        this.minTemperature = minTemperature;
    }

    public float getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(float maxTemperature) {
        this.maxTemperature = maxTemperature;
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

    public float getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(float seaLevel) {
        this.seaLevel = seaLevel;
    }

    public float getGroundLevel() {
        return groundLevel;
    }

    public void setGroundLevel(float groundLevel) {
        this.groundLevel = groundLevel;
    }
}

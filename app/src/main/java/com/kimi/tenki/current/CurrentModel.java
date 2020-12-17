package com.kimi.tenki.current;

import com.google.gson.annotations.SerializedName;
import com.kimi.tenki.shared.model.APIResponse;
import com.kimi.tenki.current.submodel.Clouds;
import com.kimi.tenki.current.submodel.Coordinate;
import com.kimi.tenki.current.submodel.Main;
import com.kimi.tenki.shared.model.Rain;
import com.kimi.tenki.shared.model.Snow;
import com.kimi.tenki.current.submodel.Sys;
import com.kimi.tenki.shared.model.Weather;
import com.kimi.tenki.current.submodel.Wind;

public class CurrentModel extends APIResponse {
    private Coordinate coord;
    private String base;
    private Sys sys;
    private int timezone;
    private int id;
    @SerializedName("name")
    private int cityName;
    protected Main main;
    protected Wind wind;
    protected Clouds clouds;
    protected Rain rain;
    protected Snow snow;
    @SerializedName("dt")
    protected long dataTime;
    protected Weather weather[];

    public Coordinate getCoord() {
        return coord;
    }

    public void setCoord(Coordinate coord) {
        this.coord = coord;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public void setWeather(Weather weather[]) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

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

    public long getDataTime() {
        return dataTime;
    }

    public void setDataTime(int dataTime) {
        this.dataTime = dataTime;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityName() {
        return cityName;
    }

    public void setCityName(int cityName) {
        this.cityName = cityName;
    }
}

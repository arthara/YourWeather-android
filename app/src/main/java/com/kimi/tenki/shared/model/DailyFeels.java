package com.kimi.tenki.shared.model;

import com.google.gson.annotations.SerializedName;

public class DailyFeels {
    @SerializedName("morn")
    protected float morning;
    protected float day;
    @SerializedName("eve")
    protected float evening;
    protected float night;

    public float getMorning() {
        return morning;
    }

    public void setMorning(float morning) {
        this.morning = morning;
    }

    public float getDay() {
        return day;
    }

    public void setDay(float day) {
        this.day = day;
    }

    public float getEvening() {
        return evening;
    }

    public void setEvening(float evening) {
        this.evening = evening;
    }

    public float getNight() {
        return night;
    }

    public void setNight(float night) {
        this.night = night;
    }
}

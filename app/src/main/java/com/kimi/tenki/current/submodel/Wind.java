package com.kimi.tenki.current.submodel;

import com.google.gson.annotations.SerializedName;

public class Wind {
    private float speed;
    @SerializedName("deg")
    private int degree;
    private float gust;

    public float getGust() {
        return gust;
    }

    public void setGust(float gust) {
        this.gust = gust;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }
}

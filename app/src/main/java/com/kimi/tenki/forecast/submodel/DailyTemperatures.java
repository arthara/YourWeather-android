package com.kimi.tenki.forecast.submodel;

import com.google.gson.annotations.SerializedName;
import com.kimi.tenki.shared.model.DailyFeels;

public class DailyTemperatures extends DailyFeels {
    @SerializedName("max")
    private float maximum;
    @SerializedName("min")
    private float minimum;

    public float getMaximum() {
        return maximum;
    }

    public void setMaximum(float maximum) {
        this.maximum = maximum;
    }

    public float getMinimum() {
        return minimum;
    }

    public void setMinimum(float minimum) {
        this.minimum = minimum;
    }
}

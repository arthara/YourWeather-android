package com.kimi.tenki.forecast;

import com.google.gson.annotations.SerializedName;
import com.kimi.tenki.shared.model.APIResponse;

public class ForecastModel extends APIResponse {
    @SerializedName("lon")
    private float longitude;
    @SerializedName("lat")
    private float latitude;
    private String timezone;
    @SerializedName("timezone_offset")
    private int timezoneOffset;
    private Daily daily[];


    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }
}

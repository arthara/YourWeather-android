package com.kimi.tenki.forecast.submodel;

import com.google.gson.annotations.SerializedName;
import com.kimi.tenki.shared.model.APIResponse;

public class OneCallModel extends APIResponse {
    @SerializedName("lon")
    private float longitude;
    @SerializedName("lat")
    private float latitude;
    private String timezone;
    @SerializedName("timezone_offset")
    private int timezoneOffset;

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

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(int timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }
}

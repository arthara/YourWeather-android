package com.kimi.tenki.forecast;

import com.kimi.tenki.forecast.submodel.Daily;
import com.kimi.tenki.forecast.submodel.OneCallModel;

public class ForecastModel extends OneCallModel {
    private Daily daily[];

    public Daily[] getDaily() {
        return daily;
    }

    public void setDaily(Daily[] daily) {
        this.daily = daily;
    }
}

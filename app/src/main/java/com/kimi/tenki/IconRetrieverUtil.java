package com.kimi.tenki;

public class IconRetrieverUtil {
    private static String url = "https://openweathermap.org/img/wn/";
    private static String urlSuffix = "@4x.png";

    public static String getIconUrl(String iconName){
        return url + iconName + urlSuffix;
    }
}

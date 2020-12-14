package com.kimi.tenki.shared.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public abstract class BaseServiceGenerator {
    protected static Gson gson = new GsonBuilder()
            .enableComplexMapKeySerialization()
            .serializeNulls()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .setPrettyPrinting()
            .setVersion(1.0)
            .create();

    protected static String http = "http://";
}

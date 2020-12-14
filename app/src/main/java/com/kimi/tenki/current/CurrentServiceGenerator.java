package com.kimi.tenki.current;

import com.kimi.tenki.BuildConfig;
import com.kimi.tenki.shared.retrofit.BaseServiceGenerator;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CurrentServiceGenerator extends BaseServiceGenerator {
    private static String prefix = "api.";
    private static final String BASE_URL = http + prefix + BuildConfig.openWeatherURL;

    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(BaseServiceGenerator.gson));

    protected static Retrofit retrofit = builder.build();

    protected static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    public static <S> S createService(Class<S> serviceClass) {
        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.level(HttpLoggingInterceptor.Level.BODY);

            httpClient.addInterceptor(logging);
        } else {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.level(HttpLoggingInterceptor.Level.BASIC);

            httpClient.addInterceptor(logging);
        }

        builder.client(httpClient.build());
        retrofit = builder.build();

        return retrofit.create(serviceClass);
    }

    public static Retrofit retrofit() {
        return retrofit;
    }
}
